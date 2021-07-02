import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JLabel;
    public class WindowManager extends Frame implements WindowListener,ActionListener {
        ArrayList<Button> bList = new ArrayList<Button>();
        ArrayList<String> cList = new ArrayList<String>(); 

        public WindowManager(String Name, ArrayList<Button> buttons, ArrayList<String> commands) {

                super(Name);
                setLayout(new FlowLayout());
                addWindowListener(this);
                
                for (int i = 0; i < buttons.size(); i++) {
                    buttonAdder(buttons.get(i), commands.get(i));
                }
                
                
        }
        

        public void buttonAdder(Button b, String ActionCommand) {
            add(b);
            b.addActionListener(this);
            b.setActionCommand(ActionCommand);
        }

        public void actionPerformed(ActionEvent e) {
                if ("Exit".equals(e.getActionCommand())) {
                    dispose();
                    System.exit(0);
                }
                else if ("Make New Window".equals(e.getActionCommand())) {
                    clearLists();
                    Button end = new Button("End Task");
                    bList.add(end);
                    cList.add("Exit");

                    windowMaker(500, 500, "New Window", bList, cList);
                }
                else if ("Make New River".equals(e.getActionCommand())) {
                    clearLists();
                    UserInterface.river.reset();
                    Button addRiver = new Button("Connect New River");
                    bList.add(addRiver);
                    cList.add("Add River");
                    textWindow(500, 500, "New River", bList, cList, UserInterface.river.toString());
                }
                else if ("Add River".equals(e.getActionCommand())) {
                    clearLists();
                    UserInterface.river.addRiver();
                    Button addRiver = new Button("Connect New River");
                    bList.add(addRiver);
                    cList.add("Add River");
                    textWindow(500, 500, "Connected River", bList, cList, UserInterface.river.toString());
                }
                else if ("Make New Passage".equals(e.getActionCommand())) {
                    clearLists();
                    UserInterface.passage.reset();
                    Button addPassage = new Button("Connect New Passage");
                    bList.add(addPassage);
                    cList.add("Add Passage");
                    textWindow(500, 500, "New Passage", bList, cList, UserInterface.passage.toString());
                }
                else if ("Add Passage".equals(e.getActionCommand())) {
                    clearLists();
                    UserInterface.passage.addPassage();
                    Button addPassage = new Button("Connect New Passage");
                    bList.add(addPassage);
                    cList.add("Add Passage");
                    textWindow(500, 500, "Connected Passage", bList, cList, UserInterface.passage.toString());
                }
                else if ("Make New Normal Room".equals(e.getActionCommand())) {
                    clearLists();
                    UserInterface.Nroom.reset();
                    Button newNormal = new Button("Make New Normal Room");
                    bList.add(newNormal);
                    cList.add("Make New Normal Room");
                    textWindow(500, 500, "Normal Room", bList, cList, UserInterface.Nroom.toString());
                }
                else if ("Make New Giant Room".equals(e.getActionCommand())) {
                    clearLists();
                    UserInterface.Groom.reset();
                    Button newGiant = new Button("Make New Giant Room");
                    bList.add(newGiant);
                    cList.add("Make New Giant Room");
                    textWindow(500, 500, "Giant Room", bList, cList, UserInterface.Groom.toString());
                }
                else if ("Make New Treasure Room".equals(e.getActionCommand())) {
                    clearLists();
                    UserInterface.Troom.reset();
                    Button newTreasure = new Button("Make New Treasure Room");
                    bList.add(newTreasure);
                    cList.add("Make New Treasure Room");
                    textWindow(500, 500, "Treasure Room", bList, cList, UserInterface.Troom.toString());
                }
                else if ("Make New Boss Room".equals(e.getActionCommand())) {
                    clearLists();
                    UserInterface.Broom.reset();
                    Button newTreasure = new Button("Make New Boss Room");
                    bList.add(newTreasure);
                    cList.add("Make New Boss Room");
                    textWindow(500, 500, "Boss Room", bList, cList, UserInterface.Broom.toString());
                }
        }

        public void clearLists() {
            bList.clear();
            cList.clear();
        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {
            this.setVisible(false);
        }

        public void windowMaker(int xSize, int ySize, String Name, ArrayList<Button> buttons, ArrayList<String> commands) {
            WindowManager myWindow = new WindowManager(Name, buttons, commands);
                myWindow.setSize(xSize,ySize);
                myWindow.setVisible(true);
        }
        public void textWindow(int xSize, int ySize, String Name, ArrayList<Button> buttons, ArrayList<String> commands, String Text) {
            WindowManager myWindow = new WindowManager(Name, buttons, commands);
            JLabel text = new JLabel("Temp");
            myWindow.add(text);
            text.setText("<html>" + Text.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>");
            myWindow.setSize(xSize,ySize);
            myWindow.setVisible(true);
        }


}

