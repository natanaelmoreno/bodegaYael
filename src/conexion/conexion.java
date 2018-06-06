package conexion;

import java.sql.*;
import javax.swing.JOptionPane;
public class conexion {
public String bd = "java";
  private String url = "jdbc:mysql://localhost:3306/yael";
    private String login = "root"; //Administrador de MySQL
    private String password = "natanaelmoreno";
      private Connection cnx = null;
    private Statement sttm = null;
    private ResultSet rst = null;
    
public Statement conectar() {
Connection conn = null;
Statement st=null;
try {
Class.forName("org.gjt.mm.mysql.Driver");
conn = DriverManager.getConnection(url, login, password);
if (conn != null)
{
 System.out.println("Yeah, hemos conectado con  "+url+" ... Ok");
 st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

//conn.close();
}
}
catch(SQLException ex) {
System.out.println("Rayos!!! Hubo un problema al conectar con la base "+url);
}
catch(ClassNotFoundException ex) {
System.out.println(ex);
}
   return st;
}

  //método para Update, Insert, Delete
    public void UID(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, login, password);
            sttm = cnx.createStatement();
            sttm.executeUpdate(sql); //statement
        } catch (ClassNotFoundException  c) {
            JOptionPane.showMessageDialog(null, "ERROR: " + c.getMessage());
            System.exit(1); //salir de aplicación
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
            System.exit(1);
        }
    }
    //Método para Consultar
    public ResultSet getValores(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, login, password);
            sttm = cnx.createStatement();
            rst = sttm.executeQuery(sql);  //resultset
        } catch (ClassNotFoundException c) {
            JOptionPane.showMessageDialog(null, "ERROR: " + c.getMessage());
            System.exit(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
            System.exit(1);
        } 
        return rst;
        
    }
}