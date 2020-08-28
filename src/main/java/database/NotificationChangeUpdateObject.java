package database;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NotificationChangeUpdateObject
{
    @JsonProperty
    private String notification_change;

    public NotificationChangeUpdateObject()
    {}

    public String getNotification_change() {
        return notification_change;
    }
}
