package April15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        try(Connection c = MySQLConnection.getConnection(); PreparedStatement pstmt = c.prepareStatement("UPDATE users SET name=?, email=? WHERE id=?")){
                String name = "Michieda Shunsuke";
                String email = "michieda.shunsuke@cit.edu";
                pstmt.setString(1, name);
                pstmt.setString(2, email);
                int idtoUpdate = 2;
                pstmt.setInt(3, idtoUpdate);
                int rowsUpdated = pstmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Data updated succesfully");
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
