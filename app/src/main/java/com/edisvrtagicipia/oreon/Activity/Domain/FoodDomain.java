package com.edisvrtagicipia.oreon.Activity.Domain;

import java.io.Serializable;
import java.util.ArrayList;

public class FoodDomain implements Serializable {
    private String title;
    private String pic;
    private String desc;
    private String preparetime;

    public FoodDomain(String title, String pic, String desc, String preparetime) {
        this.title = title;
        this.pic = pic;
        this.desc = desc;
        this.preparetime = preparetime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPreparetime() {
        return preparetime;
    }

    public void setPreparetime(String preparetime) {
        this.preparetime = preparetime;
    }
}
