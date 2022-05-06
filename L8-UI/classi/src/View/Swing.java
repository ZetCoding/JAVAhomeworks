package View;
import Model.Service.*;
import Model.Entity.*;
import Model.Repository.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame implements ActionListener {
    JLabel label = new JLabel();
    Border border = BorderFactory.createLineBorder(Color.ORANGE,4);
    JButton btn = new JButton("Submit");
    JTextField textName,textUsername,textPassword,textEmail;
public Swing(){
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(600,450);
this.setLocation(100,90);
this.setTitle("Sign up!!");
this.setLayout(new FlowLayout(3));
ImageIcon icon = new ImageIcon("index1.jpg");
this.setIconImage(icon.getImage());
this.getContentPane().setBackground(new Color(0xADD8E6)); //0x3F0FB7
    textName  = new JTextField("Name: ",20);
    textName.setPreferredSize(new Dimension(125,25));

    textUsername = new JTextField("Username: ",25);
    textUsername.setPreferredSize(new Dimension(125,25));

    textPassword = new JTextField("Password: ",25);
    textPassword.setPreferredSize(new Dimension(125,25));

    textEmail = new JTextField("Email: ",35);
    textEmail.setPreferredSize(new Dimension(125,25));

btn.addActionListener(this);
this.add(label);
this.add(textName);
this.add(textUsername);
this.add(textPassword);
this.add(textEmail);
this.add(btn);
this.setVisible(true);

}
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource()==btn){
        System.out.println("Submitted into database!");
        btn.setEnabled(false);
        try {
            InfoSer.getInstance().save(new InfoEntityBuilder().setName(textName.getText()).setUsername(textUsername.getText())
                    .setPassword(textPassword.getText()).setEmail(textEmail.getText()));
        } catch (Exception k) {
            System.out.println("Fail to save!" + k.getMessage());
        }
    }
    }
}
