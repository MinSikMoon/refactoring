package practice1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class CustomerTest {

	private static final int THREE_DAYS = 3;
	public void test() {
		// fail("Not yet implemented");
	}

	// 1. 객체가 생성되는지 테스트
	// ctrl 1 누르면 변수 자동으로 선언, 한번더 하면 초기화까지
	// 오른 클릭후 coverage하면 해당 소스의 몇 퍼센트까지 실행되었는지 뜬다.
	@Test
	public void testInitCustomer() {
		String name = null;
		Customer customer = new Customer(name);
	}

	// 2. 무엇을 타겟으로 잡을지 정한다.
	// statement를 테스트하고 싶으므로
	@Test
	public void test_statement() {
		// Arrange : 테스트 케이스 작성에 필요한 환경 구축
		// pre-condition
		// Given
		String name = null;
		Customer customer = new Customer(name);
		// Act : 테스트 대상 함수를 호출
		// when
		String actualStatement = customer.statement();
		// Assert : 기대값과 실제값이 일치하는지 비교
		// post-condition
		// then
		// junit 단축키 rerun junit ctrl 0으로 설정
		// 초록색 = 테스트 코드에 의해서 실행이 된 영역 
		// 빨간색 = 실행이 안된 영역
		// 노란색 =
		assertEquals("Rental Record for null\n" + 
				"Amount owed is 0.0\n" + 
				"You earned 0 frequent renter pointers", actualStatement); 
	}
	// 3. 무엇을 타겟으로 잡을지 정한다.
	// pricecode를 해본다.
	@Test
	public void test_getPriceCode() {
		// Arrange : 테스트 케이스 작성에 필요한 환경 구축
		// pre-condition
		// Given
		String name = "NAME_NOT_IMPORTANT";
		Movie movie = new Movie("hi", Movie.REGULAR); //getPriceCode보니까 이게 Movie거란걸 알았고, movie를 만들어줘야지
		Customer customer = new Customer(name);
		Rental rental = new Rental(movie, 0);
		customer.addRental(rental);
		// Act : 테스트 대상 함수를 호출
		// when
		String actualStatement = customer.statement(); 
		// Assert : 기대값과 실제값이 일치하는지 비교
		// post-condition
		// then
		// junit 단축키 rerun junit ctrl 0으로 설정
		// 초록색 = 테스트 코드에 의해서 실행이 된 영역 
		// 빨간색 = 실행이 안된 영역 
		// 노란색 =
		assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
				"	2.0(hi)\n" + 
				"Amount owed is 2.0\n" + 
				"You earned 1 frequent renter pointers", actualStatement); 
	}
	// 3. 무엇을 타겟으로 잡을지 정한다.
	// pricecode를 해본다.
	// 숫자는 상수화 시킨다. 3 2 1
	@Test
	public void test_RENTAL_THREEDAYS() {
		String name = "NAME_NOT_IMPORTANT";
		Movie movie = new Movie("hi", Movie.REGULAR); //getPriceCode보니까 이게 Movie거란걸 알았고, movie를 만들어줘야지
		Customer customer = new Customer(name);
		Rental rental = new Rental(movie, THREE_DAYS);
		customer.addRental(rental);
		String actualStatement = customer.statement(); 
		
		assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
				"	3.5(hi)\n" + 
				"Amount owed is 3.5\n" + 
				"You earned 1 frequent renter pointers", actualStatement); 
	}
	
	// 4. 무엇을 타겟으로 잡을지 정한다.
	// pricecode를 해본다.
	// 근데 rental, movie 만들고 customer에 넣어주는게 반복된다.
	@Test
	public void test_x() {
		String name = "NAME_NOT_IMPORTANT";
		String title = "TITLE_NOT_IMPORTANT";
		Movie movie = new Movie(title, Movie.REGULAR); //getPriceCode보니까 이게 Movie거란걸 알았고, movie를 만들어줘야지
		Customer customer = new Customer(name);
		Rental rental = new Rental(movie, THREE_DAYS);
		customer.addRental(rental);
		String actualStatement = customer.statement(); 
		
		assertEquals("Rental Record for NAME_NOT_IMPORTANT\n" + 
				"	3.5(hi)\n" + 
				"Amount owed is 3.5\n" + 
				"You earned 1 frequent renter pointers", actualStatement); 
	}
	
	

}
