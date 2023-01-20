package Pratik_35_JavaLoops2;

import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = a + b;
            int k = 1;
            for(int j = 1; j<=n; j++){
                System.out.print(temp + " ");
                temp += b*Math.pow(2, k);
                k++;
            }
            System.out.println();
        }

        in.close();
    }
}
