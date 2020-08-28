package database;


import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SeriesResultMapper  implements RowMapper<Series> {

    @Override
    public Series map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new Series(
                rs.getInt("user_id"),
                rs.getInt("anilist_id"),
                rs.getInt("next_episode_number"),
                rs.getInt("notifications_on"),
                rs.getString("title"),
                rs.getString("air_date"),
                rs.getString("status"),
                rs.getString("cover_image"),
                rs.getString("description"),
                rs.getString("notification_change"),
                rs.getString("air_date_change"));
    }
}
