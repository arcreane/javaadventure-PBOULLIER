package ex;

import java.util.Scanner;

// class Wizard avec dévellopement d'un combat contre lui
// appeler méthode Scepter
// gestion de l'attaque + auto hit si mauvaise entrée utilisateur.

public class Wizard {
    int health ;

    public void dealDamage(){

        Scanner sc = new Scanner(System.in);

        Healthpoint health = new Healthpoint();
        Scepter weapon = new Scepter();

        System.out.println("le Magicien à" +(+health.healthW+ "points de vie."));
        System.out.println("Prenez un sceptre pour le tuer.");

        do {
            System.out.println(" quelle arme prenez vous ? ");
            System.out.println(" Sword or Scepter ?");

            String userInput = sc.nextLine();

            if(userInput.contentEquals("Sword")){
                health.healthW = health.healthW - weapon.scepter;
                System.out.println("Vous avez infligé -" +weapon.scepter+ "points de vie.");
                System.out.println("Il reste "+ health.healthW + "au Magicien.");
            }
            else {
                System.out.println("Le Magicien vous lance un sort");
                health.healthA = health.healthA - weapon.scepter;
                System.out.println("Il vous reste" +health.healthA+ "points de vie");
            }
            if (health.healthW ==0){
                System.out.println("Vous avez gagné et accédez à la salle suivante");
            }
            else if (health.healthA ==0){
                System.out.println("Vous avez perdu, z'êtes nul GAME OVER");
            }

        }
        while (health.healthW !=0 &&health.healthA !=0);
    }
}

