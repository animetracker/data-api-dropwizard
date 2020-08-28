package database;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExampleObject
{
    @JsonProperty
    private int user_id, anilist_id, next_episode_number, notifications_on;

    @JsonProperty
    private String title, air_date, status, cover_image, description, notification_change, air_date_change;

    public ExampleObject()
    {}

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

    public String getDescription() {
        return description;
    }

    public int getNotifications_on() {
        return notifications_on;
    }

    public String getNotification_change() {
        return notification_change;
    }

    public String getAir_date_change() {
        return air_date_change;
    }
}
