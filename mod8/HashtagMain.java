package mod8;

import java.util.concurrent.Flow.*;
import java.util.stream.Collectors;
import java.util.*;

class TrendingHashtagsProcessor implements Subscriber<String> {
    private Subscription subscription;
    private Map<String, Integer> hashtagCounts = new HashMap<>();
    
    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(Long.MAX_VALUE); // Request unlimited items
    }
    
    @Override
    public void onNext(String hashtag) {
        hashtagCounts.merge(hashtag, 1, Integer::sum);
    }
    
    @Override
    public void onError(Throwable throwable) {
        System.err.println("Error: " + throwable.getMessage());
    }
    
    @Override
    public void onComplete() {
        System.out.println("Processing completed");
    }
    
    public List<String> getTopTrendingHashtags() {
        return hashtagCounts.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(3)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }
}

class TrendingHashtagsPublisher implements Publisher<String> {
    private List<Subscriber<? super String>> subscribers = new ArrayList<>();
    
    @Override
    public void subscribe(Subscriber<? super String> subscriber) {
        subscribers.add(subscriber);
        subscriber.onSubscribe(new Subscription() {
            @Override
            public void request(long n) {
                // Do nothing as we're using a push model
            }
            
            @Override
            public void cancel() {
                subscribers.remove(subscriber);
            }
        });
    }
    
    public void publishHashtag(String hashtag) {
        for (Subscriber<? super String> subscriber : subscribers) {
            subscriber.onNext(hashtag);
        }
    }
    
    public void complete() {
        for (Subscriber<? super String> subscriber : subscribers) {
            subscriber.onComplete();
        }
    }
}

public class HashtagMain {
    public static void main(String[] args) {
        TrendingHashtagsPublisher hashtagsPublisher = new TrendingHashtagsPublisher();
        TrendingHashtagsProcessor hashtagsProcessor = new TrendingHashtagsProcessor();
        
        hashtagsPublisher.subscribe(hashtagsProcessor);
        
        hashtagsPublisher.publishHashtag("#Java");
        hashtagsPublisher.publishHashtag("#ReactiveProgramming");
        hashtagsPublisher.publishHashtag("#Java9");
        hashtagsPublisher.publishHashtag("#Concurrency");
        
        hashtagsPublisher.complete();
        
        System.out.println("Top Trending Hashtags: " + 
            hashtagsProcessor.getTopTrendingHashtags());
    }
}