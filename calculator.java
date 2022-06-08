import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.lang.Math;

class calculator extends JFrame implements ActionListener {

    JButton jb1,jb2,jb3,jb4,jb5;
    JTextField jt1, jt2;
    JLabel lbl;

    calculator() {

        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);

        lbl = new JLabel("Result :");
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);

        jb1 = new JButton("+");
        jb1.setBounds(90, 200, 100, 30);
        add(jb1);
        
        jb2 = new JButton("-");
        jb2.setBounds(90, 250, 100, 30);
        add(jb2);
        
        jb3 = new JButton("*");
        jb3.setBounds(200, 200, 100, 30);
        add(jb3);
        
        jb4 = new JButton("/");
        jb4.setBounds(200, 250, 100, 30);
        add(jb4);
//        
        jb5 = new JButton("%");
        jb5.setBounds(320, 200, 100, 30);
        add(jb5);
       

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(jt1.getText());
        int b = Integer.parseInt(jt2.getText());
        int c = 0;

        if (e.getSource().equals(jb1)) {
            c = a + b;
            lbl.setText(String.valueOf(c));
        }
        else if(e.getSource().equals(jb2)) {
            c = Math.abs(a - b);
            lbl.setText(String.valueOf(c));
        }
        else if(e.getSource().equals(jb3)) {
            c = a * b;
            lbl.setText(String.valueOf(c));
        }
        else if(e.getSource().equals(jb4)) {
            c = a / b;
            lbl.setText(String.valueOf(c));
        }
        else if (e.getSource().equals(jb5)) {
            c = a % b;
            lbl.setText(String.valueOf(c));
        }
    }

    public static void main(String args[]) {
        calculator t = new calculator();
    }
}
