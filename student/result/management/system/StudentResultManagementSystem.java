/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.result.management.system;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class StudentResultManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String classname="com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(classname);
             System.out.println("Successful");
        } catch (ClassNotFoundException ex) {
            System.out.println("Failed");
            System.out.println(ex.getMessage());
        }
       
        
    }
    
}
