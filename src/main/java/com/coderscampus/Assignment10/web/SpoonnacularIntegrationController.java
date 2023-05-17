package com.coderscampus.Assignment10.web;

import com.coderscampus.Assignment10.dto.DayResponse;
import com.coderscampus.Assignment10.dto.WeekResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class SpoonnacularIntegrationController {

    @Value("${spoonacular.urls.base}")
    private String spoonacularUrlBase;

    @Value("${spoonacular.urls.mealplan}")
    private String spoonacularUrlsMealplan;

    public SpoonnacularIntegrationController() {
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
        RestTemplate rt = new RestTemplate();
        URI uri = getUri(numCalories, diet, exclusions, "day", spoonacularUrlBase, spoonacularUrlsMealplan);
        return rt.getForEntity(uri, DayResponse.class);
    }

    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getDayMeals(String numCalories, String diet, String exclusions) {
        RestTemplate rt = new RestTemplate();
        URI uri = getUri(numCalories, diet, exclusions, "week", spoonacularUrlBase, spoonacularUrlsMealplan);
        return rt.getForEntity(uri, WeekResponse.class);
    }

    private static URI getUri(String numCalories, String diet, String exclusions, String weekOrDay,
                              String spoonacularUrlBase, String spoonacularUrlsMealplan) {



        return UriComponentsBuilder.fromHttpUrl(spoonacularUrlBase + spoonacularUrlsMealplan)
                .queryParam("timeFrame", weekOrDay)
                .queryParam("targetCalories", numCalories)
                .queryParam("diet", diet)
                .queryParam("exclude", exclusions)
                .queryParam("apiKey", "15cacd376b9b4449b40e8bbf61f9385a")
                .build()
                .toUri();
    }
}
