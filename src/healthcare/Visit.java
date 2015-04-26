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
public class Visit implements java.io.Serializable {
    private String pat,doc,hospital, treatment;
    private Date date;

    public Visit(String newDoc, String newPat) {
        doc = newDoc;
        pat = newPat;
    }

    public void setPatient(String pat1) {
        pat = pat1;
    }
    
    public String getPatient() {
        return pat;
    }
    
    public void setDoctor(String do1) {
        doc = do1;
    }

    public String getDoctor() {
        return doc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date newDat) {
        date = newDat;
    }

    public void setTreatment(String t) {
        treatment = t;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setHospital(String hp) {
        hospital = hp;
    }

    public String getHospital() {
        return hospital;
    }
}
