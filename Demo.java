package LabAssignment;

public class Demo {
        public static void main(String[] args) {
            Computer[] computer1 = {new Computer("C001", "LCD Model 1", 8, 512, true),new Computer("C002", "LCD Model 2", 16, 1024, false)};

            Employee labAttendant = new Employee("E001", "Ali");

            Lab lab1 = new Lab("Lab001", 10, LabStatus.OPERATIONAL, labAttendant);
            Lab lab2 = new Lab("Lab002", 15, LabStatus.FAULTY_MULTIMEDIA, labAttendant);
            lab1.addComputer(computer1);
            University university = new University(2);
            university.addLab(lab1);
            university.addLab(lab2);

            Lab retrievedLab = university.fetchLab("Lab001");
            Computer retrievedComputer = lab1.fetchComputer("C001");
            System.out.println(labAttendant);
            if (retrievedLab != null) {
                System.out.println("Lab ID: " + retrievedLab.getLabID());
                System.out.println("Lab Status: " + retrievedLab.getStatus());
                System.out.println("Lab Attendant: " + retrievedLab.getLabAttendant().getName());
            }

            if (retrievedComputer != null) {
                System.out.println("Computer Number: " + retrievedComputer.getComputerNumber());
                System.out.println("LCD Model: " + retrievedComputer.getIcdModel());
                System.out.println("RAM Size (GB): " + retrievedComputer.getRamSize());
                System.out.println("HDD Size (GB): " + retrievedComputer.getHddSize());
                System.out.println("Has GPU: " + retrievedComputer.isHasGPU());
            }
        }
}
