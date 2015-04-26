/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;

/**
 *
 * @author Ye
 */
public class Visit {
    
    private String doc1;
    private String date2,pat,hospital,treatment;
    
    
   public Visit(String newDoc, String newPat)
   {
     doc1=newDoc;
     pat=newPat;
   }
   
    public void setPatient(String pat1)
    {
    pat=pat1;
    }
   public void setDoctor(String do1)
   {
       doc1=do1;
   }
   public String getDoctor()
    {
         return doc1;     
     }
     public String getDate()
{
         return date2;
}
     public void setDate(String newDat)
{
          date2=newDat;
}
     public void setTreatment(String t)
     {
                   treatment=t; 
     }
     public String getTreatment()
     {
         return treatment;
     }
     public void setHospital(String hp)
     {
                  hospital=hp; 
     }
     public String getHospital()
     {
         return hospital;
     }
}


