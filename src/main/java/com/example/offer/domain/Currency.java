package com.example.offer.domain;

/**
 * Created by Markrijnbeek on 30/07/2018.
 */
public class Currency {

    private String code;

    private String description;

    public Currency (String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
