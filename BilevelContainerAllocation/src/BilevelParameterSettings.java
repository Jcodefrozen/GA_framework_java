import ProblemDefine.CoGAProblemParameterSettings;
import algorithms.*;

public class BilevelParameterSettings extends CoGAProblemParameterSettings{
    private int vmTypes;
    private int taskNum;
    private double pmCpu;
    private double pmMem;
    private double pmEnergy;
    private double[] vmCpu;
    private double[] vmMem;
    private double[] taskCpu;
    private double[] taskMem;
    private double[] taskOS;

    private CoEvaluate evaluate;

    public BilevelParameterSettings(
            CoEvaluate evaluate,
            int vmTypes,
            int taskNum,
            double pmCpu,
            double pmMem,
            double pmEnergy,
            double[] vmCpu,
            double[] vmMem,
            double[] taskCpu,
            double[] taskMem,
            double[] taskOS
    ) {
        super(evaluate);
        this.vmTypes = vmTypes;
        this.taskNum = taskNum;
        this.pmCpu = pmCpu;
        this.pmMem = pmMem;
        this.pmEnergy = pmEnergy;
        this.vmCpu = vmCpu;
        this.vmMem = vmMem;
        this.taskCpu = taskCpu;
        this.taskMem = taskMem;
        this.taskOS = taskOS;
    }

    public int getVmTypes() {
        return vmTypes;
    }
    public int getTaskNum() {
        return taskNum;
    }
    public double getPmCpu() {
        return pmCpu;
    }
    public double getPmMem() {
        return pmMem;
    }
    public double getPmEnergy() {
        return pmEnergy;
    }
    public double[] getVmCpu() {
        return vmCpu;
    }
    public double[] getVmMem() {
        return vmMem;
    }
    public double[] getTaskCpu() {
        return taskCpu;
    }

    public double[] getTaskOS() {
        return taskOS;
    }
    public double[] getTaskMem() {
        return taskMem;
    }
}
