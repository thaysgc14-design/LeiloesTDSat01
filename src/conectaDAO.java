import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");            
            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11", "root", "root");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado: " + e.getMessage());
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
        return conn;
    }
    
}
