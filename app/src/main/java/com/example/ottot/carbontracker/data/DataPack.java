package com.example.ottot.carbontracker.data;

import com.example.ottot.carbontracker.model.Journey;

/**
 * Created by ottot on 2/24/2017.
 *
 * an singleton class to hold journey data for editing journey.
 * also holds unit setting.
 */




public class DataPack {
    private static DataPack all_data = new DataPack();
    private Journey editJourney;



    private String unit_setting;//kg/tree hour;

    //edit journey
    public Journey getEditJourney() {
        return editJourney;
    }

    public void setEditJourney(Journey editJourney) {
        this.editJourney = editJourney;
    }



    public String getUnit_setting() {
        return unit_setting;
    }

    public void setUnit_setting(String unit_setting) {
        this.unit_setting = unit_setting;
    }

    public static DataPack getData(){
        return all_data;
    }


    private DataPack(){
    }





}
