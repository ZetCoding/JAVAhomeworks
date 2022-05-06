package Model.Repository;
import Model.Entity.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InfoRepo implements AutoCloseable{
private PreparedStatement preparedStatement;
private Connection connection;
public InfoRepo() throws Exception {
    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##ex2","myjava");
    connection.setAutoCommit(false);
}
public void insert(InfoEntityBuilder infoObj) throws Exception{
    preparedStatement = connection.prepareStatement("insert into mvc_info(name,username,password,email) values (?,?,?,?)");
    preparedStatement.setString(1,infoObj.getName());
    preparedStatement.setString(2,infoObj.getUsername());
    preparedStatement.setString(3,infoObj.getPassword());
    preparedStatement.setString(4,infoObj.getEmail());
    preparedStatement.executeUpdate();
}

    public void update (InfoEntityBuilder infoObj) throws Exception{
        preparedStatement=connection.prepareStatement ("UPDATE mvc_info SET username=?,password=? WHERE email=? ");
        preparedStatement.setString (1,"belfi13");
        preparedStatement.setString (2,"138181");
        preparedStatement.setString(3,infoObj.getEmail());
        preparedStatement.executeUpdate ();
    }

    public void delete(String email) throws Exception{
        preparedStatement=connection.prepareStatement ("DELETE FROM mvc_info WHERE email=?");
        preparedStatement.setString (1,email);
        preparedStatement.executeUpdate ();
    }

    public List<InfoEntityBuilder> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM mvc_info");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<InfoEntityBuilder> infoEntiBuilderList=new ArrayList<>();
        while (resultSet.next ()){
            InfoEntityBuilder infoEntiBuilder=new InfoEntityBuilder ();
            infoEntiBuilder.setName (resultSet.getString ("name"));
            infoEntiBuilder.setUsername (resultSet.getString ("username"));
            infoEntiBuilder.setPassword (resultSet.getString ("password"));
            infoEntiBuilder.setEmail (resultSet.getString ("email"));
            infoEntiBuilderList.add (infoEntiBuilder);
        }
        return infoEntiBuilderList;
    }
    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
