package io.github.fanky10.euler_project_solutions.utils;

public class Log {
	public static boolean DEBUG = true;
	public static void d(String text) {
		if(DEBUG) System.out.println("DEBUG - "+text);
	}
	public static void i(String text) {
		System.out.println("INFO: "+text);		
	}
}
