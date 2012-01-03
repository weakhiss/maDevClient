/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhis.aplikasiabsensi.ui.model;

import com.weakhis.aplikasiabsensi.presenter.LoginController;

/**
 *
 * @author kojek
 */
public class LoginModel extends AbstractModel {
    
    private Boolean enabledLogin;

    public LoginModel() {
    }

    public Boolean isEnabledLogin() {
        return enabledLogin;
    }

    public void setEnabledLogin(Boolean enabledLogin) {       
        this.enabledLogin = enabledLogin;
        firePropertyChange(LoginController.ENABLED_LOGIN_PROPERTY, null, enabledLogin);
    }
    
}
