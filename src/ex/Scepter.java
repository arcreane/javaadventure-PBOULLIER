package ex;

public class Scepter {
    int damage;

    public int dealDamage() {
        int randomDamage  = (int) (5 +  (Math.random() * 30));
        damage=randomDamage;
        System.out.println(damage);
        return damage;
    }
}

