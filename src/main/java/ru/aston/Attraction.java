package ru.aston;

import java.util.Date;

public class Attraction {
    protected String atrName;
    protected String workingHours;
    protected int cost;
    protected int ID;
    // для удобства поиска аттракционов добавлено поле ID

    public Attraction(String atrName, String workingHours, int cost, int ID) {
        this.atrName = atrName;
        this.workingHours = workingHours;
        this.cost = cost;
        this.ID = ID;
    }


}
