package jdbcpool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidTest {
    public static void main(String[] args) {
        Connection connection = JDBCUtil.getConnection();
        String sql ="insert into person(id, name)values(?,?)";

        PreparedStatement statement1 = null;
        PreparedStatement statement2 = null;

        try {
            statement1 = connection.prepareStatement(sql);
            statement2 = connection.prepareStatement(sql);
            statement1.setInt(1,15);
            statement1.setString(2,"元祖");
            int num1 = statement1.executeUpdate();
            statement2.setInt(1,16);
            statement2.setString(2,"风灵");
            int num2 = statement2.executeUpdate();
            System.out.println("num1"+","+"num2");
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                JDBCUtil.close(statement1,connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
