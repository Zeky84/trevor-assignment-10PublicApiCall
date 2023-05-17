package com.coderscampus.Assignment10.dto;

import com.coderscampus.Assignment10.dto.Meals;
import com.coderscampus.Assignment10.dto.Nutrients;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DayResponse {
    @JsonProperty("meals")
    private List<Meals> mealsToFeed;

    @JsonProperty("nutrients")
    private Nutrients nutrientsToFeed;

    public List<Meals> getMeals() {
        return mealsToFeed;
    }

    public void setMeals(List<Meals> meals) {
        this.mealsToFeed = meals;
    }

    public Nutrients getNutrientsToFeed() {
        return nutrientsToFeed;
    }
    public void setNutrientsToFeed(Nutrients nutrientsToFeed) {
        this.nutrientsToFeed = nutrientsToFeed;
    }

}
