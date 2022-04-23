package Model.Repository;
import Model.Entity.Entity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repo implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;

    public Repo() throws Exception{
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##ex2","myjava");
        connection.setAutoCommit(false);
    }

    public void insert(Entity enti) throws Exception{
        preparedStatement=connection.prepareStatement ("INSERT INTO mynet(attempts, hajm) VALUES (?,?)");
        preparedStatement.setLong (1,0);
        preparedStatement.setLong(2,0);
        preparedStatement.executeUpdate ();
    }


    public List<Entity> select() throws Exception{
        preparedStatement=connection.prepareStatement ("SELECT * FROM net");
        ResultSet resultSet=preparedStatement.executeQuery ();
        List<Entity> entiList=new ArrayList <> ();
        while (resultSet.next ()){
            Entity enti=new Entity ();
            enti.setId (resultSet.getLong ("id"));
            enti.setHajm (resultSet.getLong ("hajm_GB"));
            enti.setPrice(resultSet.getString("price"));
            entiList.add (enti);
        }
        return entiList;
    }

    public void commit() throws Exception{
        connection.commit ();
    }
    public void rollback() throws Exception{
        connection.rollback ();
    }
    public void close() throws Exception{
        preparedStatement.close ();
        connection.close ();
    }

}
