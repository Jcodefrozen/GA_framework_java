package algorithms;


import java.util.ArrayList;

import algorithms.*;
import dataCollector.DataCollector;

public abstract class Coevolution {

    /**
     * Everything is array instead of one.
     */
    protected InitPop[] initPops;
    protected Evaluate[] evaluates;
    protected Selection[] selections;
    protected Crossover[] crossovers;
    protected Mutation[] mutations;
    protected Elitism[] elitisms;
    protected Constraint[] constraints;
    protected Distance[] distances;
    protected DataCollector[] collectors;

    /** a double array of population variables,
     * the first entry is the index of sub-population
     * and the second entry is the population size */
    protected Chromosome[][] popVars;

    /** An array of List, each list includes
     * fitness values of that sub-population,
     * e.g ArrayList<double[]> */
    protected ArrayList[] popFits;

    protected  Sort[] sorts;

    /** each optimization corresponds
     * the optimization direction of a sub-population.
     * e.g, optimization == 1, the algorithm maximizes the fitness values.
     * */
    protected int[] optimizations;

    protected double[] mutationRates;
    protected int[] elitSizes;

    protected int[] tournamentSizes;
    protected double[] crossoverRates;

    /** normally all sub-population will start together,
     * but we still use an array to store that. All the
     * values are the same. */
    protected int[] maxGen;

    /** chromosome size */
    protected int[] maxVar;

    /** the upper and lower boundaries of a variable*/
    protected double[] lbound;
    protected double[] ubound;

    /**
     * Instead of using a constructor, we use a prepare() which does the
     * initialization of GA including assignment of values,
     * This should be extended and accomplished in the subclass.
     */
	protected abstract void prepare();
    /**
     * Initialization of random generator.
     */
	public void initializeRand(int seed){
		StdRandom.setSeed(seed);
	}

    /**
     * The actual process of GA, but we do not implement the process here.
     * This run is quite different with the orginal GA, therefore, it needs to
     * be re-implemented later on.
     * @param seed the random seed
     */
	public abstract void run(int seed);

    /**
     * Repeat experiments for N times
     *
     * @param seedStart the random seeds start from this seedStart, increasing 1 by each time.
     * @param nTimes run experiments for nTimes
     */
    public abstract void runNtimes(int seedStart, int nTimes);
}