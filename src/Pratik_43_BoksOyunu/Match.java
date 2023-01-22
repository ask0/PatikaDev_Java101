package Pratik_43_BoksOyunu;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    void run() {
        if (isCheck()) {
            if (getRandomBoolean()) { // true -> f1 starts to the round
                System.out.println("#### The Game Starts ####\n" + this.f1.name + " starts to the match.");
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("##### New Round #####");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) break;
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) break;
                    System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                }
            } else {  // false -> f2 starts to the round
                System.out.println("#### The Game Starts ####\n" + this.f2.name + " starts to the match.");
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("##### New Round #####");
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) break;
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) break;
                    System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
                    System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                }
            }

        } else {
            System.out.println("Oyuncuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }
        return false;
    }
}
