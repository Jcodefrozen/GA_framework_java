/*
 * Boxiong Tan (Maximus Tann)
 * Title:        Single-objective GA framework
 * Description:  Single-objective GA framework for general optimization purpose
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2016-2019, The Victoria University of Wellington
 * sortPop.java - A sort method for population
 */
package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * population sorting
 * @author Boxiong Tan (Maximus Tann) 
 * @since GA framework 1.0
 */
public class sortPop {
	/**
	 * Sort
	 * Steps
	 * <ul>
	 * 	<li> 1. Sort fitness list according to fitness values of chromosomes </li>
	 *  <li> 2. Rearrange chromosomes according to their ranking </li>
	 *  <li> 3. update the ranking in fitness pairs </li>
	 *  <li> 4. change original population to new population </li>
	 * </ul>
	 * @param popVar population
	 * @param popFit fitness
	 */
	public void sort(Chromosome[] popVar, ArrayList<Double[]> popFit){
		Chromosome[] newPop = new Chromosome[popVar.length];
		Collections.sort(popFit, new Comparator<Double[]>() {
			@Override
			public int compare(Double[] fitness1, Double[] fitness2) {
				if(fitness1[0] < fitness2[0]) return -1;
				else if(fitness1[0] == fitness2[1]) return 0;
				else return 1;
			}
		});

		for(int i = 0; i < popVar.length; i++){
			newPop[i] = popVar[popFit.get(i)[1].intValue()];
			popFit.get(i)[1] = new Double(i);
		}
		popVar = newPop;
	}
}
