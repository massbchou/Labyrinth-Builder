

public class Passages {
    private int width;
    private int height;
    private int EncounterLevel;
    private int EnemiesChance;
    private Boolean Branch;
    private Boolean River;
    private Boolean Shelter;
    private String ConnectedTo;

    public Passages(){
        this.width = UserInterface.randomize(5, 30);
        this.height = UserInterface.randomize(5, 60);
        this.EncounterLevel = UserInterface.randomize(1, 15);
        this.EnemiesChance = UserInterface.randomize(1, 100);
        this.Branch = UserInterface.perChance(10);
        this.River = UserInterface.perChance(5);
        this.Shelter = UserInterface.perChance(40);
        this.ConnectedTo = Connections();
    }

    public void reset(){
        this.width = UserInterface.randomize(5, 30);
        this.height = UserInterface.randomize(5, 60);
        this.EncounterLevel = UserInterface.randomize(1, 15);
        this.EnemiesChance = UserInterface.randomize(1, 100);
        this.Branch = UserInterface.perChance(10);
        this.River = UserInterface.perChance(5);
        this.Shelter = UserInterface.perChance(40);
        this.ConnectedTo = Connections();
    }

    public void addPassage(){
        this.width = UserInterface.percentMod(this.width, UserInterface.randomize(-10, 10));
        this.height = UserInterface.percentMod(this.height, UserInterface.randomize(-10, 10));
        this.EncounterLevel += UserInterface.randomize(-2, 2);
        this.EnemiesChance = UserInterface.randomize(1, 100);
        this.Branch = UserInterface.perChance(10);
        this.River = UserInterface.perChance(5);
        this.Shelter = UserInterface.perChance(40);
        this.ConnectedTo = Connections();
    }

    private String Connections(){
        int temp = UserInterface.randomize(1, 100);
        if (UserInterface.isBetween(1, 60, temp)) {
            return "Straight Passage";
        }
        else if (UserInterface.isBetween(61, 70, temp)) {
            temp = UserInterface.randomize(1,4);
            switch (temp) {
                case 1:
                    return "Left Turn";
                case 2:
                    return "Top Left Turn";
                case 3:
                    return "Right Turn";
                case 4:
                    return "Top Right Turn";
                default:
                    return "Right Turn";
            }   
        }
        else if (UserInterface.isBetween(71, 91, temp)) {
            temp = UserInterface.randomize(1,100);
            if (UserInterface.isBetween(1, 70, temp)) {
                return "Normal Room";
            }  
            else if (UserInterface.isBetween(71, 85, temp)) {
                return "Giant Room";
            }
            else if (UserInterface.isBetween(86, 95, temp)) {
                return "Boss Room";
            }
            else {
                return "Treasure Room";
            }
        }
        else if (UserInterface.isBetween(92, 93, temp)) {
            return "Passage to Middle Stratum";
        }
        else if (UserInterface.isBetween(94, 99, temp)){
            return "Dead End";
        }
        else if (temp == 100) {
            return "Labyrinth Exit";
        }
        else {
            return "error";
        }
    }

    public String toString() {
        String toReturn = "Width: " + this.width + "ft\n";
        toReturn += "Height: " + this.height + "ft\n";
        toReturn += "Encounter Level: " + this.EncounterLevel + "\n";
        toReturn += "Enemies Chance: " + this.EnemiesChance + "%\n";
        toReturn += "Branched Path?: " + this.Branch + "\n";
        toReturn += "River Cut Through?: " + this.River + "\n";
        toReturn += "Temporary Shelter?: " + this.Shelter + "\n";
        toReturn += "Connected To: " + this.ConnectedTo;
        return toReturn;

    }
}
