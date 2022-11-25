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
public class EncounterDirectory {
     private ArrayList<Encounter> encounterhis;
        
    public EncounterDirectory(){
        
        this.encounterhis= new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounter() {
        return encounterhis;
    }

    public void setEncounter(ArrayList<Encounter> encounter) {
        this.encounterhis = encounterhis;
    }
    
    public Encounter addNewEncounter(){
        
        Encounter newEncounter = new Encounter();
        encounterhis.add(newEncounter);
        return newEncounter;
    }
}
