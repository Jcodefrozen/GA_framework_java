package BilevelContainerAllocation;

import algorithms.*;
import commonOperators.InitIntChromosomes;

import java.io.IOException;
import java.util.ArrayList;

public class Experiment {
    public static void main(String[] args) throws IOException {
        ArrayList<CoFitnessFunc> funcList = new ArrayList<CoFitnessFunc>();

        // bound for vm types
        double vmLbound = 0;
        double vmUbound = 5;

        // For all three sub-pops, we use the same crossover rate
        double[] crossoverRate = {0.7, 0.7, 0.7};
        double[] mutationRate = {0.1, 0.1, 0.1};

        // minimization
        int optimization = 0;

        int[] tournamentSize = {3, 3, 3};
        int[] eliteSize = {20, 20, 20};
        int[] popSize = {100, 100, 100};
        int maxGen = 200;
        double k = 0.7;

        int testCase = 1;
        String base = "/home/tanboxi/workspace/BilevelData/testCase" + testCase;
        String ProblemConfig = base + "/ProblemConfig.csv";
        String PMConfig = base + "/PMConfig.csv";
        String VMConfig = base + "/VMConfig.csv";
        String taskCpuAddr = base + "/taskCpu.csv";
        String taskMemAddr = base + "/taskMem.csv";

        String resultBase = "/home/tanboxi/workspace/WSRResult/GA/testCase" + testCase;
        ReadFileBilevel readFiles = new ReadFileBilevel(
                ProblemConfig,
                PMConfig,
                VMConfig,
                taskCpuAddr,
                taskMemAddr
        );

        int vmTypes = (int) readFiles.getVMTypes();
        int taskNum = (int) readFiles.getTaskNum();
        double pmCpu = readFiles.getPMCpu();
        double pmMem = readFiles.getPMMem();
        double pmEnergy = readFiles.getPMEnergy();
        double[] vmMem = readFiles.getVMMem();
        double[] vmCpu = readFiles.getVMCpu();
        double[] taskCpu = readFiles.getTaskCpu();
        double[] taskMem = readFiles.getTaskMem();

        WriteFileBilevel writeFiles = new WriteFileBilevel(resultBase);

        // Initialization !!!

        // Init Sub-pops
        InitPop initContainerVM = new InitAllocationChromosome();
        InitPop initVMPM = new InitAllocationChromosome();
        InitPop initVmTypes = new InitIntChromosomes();
        InitPop[] initPops = {initContainerVM, initVMPM, initVmTypes};

        // Init Mutations
//        Mutation mutateContainerVm = new

    }



}