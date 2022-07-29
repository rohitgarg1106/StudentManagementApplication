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


    public static boolean  deleteStudentFromDB(int studentId){

        try{
            Connection con = StudentConnection.createConnection();
            String query = "delete from students where id=?";
            //Prepared Statement
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, Integer.toString(studentId));

            stmt.executeUpdate();

            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return false;

    }

    public static boolean updateStudentInDB(int studentId, Student newStudent) {

        try{
            Connection con = StudentConnection.createConnection();
            String query = "update students set sname = ?, sphone = ?, scity = ? where id = ?";

            //Prepared Statement
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, newStudent.getSname());
            stmt.setString(2, newStudent.getSphone());
            stmt.setString(3, newStudent.getScity());
            stmt.setString(4, Integer.toString(studentId));

            stmt.executeUpdate();

            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
