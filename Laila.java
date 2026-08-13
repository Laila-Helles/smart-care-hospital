
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Laila {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();

        // 1. قراءة بيانات الأطباء من الملف
        try {
            File file = new File("doctors.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");

                Doctor d = new Doctor(
                        data[0].trim(),
                        data[1].trim(),
                        data[2].trim(),
                        Double.parseDouble(data[3].trim()),
                        Integer.parseInt(data[4].trim()),
                        data[5].trim(),
                        Double.parseDouble(data[6].trim())
                );

                doctors.add(d);
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Doctors file not found.");
        }

        int choice;

        do {
            System.out.println("\n===== Smart Care Hospital =====");
            System.out.println("1. Show Doctors");
            System.out.println("2. Add Patient");
            System.out.println("3. Book Appointment");
            System.out.println("4. Show Appointments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = s.nextInt();

            switch (choice) {

                case 1:
                    if (doctors.isEmpty()) {
                        System.out.println("No doctors available.");
                    } else {
                        for (Doctor d : doctors) {
                            d.displayInfo();
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 2:
                    s.nextLine(); // تنظيف السطر

                    System.out.print("Patient Name: ");
                    String name = s.nextLine();

                    System.out.print("National ID: ");
                    String id = s.nextLine();

                    System.out.print("Phone: ");
                    String phone = s.nextLine();

                    System.out.print("Blood Type: ");
                    String blood = s.nextLine();

                    System.out.print("Medical Record: ");
                    String record = s.nextLine();

                    // تأكدي من ترتيب معلمات الـ Constructor لكلاس Patient لديكِ
                    Patient p = new Patient(blood, record, name, id, phone);

                    patients.add(p);

                    System.out.println("Patient Added.");
                    break;

                case 3:
                    if (doctors.isEmpty()) {
                        System.out.println("No doctors available to book with!");
                        break;
                    }

                    if (patients.isEmpty()) {
                        System.out.println("No patients available! Add a patient first.");
                        break;
                    }

                    System.out.println("Doctors:");
                    for (int i = 0; i < doctors.size(); i++) {
                        System.out.println((i + 1) + "- " + doctors.get(i).getName());
                    }

                    System.out.print("Choose doctor: ");
                    int doctorIndex = s.nextInt() - 1;

                    System.out.println("Patients:");
                    for (int i = 0; i < patients.size(); i++) {
                        System.out.println((i + 1) + "- " + patients.get(i).getName());
                    }

                    System.out.print("Choose patient: ");
                    int patientIndex = s.nextInt() - 1;

                    s.nextLine();

                    System.out.print("Date: ");
                    String date = s.nextLine();

                    System.out.print("Time: ");
                    String time = s.nextLine();
                    
                    try {

    checkDoctorAvailability(
            doctors.get(doctorIndex),
            date,
            time,
            appointments
    );

    Appointment a = new Appointment(
            doctors.get(doctorIndex),
            patients.get(patientIndex),
            date,
            time,
            "Scheduled"
    );

    appointments.add(a);

    System.out.println("Appointment Added.");

} catch (DoctorUnavailableException e) {

    System.out.println(e.getMessage());
}

                    Appointment a = new Appointment(
                            doctors.get(doctorIndex),
                            patients.get(patientIndex),
                            date,
                            time,
                            "Scheduled"
                    );

                    appointments.add(a);

                    System.out.println("Appointment Added.");
                    break;

                case 4:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments booked yet.");
                    } else {
                        for (Appointment app : appointments) {
                            app.displayInfo();
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 5:
                    try {
                        PrintWriter out = new PrintWriter("appointments.txt");

                        for (Appointment app : appointments) {
                            out.println(
                                    app.getDoctor().getName() + ","
                                    + app.getPatient().getName() + ","
                                    + app.getDate() + ","
                                    + app.getTime() + ","
                                    + app.getStatus()
                            );
                        }

                        out.close();
                        System.out.println("Appointments Saved.");

                    } catch (FileNotFoundException e) {
                        System.out.println("Error Saving File.");
                    }

                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        s.close();
    }
    
    public static void checkDoctorAvailability(
        Doctor doctor,
        String date,
        String time,
        ArrayList<Appointment> appointments)
        throws DoctorUnavailableException {

    for (Appointment app : appointments) {

        if (app.getDoctor() == doctor
                && app.getDate().equals(date)
                && app.getTime().equals(time)) {

            throw new DoctorUnavailableException(
                    "Doctor is unavailable at this date and time."
            );
        }
    }
}
}
