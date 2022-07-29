import Student.Student;
import Student.StudentDAO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1: Insert student record");
            System.out.println("2: Delete student record");
            System.out.println("3: Update student record");
            System.out.println("4: Show all students records");
            System.out.println("5: Exit Program\n");

            int userInput = Integer.parseInt(sc.nextLine());

            if(userInput == 1){
                System.out.println(">>Enter name");
                String name = sc.nextLine();
                System.out.println(">>Enter phone");
                String phone = sc.nextLine();
                System.out.println(">>Enter city");
                String city = sc.nextLine();

                Student student = new Student(name, phone, city);
                if(StudentDAO.insertStudentToDB(student)){
                    System.out.println(">>Inserted record successfully");
                }else{
                    System.out.println(">>Record insertion failed1");
                }
            }
            else if(userInput == 2){
                
            }
            else if(userInput == 3){

            } else if (userInput == 4) {

            }
            else if(userInput == 5){
                System.out.println("\nProgram exiting successfully...\n");
                break;
            }

        }

    }
}
