
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UCAS
 */
public class Appointment {
    private Doctor doctor;
private Patient patient;
private String date;
private String time;
private String status;

    public Appointment(Doctor doctor, Patient patient, String date, String time, String status) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
        this.status = status;
    }
    public void displayInfo (){
    
        System.out.println("  Doctor : ");
    doctor.displayInfo ();
        System.out.println("  Patient :");
        patient.displayInfo();
        
        System.out.println("date "+date +"\n time" +time + "\n  status "+status );
        
        
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
