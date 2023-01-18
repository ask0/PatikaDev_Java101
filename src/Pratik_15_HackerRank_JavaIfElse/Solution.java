package Pratik_15_HackerRank_JavaIfElse;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String output = "";
        if(N % 2 == 1){
            output = "Weird";
        }
        else{
            if(N >= 2 && N <= 5){
                output = "Not Weird";
            }
            else if(N >= 6 && N <= 20){
                output = "Weird";
            }
            else if(N >= 20){
                output = "Not Weird";
            }
        }
        System.out.println(output);
    }
}
