//Write a program that prints its arguments  in random order. Do not make  a copy of the argument array. Demonstrate  how to print out the elements  using both streams  and the traditional enhanced for statement.

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        
        List<String> argList = Arrays.asList("hello","world","and","welcome","to","Q");
        Collections.shuffle(argList);
        argList.stream().forEach(e->System.out.format("%s ",e));

        for (String arg: argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}