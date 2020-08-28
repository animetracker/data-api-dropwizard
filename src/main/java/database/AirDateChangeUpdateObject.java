package database;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirDateChangeUpdateObject
{
    @JsonProperty
    private String air_date_change;

    public AirDateChangeUpdateObject()
    {}

    public String getAir_date_change() {
        return air_date_change;
    }
}
