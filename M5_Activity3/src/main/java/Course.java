import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Course {
	
	 public void addCourse(String courseName, String grade, int studentId) {
		 
		 String sql = "INSERT INTO course (course_name, grade, student_id) VALUES (?, ?, ?)";
		 try (Connection conn = DBConnection.getConnection();
				 PreparedStatement stmt = conn.prepareStatement(sql)) {
			 
	        stmt.setString(1, courseName);
	        stmt.setString(2, grade);
	        stmt.setInt(3, studentId);
	        stmt.executeUpdate();
	        
	        System.out.println("Course added successfully!");
		 } catch (Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
	 
	 public void displayCourses() {
	        String sql = "SELECT c.id, c.course_name, c.grade, s.name AS student_name " +
	                     "FROM course c JOIN student s ON c.student_id = s.id";
	        try (Connection conn = DBConnection.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
	            while (rs.next()) {
	                System.out.println(rs.getInt("id") + " | " +
	                                   rs.getString("course_name") + " | " +
	                                   rs.getString("grade") + " | " +
	                                   rs.getString("student_name"));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
