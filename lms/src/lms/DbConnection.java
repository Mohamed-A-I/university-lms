/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

/**
 *
 * @author Mohamed
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class DbConnection {
   
   public static Connection connect(){
        Connection con=null;
   try {
        String db  = "university.odb";
                  Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
               Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
          con = DriverManager.getConnection("jdbc:hsqldb:file:" + db, "","");
            JOptionPane.showMessageDialog(null, "connected");
        }catch(Exception e){
    System.out.println ("Class not found");
    }
        return con;
   }
    
     public static void main(String[] args) {
        
        connect();
    }
    
}
