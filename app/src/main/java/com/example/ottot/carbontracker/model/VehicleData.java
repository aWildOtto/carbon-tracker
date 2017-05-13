package com.example.ottot.carbontracker.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ottot on 2/28/2017.
 *
 * class to hold list of car make for car.
 */



public class VehicleData {
    private List<Make> makes;
    private int NumMake;
    public VehicleData(){
        makes = new ArrayList<Make>();
    }


    public Make getMakeByIndex(int index) {
        return makes.get(index);
    }

    public Make addMake(String make) {
        Make newMake = new Make(make);
        this.makes.add(newMake);
        NumMake++;
        return newMake;
    }

    //get all makes of the car
    public String[] getAllMakes(){
        String[] AllMakeNames = new String[NumMake];
        for (int i = 0; i <NumMake; i++){
            AllMakeNames[i] = getMakeByIndex(i).getMakeName();
        }
        return AllMakeNames;
    }

    public int getNumMake() {
        return NumMake;
    }
}
