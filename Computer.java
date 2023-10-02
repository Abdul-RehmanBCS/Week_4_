package LabAssignment;

public class Computer {
    private String computerNumber;
    private String IcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;
    public Computer(){

    }
    public Computer(String computerNumber,String IcdModel,int ramSize,int hddSize,boolean hasGPU){
        this.computerNumber=computerNumber;
        this.IcdModel=IcdModel;
        this.ramSize=ramSize;
        this.hddSize=hddSize;
        this.hasGPU=hasGPU;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getIcdModel() {
        return IcdModel;
    }

    public void setIcdModel(String icdModel) {
        IcdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Computer computer = (Computer) obj;
        return computerNumber.equals(computer.computerNumber);
    }
    public Computer clone() {
        return new Computer(computerNumber, IcdModel, ramSize, hddSize, hasGPU);
    }
}
