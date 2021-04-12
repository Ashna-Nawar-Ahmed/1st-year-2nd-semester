
import javax.swing.*;
import java.awt.event.*;

public class GUICalculator implements ActionListener {

    int i;
    JTextField tf1;
    JButton b[] = new JButton[10];

    JFrame f = new JFrame();

    GUICalculator() {
        tf1 = new JTextField();
        tf1.setBounds(80, 10, 150, 40);

        int x = 10, y = 10;
        for (i = 0; i <= 9; i++) {
            b[i] = new JButton(Integer.toString(i));
            b[i].setBounds(x, y, 50, 50);
            x = x + 80;
            if (i % 3 == 0) {
                y = y + 60;
                x = 10;
            }
            f.add(b[i]);
            b[i].addActionListener(this);
        }
        f.add(tf1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton myButton = (JButton) e.getSource();
        tf1.setText(myButton.getText());

    }

    public static void main(String[] args) {
        new GUICalculator();
    }
}
