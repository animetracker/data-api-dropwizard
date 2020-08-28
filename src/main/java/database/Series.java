package database;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Series
{
    @JsonProperty
    private final int user_id, anilist_id, next_episode_number, notifications_on;
    @JsonProperty
    private final String title, air_date, status, cover_image, description, notification_change, air_date_change;

    public Series(int user_id, int anilist_id, int next_episode_number, int notifications_on, String title, String air_date, String status, String cover_image, String description, String notification_change, String air_date_change) {
        this.user_id = user_id;
        this.anilist_id = anilist_id;
        this.next_episode_number = next_episode_number;
        this.notifications_on = notifications_on;
        this.title = title;
        this.air_date = air_date;
        this.status = status;
        this.cover_image = cover_image;
        this.description = description;
        this.notification_change = notification_change;
        this.air_date_change = air_date_change;
    }

    public int getAnilist_id() {
        return anilist_id;
    }

    public String getAir_date() {
        return air_date;
    }

    public String getCover_image() {
        return cover_image;
    }

    public int getUser_id(){return user_id;}

    public int getNext_episode_number(){return next_episode_number;}

    public String getTitle(){return title;}

    public String getStatus(){return status;}

    public int getNotifications_on() {
        return notifications_on;
    }

    public String getNotification_change() {
        return notification_change;
    }

    public String getDescription() {
        return description;
    }

    public String getAir_date_change() {
        return air_date_change;
    }
}
