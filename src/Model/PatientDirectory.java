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
public class PatientDirectory {
  private ArrayList<Patient> patient;

    public PatientDirectory(){
        
        this.patient= new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }
    
    public Patient addNewPatient(){
        Patient newPatient = new Patient();
        patient.add(newPatient);
        return newPatient;
    }
    public void deletePatient(Patient pd) {
        patient.remove(pd);
    }  
}
