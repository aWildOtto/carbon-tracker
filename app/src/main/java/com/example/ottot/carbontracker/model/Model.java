package com.example.ottot.carbontracker.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ottot on 2/28/2017.
 *
 * class to hold car model data for car.
 */



public class Model {
    private String model;
    private List<Year> years;
    private int NumYear;

    public Model(String model){
        this.model = model;
        years = new ArrayList<>();
    }

    //year
    public Year addYear(String yearNum){
        Year newYear = new Year(yearNum);
        this.years.add(newYear);
        NumYear++;
        return newYear;
    }
    public String[] getAllYears(){
        String[] AllYears = new String[NumYear];
        for (int i = 0; i <NumYear; i++){
            AllYears[i] = years.get(i).getYearName();
        }
        return AllYears;
    }

    public int getNumYear(){return NumYear;}

    public String getModelName() {
        return model;
    }

    public Year getYearByIndex(int yearCode) {
        return years.get(yearCode);
    }
}
