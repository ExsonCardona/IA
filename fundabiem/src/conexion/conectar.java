package conexion;

import java.sql.*;
import javax.swing.*;


public class conectar {
Connection conect = null;
   public Connection conexion()
                     
           
    {
      try {
             
           
           Class.forName("com.mysql.jdbc.Driver");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/fundabiem","root","");     
      } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     }}
