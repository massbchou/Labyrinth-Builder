import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;
//readSpecific((int)Math.floor(Math.random()*(countLineBufferedReader(textFile)-0+1)+0), textFile)
//C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\textfile
public class UserInterface {
        public static String SpellFile = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\Spells.txt";
        public static String NormalRoomsFile = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\NroomFile.txt";
        public static String GiantRoomsFile = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\GiRoomFile.txt";
        public static String CommonItemsFile = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\CommonItems.txt";
        public static String UncommonItemsFile = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\UncommonItems.txt";
        public static String RareItemsFile = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\RareItems.txt";
        public static String VeryRareItemsFile = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\VeryRareItems.txt";
        public static String LegendaryItemsFile = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\LegendaryItems.txt";
        public static String BossAffixes = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\BossAffixes.txt";
        public static String MajorBossAffixes = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\MajorBossAffixes.txt";
        public static String MidBossList = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\MidBossList.txt";
        public static String MajorBossList = "C:\\Users\\bchou\\OneDrive\\Documents\\My Projects\\Labyrinth Builder\\src\\textfiles\\MajorBossList.txt";
        
        public static Rivers river = new Rivers();
        public static Passages passage = new Passages();
        public static NormalRoom Nroom = new NormalRoom();
        public static GiantRoom Groom = new GiantRoom();
        public static TreasureRoom Troom = new TreasureRoom();
        public static BossRooms Broom = new BossRooms();

        public static void main(String[] args) {
            ArrayList<Button> buttons = new ArrayList<Button>();
            
            ArrayList<String> commands = new ArrayList<String>();
            Button b = new Button("New Window");
            Button b2 = new Button("End Program");
            Button rivers = new Button("Make New River");
            Button passage = new Button("Make New Passage");
            Button NormalRoom = new Button("Make New Normal Room");
            Button GiantRoom = new Button("Make New Giant Room");
            Button TreasureRoom = new Button("Make New Treasure Room");
            Button BossRoom = new Button("Make New Boss Room");
            buttons.add(b);
            buttons.add(b2);
            buttons.add(rivers);
            buttons.add(passage);
            buttons.add(NormalRoom);
            buttons.add(GiantRoom);
            buttons.add(TreasureRoom);
            buttons.add(BossRoom);
            commands.add("Make New Window");
            commands.add("Exit");
            commands.add("Make New River");
            commands.add("Make New Passage");
            commands.add("Make New Normal Room");
            commands.add("Make New Giant Room");
            commands.add("Make New Treasure Room");
            commands.add("Make New Boss Room");
            WindowManager MainWindow = new WindowManager("LabyrinthBuilder", buttons, commands);
            MainWindow.setSize(500, 500);
            MainWindow.show();
        }

        public static int randomize(int min, int max) {

            return (int)(Math.random() * (max - min + 1) + min);
        }

        public static boolean isBetween(int first, int second, int num) {

            return (num >= first && num <= second);
        }

        public static boolean perChance(int chance){

            return chance >= (int)(Math.random() * (100 - 1 + 1) + 1);
        }

        public static String rFilePull(String filename) {
            return readSpecific((int)Math.floor(Math.random()*(countLineBufferedReader(filename)-0+1)+0), filename);
        }

        public static String pullSpell(int level) {
            String spell = "";
            int ceiling = 0;
            int floor = 0;
            
            switch (level) {
                case 0:
                    ceiling = 49;
                    floor = 0;
                    break;
                case 1:
                    ceiling = 139;
                    floor = 50;
                    break;
                case 2:
                    ceiling = 226;
                    floor = 140;
                    break;
                case 3:
                    ceiling = 304;
                    floor = 227;
                    break;
                case 4:
                    ceiling = 363;
                    floor = 305;
                    break;
                case 5:
                    ceiling = 427;
                    floor = 364;
                    break;
                case 6:
                    ceiling = 478;
                    floor = 428;
                    break;
                case 7:
                    ceiling = 507;
                    floor = 479;
                    break;
                case 8:
                    ceiling = 531;
                    floor = 508;
                    break;
                default:
                    ceiling = 554;
                    floor = 532;
    
            }
            
            spell += readSpecific((int)Math.floor(Math.random()*(ceiling-floor+1)+floor), SpellFile);
            
    
    
            return spell;
        }




public static int countLineBufferedReader(String fileName) {

    int lines = 0;
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        while (reader.readLine() != null) lines++;
    } catch (IOException e) {
        e.printStackTrace();
    }
    return lines;

}

public static String readSpecific(int line, String File) {
    String lineIWant = "";
    try(FileInputStream fs = new FileInputStream(File)) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(fs))){
            for(int i = 0; i < line-1; i++){
                br.readLine();
            }
            lineIWant = br.readLine();
        
        } catch (Exception e) {
            e.printStackTrace();
        }

        } catch (Exception e) {
        e.printStackTrace();
    }
    return lineIWant;
    }

    public static int percentMod(double num, double percent) {
        
        return (int)(num * ((percent / 100) + 1));
    }


}

