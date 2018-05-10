import com.sun.javafx.runtime.SystemProperties;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion {
    private JButton btnHolaMundo;
    private JPanel panel1;
    private JTable table1;
    private JRadioButton radioButton1;

    public Aplicacion() {
        btnHolaMundo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola Mundo");
            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


}
