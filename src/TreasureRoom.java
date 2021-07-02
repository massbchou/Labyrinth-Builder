public class TreasureRoom {
    private int gold;
    private String lootItems = "";
    private int norItems;
    private int LabItems;
    public TreasureRoom(int Tier) {
        if (Tier == 1) {
            this.gold = UserInterface.randomize(1, 1000);
            this.norItems = UserInterface.randomize(1, 2);
            this.LabItems = UserInterface.randomize(1, 4);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }
        else if (Tier == 2) {
            this.gold = UserInterface.randomize(500, 5000);
            this.norItems = UserInterface.randomize(2, 4);
            this.LabItems = UserInterface.randomize(2, 6);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }
        else if (Tier == 3) {
            this.gold = UserInterface.randomize(1000, 10000);
            this.norItems = UserInterface.randomize(3, 7);
            this.LabItems = UserInterface.randomize(4, 8);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }
        else {
            this.gold = UserInterface.randomize(100 * Tier, 100 * Tier * Tier);
            this.norItems = UserInterface.randomize(Tier, 2 * Tier + 1);
            this.LabItems = UserInterface.randomize(Tier + 1, (Tier + 1) * 2);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }

    }

    public TreasureRoom() {
        int Tier = getTier();
        if (Tier == 1) {
            this.gold = UserInterface.randomize(1, 1000);
            this.norItems = UserInterface.randomize(1, 2);
            this.LabItems = UserInterface.randomize(1, 4);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }
        else if (Tier == 2) {
            this.gold = UserInterface.randomize(500, 5000);
            this.norItems = UserInterface.randomize(2, 4);
            this.LabItems = UserInterface.randomize(2, 6);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }
        else if (Tier == 3) {
            this.gold = UserInterface.randomize(1000, 10000);
            this.norItems = UserInterface.randomize(3, 7);
            this.LabItems = UserInterface.randomize(4, 8);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }
        else {
            this.gold = UserInterface.randomize(100 * Tier, 100 * Tier * Tier);
            this.norItems = UserInterface.randomize(Tier, 2 * Tier + 1);
            this.LabItems = UserInterface.randomize(Tier + 1, (Tier + 1) * 2);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }

    }

    private int getTier() {
        int temp = UserInterface.randomize(1, 100);
        if (UserInterface.isBetween(1, 60, temp)) {
            return 1;
        }
        else if (UserInterface.isBetween(61, 90, temp)) {
            return 2;
        }
        else if (UserInterface.isBetween(91, 100, temp)) {
            return 3;
        }
        else {
            return UserInterface.randomize(1, 10);
        }
    }

    public void reset() {
        this.lootItems = "";
        int Tier = getTier();
        if (Tier == 1) {
            this.gold = UserInterface.randomize(1, 1000);
            this.norItems = UserInterface.randomize(1, 2);
            this.LabItems = UserInterface.randomize(1, 4);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }
        else if (Tier == 2) {
            this.gold = UserInterface.randomize(500, 5000);
            this.norItems = UserInterface.randomize(2, 4);
            this.LabItems = UserInterface.randomize(2, 6);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }
        else if (Tier == 3) {
            this.gold = UserInterface.randomize(1000, 10000);
            this.norItems = UserInterface.randomize(3, 7);
            this.LabItems = UserInterface.randomize(4, 8);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }
        else {
            this.gold = UserInterface.randomize(100 * Tier, 100 * Tier * Tier);
            this.norItems = UserInterface.randomize(Tier, 2 * Tier + 1);
            this.LabItems = UserInterface.randomize(Tier + 1, (Tier + 1) * 2);
            for (int i = 0; i < norItems; i++) {
            this.lootItems += norItemLoot() + ",\n";
            }
        }

    }

    private String norItemLoot() {
        int rarity = UserInterface.randomize(1, 100);
        if ((UserInterface.isBetween(1, 45, rarity))) {
            return UserInterface.rFilePull(UserInterface.CommonItemsFile);
        }
        else if (UserInterface.isBetween(46, 70, rarity)) {
            return UserInterface.rFilePull(UserInterface.UncommonItemsFile);
        }
        else if (UserInterface.isBetween(71, 85, rarity)) {
            return UserInterface.rFilePull(UserInterface.RareItemsFile);
        }
        else if (UserInterface.isBetween(86, 95, rarity)) {
            return UserInterface.rFilePull(UserInterface.VeryRareItemsFile);
        }
        else if (UserInterface.isBetween(96, 100, rarity)) {
            return UserInterface.rFilePull(UserInterface.LegendaryItemsFile);
        }
        else {
            return "error";
        }
    }

    public String toString() {
        String toReturn = "Gold Content: " + this.gold + "\n";
        toReturn += "Number of Labyrinth Items: " + this.LabItems + "\n";
        toReturn += "Normal Items: " + this.lootItems;
        

        return toReturn;
    }
}
