package com.ahpandroid.domain.entity;

import java.io.Serializable;

/**
 * Created by denisvieira on 19/02/17.
 */

public class Criterion  implements Serializable {

    private final String mGuid;
    private String mTitle;

    public Criterion(String guid, String title) {
        this.mGuid      = guid;
        this.mTitle     = title;
    }

    public String getGuid() {
        return mGuid;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

}
