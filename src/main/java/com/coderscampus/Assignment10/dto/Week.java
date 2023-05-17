package com.coderscampus.Assignment10.dto;

import com.coderscampus.Assignment10.dto.DayResponse;

public class Week {

    private DayResponse monday = new DayResponse();
    private DayResponse tuesday = new DayResponse();
    private DayResponse wednesday = new DayResponse();
    private DayResponse thursday = new DayResponse();
    private DayResponse friday = new DayResponse();
    private DayResponse saturday = new DayResponse();
    private DayResponse Sunday = new DayResponse();

    public DayResponse getMonday() {
        return monday;
    }

    public void setMonday(DayResponse monday) {
        this.monday = monday;
    }

    public DayResponse getTuesday() {
        return tuesday;
    }

    public void setTuesday(DayResponse tuesday) {
        this.tuesday = tuesday;
    }

    public DayResponse getWednesday() {
        return wednesday;
    }

    public void setWednesday(DayResponse wednesday) {
        this.wednesday = wednesday;
    }

    public DayResponse getThursday() {
        return thursday;
    }

    public void setThursday(DayResponse thursday) {
        this.thursday = thursday;
    }

    public DayResponse getFriday() {
        return friday;
    }

    public void setFriday(DayResponse friday) {
        this.friday = friday;
    }

    public DayResponse getSaturday() {
        return saturday;
    }

    public void setSaturday(DayResponse saturday) {
        this.saturday = saturday;
    }

    public DayResponse getSunday() {
        return Sunday;
    }

    public void setSunday(DayResponse sunday) {
        Sunday = sunday;
    }
}
