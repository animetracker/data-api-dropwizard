package mysql;

import java.io.IOException;
import java.sql.*;
import java.util.*;
import org.json.JSONObject;

public class SQLInsert
{
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_connect";

    static final String USER = "splunk_user";
    static final String PASS = "password";

    public static void main(String[] args)
    {
        try
        {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String query = "insert into anime_list (AniList_id, TVDB_id, title, continuous, next_episode_number, UTC_air_date_of_next_episode, status)"
                    + "values (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, 420);
            ps.setInt(2, 6996);
            ps.setString(3, "Unused Tools");
            ps.setInt(4, 0);
            ps.setInt(5, 7);
            ps.setString(6, "20/4/69 8:09");
            ps.setString(7, "RELEASING");

            ps.execute();

            conn.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("Got an exception!");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }


}
