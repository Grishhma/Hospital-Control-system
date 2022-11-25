/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author riddhivora
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctor;
    
    public DoctorDirectory(){
            this.doctor = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }
    
     public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        doctor.add(newDoctor);
        return newDoctor;
    }
    public void deleteDoctor(Doctor del) {
        doctor.remove(del);
    }
}
