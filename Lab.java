package LabAssignment;

import java.util.Arrays;

public class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;

    public Lab() {

    }

    public Lab(String labID, int maxComputers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = new Computer[maxComputers];
        this.status = status;
        this.labAttendant = labAttendant;
    }

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void addComputer(Computer[] computers) {
        this.computers = computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public void changeLabStatus(LabStatus status) {
        this.status = status;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public Computer fetchComputer(String c001) {
        for(Computer computer : computers){
            if(computer!=null&&computer.getComputerNumber().equals(c001)){
                return computer;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "labID='" + labID + '\'' +
                ", computers=" + Arrays.toString(computers) +
                ", status=" + status +
                ", labAttendant=" + labAttendant +
                '}';
    }
}

