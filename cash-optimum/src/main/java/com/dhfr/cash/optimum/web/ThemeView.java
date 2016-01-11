package com.dhfr.cash.optimum.web;

import com.dhfr.common.util.DateFormatter;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import javax.inject.Inject;
//import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

//@Named(value = "themeView")
@ManagedBean(name ="themeView" )
@SessionScoped
public class ThemeView implements Serializable {

    @ManagedProperty(value = "#{dateFormatter}")
//    @Inject
 
    private DateFormatter dateFormatter;
    private String color;

    public String getColor() {
//        System.out.println("  Hahhaha "+dateFormatter.getDayPattern());
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void change(String color) {
        System.out.println("  Hahhaha " + dateFormatter);
        if (color.equals("green")) {
            this.color = null;
        } else {
            this.color = "-" + color;
        }
    }

    public void setDateFormatter(DateFormatter dateFormatter) {
        this.dateFormatter = dateFormatter;
    }

}
