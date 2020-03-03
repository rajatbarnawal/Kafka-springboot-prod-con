package com.example.demo.model;

import java.io.Serializable;

public class MoreSimpleModel implements Serializable{
	private String firstName;
    private String lastName;

    public MoreSimpleModel(String title, String description) {
        this.firstName = title;
        this.lastName = description;
    }

    public MoreSimpleModel(){}

    public String getTitle() {
        return firstName;
    }

    public void setTitle(String title) {
        this.firstName = title;
    }

    public String getDescription() {
        return lastName;
    }

    public void setDescription(String description) {
        this.lastName = description;
    }

    @Override
    public String toString() {
        return "MoreSimpleModel{" +
                "title='" + firstName + '\'' +
                ", description='" + lastName + '\'' +
                '}';
    }


}
