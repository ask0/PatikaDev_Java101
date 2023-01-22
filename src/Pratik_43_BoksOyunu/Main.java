package Pratik_43_BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 75, 95, 65);
        Fighter f2 = new Fighter("B", 20, 75, 85, 45);

        Match match = new Match(f1, f2, 80, 95);
        match.run();
    }
}
