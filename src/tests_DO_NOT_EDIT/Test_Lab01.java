package tests_DO_NOT_EDIT;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import labs.*;

class Test_Lab01 {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		String problemNumber = "Problem #1";
	
		System.out.println("No tests for problem #1\n\n\n\n");
		
		
	}
	
	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
		String problemNumber = "Problem #2";
		
		int[] test =  {2, 4, 5, 8, 16, 2, -3, 5, -9, 0, 9, 6};
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		int[] returnValue = Lab01.problem2();
		
		try {
			assertEquals(Arrays.toString(test), Arrays.toString(returnValue));
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		}
		catch (AssertionError e) {
			
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + 1 + " of " + 1
					+ "\n   Expected return: " + Arrays.toString(test) 
					+ "\n   Your return: " + Arrays.toString(returnValue)
					+ "\n\n\n\n");
			fail();
		}
		
		
	}

	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		String problemNumber = "Problem #3";
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		Lab01.populateNums();
		int expectedReturn = Lab01.nums[3];
		int i = 0;
		int actualReturn = Lab01.problem3();
		
		
		
		try {
			for (; i < 20; i++) {
				
				expectedReturn = Lab01.nums[3];
				actualReturn = Lab01.problem3();
				assertEquals(expectedReturn, actualReturn);
			}
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		}
		catch (AssertionError e) {
			
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + 1 + " of " + 1
					+ "\n   Expected return: " + expectedReturn
					+ "\n   Your return: " + actualReturn
					+ "\n\n\n\n");
			fail();
		}
		
		
	}
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		String problemNumber = "Problem #4";
		
		String[] tests = {"1", "15", "22", "75", "-1"};
			    	

		int i = 0;
		String output = "";
		int result = 0;
		int expectedResult = 0;
		try {

			for (; i < tests.length; i++) {

				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(String.valueOf(tests[i]));
				Lab01.populateNums();
				result = Lab01.problem4();
				expectedResult = indexHelper(Integer.valueOf(tests[i]), Lab01.nums);
				assertEquals(result, expectedResult);

			}

			

			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		} catch (AssertionError e) {
			inOut.resetSystem();

			System.out.println("Error " + problemNumber + ": " 
						+ "\n   Failed test " + (i + 1) + " of " + tests.length 
						+ "\n   Input tested: " + tests[i]
						+ "\n   Expected return: " + expectedResult 
						+ "\n   Your return: " + result 
						+ "\n   nums array values: " + Arrays.toString(Lab01.nums) + "\n\n\n\n"
						);
			fail();
		}

	}
	
	
	@Test
	@DisplayName("Test Problem #5")
	void test5() {
		String problemNumber = "Problem #5";
		
		
		int i = 0;
		String output = "";
		int result = 0;
		int expectedResult = 0;
		try {

			for (; i < 20; i++) {

				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				Lab01.populateNums();
				result = Lab01.problem5();
				expectedResult = Lab01.nums[Lab01.nums.length - 1];
				assertEquals(result, expectedResult);

			}

			

			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		} catch (AssertionError e) {
			inOut.resetSystem();

			System.out.println("Error " + problemNumber + ": " 
						+ "\n   Failed test " + (i + 1) + " of 10" 
						+ "\n   Input tested: "
						+ "\n   Expected return: " + expectedResult 
						+ "\n   Your return: " + result 
						+ "\n   nums array values: " + Arrays.toString(Lab01.nums) + "\n\n\n\n"
						);
			fail();
		}

	}
	
	@Test
	@DisplayName("Test Problem #6")
	void test6() {
		String problemNumber = "Problem #6";
		
		
		int i = 0;
		String output = "";
		boolean result = false;
		boolean expectedResult = false;
		try {

			for (; i < 20; i++) {

				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				Lab01.populateNums();
				result = Lab01.problem6();
				expectedResult = largeHelper(Lab01.nums);
				assertEquals(result, expectedResult);

			}

			

			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		} catch (AssertionError e) {
			inOut.resetSystem();

			System.out.println("Error " + problemNumber + ": " 
						+ "\n   Failed test " + (i + 1) + " of 10" 
						+ "\n   Input tested: "
						+ "\n   Expected return: " + expectedResult 
						+ "\n   Your return: " + result 
						+ "\n   nums array values: " + Arrays.toString(Lab01.nums) + "\n\n\n\n"
						);
			fail();
		}

	}
	
	
	
	@Test
	@DisplayName("Test Problem #7")
	void test7() {
		String problemNumber = "Problem #7";
		
		
		int i = 0;
		String output = "";
		int result = 0;
		int expectedResult = 0;
		try {

			for (; i < 20; i++) {

				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				Lab01.populateNums();
				result = Lab01.problem7();
				expectedResult = counter(Lab01.nums);
				assertEquals(result, expectedResult);

			}

			

			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		} catch (AssertionError e) {
			inOut.resetSystem();

			System.out.println("Error " + problemNumber + ": " 
						+ "\n   Failed test " + (i + 1) + " of 10" 
						+ "\n   Input tested: "
						+ "\n   Expected return: " + expectedResult 
						+ "\n   Your return: " + result 
						+ "\n   nums array values: " + Arrays.toString(Lab01.nums) + "\n\n\n\n"
						);
			fail();
		}

	}
	
	
	
	@Test
	@DisplayName("Test Problem #8")
	void test8() {
		String problemNumber = "Problem #8";
		
		
		int i = 0;
		String output = "";
		int result = 0;
		int expectedResult = 0;
		try {

			for (; i < 20; i++) {

				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				Lab01.populateNums();
				result = Lab01.problem8();
				expectedResult = find(Lab01.nums);
				assertEquals(result, expectedResult);

			}

			

			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		} catch (AssertionError e) {
			inOut.resetSystem();

			System.out.println("Error " + problemNumber + ": " 
						+ "\n   Failed test " + (i + 1) + " of 10" 
						+ "\n   Input tested: "
						+ "\n   Expected return: " + expectedResult 
						+ "\n   Your return: " + result 
						+ "\n   nums array values: " + Arrays.toString(Lab01.nums) + "\n\n\n\n"
						);
			fail();
		}

	}
	
	
	
	public static int indexHelper(int input, int[] nums) {
		if (input >= 0 && input < nums.length) {
			return nums[input];
		}
		
		return -50;
	}
	
	public static boolean largeHelper(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 10) {
				return true;
			}
		}
		return false;
	}
	
	public static int counter(int[] nums) {
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				count++;
			}
		}
		
		return count;
	}
	
	public static int find(int[] nums) {
		int find = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			find = Math.min(find, nums[i]);
		}
		return find;
	}
}
