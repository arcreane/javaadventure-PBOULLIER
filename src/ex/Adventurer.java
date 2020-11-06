package ex;

//Classe aventurier en cours de dévellopement

public class Adventurer {

    private int health;
    Sword swordA;
    Scepter scepterA;

    Adventurer(){
        swordA = new Sword();
        scepterA = new Scepter();
        health = 200;
    }

    public void managehealthstatus(int i){
        System.out.println("Il vous reste" + health + "points de vie");
    }

    public void enter(Dungeon underworld) {
        underworld.move(this); // methode param Hero qui bouge de pièce.
    }
    public boolean isalive() {
        return health > 0;
    }
    // coder fonction attaque

}



