package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	//1 들어오면 1내놔라
	// tdd는 기존거랑 순서가 다르네? - > 불필요한거 안만드네
	public void fizzBuzz_should_say_1_for_1() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actual = fizzBuzz.say(1); //객체와 인터페이스 결정, 파라미터까지 싸악, 리턴까지~
		System.out.println(actual); 
		assertEquals("1", actual);
	}
	@Test
	//1 들어오면 1내놔라
	// tdd는 기존거랑 순서가 다르네? - > 불필요한거 안만드네
	public void fizzBuzz_should_say_1_for_2() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String actual = fizzBuzz.say(2); //객체와 인터페이스 결정, 파라미터까지 싸악, 리턴까지~
		System.out.println(actual); 
		assertEquals("2", actual);
	}

}
