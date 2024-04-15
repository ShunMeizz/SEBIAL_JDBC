package April15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) {
        try(Connection c = MySQLConnection.getConnection(); PreparedStatement pstmt = c.prepareStatement("INSERT INTO users(name, email) VALUES(?, ?)")){
                String name = "Shanley Mae Sebial";
                String email = "shanleymae.sebial@cit.edu";
                pstmt.setString(1, name);
                pstmt.setString(2, email);

                int rowsInserted = pstmt.executeUpdate();
                if(rowsInserted>0) {
                    System.out.println("Data inserted succesfully");
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
