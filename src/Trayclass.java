

import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import static java.sql.DriverManager.println;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sudesh
 */
public class Trayclass {
    static TrayIcon trayicon;

    public Trayclass() {
                show();

    }
     public  void show()
    {
        if(!SystemTray.isSupported())
        {
           println("This Feature is not Supported");
        }
        trayicon= new TrayIcon(createIcon("Images/trayicon.jpg","icon"));
        final SystemTray tray = SystemTray.getSystemTray();
        trayicon.setToolTip("HCMS");
       
        
        final PopupMenu menu = new PopupMenu();
        
        //add menu / menu items; 
        
        MenuItem msg1 = new MenuItem("Developer Details");
        MenuItem msg2 = new MenuItem("Exit");
        
        menu.add(msg1);
        menu.addSeparator();
        menu.add(msg2);
        
        trayicon.setPopupMenu(menu);    
        
        msg1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {                
            JOptionPane.showMessageDialog(null,"BCT #70052,70066,70078");
            }
        });
        
        msg2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            tray.remove(trayicon);
            System.exit(0);
            }
        });
        
        
            
        
        
   try {
       tray.add(trayicon);
   }   
   catch(Exception e)
           {
               
           }
   
    } 
     
     
    protected static Image createIcon(String path, String desc)
    {
        URL imageURL= Trayclass.class.getResource(path);
        return(new ImageIcon(imageURL, desc )).getImage();
 
    

}
}
