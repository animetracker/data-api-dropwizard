package database;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeriesAiringUpdateObject
{
    @JsonProperty
    private int next_episode_number;

    @JsonProperty
    private String air_date, status;

    public SeriesAiringUpdateObject()
    {}

    public int getNext_episode_number() {
        return next_episode_number;
    }

    public String getAir_date() {
        return air_date;
    }

    public String getStatus() {
        return status;
    }
}
