import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        Computer pc1 = new Computer();
        OffBoardGpu offBoardGpu1 = new OffBoardGpu();

        offBoardGpu1.setCompany("NVidia");
        offBoardGpu1.setModel("Gtx 1080 TI");
        offBoardGpu1.setMemoryOffBoardGpu(16);
        offBoardGpu1.setOverclockable(true);

        pc1.setOffboardGpu(offBoardGpu1);
        pc1.setCpu("Testing 1");

        System.out.println(pc1.getOffboardGpu().getModel());
    }
}