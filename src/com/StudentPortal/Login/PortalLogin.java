package com.StudentPortal.Login;

import com.StudentPortal.PortalUtility.StudentPortal_Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PortalLogin {
        public static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

    public static void portalLogin() throws IOException, SQLException {

        System.out.println("Enter UserName : ");
        String uname=bf.readLine();
       Connection connection=StudentPortal_Utility.MyConnection();
        Statement statement=connection.createStatement();
        String sql1="Select * from users where userName='"+uname+"'";
        ResultSet resultSet=statement.executeQuery(sql1);
        if (resultSet.next()==false)
        {
            System.out.println("USERNAME Not Found");
        }
        else {
            System.out.println("Enter Password : ");
            String pass = bf.readLine();

            String sql2="SELECT * from users where userName='"+uname+"'"+" and"+" password='"+pass+"'";

            ResultSet resultSet1=statement.executeQuery(sql2);
            if (resultSet1.next())
            {
                System.out.println("LOGIN SUCCESSFUL:::::");
                System.out.println("WELCOME:::::");


            }
            else
            {
                System.out.println("WWrong Username or Password");
            }

        }
    }
}
