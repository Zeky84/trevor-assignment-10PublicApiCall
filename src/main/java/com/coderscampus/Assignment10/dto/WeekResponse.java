package com.coderscampus.Assignment10.dto;

import com.coderscampus.Assignment10.dto.Week;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
    @JsonProperty("week")
    private Week weekToFeed;

    public Week getWeekToFeed() {
        return weekToFeed;
    }

    public void setWeekToFeed(Week weekToFeed) {
        this.weekToFeed = weekToFeed;
    }
}
