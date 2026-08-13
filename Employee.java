
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UCAS
 */
public class Employee extends Person {
      private double basicSalary;
      private int workingHours;
      
    public Employee(String name, String nationalID, String phone ,double basicSalary ,int workingHours ) {
        super(name, nationalID, phone);
        this.basicSalary= basicSalary ; 
        this.workingHours =  workingHours;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
   
      @Override
    public void displayInfo (){ 
        super.displayInfo();
        System.out.println("salary  : " + basicSalary + "\n "
                + "working Hours " + workingHours );
  
    
    
    }

    public Employee() {
    }
}
