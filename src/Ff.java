import java.sql.*;

public class Ff {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:3333/SpaceMarineBase",
                "postgres", "3016");

        Statement stmt;
        stmt = c.createStatement();
            String sql = "CREATE TABLE USER_TABLE " +
                    "(ID SERIAL PRIMARY KEY     NOT NULL," +
                    " USER_NAME           TEXT    NOT NULL, " +
                    " USER_PASS            TEXT     NOT NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        }

}
