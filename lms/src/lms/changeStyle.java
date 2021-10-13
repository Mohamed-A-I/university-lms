/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import javax.swing.UIManager;

/**
 *
 * @author mohamed
 */
public class changeStyle {
    
    
    String style[]={"com.jtattoo.plaf.smart.SmartLookAndFeel",
        "com.jtattoo.plaf.acryl.AcrylLookAndFeel",
        "com.jtattoo.plaf.aero.AeroLookAndFeel",
        "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel",
        "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel",
        "com.jtattoo.plaf.fast.FastLookAndFeel",
        "com.jtattoo.plaf.graphite.GraphiteLookAndFeel",
        "com.jtattoo.plaf.hifi.HiFiLookAndFeel",
        "com.jtattoo.plaf.luna.LunaLookAndFeel",
        "com.jtattoo.plaf.mcwin.McWinLookAndFeel",
        "com.jtattoo.plaf.mint.MintLookAndFeel",
        "com.jtattoo.plaf.noire.NoireLookAndFeel",
        "com.jtattoo.plaf.smart.SmartLookAndFeel",
        "com.jtattoo.plaf.texture.TextureLookAndFeel",
        
    
    
    };
    
    public void look(int indx){
                    try {
                        
                        UIManager.setLookAndFeel(style[indx]);
                    } catch (Exception ex){
                    
                    }
                }
                
                public void look(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            
        } 
                }
    
}
