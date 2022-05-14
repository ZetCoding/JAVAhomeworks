import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShowThread extends SwingThread implements Runnable {
    Connection connection;
    PreparedStatement preparedStatement;
    SwingThread obj = new SwingThread();

    @Override
    public void run() {
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##thread", "1234");
            preparedStatement = connection.prepareStatement("select * from info");
            ResultSet resultSet = preparedStatement.executeQuery();
            List<SwingThread> swingList = new ArrayList<>();
            SwingThread swing = new SwingThread();
            while (resultSet.next()) {
                swing.setMyName(resultSet.getString("name"));
                swing.setMyCodemelli(resultSet.getString("codemelli"));
                swing.setMyAge(resultSet.getString("age"));
                swingList.add(swing);
            }
        } catch (SQLException k) {
            System.out.println("An Error occurred!!");
        }

            JFrame frame = new JFrame();
            JLabel label = new JLabel();
            JLabel label2 = new JLabel();
            frame.setSize(400, 450);
            frame.setLocation(600, 90);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame.setTitle("Thread 2 is working!");
            frame.getContentPane().setBackground(new Color(0x1c80e3));
            frame.setLayout(null);
            label.setText(getMyName()+"\n"+getMyCodemelli()+"\n"+getMyAge());
            label.setBounds(40,50,200,30);
            frame.add(label);
            frame.setVisible(true);

        }

}
