package com.Student;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class StudentDao {
    //To Enter Student info in System
    public static boolean insertStudenttoDB(Studentdata st )
    {
        boolean f = false;
        try
        {

            Connection con = CP.createC();
            //Query for Enter Data of Students
            String q = "insert into Studentapp (Student_Name,Student_Phone,Student_City) values (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1,st.getName());
            pstmt.setString(2,st.getPhone());
            pstmt.setString(3,st.getCity());

            pstmt.executeUpdate();

            f=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return f;

    }
    //To Delete Student info from System
    public static boolean deleteStudent(int userID)
    {
        boolean f = false;
        try
        {
            Connection con = CP.createC();
            String q = "delete from Studentapp where Student_ID=?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,userID);
            pstmt.executeUpdate();

            f=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }

    // To Show All Students in System
    public static void showAllStudentapp() {
        boolean f = false;
        try
        {
            Connection con = CP.createC();
            String q = "select * from Studentapp";
            Statement stmt = con.createStatement();
            ResultSet set=stmt.executeQuery(q);
            while (set.next())
            {
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString(4);
                System.out.println("ID :" +id);
                System.out.println("Name :" +name);
                System.out.println("Phone : " +phone);
                System.out.println("City : " + city);
                System.out.println("-----------------------------------------------------");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
