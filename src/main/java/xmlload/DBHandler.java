package xmlload;

import java.sql.*;
import org.apache.log4j.*;


public class DBHandler {

    private static final Logger LOGGER = Logger.getLogger(DBHandler.class);

    String USER = "";
    String PASS = "";

    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL = "kingshills.cz";

    Connection conn;

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    Statement stmt;

    public void runCheck() throws Throwable {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            LOGGER.info("JDBC Driver loaded");
            LOGGER.info("Trying to connect to DB...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            LOGGER.info("Creating statement "+stmt);
            stmt = conn.createStatement();
            String sql="";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){

            }
            rs.close();
            stmt.close();
            conn.close();

        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error(e);
        }







    }

}
