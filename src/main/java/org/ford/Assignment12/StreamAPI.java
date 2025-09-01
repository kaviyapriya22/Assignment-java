package org.ford.Assignment12;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> ages = Arrays.asList(12, 18, 25, 16, 40, 30);
        List <Integer> eligibleAges = ages.stream().filter((age) -> age >= 18).toList();
        System.out.println("Eligible ages for voting: " + eligibleAges);

        List<String> names = Arrays.asList("john", "emma", "alex");
        List <String> uppercaseNames= names.stream().map((String name) -> name.toUpperCase()).toList();
        System.out.println("Uppercased names: " + uppercaseNames);


        Comparator <Integer> scoreComparator = (Integer num1,Integer num2) -> num1.compareTo (num2);
        List<Integer> scores = Arrays.asList(50, 85, 40, 90, 70);
        List <Integer> sortedScores = scores.stream().sorted(scoreComparator).toList();
        System.out.println("Sorted scores: " + sortedScores);

        List<String> books = Arrays.asList("Java", "Python", "JavaScript", "C++", "JMeter");
        List <String > jBooks = books.stream().filter((book) -> book.toLowerCase().startsWith("j")).toList();
        System.out.println("JBooks: " + jBooks);

        List<Integer> sales = Arrays.asList(200, 450, 300, 150, 600);
        int totalSales = sales.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Total Weekly Sales: " + totalSales);

        List<Integer> marks = Arrays.asList(30, 45, 60, 75, 40);
        Integer firstPass = marks.stream()
                .filter(mark -> mark > 50)
                .findFirst()
                .orElse(null);
        System.out.println("FirstPass: " + firstPass);

    }
}
