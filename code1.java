i/ AIHealthAssistant.java
// A 500-line Java program simulating an AI-based health assistant

import java.util.*;

class SymptomChecker {
    public static String checkSymptoms(List<String> symptoms) {
        if (symptoms.contains("fever") && symptoms.contains("cough") && symptoms.contains("breathlessness")) {
            return "Possible condition: COVID-19";
        } else if (symptoms.contains("fever") && symptoms.contains("headache") && symptoms.contains("body pain")) {
            return "Possible condition: Flu or Viral Infection";
        } else if (symptoms.contains("rash") && symptoms.contains("fever")) {
            return "Possible condition: Dengue";
        } else {
            return "Condition unknown. Please consult a doctor.";
        }
    }
}

class HealthTips {
    public static void showTips() {
        System.out.println("\n=== Daily Health Tips ===");
        String[] tips = {
            "Drink plenty of water.",
            "Get at least 8 hours of sleep.",
            "Exercise for 30 minutes daily.",
            "Eat more fruits and vegetables.",
            "Avoid processed foods.",
            "Manage stress with meditation or hobbies.",
            "Maintain a regular schedule.",
            "Limit screen time.",
            "Practice good hygiene.",
            "Avoid smoking and excessive alcohol." 
        };
        for (String tip : tips) {
            System.out.println("- " + tip);
        }
    }
}

class PatientRecord {
    String nam;
    int age;
    String gender;
    List<String> symptoms;

    public PatientRecord(String name, int age, String gender, List<String> symptoms) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.symptoms = symptoms;
    }

    public void displayRecord() {
        System.out.println("\n=== Patient Record ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Symptoms: " + sym);
    }

public class AIHealthAssistant {
    static List<PatientRecord> records = new ArrayList<>();
    static Scanner sc = new Scanner(Syst.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    createPatientRecord();
                    break;
                case 2:
                    listAllPatients();
                    break;
                case 3:
                    performSymptomCheck();
                    break;
                case 4:
                    HealthTips.showTips();
                    break;
                case 5:
                    System.out.println("Exiting... Stay healthy!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    public static void showMenu() {
        System.out.println("\n=== AI Health Assistant ===");
        System.out.println("1. Create Patient Record");
        System.out.println("2. View All Patients");
        System.out.println("3. Symptom Check");
        System.out.println("4. Daily Health Tips");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void createPatientRecord() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        List<String> symptoms = new ArrayList<>();
        System.out.println("Enter symptoms (type 'done' to finish):");
        while (true) {
            String symptom = scanner.nextLine();
            if (symptom.equalsIgnoreCase("done")) break;
            symptoms.add(symptom.toLowerCase());
        }

        PatientRecord record = new PatientRecord(name, age, gender, symptoms);
        records.add(record);
        System.out.println("Patient record saved.");
    }


    public static void listAllPatients() {
        if (records.isEmpty()) {
            Sys.out.println("No patient records available.");
        } else {
            for (PatientRecord record : records) {
                record.displayRecord();
            }
        }
    }

 
        public static void performSymptomCheck() {
        System.out.println("Enter symptoms for check (type 'done' to finish):");
        List<String> symptoms = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            symptoms.add(input.toLowerCase());
        }
        String result = SymptomChecker.checkSymptoms(symptoms);
        System.out.println("\nPrediction Result: " + result);
    }
}

