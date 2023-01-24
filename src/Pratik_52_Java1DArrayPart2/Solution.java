package Pratik_52_Java1DArrayPart2;

import java.util.Scanner;

public class Solution {
    public static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1)
            return false;
        if (i + 1 >= game.length || i + leap >= game.length)
            return true;
        game[i] = 1;
        return canWin(leap, game, i + leap) || canWin(leap, game, i + 1) || canWin(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        scan.close();
    }



    /* unfinished 5/10
        public static boolean canWin(int leap, int[] game) {
            int i=0; boolean decreased = false;
            for(int k=0; k<game.length; k++){
                if(i != 0){
                    if(game[i-1]==0){
                        i--;
                        decreased = true;
                    }
                }
                if(i+1 < game.length && !decreased){
                    if(game[i+1] == 0)
                        i++;
                }
                if(i+leap < game.length){
                    if(game[i+leap]==0){
                        i += leap;
                    }
                }
                if(i == game.length -1 || i + leap >= game.length){
                    return true;
                }
                decreased = false;
            }
            return false;
        }
     */
}
