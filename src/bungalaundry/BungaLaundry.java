/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bungalaundry;

import bungalaundry.UI.Login_Auth;

/**
 *
 * @author Lenovo
 */
public class BungaLaundry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Authenticate auth = new Authenticate();
        
        new Login_Auth().setVisible(true);
    }
    
}