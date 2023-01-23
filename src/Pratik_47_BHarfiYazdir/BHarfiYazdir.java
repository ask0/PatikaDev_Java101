package Pratik_47_BHarfiYazdir;

public class BHarfiYazdir {
    public static void main(String[] args) {
        int x = 7, y = 4;
        String[][] harf = new String[x][y];
        for (int i = 0; i < harf.length; i++) {
            for (int j = 0; j < harf[i].length; j++) {
                if (i == 0 || i == harf.length / 2 || i == harf.length - 1 || j == 0 || j == harf[i].length - 1) {
                    harf[i][j] = " * ";
                } else {
                    harf[i][j] = "   ";
                }
            }
        }

        for (String[] i : harf) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
