package org.ford.Assignment10StreamAPI;
import java.sql.SQLOutput;
import  java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MarkAnalysisDriver {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(45, 67, 82, 39, 90, 55);
        List<String> names = Arrays.asList("John" , "Emma" , "Alex" , "Sophia" , "Liam" , "Olivia");


        List <Integer> passingMarks1= marks.stream().filter(mark -> mark>50).map((Integer mark) -> mark).toList();
        System.out.println("Passing marks list: "+passingMarks1);
        System.out.println();

        long passCount = marks.stream()
                .filter(mark -> mark >= 50)
                .mapToInt(mark -> mark)   // convert each passing element to 1
                .count();
        System.out.println(" total pass count : "+passCount);
        System.out.println();


        System.out.println("Sorting marks in ascending order: ");
        List <Integer> sortedMarks= marks.stream().sorted().map((Integer mark) -> mark).toList();
        System.out.println(sortedMarks);
        System.out.println();


        int highScore = marks.stream().mapToInt((Integer mark) -> mark).max().getAsInt();
        System.out.println("High score : "+highScore);
        System.out.println();


        System.out.println("Collecting name starting with A");
        List <String> filteredNameList= names.stream().filter((String name)-> name.startsWith("A"))
                .map((String name) -> name).toList();
        System.out.println(filteredNameList);
        System.out.println();



        System.out.println(" Assigning grade for the marks : ");
        List <String> gradeList = marks.stream().map((Integer mark) -> {
            if (mark >= 85) return "A";
            else if (mark >= 70) return "B";
            else if (mark >= 50) return "C";
            else return "Fail";
        }).toList();
        System.out.println(gradeList);










    }
}
