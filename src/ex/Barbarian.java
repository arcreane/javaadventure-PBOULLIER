package ex;

import java.util.Scanner;

public class Barbarian {

    // Appeller methode Sword
    // process de l'attaque de la Sword avec attaque auto si mauvaise entrée.

    int healthb;
    Sword swordb; // nouvelle épée propre au barbare 
    
    Barbarian(){
       swordb = new Sword();
       healthb = 20;
    }

   /* public void barbare() {

        Scanner sc = new Scanner(System.in);

        System.out.println("le barbare à" + (+health + "points de vie."));
        System.out.println("Prennez une épée pour le tuer.");

        do {
            System.out.println(" quelle arme prenez vous ? ");
            System.out.println(" Sword or Scepter ?");

            String userInput = sc.nextLine();

            if (userInput.contentEquals("Sword")) {
                health = health - weapon.sword;
                System.out.println("Vous avez infligé -" + weapon.sword + "points de vie.");
                System.out.println("Il reste " + health + "au Barbare.");
            } else {
                System.out.println("Le barbare vous attaque");
                health = health.healthA - weapon.sword;
                System.out.println("Il vous reste" + health.healthA + "points de vie");
            }
            if (health.healthB == 0) {
                System.out.println("Vous avez gagné et accédez à la salle suivante");
            } else if (health.healthA == 0) {
                System.out.println("Vous avez perdu, z'êtes nul GAME OVER");
            }

        }
        while (health.healthB != 0 && health.healthA != 0);


    }

    */


    public boolean isalive() {
        return healthb > 0;
    }

    public void fight(Adventurer adventurer) {
        adventurer.managehealthstatus(swordb.dealDamage());
    }
// ..........
//    public void fight(Adventurer adventurer) {
//    }
    // .........
}



