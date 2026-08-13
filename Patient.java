
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UCAS
 */
public class Patient extends Person {

  
    private String BloodType ;
     private String MedicalRecord ;

    public Patient(String BloodType , String MedicalRecord , String name, String nationalID, String phone) {
        super(name, nationalID, phone);
        this.BloodType = BloodType ;
       
        this.MedicalRecord = MedicalRecord;
      
    }
    @Override
    public void displayInfo (){
    
    super.displayInfo(); 
    
        System.out.println("Blood Type =  "  +BloodType +"\n Medical Record  = "+MedicalRecord );}

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getMedicalRecord() {
        return MedicalRecord;
    }

    public void setMedicalRecord(String MedicalRecord) {
        this.MedicalRecord = MedicalRecord;
 
    
    }

    public Patient() {
    }
      
    
}
