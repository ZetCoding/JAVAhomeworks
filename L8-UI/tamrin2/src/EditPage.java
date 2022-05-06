import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class EditPage extends JFrame implements ActionListener {
    Connection connection;
    PreparedStatement preparedStatement;
    JLabel intro,usernameLabel,passwordLabel;
    JButton button = new JButton("Submit");
    JTextField name,username,password;
    EditPage(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,500);
        this.setLocation(250,120);
        this.setTitle("Edit Profile");
        this.setLayout(null);
        ImageIcon icon = new ImageIcon("images.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(0xC0C0C0));
        intro = new JLabel("You can edit your information!");
        intro.setBounds(100,2,300,30);
        intro.setFont(new Font("MV Boli",Font.BOLD,16));

        username = new JTextField(20);
        username.setBounds(130,70,140,30);
        usernameLabel = new JLabel("New Username : ");
        usernameLabel.setBounds(36,70,140,30);

        password = new JTextField(20);
        password.setBounds(130,150,140,30);
        passwordLabel = new JLabel("New Password : ");
        passwordLabel.setBounds(36,150,140,30);

        button.setBounds(100,300,200,40);
        button.setFocusable(false);
        button.addActionListener(this);

        this.add(intro);
        this.add(button);
        this.add(usernameLabel);
        this.add(username);
        this.add(passwordLabel);
        this.add(password);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            {
                try {
                    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##ui", "java1234");
                    preparedStatement = connection.prepareStatement("UPDATE tamrin2 SET username=?,password=? WHERE id=1 ");
                    preparedStatement.setString(1,username.getText());
                    preparedStatement.setString(2,password.getText());
                    preparedStatement.executeUpdate();
                    System.out.println("Edited successfully");
                } catch (SQLException k){
                    System.out.println("An Error occurred!!");
                }
            }
            button.setEnabled(false);
        }
    }
}
