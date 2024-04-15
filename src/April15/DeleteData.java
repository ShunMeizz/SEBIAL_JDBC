package April15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        try(Connection c = MySQLConnection.getConnection(); PreparedStatement pstmt = c.prepareStatement("DELETE FROM users WHERE id=?")){
            int idtoDelete = 2;
            pstmt.setInt(1, idtoDelete);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data deleted succesfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
