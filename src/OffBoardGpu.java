public class OffBoardGpu {
    private String company;
    private int memoryOffBoardGpu;
    private String model;
    private boolean overclockable;

    OffBoardGpu() {}

    public String getCompany() {
        return this.company;
    }

    public int getMemoryOffBoardGpu() {
        return this.memoryOffBoardGpu;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isOverclockable() {
        return this.overclockable;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setMemoryOffBoardGpu(int memoryOffBoardGpu) {
        this.memoryOffBoardGpu = memoryOffBoardGpu;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOverclockable(boolean overclockable) {
        this.overclockable = overclockable;
    }
}
