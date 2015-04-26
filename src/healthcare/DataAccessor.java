/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Jing Liang
 */
public class DataAccessor {
    public static User getUser(String username)
    {
        //get user from the database
        String fileName="data/"+ username;
        User user = null;
        try
        {
            FileInputStream fis=new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            user = (User)ois.readObject();
            fis.close();
            ois.close();
        }
        catch (Exception e) {
            //JOptionPane.showMessageDialog(new JFrame(), "No Data.");
        }
        return user;
    }
    public static void storeUser(User user)
    {
        //store user to the database
        File dir = new File("data");
        if (dir.exists()==false) dir.mkdir();
        String fileName="data/" + user.getUserName();
        try 
        {
            FileOutputStream fos = new FileOutputStream (fileName);   
            ObjectOutputStream oos = new ObjectOutputStream(fos);   
            oos.writeObject(user);   
            fos.close();  
            oos.close();
        }    
        catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Can not write user to the data file");
        }   
    }
    public static WaitingList getWaitingList()
    {
        String fileName="data/"+ "waitingList";
        WaitingList list= new WaitingList();
        try
        {
            FileInputStream fis=new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (WaitingList)ois.readObject();
            fis.close();
            ois.close();
        }
        catch (Exception e) {
            //JOptionPane.showMessageDialog(new JFrame(), "No Data.");
        }
        return list;
    }
    public static void storeWaitingList(WaitingList list)
    {
        //store user to the database
        String fileName="data/" + "waitingList";
        try 
        {
            FileOutputStream fos = new FileOutputStream (fileName);   
            ObjectOutputStream oos = new ObjectOutputStream(fos);   
            oos.writeObject(list);   
            fos.close();  
            oos.close();
        }    
        catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Can not write list to the data file");
        }   
    }
    
}
