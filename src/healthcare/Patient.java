/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;
import java.util.*;
/**
 *
 * @author Jing Liang
 */
public class Patient extends User {
    private ArrayList<PainEntry> painHistory;
    private ArrayList<Visit> visitHistory;
    public Patient(String username,String password)
    {
        super(username,password);
        painHistory = new ArrayList<>();
        visitHistory = new ArrayList<>();
    }
    public Patient(String username,String password,String name,String sex,int age,String ead,String phone)
    {
        super(username,password,name,sex,age,ead,phone);
    }
    public ArrayList<PainEntry> getPainHistory()
    {
        return painHistory;
    }
    public void addPain(PainEntry pain)
    {
        painHistory.add(pain);
    }
    public PainEntry getLatestPain()
    {
        return painHistory.get(painHistory.size()-1);
    }
    public ArrayList<Visit> getVisitHistory()
    {
        return visitHistory;
    }
    public void addVisit(Visit visit)
    {
        visitHistory.add(visit);
    }
}
