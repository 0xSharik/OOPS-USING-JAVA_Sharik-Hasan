import java.sql.*;

 class Update {


    static class DBConnection {

        public static Connection getConnection() {
            Connection con = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                 con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/jobportal?useSSL=false&serverTimezone=UTC",
                        "root",
                        "Sharik@12"
                );

                System.out.println("DB Connected");

            } catch (Exception e) {
                e.printStackTrace();
            }

            return con;
        }
    }

    public static boolean updateStudent(int id, String name, int marks) {

        String query = "UPDATE students SET name = ?, marks = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setInt(2, marks);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }


    public static void main(String[] args) {

        int id = 1;
        String name = "Sharik";
        int marks = 95;

        boolean result = updateStudent(id, name, marks);

        if (result) {
            System.out.println("Student updated successfully");
        } else {
            System.out.println("Update failed (ID may not exist)");
        }
    }
}


