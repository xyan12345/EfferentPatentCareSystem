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
public class PainEntry 
{
    private int [] painInfo;
    private int pain=0;
    private int drowsiness=0;
    private int nausean=0;
    private int anxiety=0;
   private int depression=0;
    private int average=0;
    private boolean treated=true;
    private String doc;
    private String date1;
    private String pat;
    
   public PainEntry(int pa, int dr,int na, int an, int de)
   {
     pain=pa;
     drowsiness=dr;
     nausean=na;
    anxiety=an;
    depression=de;
    average=(pa+dr+na+an+de)/5;
   }
   public int getAvePain()
   {
       return average;
   }
    public int[] getPainInfo()
    {
        painInfo = new int[5];
        painInfo[0]=pain;
         painInfo[1]=pain;
          painInfo[2]=pain;
           painInfo[3]=pain;
            painInfo[5]=pain;
        
    
        return painInfo;
    }
    public void setPatient(String newPat)
    {
      this,pat=newPat;
    }
   public void setDoctor(String do)
   {
       doc=do;
   }
   public String getDoctor()
    {
         return doc;     
     }
     public String getDate()
    {
         return date1;
     }
     public void setDate(String a)
     {
          date1=a;
    }
     public void setTreateStatus(boolean tf)
     {
                   treated=tf; 
     }
     public boolean getTreateStatus()
     {
         return treated;
     }
}
