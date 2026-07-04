import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Patient Registration System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter Name: ");
                String name = input.nextLine();

                System.out.print("Enter Age: ");
                int age = input.nextInt();
                input.nextLine();

                System.out.print("Enter Gender: ");
                String gender = input.nextLine();

                System.out.print("Enter Disease: ");
                String disease = input.nextLine();

                patients.add(new Patient(id, name, age, gender, disease));
                System.out.println("Patient added successfully!");

            } else if (choice == 2) {
                System.out.println("\n--- Patient List ---");
                for (Patient p : patients) {
                    System.out.println(p);
                    System.out.println("-------------------");
                }

            } else if (choice == 3) {
                System.out.println("Exiting system...");
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        input.close();
    }
}
