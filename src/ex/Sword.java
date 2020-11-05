package ex;

import java.util.Random;

public class Sword {
    int damage;

    public void dealDamage() {
        int randomDamage = (int) (5 +  (Math.random() * 30));
        damage=randomDamage;
        System.out.println(damage);
    }
}

