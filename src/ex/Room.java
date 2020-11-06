package ex;

public class Room {

    Barbarian fifi; // déclaration de l'existance d'un barbare
    Wizard loulou;
    Room(){ // création du constructeur de pièce
        fifi = new Barbarian();
        loulou = new Wizard();
    }

   public void opendoor(Adventurer adventurer) {

        while( fifi.isalive() && adventurer.isalive() ) {
            fifi.fight(adventurer);
        }
    }

}


// créer un sorcier
// créer fonction random choice