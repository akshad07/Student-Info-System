
//Student Info System Using Mysql

import com.Student.Studentdata;
import com.Student.StudentDao;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class jdbcapp {

    public static void main(String[]args)throws Exception
    {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Press 1 to Add Student");
            System.out.println("Press 2 to Delete Student");
            System.out.println("Press 3 to Display Student");
            System.out.println("Press 4 to Exit");
            int c = Integer.parseInt(br.readLine());
            if(c==1)
            {
                //Student details
                System.out.println("Enter Student Name :");
                String name = br.readLine();
                System.out.println("Enter Student Phone :");
                String phone = br.readLine();
                System.out.println("Enter Student City :");
                String city = br.readLine();
                Studentdata st = new Studentdata(name, phone, city);
                boolean answer = StudentDao.insertStudenttoDB(st);
                if(answer)
                {
                    System.out.println("Student is Added Successfully");
                }
                else
                {
                    System.out.println("Something went Wrong....Try Again");
                }
                System.out.println(st);

            }
            else if(c==2)
            {
                System.out.println("Enter Student ID to Delete :");
                int userID = Integer.parseInt(br.readLine());
                boolean f = StudentDao.deleteStudent(userID);
                if(f)
                {
                    System.out.println("Deleted Successfully");
                }
                else
                {
                    System.out.println("Something went Wrong....Try Again");
                }
            }
            else if(c==3)
            {
                StudentDao.showAllStudentapp();
            }
            else if(c==4)
            {
                break;
            }
            else
            {}
        }
        System.out.println("Thank You For Using Application");
    }
}
