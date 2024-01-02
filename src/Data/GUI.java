package Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JButton bproses;
    private JTextArea taAngka;
    private JLabel total;
    private JPanel main;
    public JPanel getMain(){
        return main;
    }
    public GUI() {
        bproses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Metode data = new Metode();

                taAngka.setText(data.getUrutanAngka());
                total.setText(String.valueOf(data.getTotalJumlah()));

                System.out.println(data.getUrutanAngka());
            }
        });
    }
}
