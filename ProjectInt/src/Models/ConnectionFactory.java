package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost:3306/pi";
    private static final String USER = "root";
    private static final String PASS = "system";
    private static Connection c = null; 

    public Connection getConnection(boolean autoCommit) {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
    		c = DriverManager.getConnection(URL, USER, PASS);
    		c.setAutoCommit(autoCommit);
    		return c;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement ps) {

        closeConnection(con);

        try {

            if (ps != null) {
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement ps, ResultSet rs) {

        closeConnection(con, ps);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}