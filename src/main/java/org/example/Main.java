package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        int total = first.length()+second.length();
        int result = 0;
        HashSet<Character> hashSet = new HashSet<>();
        int j=0;
        


        System.out.println(total-result);

    }

}


/**
 *  while((line = bf.readLine())!=null){
 *             String[] k = line.split(" ");
 *             Integer A = Integer.parseInt(k);
 *             Integer B = Integer.parseInt(k);
 *             System.out.println(A+B);
 *         }
 *
 */