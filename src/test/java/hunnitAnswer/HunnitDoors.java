package hunnitAnswer;

import static org.junit.Assert.*;

import org.junit.Test;

public class HunnitDoors {

	@Test //첫 실패
	public void doorStates_for_oneDoorNoPass() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(1);
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{false}, doorStates);
	}
	
	
	
	
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_oneDoorPass() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(1);
		oneHunnitDoors.pass();
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		
		//ASSERT
		assertArrayEquals(new boolean[]{true}, doorStates);
	}
	
	
	
	
	//2
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_twoDoor_NoPass() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(2);
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		
		//ASSERT
		assertArrayEquals(new boolean[]{false, false}, doorStates);
	}
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_twoDoor_Pass() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(2);
		oneHunnitDoors.pass();
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{true, true}, doorStates);
	}
	
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_twoDoor_TwoPasses() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(2);
		oneHunnitDoors.pass();
		oneHunnitDoors.pass();
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{true, false}, doorStates);
	}
	
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_ThreeDoor_noPass() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(3);
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{false, false, false}, doorStates);
	}
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_ThreeDoor_onePass() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(3);
		oneHunnitDoors.pass();
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{true, true, true}, doorStates);
	}
	
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_ThreeDoor_twoPasses() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(3);
		oneHunnitDoors.pass();
		oneHunnitDoors.pass();
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{true, false, true}, doorStates);
	}
	
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_ThreeDoor_threePasses() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(3);
		oneHunnitDoors.pass();
		oneHunnitDoors.pass();
		oneHunnitDoors.pass();
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{true, false, false}, doorStates);
	}
	
	//4
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_ThreeDoor_fourNoPass() { //성공한거는 지워도 된다.
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(4);
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{false, false, false, false}, doorStates);
	}
	//4
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_ThreeDoor_four_OnePass() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(4);
		oneHunnitDoors.pass(1);
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{true, true, true, true}, doorStates);
	}
	@Test //첫 실패 //TESTCASE가 다르다? = ARRANGE가 달라야지
	public void doorStates_for_ThreeDoor_four_Two_Passes() {
		//ARRANGE
		OneHunnitDoors oneHunnitDoors = new OneHunnitDoors(4);
		oneHunnitDoors.pass(2);
		//ACT
		boolean[] doorStates = oneHunnitDoors.doorStates();
		//ASSERT
		assertArrayEquals(new boolean[]{true, false, true, false}, doorStates);
	}
	
	
	
	

}
