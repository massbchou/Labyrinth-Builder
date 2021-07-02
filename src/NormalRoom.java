public class NormalRoom {
    private int width;
    private int height;
    private int length;
    private int EncounterLevel;
    private int EnemiesChance;
    private String Room;
    private int passageConnects;

    public NormalRoom(){
        this.width = UserInterface.randomize(30, 120);
        this.length = UserInterface.randomize(30, 120);
        this.height = UserInterface.randomize(10, 120);
        this.EncounterLevel = UserInterface.randomize(1, 15);
        this.EnemiesChance = UserInterface.randomize(1, 100);
        this.passageConnects = UserInterface.randomize(0, 3);
        this.Room = UserInterface.rFilePull(UserInterface.NormalRoomsFile);
    }

    public void reset(){
        this.width = UserInterface.randomize(30, 120);
        this.length = UserInterface.randomize(30, 120);
        this.height = UserInterface.randomize(10, 120);
        this.EncounterLevel = UserInterface.randomize(1, 15);
        this.EnemiesChance = UserInterface.randomize(1, 100);
        this.passageConnects = UserInterface.randomize(0, 3);
        this.Room = UserInterface.rFilePull(UserInterface.NormalRoomsFile);
    }


    public String toString() {
        String toReturn = "Width: " + this.width + "ft\n";
        toReturn += "Length: " + this.length + "ft\n";
        toReturn += "Height: " + this.height + "ft\n";
        toReturn += "Encounter Level: " + this.EncounterLevel + "\n";
        toReturn += "Enemies Chance: " + this.EnemiesChance + "%\n";
        toReturn += "Num Passages Out: " + this.passageConnects + "\n";
        if (UserInterface.randomize(1, 4) == 4) {
            toReturn += "Room Info: Safe Room"; 
        }
        else {
            if (this.Room.equals("Spell Gas Level v1")) {
                this.Room = "Spell Gas: " + UserInterface.pullSpell(UserInterface.randomize(1, 3));
            }
            else if (this.Room.equals("Spell Gas Level v2")) {
                this.Room = "Spell Gas: " + UserInterface.pullSpell(UserInterface.randomize(4, 6));
            }
            else if (this.Room.equals("Spell Gas Level 7")) {
                this.Room = "Spell Gas: " + UserInterface.pullSpell(7);
            }
            else if (this.Room.equals("Spell Gas Level 8")) {
                this.Room = "Spell Gas: " + UserInterface.pullSpell(8);
            }
            else if (this.Room.equals("Spell Gas Level 9")) {
                this.Room = "Spell Gas: " + UserInterface.pullSpell(9);
            }
            toReturn += "Room Info: " + this.Room;
            
        }

        return toReturn;

    }
}
