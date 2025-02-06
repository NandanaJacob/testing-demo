package jdk11;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
 
public class HttpClientEx {
 
	public static void main(String[] args) throws Exception{
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().
				uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
						.build();	
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());

	}
}

