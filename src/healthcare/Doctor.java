/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;

/**
 *
 * @author Jing Liang
 */
public class Doctor extends User implements java.io.Serializable {
    private String hospital;
    public Doctor(String username,String password)
    {
        super(username,password);
    }
    public Doctor(String username,String password,String name,String sex,int age,String ead,String phone)
    {
        super(username,password,name,sex,age,ead,phone);
    }
    public String getHospital()
    {
        return hospital;
    }
    public void setHospital(String hospital)
    {
        this.hospital = hospital;
    }
}
