package com.example.ottot.carbontracker.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ottot on 2/28/2017.
 *
 * class to hold car make data for car.
 */



public class Make {
    private String make;
    private List<Model> models;
    private int NumModel;


    public Make(String makeName){
        make = makeName;
        models = new ArrayList<>();
    }

    public Model getModelByIndex(int index){
        return models.get(index);
    }

    public Model addModel(String modelName){
        Model newModel = new Model(modelName);
        models.add(newModel);
        NumModel++;
        return newModel;
    }

    public String[] getAllModels(){
        String[] AllModelNames = new String[NumModel];
        for (int i = 0; i <NumModel; i++){
            AllModelNames[i] = getModelByIndex(i).getModelName();
        }
        return AllModelNames;
    }

    public String getMakeName() {
        return make;
    }


    public int getNumModel() {
        return NumModel;
    }
}
