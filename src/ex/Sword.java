package ex;

// Arme physique commune au Barbare et à l'aventurier
public class Sword {

    public int dealDamage() {
        return (int) (5 +  (Math.random() * 10));
    }
}

