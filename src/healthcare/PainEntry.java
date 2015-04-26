/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;

import java.util.Date;

/**
 *
 * @author Ye
 */
public class PainEntry {

    private int[] painInfo;
    private int pain = 0;
    private int drowsiness = 0;
    private int nausean = 0;
    private int anxiety = 0;
    private int depression = 0;
    private int average = 0;
    private boolean treated;
    private Doctor doc;
    private Date date;
    private Patient pat;

    public PainEntry(int pa, int dr, int na, int an, int de) {
        pain = pa;
        drowsiness = dr;
        nausean = na;
        anxiety = an;
        depression = de;
        average = (pa + dr + na + an + de) / 5;
        treated = false;
    }

    public int getAvePain() {
        return average;
    }

    
        public int getPainInfo(int a)
    {
        painInfo = new int[5];
        painInfo[0]=pain;
         painInfo[1]=drowsiness;
          painInfo[2]=nausean;
           painInfo[3]=anxiety;
            painInfo[5]=depression;
        
    
        return painInfo[a];
    }

    public void setPatient(Patient newPat) {
        this.pat = newPat;
    }
    
    public Patient getPatient() {
        return pat;
    }

    public void setDoctor(Doctor doc) {
        this.doc = doc;
    }

    public Doctor getDoctor() {
        return doc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date a) {
        date = a;
    }

    public void setTreateStatus(boolean tf) {
        treated = tf;
    }

    public boolean getTreateStatus() {
        return treated;
    }
}
