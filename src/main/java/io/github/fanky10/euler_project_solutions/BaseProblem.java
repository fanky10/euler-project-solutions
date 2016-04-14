package io.github.fanky10.euler_project_solutions;

import io.github.fanky10.euler_project_solutions.utils.Log;

abstract class BaseProblem {
	protected abstract void showSolution();

	public void solve() {
		long startMillis = System.currentTimeMillis();
		showSolution();
		long durMillis = System.currentTimeMillis() - startMillis;
		Log.i("Solution duration " + durMillis + " millis");
	}
}
