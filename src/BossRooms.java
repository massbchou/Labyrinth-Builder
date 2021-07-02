public class BossRooms {
    private String size;
    private int exits;
    private String boss;
    private String Affixes = "";

    public BossRooms(int Tier) {
        this.Affixes = "";
        if (Tier == 1) {
            this.size = "100 x 100";
            this.exits = UserInterface.randomize(0, 2);
            this.boss = "A CR " + UserInterface.randomize(3, 16) + " Creature";
            for (int i = 0; i < UserInterface.randomize(1, 3); i++) {
            this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes) + ",\n";
            }
            this.Affixes += "+1 to all stats";
        }
        else if (Tier == 2) {
            this.size = "300 x 300";
            this.exits = UserInterface.randomize(0, 3);
            this.boss = UserInterface.rFilePull(UserInterface.MidBossList);
            for (int i = 0; i < UserInterface.randomize(1, 2); i++) {
            this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes) + ",\n";
            }
            this.Affixes += UserInterface.rFilePull(UserInterface.MajorBossAffixes);
        }
        else if (Tier == 3) {
            this.size = "500 x 500";
            this.exits = UserInterface.randomize(0, 4);
            this.boss = UserInterface.rFilePull(UserInterface.MajorBossList);
            for (int i = 0; i < UserInterface.randomize(1, 2); i++) {
            this.Affixes += UserInterface.rFilePull(UserInterface.MajorBossAffixes) + ",\n";
            }
            this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes);
        }
        else {
            this.size = "500 x 500";
            this.exits = UserInterface.randomize(0, 4);
            this.boss = UserInterface.rFilePull(UserInterface.MajorBossList);
            for (int i = 0; i < UserInterface.randomize(1, 3); i++) {
            this.Affixes += UserInterface.rFilePull(UserInterface.MajorBossAffixes) + ",\n";
            }
            this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes);
            }
        }

        public BossRooms() {
            this.Affixes ="";
            int Tier = getTier();
            if (Tier == 1) {
                this.size = "100 x 100";
                this.exits = UserInterface.randomize(0, 2);
                this.boss = "A CR " + UserInterface.randomize(3, 16) + " Creature";
                for (int i = 0; i < UserInterface.randomize(1, 3); i++) {
                this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes) + ",\n";
                }
                this.Affixes += "+1 to all stats";
            }
            else if (Tier == 2) {
                this.size = "300 x 300";
                this.exits = UserInterface.randomize(0, 3);
                this.boss = UserInterface.rFilePull(UserInterface.MidBossList);
                for (int i = 0; i < UserInterface.randomize(1, 2); i++) {
                this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes) + ",\n";
                }
                this.Affixes += UserInterface.rFilePull(UserInterface.MajorBossAffixes);
            }
            else if (Tier == 3) {
                this.size = "500 x 500";
                this.exits = UserInterface.randomize(0, 4);
                this.boss = UserInterface.rFilePull(UserInterface.MajorBossList);
                for (int i = 0; i < UserInterface.randomize(1, 2); i++) {
                this.Affixes += UserInterface.rFilePull(UserInterface.MajorBossAffixes) + ",\n";
                }
                this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes);
            }
            else {
                this.size = "500 x 500";
                this.exits = UserInterface.randomize(0, 4);
                this.boss = UserInterface.rFilePull(UserInterface.MajorBossList);
                for (int i = 0; i < UserInterface.randomize(1, 3); i++) {
                this.Affixes += UserInterface.rFilePull(UserInterface.MajorBossAffixes) + ",\n";
                }
                this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes);
                }
            }

        public void reset() {
            this.Affixes = "";
            int Tier = getTier();
            if (Tier == 1) {
                this.size = "100 x 100";
                this.exits = UserInterface.randomize(0, 2);
                this.boss = "A CR " + UserInterface.randomize(3, 16) + " Creature";
                for (int i = 0; i < UserInterface.randomize(1, 3); i++) {
                this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes) + ",\n";
                }
                this.Affixes += "+1 to all stats";
            }
            else if (Tier == 2) {
                this.size = "300 x 300";
                this.exits = UserInterface.randomize(0, 3);
                this.boss = UserInterface.rFilePull(UserInterface.MidBossList);
                for (int i = 0; i < UserInterface.randomize(1, 2); i++) {
                this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes) + ",\n";
                }
                this.Affixes += UserInterface.rFilePull(UserInterface.MajorBossAffixes);
            }
            else if (Tier == 3) {
                this.size = "500 x 500";
                this.exits = UserInterface.randomize(0, 4);
                this.boss = UserInterface.rFilePull(UserInterface.MajorBossList);
                for (int i = 0; i < UserInterface.randomize(1, 2); i++) {
                this.Affixes += UserInterface.rFilePull(UserInterface.MajorBossAffixes) + ",\n";
                }
                this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes);
            }
            else {
                this.size = "500 x 500";
                this.exits = UserInterface.randomize(0, 4);
                this.boss = UserInterface.rFilePull(UserInterface.MajorBossList);
                for (int i = 0; i < UserInterface.randomize(1, 3); i++) {
                this.Affixes += UserInterface.rFilePull(UserInterface.MajorBossAffixes) + ",\n";
                }
                this.Affixes += UserInterface.rFilePull(UserInterface.BossAffixes);
                }
            }

        private int getTier() {
            int temp = UserInterface.randomize(1, 100);
            if (UserInterface.isBetween(1, 60, temp)) {
                return 1;
            }
            else if (UserInterface.isBetween(61, 95, temp)) {
                return 2;
            }
            else if (UserInterface.isBetween(96, 100, temp)) {
                return 3;
            }
            else {
                return UserInterface.randomize(1, 10);
            }
        }

        public String toString() {
            String toReturn = "Room Dimensions: " + this.size + "\n";
            toReturn += "Boss: " + this.boss + "\n";
            toReturn += "Exits: " + this.exits + "\n";
            toReturn += "Affixes: " + this.Affixes;

            
    
            return toReturn;
        }
    }

    

