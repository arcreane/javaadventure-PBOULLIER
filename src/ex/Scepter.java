package ex;

public class Scepter {
    int damage;

    public void dealDamage() {
        int randDamage  = (int) (5 +  (Math.random() * 30));
        damage=randDamage;
        System.out.println(damage);
    }
}

