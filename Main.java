package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("This program will print out a list of terms corresponding to the Fibonacci sequence. \n" +
                " Enter a valid term that belongs to the Fibonacci numbers:  \n");

        Scanner scan = new Scanner(System.in);

        try {
            int userInput = scan.nextInt();
            fibonacci(userInput);
        }catch (Exception e)
        {
            System.out.println("Not an integer\n");

            Main.main(null);

        }

    }


    static void fibonacci(int fib)
    {
        /* initiated term1 & term2 to equal 1 to start the sequence off.  */
        int term1 = 1;
        int term2 = 1;
        int term3 = 0;
        int index = 0;
        
        ArrayList<Integer> terms = new ArrayList<>();
        terms.add(index, term1);
        ++index;
        terms.add(index, term2);
        ++index;


        while (term3 != fib)
        {
            term3 = term1 + term2;
            terms.add(index, term3);
            ++index;
            term1 = term2;
            term2 = term3;

        }
        System.out.println("\nThe list of terms is as presents:  ");

        System.out.println(terms.toString());
    }
}
