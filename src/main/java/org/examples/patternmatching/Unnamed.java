package org.examples.patternmatching;


import java.util.List;
import java.util.function.Consumer;

public class Unnamed {
    public static void main(String[] args) {


        // For a try-catch block, this feature can be particularly handy
        // when you want to handle exceptions without needing to use the exception object itself.

        try {
            // Code that might throw an exception
        } catch (Exception _) {
            System.out.println("An exception occurred");
        }


        //You can use unnamed variables for initialization or iteration when they are not directly used in the loop body

        var items = List.of("apple", "banana", "cherry");

        for (String _ : items) {

        }


        //If a lambda expression parameter is not used, you can replace it with an underscore

        Consumer<String> printMessage = (_) -> {
            System.out.println("Message received.");
        };
    }

}




