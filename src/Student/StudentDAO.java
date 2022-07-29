package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public static boolean  insertStudentToDB(Student student){

        try{
            Connection con = StudentConnection.createConnection();
            String query = "insert into students(sname, sphone, scity) values (?,?,?)";
            //Prepared Statement
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, student.getSname());
            stmt.setString(2, student.getSphone());
            stmt.setString(3, student.getScity());

            stmt.executeUpdate();

            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }

}
