package database;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NotificationsOnUpdateObject
{
    @JsonProperty
    private int notifications_on;

    public NotificationsOnUpdateObject()
    {}

    public int getNotifications_on() {
        return notifications_on;
    }
}
