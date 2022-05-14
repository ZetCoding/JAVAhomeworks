import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class SwingThread extends JFrame implements Runnable, ActionListener {
    public Connection connection;
    public PreparedStatement preparedStatement;
    JTextField nameText,ageText,codeMelliText;
    JButton btn = new JButton("Submit");
    String myName,MyCodemelli,myAge;

    @Override
    public void run() {
        JFrame frame = new JFrame();
        JLabel nameLabel,ageLabel,codeMelliLabel;

        frame.setSize(400,450);
        frame.setLocation(100,90);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("Thread 1 is working!");
        frame.getContentPane().setBackground(new Color(0xdbbc0b));
        frame.setLayout(null);

        nameLabel = new JLabel("Name :");
        nameLabel.setBounds(35,35,125,30);
        nameLabel.setFont(new Font(null,Font.BOLD,18));
        nameText = new JTextField(10);
        nameText.setBounds(105,35,130,30);
        codeMelliLabel = new JLabel("Code Melli :");
        codeMelliLabel.setBounds(35,80,125,30);
        codeMelliLabel.setFont(new Font(null,Font.BOLD,18));
        codeMelliText = new JTextField(10);
        codeMelliText.setBounds(150,80,130,30);
        ageLabel = new JLabel("Age :");
        ageLabel.setBounds(35,125,125,30);
        ageLabel.setFont(new Font(null,Font.BOLD,18));
        ageText = new JTextField(10);
        ageText.setBounds(90,125,130,30);

        btn.setBounds(155,255,90,30);
        btn.setFocusable(true);
        btn.addActionListener(this);
        frame.add(nameLabel);
        frame.add(nameText);
        frame.add(codeMelliLabel);
        frame.add(codeMelliText);
        frame.add(ageLabel);
        frame.add(ageText);
        frame.add(btn);
        frame.setVisible(true);

        setMyName(nameText.getText());
        setMyCodemelli(codeMelliText.getText());
        setMyAge(ageText.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){
            {
                try {
                    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##thread", "1234");
                    preparedStatement = connection.prepareStatement("insert into info(name,codemelli,age) values(?,?,?)");
                    preparedStatement.setString(1, nameText.getText());
                    preparedStatement.setString(2, codeMelliText.getText());
                    preparedStatement.setString(3, ageText.getText());
                    preparedStatement.executeUpdate();
                    System.out.println("Added to Database successfully");
                } catch (SQLException k){
                    System.out.println("An Error occurred!!");
                }
            }
            btn.setEnabled(false);
        }
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyCodemelli() {
        return MyCodemelli;
    }

    public void setMyCodemelli(String myCodemelli) {
        MyCodemelli = myCodemelli;
    }

    public String getMyAge() {
        return myAge;
    }

    public void setMyAge(String myAge) {
        this.myAge = myAge;
    }
}
