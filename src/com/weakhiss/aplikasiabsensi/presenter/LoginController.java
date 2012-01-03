/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhiss.aplikasiabsensi.presenter;

import com.weakhiss.aplikasiabsensi.model.User;
import com.weakhiss.aplikasiabsensi.app.MainApps;

/**
 *
 * @author kojek
 */
public class LoginController extends AbstractController {
    
    public static final String ENABLED_LOGIN_PROPERTY = "EnabledLogin";
    
    public LoginController() {
    }  
    
    public void validateLogin(String userName, String password){
        User user = MainApps.getUserService().getUser(userName, password);
       if(user != null){
           setModelProperty(ENABLED_LOGIN_PROPERTY, true);
       } else {
           setModelProperty(ENABLED_LOGIN_PROPERTY, false);
       }
    }
    
}
