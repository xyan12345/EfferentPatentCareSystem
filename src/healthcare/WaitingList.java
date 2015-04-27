/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jing
 */
public class WaitingList implements java.io.Serializable {
    private ArrayList<PainEntry> list;
    public WaitingList()
    {
        list = new ArrayList<>();
    }
    public void add(PainEntry entry)
    {
        for (Iterator<PainEntry> it = list.iterator(); it.hasNext();) {
            PainEntry e = it.next();
            if(e.getPatUserName().equals(entry.getPatUserName()))
            {
                list.remove(e);
                break;
            }
        }
        list.add(entry);
    }
    public ArrayList<PainEntry> getList()
    {
        return list;
    }
}
