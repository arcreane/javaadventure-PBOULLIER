package ex;

// Arme magique commune à l'aventurier et au Wizard
public class Scepter {
    int scepter;

    public int dealDamage() {
        return (int) (5 +  (Math.random() * 10));

    }
}

