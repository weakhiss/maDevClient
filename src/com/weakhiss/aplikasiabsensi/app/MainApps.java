/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.weakhiss.aplikasiabsensi.app;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import com.weakhiss.aplikasiabsensi.presenter.LoginController;
import com.weakhiss.aplikasiabsensi.service.UserService;
import com.weakhiss.aplikasiabsensi.ui.model.LoginModel;
import com.weakhiss.aplikasiabsensi.ui.view.LoginDialog;
import com.weakhiss.aplikasiabsensi.ui.view.MainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.jdesktop.application.SingleFrameApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jeks
 */
public class MainApps extends SingleFrameApplication{

    private static ApplicationContext applicationContext;
    
    private MainFrame main;
    private LoginModel loginModel;
    private LoginController loginController;
    private LoginDialog loginView;
        
    @Override
    protected void startup() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());            
        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        applicationContext = new ClassPathXmlApplicationContext("spring.ctx.xml");
                
        this.loginModel = (LoginModel) applicationContext.getBean("loginModel");
        this.loginView = (LoginDialog) applicationContext.getBean("loginView");
        this.loginController = (LoginController) applicationContext.getBean("loginController");      
        loginController.addModel(loginModel);
        loginController.addView(loginView);
        
        this.main = (MainFrame) applicationContext.getBean("mainFrame");
        main.showMain();
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void main(String[] args) {
        launch(MainApps.class, args);
    }

    public static  UserService getUserService(){
        return (UserService) applicationContext.getBean("userService");
    }
}
