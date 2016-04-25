package com.suryabhan;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

public class LearndropwizardConfiguration extends Configuration {

    private DataSourceFactory database = new DataSourceFactory();

    @JsonProperty("database")
    public DataSourceFactory getDatabase() {
        return database;
    }



}
