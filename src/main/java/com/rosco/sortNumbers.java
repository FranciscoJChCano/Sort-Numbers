package com.rosco;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sortNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of elements you want to sort:");
        int count = scanner.nextInt();

        
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the numbers one by one (number 4 will be ignored):");
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if (number == 4) {
                System.out.println("Number 4 has been ignored.");
                continue;
            }
            numbers.add(number);
        }

        
        System.out.println("Enter 'A' for ascending order or 'D' for descending order:");
        char order = scanner.next().charAt(0);

        
        if (order == 'A' || order == 'a') {
            Collections.sort(numbers);
            System.out.println("List sorted in ascending order: " + numbers);
        } else if (order == 'D' || order == 'd') {
            Collections.sort(numbers, Collections.reverseOrder());
            System.out.println("List sorted in descending order: " + numbers);
        } else {
            System.out.println("Invalid option. Please try again.");
        }
    }
}
