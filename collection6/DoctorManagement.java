package collection6;
import java.util.*;

class Doctor {
    private int id;
    String name;
    String speciality;

    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }
}

public class DoctorManagement {
    private List<Doctor> doctors;

    public DoctorManagement() {
        doctors = new ArrayList<>();
    }

    public void addDoctor(int id, String name, String speciality) {
        doctors.add(new Doctor(id, name, speciality));
    }

    public void displayDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("ID: " + doctor.getId() + ", Name: " + doctor.getName() + ", Speciality: " + doctor.getSpeciality());
        }
    }

    public void updateDoctor(int id, String name, String speciality) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                doctor.name = name;
                doctor.speciality = speciality;
                break;
            }
        }
    }

    public static void main(String[] args) {
        DoctorManagement doctorManagement = new DoctorManagement();
        doctorManagement.addDoctor(1, "Dr. Smith", "Cardiologist");
        doctorManagement.addDoctor(2, "Dr. Johnson", "Orthopedic");
        doctorManagement.addDoctor(3, "Dr. Williams", "Dermatologist");

        doctorManagement.displayDoctors();

        // Example of updating a doctor's information
        doctorManagement.updateDoctor(2, "Dr. Brown", "Neurologist");

        doctorManagement.displayDoctors();
    }
}
