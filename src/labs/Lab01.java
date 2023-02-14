package labs;

import java.util.Scanner;

public class Lab01 {

	public static int[] nums;
	
	public static void main(String[] args) {
		
		populateNums();
		
		problem1();
		problem2();
		problem3();
		problem4();
		problem5();
		problem6();
		problem7();
		problem8();
		
	}

	
	
	public static void problem1() {
		
	}

	
	public static int[] problem2() {
		
		return null;
	}

	
	public static int problem3() {
		
		return 0;
	}

	
	public static int problem4() {
		return 0;
	}

	
	public static int problem5() {
		
		return 0;
	}

	
	public static boolean problem6() {
		
		return false;
	}

	
	public static int problem7() {
		
		
		return 0;
	}

	
	public static int problem8() {
		
		
		
		return 0;
	}

	
	
	
	
	
	
	/*
	 * DO NOT MESS WITH THIS METHOD!!!
	 * DO NOT MESS WITH THIS METHOD!!!
	 * DO NOT MESS WITH THIS METHOD!!!
	 * DO NOT MESS WITH THIS METHOD!!!
	 * DO NOT MESS WITH THIS METHOD!!!
	 */
	public static void populateNums() {
		nums = new int[(int) (Math.random() * (12)) + 15];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * (20) - 5);
		}
	}
}
