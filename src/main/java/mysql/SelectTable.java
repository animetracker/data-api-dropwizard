package mysql;

import java.sql.*;

public class SelectTable
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

            IO io = new IO();

            int selection = Integer.parseInt(io.getNextInput());

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String query = "select * from anime_list where user_id=" + selection ;

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);



            System.out.println("||" + "id" + "|" + "AniList_id" + "|" + "title" + "|" + "next_episode_number" + "|" + "UTC_air_date_of_next_episode" + "|" + "status" + "|" + "user_id" + "||");

            while(rs.next())
            {
                int id = rs.getInt("id");
                int AniList_id = rs.getInt("AniList_id");
                String title = rs.getString("title");
                int next_episode_number = rs.getInt("next_episode_number");
                String UTC_air_date_of_next_episode = rs.getString("UTC_air_date_of_next_episode");
                String status = rs.getString("status");
                int user_id = rs.getInt("user_id");

                System.out.println("||" + id + "|" + AniList_id + "|" + title + "|" + next_episode_number + "|" + UTC_air_date_of_next_episode + "|" + status + "|" + user_id + "||");
            }
            st.close();
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
