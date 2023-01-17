package Pratik8_HackerRank_JavaDatatypes;

import java.util.Scanner;
import java.lang.Math;
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i=0; i<t; i++){
            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x>=-128 && x<=127)
                    System.out.println("* byte");
                if(x>=-Math.pow(2,15) && x<=Math.pow(2,15)-1)
                    System.out.println("* short");
                if(x>=-Math.pow(2,31) && x<=Math.pow(2,31)-1)
                    System.out.println("* int");
                if(x>=-Math.pow(2,63) && x<=Math.pow(2,63)-1)
                    System.out.println("* long");
            }
            catch (Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }

        /* If-Else olmadan
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String output="";
        for(int i=0; i<t; i++){
            try{
                long n = scanner.nextLong();
                output = (n>=-128 && n<=127) ? output+="* byte\n" : "";
                output = (n>=-Math.pow(2,15) && n<=Math.pow(2,15)-1) ? output+="* short\n" : "";
                output = (n>=-Math.pow(2,31) && n<=Math.pow(2,31)-1) ? output+="* int\n" : "";
                output = (n>=-Math.pow(2,63) && n<=Math.pow(2,63)-1) ? output+="* long\n" : "";
                System.out.println(n + " can be fitted in:\n" + output);
            }
            catch (Exception e){
                System.out.println(scanner.next() + " can't be fit anywhere.\n");
            }
        }
        */
    }

}
