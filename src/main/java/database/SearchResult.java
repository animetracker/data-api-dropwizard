package database;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult
{
    @JsonProperty
    private int user_id, anilist_id, next_episode_number;
    @JsonProperty
    private String title, air_date, status, cover_image;

    public SearchResult(int user_id, int aniList_id, int next_episode_number, String title, String UTC_air_date_of_next_episode, String status, String cover_image) {
        this.user_id = user_id;
        this.anilist_id = aniList_id;
        this.next_episode_number = next_episode_number;
        this.title = title;
        this.air_date = UTC_air_date_of_next_episode;
        this.status = status;
        this.cover_image = cover_image;
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
}
