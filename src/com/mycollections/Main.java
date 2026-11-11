/**
 *  Java program to find quantity of filtrated numbers less than 4 multiplied by 2 and bigger than 10 in the end.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a list of numbers.
        List<Integer> numbers = new ArrayList<>();

        // Filling the list with numbers from 0 to 9.
        for (int index = 0; index < 10; index++) {
            numbers.add(index);
        }

        // Filter and print numbers according to a task > 10.
        System.out.println(numbers.stream().filter(num -> num < 4)
                .map(val -> val * 2)
                .filter(val -> val > 10)
                .count());

    }
}