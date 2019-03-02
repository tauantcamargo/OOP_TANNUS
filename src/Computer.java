public class Computer {
    private int memory;
    private String cpu;
    private double hd;
    private OffBoardGpu offboardGpu = new OffBoardGpu();

    public OffBoardGpu getOffboardGpu() {
        return offboardGpu;
    }

    public void setOffboardGpu(OffBoardGpu offboardGpu) {
        this.offboardGpu = offboardGpu;
    }

    Computer() {}

    public void getAllData() {
        System.out.println("Memory:" +  this.memory + ", " + "Cpu: " + this.cpu + ", " + "Hd: " + this.hd);
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }

    public int getMemory() {
        return this.memory;
    }

    public String getCpu() {
        return this.cpu;
    }

    public double getHd() {
        return this.hd;
    }
}
