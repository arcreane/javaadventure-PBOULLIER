package ex;

// Arme physique commune au Barbare et à l'aventurier
public class Sword {
    int sword;

    public int dealDamage() {
        int randomDamage  = (int) (5 +  (Math.random() * 30));
        sword = randomDamage;
        System.out.println(sword);
        return sword;
    }
}

