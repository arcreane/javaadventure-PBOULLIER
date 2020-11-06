package ex;

public class Dungeon {
    Room [] rooms;
    Dungeon (){
        rooms = new Room[5]; // 5 salles de crées dans le Donjon.
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] =new Room(); // créer une nouvelle room
        }
    }

    public void move(Adventurer adventurer) {
        for (int i = 0; i < rooms.length ; i++) {
            rooms [i].opendoor(adventurer);
        }
    }
}
