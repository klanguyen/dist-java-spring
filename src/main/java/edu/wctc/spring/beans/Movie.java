package edu.wctc.spring.beans;

import edu.wctc.spring.services.LogService;

public class Movie {
    private int id;
    private String mName;
    private String overview;
    private int year;

    private LogService ls;

    public void setLs(LogService ls) {
        this.ls = ls;
    }

    public Movie(LogService ls) {
        this.ls = ls;
    }

    public String logChange(){
        return ls.getLogMessage("The database was changed");
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
