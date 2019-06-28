package com.example.danilo.appdebts.classes;

/**
 * Created by danilo on 24/06/19.
 */

public class Category {
    private long mId;
    private String mType;

    public Category() {

    }

    public Category(String type) {
        mType = type;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }
}
