package com.StudentPortal.ControllerMenu;

import com.StudentPortal.Login.PortalLogin;
import com.StudentPortal.Registration.StudentReistration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class StudentPortal_Menu {
    public static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    public static void Menu() throws IOException, SQLException {
        System.out.println("Press 1 to Login to Account");
        System.out.println("Don't have a Account ? Press 2 to Create Account");
        System.out.println("Login As ADMIN");
        int choice= Integer.parseInt(bf.readLine());
        if (choice==1)
        {
            PortalLogin.portalLogin();
        } else if (choice==2) {
            StudentReistration.registration();
        }

    }
}
