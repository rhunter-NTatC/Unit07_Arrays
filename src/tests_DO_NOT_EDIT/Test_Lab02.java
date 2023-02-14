package tests_DO_NOT_EDIT;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import labs.Lab01;
import labs.Lab02;

class Test_Lab02 {

	
	private String col = "[White, Red, LightRed, DeepOrange, Orange, Amber, Yellow, Lime, LightGreen, Green, Teal, Indigo, LightBlue, Blue, Cyan, Purple, DeepPurple, Brown, DeepBrown, BlueGrey, Grey, Black]";
	private String he = "[#FFFFFF, #D40C00, #FF9A00, #FF5500, #FF9A00, #FFCD00, #FFEF00, #CDE000, #87C735, #32C12C, #009888, #3E49BB, #00A5F9, #526EFF, #00BCD9, #7F4FC9, #682CBF, #7C5547, #50342C, #5F7D8E, #9E9E9E, #000000]";
	private String il = "[false, true, true, true, false, true, true, false, false, false, true, false, false, true, true, false, false, true, false, true, false, false]";
	private String il2 = "[true, false, false, false, true, false, false, true, true, true, false, true, true, false, false, true, true, false, true, false, true, true]";
	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		String problemNumber = "Problem #1";
		
		int error = 1;
		
		try {
			inOut.resetOutputStream();
			inOut.overridePrintStatements();
			String[] x = Lab02.color;
			error++;
			String[] y = Lab02.hex;
			error++;
			boolean[] z = Lab02.isLiked;
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
			
		}
		catch (AssertionError e) {
			inOut.resetSystem();
			switch (error) {
			case 1:
				System.out.println("Color array is not declared correctly");
				break;
			case 2:
				System.out.println("Hex array is not declared correctly");
				break;
			case 3:
				System.out.println("Is Liked array is not declared correctly");
				break;
			}
			
			fail();
		}
		
		
	}

	
	
	@Test
	@DisplayName("Test Problem #2")
	void test2() throws Exception {
		String problemNumber = "Problem #2";
		
		int error = 1;
		
		try {
			inOut.resetOutputStream();
			inOut.overridePrintStatements();
			Lab02.problem2();
			assertEquals(Arrays.toString(Lab02.color), col);
			error++;
			assertEquals(Arrays.toString(Lab02.hex), he);
			error++;
			assertEquals(Arrays.toString(Lab02.isLiked), il);
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
			
		}
		catch (AssertionError e) {
			inOut.resetSystem();
			switch (error) {
			case 1:
				System.out.println("color array is not instantiated correctly");
				break;
			case 2:
				System.out.println("hex array is not instantiated correctly");
				break;
			case 3:
				System.out.println("isLiked array is not instantiated correctly");
				break;
			}
			
			fail();
		}
		
		
	}
	
	
	
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		String problemNumber = "Problem #3";
		
		
			    	

		int i = 0;
		String output = "";
		int result = 0;
		String[] expectedResult = {"", "", ""};
		try {

			for (; i < Lab02.color.length; i++) {

				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(String.valueOf(i));
				Lab02.problem3();
				expectedResult[0] = Lab02.color[i];
				expectedResult[0] = Lab02.hex[i];
				expectedResult[0] = String.valueOf(Lab02.isLiked[i]);
				assertTrue(inOut.getOutputStream().contains(expectedResult[0]));
				assertTrue(inOut.getOutputStream().contains(expectedResult[1]));
				assertTrue(inOut.getOutputStream().contains(expectedResult[2]));
			}

			

			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		} catch (AssertionError e) {
			inOut.resetSystem();

			System.out.println("Error " + problemNumber + ": " 
						+ "\n   Failed test " + (i + 1) + " of " + Lab02.color.length
						+ "\n   Input tested: " + i
						+ "\n   Expected output should include: " + expectedResult[0] + " " + expectedResult[1] + " & " + expectedResult[2]
						+ "\n   Your return: " + inOut.getOutputStream()
						);
			fail();
		}

	}
	
	

	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		String problemNumber = "Problem #4";
		
		
			    	

		
		String result = "";
		String expectedResult = "Red, LightRed, DeepOrange, Amber, Yellow, Teal, Blue, Cyan, Brown, BlueGrey";
		try {
			inOut.resetOutputStream();
			inOut.overridePrintStatements();
			result = Lab02.problem4();
			assertTrue(result.equals(expectedResult));
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		} catch (AssertionError e) {
			inOut.resetSystem();

			System.out.println("Error " + problemNumber + ": " 
						+ "\n   Failed test " + 1 + " of " + 1
						+ "\n   Expected output should include: " + expectedResult
						+ "\n   Your return: " + result
						+ "\n   Do you have an extra space, comma or return at the end of the line?"
						);
			fail();
		}

	}

	
	@Test
	@DisplayName("Test Problem #5")
	void test5() {
		String problemNumber = "Problem #5";
		
		String[][] tests = {{"red", "D40C00"},
						    {"lIghtred", "FF9A00"},
						    {"teal", "009888"},
						    {"greyish", "That color is not on the list."},
						    {"Brown", "7C5547"}
						    };	
		
		
		int i = 0;
		String output = "";
		
		try {
			
			
			for (; i < tests.length; i ++) {
				
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(String.valueOf(tests[i][0]));
				output = Lab02.problem5();
				assertTrue(output.equals(tests[i][1]));
				
			}
			
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");

		}
		catch (AssertionError e) {
			inOut.resetSystem();
			
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input tested: " +  tests[i][0]
					+ "\n   Expected return: " + tests[i][1] 
					+ "\n   Your return: " + output
					+ "\n\n\n\n");
			fail();
		}
	}
	
	
	@Test
	@DisplayName("Test Problem #6")
	void test6() {
		String problemNumber = "Problem #6";
		
		int expectedReturn = 10;
		int output = 0;
		
		try {
			inOut.resetOutputStream();
			inOut.overridePrintStatements();
			output = Lab02.problem6();
			
			assertEquals(output, expectedReturn);
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
			
		}
		catch (AssertionError e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + 1 + " of " + 8
					+ "\n   Expected return: " + expectedReturn
					+ "\n   Your return: " + output
					+ "\n\n\n\n");
			
			fail();
		}
		
		
	}
	
	
	@Test
	@DisplayName("Test Problem #7")
	void test7() {
		String problemNumber = "Problem #7";
		
		
			    	

		
		String result = "";
		String expectedResult = "White, Orange, Lime, LightGreen, Green, Indigo, LightBlue, Purple, DeepPurple, DeepBrown, Grey, Black";
		try {
			inOut.resetOutputStream();
			inOut.overridePrintStatements();
			result = Lab02.problem7();
			assertTrue(result.equals(expectedResult));
			assertTrue(Arrays.toString(Lab02.isLiked).equals(il2));
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
			
		} catch (AssertionError e) {
			inOut.resetSystem();

			System.out.println("Error " + problemNumber + ": " 
						+ "\n   Failed test " + 1 + " of " + 10
						+ "\n   Expected output should include: " + expectedResult
						+ "\n   Your return: " + result
						+ "\n   Do you have an extra space, comma or return at the end of the line?"
						);
			fail();
		}

	}
	
	
}
