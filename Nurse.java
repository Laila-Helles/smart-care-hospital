
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UCAS
 */
public class Nurse extends Employee {
    private String department;
        private String roomNumber;

    public Nurse(String department, String roomNumber, String name, String nationalID, String phone, double basicSalary, int workingHours) {
        super(name, nationalID, phone, basicSalary, workingHours);
        this.department = department;
        this.roomNumber = roomNumber;
        
        
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    @Override
    public void displayInfo(){
    
    super.displayInfo();
    
        System.out.println("department " +department + "\n  roomNumber "+roomNumber );
    
    
    
   
    
    
    }

    public Nurse() {
    }
    
    
  }
  
 
     

    
