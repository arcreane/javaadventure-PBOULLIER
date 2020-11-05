package ex;

public class Scepter {
    int scepter;

    public int dealDamage() {
        int randomDamage  = (int) (5 +  (Math.random() * 30));
        scepter=randomDamage;
        System.out.println(scepter);
        return scepter;
    }
}

