package com.deleco.app.model;

import java.io.Serializable;

public class Researcher implements Serializable {
    public Researcher(String name, String grade, String urlIG, String urlLI, String urlGit, int drawableId) {
        Name = name;
        this.grade = grade;
        this.urlIG = urlIG;
        this.urlLI = urlLI;
        this.urlGit = urlGit;
        this.drawableId =drawableId;
    }

    public String getName() {
        return Name;
    }

    public String getGrade() {
        return grade;
    }

    public String getUrlIG() {
        return urlIG;
    }

    public String getUrlLI() {
        return urlLI;
    }

    public String getUrlGit() {
        return urlGit;
    }

    public int getDrawableId() {
        return drawableId;
    }

    private String Name;
    private String grade;
    private String urlIG;
    private String urlLI;
    private String urlGit;
    private int drawableId;
}
