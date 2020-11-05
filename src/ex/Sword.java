package ex;

public class Sword {
    int sword;

    public int dealDamage() {
        int randomDamage  = (int) (5 +  (Math.random() * 30));
        sword = randomDamage;
        System.out.println(sword);
        return sword;
    }
}

