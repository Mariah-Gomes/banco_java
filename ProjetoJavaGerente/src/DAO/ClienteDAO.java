
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Cliente;

public class ClienteDAO {
    
    private Connection conn;

    public ClienteDAO(Connection conn) {
        this.conn = conn;
    }
    
    
    
}
