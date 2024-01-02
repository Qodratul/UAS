package Data;

import javax.swing.*;

public class RunMain {
    public static void main(String[] args) {
        JFrame data = new JFrame();
        data.setContentPane(new GUI().getMain());
        data.setSize(640, 400);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setVisible(true);
    }
}
