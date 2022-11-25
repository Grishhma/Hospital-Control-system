/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author riddhivora
 */
public class Patient {
    
    private String name;
    private int age;
    private String city;
    private String community;
    
    //Four main vital signs
    private int bp;         //blood pressure
    private int pulse;      //pulse rate
    private int temp;       //body temperature
    private int resp_rate;  // respiratory rate (measured per min)
    
    //other misc details
    //private int ht;         //weight in cms
    //private int wt;         //height in cms

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getResp_rate() {
        return resp_rate;
    }

    public void setResp_rate(int resp_rate) {
        this.resp_rate = resp_rate;
    }
    
}
