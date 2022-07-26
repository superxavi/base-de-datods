
package ConProcedure;

import interfasconsql.*;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class main_Procedure {
    private Connection conex= null;
    
   
     
    
    public static  Connection getConexion() {
        
        try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       //conexion con base de datos
       String url="jdbc:sqlserver://localhost:1433;databaseName=escolast";
       Connection conex=DriverManager.getConnection(url, "sa", "123456");
        System.out.println("Conexion Exitosa main");
        }
        catch(ClassNotFoundException cnex){
            JOptionPane.showMessageDialog(null,"Error en el Driver"+ cnex.getMessage());
        }
        catch(SQLException sqlex){
            JOptionPane.showMessageDialog(null,"Error al conectar la BDD"+ sqlex.getMessage());
        }
        return null;
        
      
    }
    
   
    public static void main(String[] args) throws SQLException {
      
    getConexion();
   // main_Procedure jasper= new main_Procedure();
    
         la_ultima v1=new la_ultima();
        v1.setVisible(true);
        
        
    }//fin main
    /*
    
    
    
    
    
    */
}//fin conexion
