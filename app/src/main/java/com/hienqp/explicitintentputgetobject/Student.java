package com.hienqp.explicitintentputgetobject;

import java.io.Serializable;

public class Student implements Serializable {
    private String fullName;
    private int yearBirth;

    public Student(String fullName, int yearBirth) {
        this.fullName = fullName;
        this.yearBirth = yearBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
}
