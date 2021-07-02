public class GiantRoom {
    private int exits;
    private int challengeLevel;
    private String environment;
    

    public GiantRoom(){
        this.exits = UserInterface.randomize(0, 6);
        this.environment = UserInterface.rFilePull(UserInterface.GiantRoomsFile);
        this.challengeLevel = UserInterface.randomize(5, 15);
    }

    public void reset(){
        this.exits = UserInterface.randomize(0, 6);
        this.environment = UserInterface.rFilePull(UserInterface.GiantRoomsFile);
        this.challengeLevel = UserInterface.randomize(5, 15);
    }


    public String toString() {
        String toReturn = "Number of Exits: " + this.exits + "\n";
        toReturn += "Environment: " + this.environment + "\n";
        toReturn += "Average Challenge Rating: " + this.challengeLevel;
        

        return toReturn;

    }
    
}
