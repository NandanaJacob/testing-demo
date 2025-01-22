package java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterEx {
    public static void main(String[] args) {
        Function<Integer, Integer> sqrt = n -> n*n;
        System.out.println("square = "+ sqrt.apply(4));

        Function<Integer, String> sq = n -> "Square of n is " + n*n;
        System.out.println("square = "+ sq.apply(6));

        BiFunction<Integer, Integer, Integer> sum = (a,b) -> a+b;
        System.out.println("bifunction SUM = "+ sum.apply(7, 3));

        Predicate<String> p = s -> s.equals("nandana"); //returns boolean fixed
        System.out.println("predicate equals true? : " + p.test("nandana")); //here use test(), not apply()

        BiPredicate<String, String> p2 = (s1, s2) -> s1.equals(s2);
        System.out.println("bipredicate uqlas true? : " + p2.test("tinu", "nandana"));
    }
}
