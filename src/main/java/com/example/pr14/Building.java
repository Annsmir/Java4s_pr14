package com.example.pr14;

import java.sql.Date;

public class Building{
    private String type;
    private Date creationDate;

    public Building(String type, Date creationDate) {
        this.type = type;
        this.creationDate = creationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Building{" +
                "type='" + type + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
