package io.github.fanky10.euler_project_solutions;

public class Problem_02 {
	public static void main(String[] args) {
		long startMillis = System.currentTimeMillis();
		System.out.println("result "+solution());
		long durMillis = System.currentTimeMillis() - startMillis;
		System.out.println("slow duration "+durMillis +" millis");
	}
	static int MAX_VAL = 4 * 1000* 1000;
	public static int solution() {
		int result = 2;
		int previousValue = 2;
		int currentValue = 3;
		while (currentValue < MAX_VAL ) {
			int aux = currentValue;
			currentValue = currentValue + previousValue;
			previousValue = aux;
			if (currentValue % 2 == 0) {
				result += currentValue;
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