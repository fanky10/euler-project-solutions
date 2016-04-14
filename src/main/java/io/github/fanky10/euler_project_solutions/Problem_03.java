package io.github.fanky10.euler_project_solutions;

import io.github.fanky10.euler_project_solutions.utils.Log;

public class Problem_03 extends BaseProblem {
	
	public static void main(String[] args) {
		new Problem_03().solve();
	}
	
	@Override
	protected void showSolution() {
		// https://projecteuler.net/problem=3
		// target: 600851475143
		long result = primeFactor(600851475143l);
		Log.d("Max factor result: "+result);
	}
	
	private long primeFactor(long root) {
		Log.d("looking for factor: "+root);
		long factor = root;
		boolean keepLooking = false;
		
		for (long i = 2; i < root; i++) {
			// starts at 2 because any number is divisible by 1
			// ends by itself -1 b/c any number is divisible by itself
			if (root % i == 0) {
				keepLooking = true;
				factor = i;
				Log.d("found divisible: "+i);
				break;
			}
		}
		
		if (keepLooking) {
			return primeFactor(root/factor);
		} else {
			Log.d("stop looking "+factor);
			return factor;
		}
	}
}
