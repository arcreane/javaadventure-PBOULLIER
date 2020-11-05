package ex;

import java.util.Scanner;

public class Barbarian {

    // Appeller methode Sword
    // process de l'attaque de la Sword avec attaque auto si mauvaise entrée.



    public void barbare (){

        Scanner sc = new Scanner(System.in);

        Healthpoint health = new Healthpoint();
        Sword weapon = new Sword();

        System.out.println("le barbare à" +(+health.healthB+ "points de vie."));
        System.out.println("Prennez une épée pour le tuer.");

        do {
            System.out.println(" quelle arme prenez vous ? ");
            System.out.println(" Sword or Scepter ?");

            String userInput = sc.nextLine();

            if(userInput.contentEquals("Sword")){
            health.healthB = health.healthB - weapon.sword;
            System.out.println("Vous avez infligé -" +weapon.sword+ "points de vie.");
            System.out.println("Il reste "+ health.healthB + "au Barbare.");
            }
            else {
                System.out.println("Le barbare vous attaque");
                health.healthA = health.healthA - weapon.sword;
                System.out.println("Il vous reste" +health.healthA+ "points de vie");
            }
            if (health.healthB ==0){
                System.out.println("Vous avez gagné et accédez à la salle suivante");
            }
            else if (health.healthA ==0){
                System.out.println("Vous avez perdu, z'êtes nul GAME OVER");
            }

        }
        while (health.healthB !=0 &&health.healthA !=0);
    }
}



