package database;

import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import java.util.List;


public interface myDAO
{
    @SqlQuery("select title from anime_list where user_id = :user_id and title = :title")
    String findTitle(@Bind("user_id") int user_id, @Bind("title") String title);

    @SqlQuery("select * from anime_list where user_id = :user_id")
    @RegisterRowMapper(SeriesResultMapper.class)
    List<Series> getList(@Bind("user_id") int user_id);

    @SqlUpdate("delete from anime_list where user_id = :user_id and anilist_id = :anilist_id")
    void remove(@Bind("user_id") int user_id, @Bind("anilist_id") int anilist_id);

    @SqlUpdate("insert into anime_list (user_id, anilist_id, title, next_episode_number, air_date, status, cover_image, description, notifications_on, notification_change, air_date_change) values (:user_id, :anilist_id, :title, :next_episode_number, :air_date, :status, :cover_image, :description, :notifications_on, :notification_change, :air_date_change)")
    void insert(@Bind("user_id") int user_id, @Bind("anilist_id") int AniList_id,  @Bind("title") String title, @Bind("next_episode_number") int next_episode_number, @Bind("air_date") String air_date, @Bind("status") String status, @Bind("cover_image") String cover_image, @Bind("description") String description, @Bind("notifications_on") int notifications_on, @Bind("notification_change") String notification_change, @Bind("air_date_change") String air_date_change );

    @SqlUpdate("update anime_list set next_episode_number = :next_episode_number, air_date = :air_date, status = :status where anilist_id = :anilist_id and user_id = :user_id")
    void updateAiring(@Bind("user_id") int user_id, @Bind("anilist_id") int aniList_id, @Bind("next_episode_number") int next_episode_number, @Bind("air_date") String air_date, @Bind("status") String status);

    @SqlUpdate("update anime_list set notifications_on = :notifications_on where anilist_id = :anilist_id and user_id = :user_id")
    void updateNotificationsOn(@Bind("user_id") int user_id, @Bind("anilist_id") int aniList_id, @Bind("notifications_on") int notifications_on);

    @SqlUpdate("update anime_list set notification_change = :notification_change where anilist_id = :anilist_id and user_id = :user_id")
    void updateNotificationChange(@Bind("user_id") int user_id, @Bind("anilist_id") int aniList_id, @Bind("notification_change") String notification_change);

    @SqlUpdate("update anime_list set air_date_change = :air_date_change where anilist_id = :anilist_id and user_id = :user_id")
    void updateAirDateChange(@Bind("user_id") int user_id, @Bind("anilist_id") int aniList_id, @Bind("air_date_change") String air_date_change);
}
