import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Swing extends JFrame implements ActionListener {
    PreparedStatement preparedStatement;
    Connection connection;
    JFrame frame = new JFrame();
    JLabel label = new JLabel("  1.Name      2.Lastname      3.Age      4.Phone number  ");
    Border border = BorderFactory.createLineBorder(Color.ORANGE,4);
    JButton btn = new JButton("Submit");
    JTextField textName,textLastname,textAge,textPhoneNumber;
    Swing() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(590, 400);
        this.setTitle("Registration");
        this.setLocation(100, 90);
        this.setLayout(new FlowLayout(3));
        ImageIcon icon = new ImageIcon("image.png");
       this.setIconImage(icon.getImage());
       this.getContentPane().setBackground(Color.GRAY);
       label.setFont(new Font("MV Boli",Font.PLAIN,14));
       label.setBorder(border);
       btn.setBounds(700,700,800,700);
       btn.addActionListener(this);
       btn.setFocusable(false);
       textName = new JTextField(10);
       textName.setPreferredSize(new Dimension(125,25));
       textLastname = new JTextField(10);
       textLastname.setPreferredSize(new Dimension(125,25));
       textAge = new JTextField(10);
       textAge.setPreferredSize(new Dimension(125,25));
       textPhoneNumber = new JTextField(10);
       textPhoneNumber.setPreferredSize(new Dimension(125,25));

        this.add(textName);
        this.add(textLastname);
        this.add(textAge);
        this.add(textPhoneNumber);
        this.add(label);
        this.add(btn);
        //this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            System.out.println("Submitted!");
            try {
                connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##ui","java1234");
                preparedStatement = connection.prepareStatement("INSERT INTO info(name,lastname,age,phonenumber) VALUES (?,?,?,?)");
                preparedStatement.setString(1, textName.getText());
                preparedStatement.setString(2, textLastname.getText());
                preparedStatement.setLong(3, Long.parseLong(textAge.getText()));
                preparedStatement.setString(4,textPhoneNumber.getText());
                preparedStatement.executeUpdate();
            }catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        }
}
