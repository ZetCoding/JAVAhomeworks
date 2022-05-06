import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame implements ActionListener {
    JTextField username,password;
    JLabel usernameLabel,passwordLabel;
    JButton btn = new JButton("Login");
    Swing(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setLocation(100,90);
        this.setTitle("Login");
        this.setLayout(null);
        ImageIcon icon = new ImageIcon("images.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(0xADD8E6));
        username = new JTextField(20);
        username.setBounds(90,20,140,30);
        usernameLabel = new JLabel("Username : ");
        usernameLabel.setBounds(10,20,125,30);

        password = new JTextField(20);
        password.setBounds(90,60,140,30);
        passwordLabel = new JLabel("Password : ");
        passwordLabel.setBounds(10,60,125,30);

        btn.setBounds(100,200,200,40);
        btn.setFocusable(false);
        btn.addActionListener(this);
        this.add(usernameLabel);
        this.add(username);
        this.add(passwordLabel);
        this.add(password);
        this.add(btn);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){
            this.dispose();
            EditPage newPage = new EditPage();
        }
    }
}
