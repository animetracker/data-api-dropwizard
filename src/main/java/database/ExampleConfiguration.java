package database;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ExampleConfiguration extends Configuration
{
    @Valid @NotNull @JsonProperty("database")
    private DataSourceFactory db = new DataSourceFactory();

    public void setDb(DataSourceFactory db)
    {
        this.db = db;
    }

    public DataSourceFactory getDb()
    {
        return db;
    }
}
