package Collection;
import java.util.ArrayList;
import java.util.Scanner;

class Doctor {
    private int id;
    private String name;
    private String specialty;

    public Doctor(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor [id=" + id + ", name=" + name + ", specialty=" + specialty + "]";
    }
}

public class DoctorManagement {
    private ArrayList<Doctor> doctorList;

    public DoctorManagement() {
        doctorList = new ArrayList<>();
    }

    public void addDoctor(int id, String name, String specialty) {
        Doctor doctor = new Doctor(id, name, specialty);
        doctorList.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    public void displayDoctors() {
        if (doctorList.isEmpty()) {
            System.out.println("No doctors available.");
        } else {
            System.out.println("List of Doctors:");
            for (Doctor doctor : doctorList) {
                System.out.println(doctor);
            }
        }
    }

    public void updateDoctor(int id, String newSpecialty) {
        boolean found = false;
        for (Doctor doctor : doctorList) {
            if (doctor.getId() == id) {
                doctor.setSpecialty(newSpecialty);
                found = true;
                System.out.println("Doctor updated successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Doctor not found with ID: " + id);
        }
    }

    public static void main(String[] args) {
        DoctorManagement doctorManagement = new DoctorManagement();
        Scanner scanner = new Scanner(System.in);

        doctorManagement.addDoctor(1, "Dr. Smith", "Cardiology");
        doctorManagement.addDoctor(2, "Dr. Johnson", "Pediatrics");

        doctorManagement.displayDoctors();

        System.out.print("\nEnter Doctor ID to update specialty: ");
        int idToUpdate = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new specialty: ");
        String newSpecialty = scanner.nextLine();

        doctorManagement.updateDoctor(idToUpdate, newSpecialty);
        doctorManagement.displayDoctors();

        scanner.close();
    }
}
