package woodchucks.db;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <<Details>>
 *
 * @author reaflash
 * @date 2019-11-28
 */
public class DBConnection {

    Logger logger = Logger.getLogger(
            DBConnection.class.getName());

    public static void main(String[] args) {



        String url = "jdbc:postgresql://localhost:5432/woodchucks";
        String user = "realflash";
        String password = "test1234";

        String query = "SELECT id, name, from_date FROM stakeholder_role;"
                + "SELECT id, name FROM operation;";

        Connection con=null;

        try {
             con = DriverManager.getConnection(url, user, password);
            System.out.println("Success 1 - " );
        } catch (SQLException ex) {
            System.out.println("Error 1 - " + ex.getMessage());
        }

        if(con !=null) {
            try {
                PreparedStatement pst = con.prepareStatement(query);

                    boolean isResult = pst.execute();

                    do {

                            ResultSet rs = pst.getResultSet();
                            while (rs.next()) {

                                System.out.print(rs.getInt(1));
                                System.out.print(": ");
                                System.out.println(rs.getString(2));
                            }

                            isResult = pst.getMoreResults();

                    } while (isResult);

            } catch (SQLException ex) {
                    System.out.println("Error 3 - " + ex.getMessage());
                Logger lgr = Logger.getLogger(
                        DBConnection.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        } else {
            System.out.println("Error 2 - " + "con is null");
        }
    }
}
