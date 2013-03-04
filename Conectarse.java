import java.sql.*;
import java.util.Properties;

public class Conectarse {
    
    public Conectarse(){}
    
    public void conectar(){
        Connection conn = null;
        Statement sentencia = null;
        ResultSet resultados = null;
        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost/test";
            Properties props = new Properties();
            props.setProperty("user","usrprueba");
            props.setProperty("password","usrprueba");
            conn = DriverManager.getConnection(url, props);
            sentencia = conn.createStatement();
            resultados = sentencia.executeQuery("select * from usuario");
            while(resultados.next()){
                System.out.print("id: "+resultados.getString(1));
                System.out.print("\t");
                System.out.println("Nombre: "+resultados.getString(2));
            }
        } catch (ClassNotFoundException | SQLException miExcepcion){
            System.out.println("Excepcion encontrada: "+miExcepcion.getMessage());
        } finally {
            if(resultados != null){
                try{ resultados.close(); } catch(SQLException sqle){}
            }
            if(sentencia != null){
                try { sentencia.close(); } catch(SQLException sqle){}
            }
            if(conn != null){
                try { conn.close(); } catch(SQLException sqle){}
            }
        }
    }
    
    public static void main(String args[]){
        Conectarse con = new Conectarse();
        con.conectar();
    }
}
