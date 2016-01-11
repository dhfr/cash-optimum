package com.dhfr.cash.optimum.web;

import com.dhfr.cash.optimum.entity.PasswordComplexity;
import com.dhfr.cash.optimum.service.PasswordComplexityService;
import com.dhfr.common.util.DateFormatter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


//@Named(value = "themeView")
@ManagedBean(name ="themeView" )
@SessionScoped
public class ThemeView implements Serializable {

//    @ManagedProperty(value = "#{dateFormatter}")
//    @Inject
   @ManagedProperty(value = "#{passwordComplexityService}")
    private PasswordComplexityService passwordComplexityService;
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
       try {
           PasswordComplexity passwordComplexity = passwordComplexityService.getByCode("passconfigcode");
           passwordComplexityService.update(passwordComplexity);
           System.out.println("  Hahhaha " + passwordComplexity.getEmailNotification());
           if (color.equals("green")) {
               this.color = null;
           } else {
               this.color = "-" + color;
           }
       } catch (Exception ex) {
           Logger.getLogger(ThemeView.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    public void setPasswordComplexityService(PasswordComplexityService passwordComplexityService) {
        this.passwordComplexityService = passwordComplexityService;
    }

    
}
