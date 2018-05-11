package com.javachort3.project_weather_;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.sun.xml.internal.ws.developer.Serialization;


public class Query {



    private int numberCount;



    private String creationDate;



    private String language;



    private Results resultList;

    public Query() {}

    @JsonProperty("count")
    public int getNumberCount() {
        return numberCount;
    }
    @JsonProperty("count")
    public void setNumberCount(int numberCount) {
        this.numberCount = numberCount;
    }

    @JsonProperty("created")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("created")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("lang")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("lang")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("results")
    public Results getResultList() {
        return resultList;
    }
    @JsonProperty("results")
    public void setResultList(Results resultList) {
        this.resultList = resultList;
    }

    @Override
    public String toString() {
        return "Query{" +
                "numberCount=" + numberCount +
                ", creationDate='" + creationDate + '\'' +
                ", language='" + language + '\'' +
                ", resultList=" + resultList +
                '}';
    }
}
