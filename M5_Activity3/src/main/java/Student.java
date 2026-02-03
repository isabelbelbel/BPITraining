import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {

	public void addStudent(String name, int age, String email) {
		
		String sql = "INSERT INTO student (name, age, email) VALUES (?, ?, ?)";
		
        try (Connection conn = DBConnection.getConnection();
        		PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, email);
            stmt.executeUpdate();
            
            System.out.println("Student added successfully!");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

	}
	
	public void displayStudents() {
        String sql = "SELECT * FROM student";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                                   rs.getString("name") + " | " +
                                   rs.getInt("age") + " | " +
                                   rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
