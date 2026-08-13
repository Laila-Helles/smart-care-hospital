
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author UCAS
 */
public class Doctor extends Employee  {
private String specialization ;
private double examinationFee ; 


public Doctor (
        String name, String nationalID, String phone ,double basicSalary ,int workingHours ,String specialization , double examinationFee ){
super ( name,  nationalID,  phone , basicSalary , workingHours );
this.examinationFee = examinationFee;
this.specialization = specialization ;
}

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    

    public double getExaminationFee() {
        return examinationFee;
    }

    public void setExaminationFee(double examinationFee) {
        this.examinationFee = examinationFee;
    }

@Override
public void displayInfo() {
    super.displayInfo();
    System.out.println("Specialization: " + specialization+
  "\n Examination Fee: " + examinationFee);



}

    public Doctor() {
    }
}
