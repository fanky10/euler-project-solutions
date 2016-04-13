package io.github.fanky10.euler_project_solutions;

public class Problem_01 {
	public static void main(String[] args) {
		long startMillis = System.currentTimeMillis();
		System.out.println("result "+slowSolution());
		long durMillis = System.currentTimeMillis() - startMillis;
		System.out.println("slow duration "+durMillis +" millis");
		
		startMillis = System.currentTimeMillis();
		System.out.println("result "+fastSolution());
		durMillis = System.currentTimeMillis() - startMillis;
		System.out.println("fast duration "+durMillis +" millis");
	}
	static int MAX_VAL = Integer.MAX_VALUE;
	public static int slowSolution() {
		int result = 0;
		for (int i = 1; i < MAX_VAL; i++) {
			if (i%3 == 0 || i%5 ==0) {
				result += i;
			}
		}
		return result;
	}
	
	public static int fastSolution() {
		return sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15);
	}
	private static int sumDivisibleBy(int number) {
		int p = MAX_VAL / number;
		return number * (1/2 * p * (p+1));
	}
}
