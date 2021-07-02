public class Rivers {
    private int width;
    private int depth;
    private int speed;
    private String covered;
    private String rocky;
    private String Extras;
    private String ConnectedTo;
    public Rivers() {
        this.width = UserInterface.randomize(20, 200);
        this.depth = UserInterface.randomize(5, 60);
        this.speed = UserInterface.randomize(1, 10);
        this.covered = coveredRocks();
        this.rocky = coveredRocks();
        this.Extras = Addons();
        this.ConnectedTo = Connections();
    } 

    public void reset() {
        this.width = UserInterface.randomize(20, 200);
        this.depth = UserInterface.randomize(5, 60);
        this.speed = UserInterface.randomize(1, 10);
        this.covered = coveredRocks();
        this.rocky = coveredRocks();
        this.Extras = Addons();
        this.ConnectedTo = Connections();
    }

    public void addRiver() {
        this.width = UserInterface.percentMod(this.width, UserInterface.randomize(-10, 10));
        this.depth = UserInterface.percentMod(this.depth, UserInterface.randomize(-10, 10));
        this.speed = UserInterface.percentMod(this.speed, UserInterface.randomize(-10, 10));
        this.covered = coveredRocks();
        this.rocky = coveredRocks();
        this.Extras = Addons();
        this.ConnectedTo = Connections();
    }

    private String coveredRocks() {
        int temp = UserInterface.randomize(1, 10);
        if (temp == 1) {
            return "Yes";
        }
        else {
            return "No";
        }
    } 

    private String Addons() {
        int temp = UserInterface.randomize(1, 100);
        if (temp > 5) {
            return "No";
        }
        else {
            temp = UserInterface.randomize(1, 6);
            switch (temp) {
                case 1:
                    return "Straight River";
                case 2:
                    return "Passage";
                case 3:
                    return "Normal Room";
                case 4:
                    return "Treasure Room";
                case 5:
                    return "Boss Room";
                case 6:
                    return "Giant Room";
                default:
                    return "No";
            }
        }
    }

    private String Connections(){
        int temp = UserInterface.randomize(1, 100);
        if (UserInterface.isBetween(1, 80, temp)) {
            return "Straight River";
        }
        else if (UserInterface.isBetween(81, 91, temp)) {
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
        else if (UserInterface.isBetween(92, 97, temp)) {
            return "Underground Reservoir";
        }
        else if (UserInterface.isBetween(98, 100, temp)) {
            return "Waterfall leading 1 Level Down";
        }
        else {
            return "error";
        }
    }

    public String toString() {
        String toReturn = "Width: " + this.width + "ft\n";
        toReturn += "Depth: " + this.depth + "ft\n";
        toReturn += "Flow Speed: " + this.speed + "m/s\n";
        toReturn += "Covered?: " + this.covered + "\n";
        toReturn += "Rocky?: " + this.rocky + "\n";
        toReturn += "Add Ons?: " + this.Extras + "\n";
        toReturn += "Connected To: " + this.ConnectedTo;
        return toReturn;

    }

}
