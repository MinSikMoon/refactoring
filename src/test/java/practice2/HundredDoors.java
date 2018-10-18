package practice2;

import static org.junit.Assert.*;

import org.junit.Test;

public class HundredDoors {
	/*
	100 doors in a row are all initially closed. You make
	100 passes by the doors. The first time through, you
	visit every door and toggle the door (if the door is
	closed, you open it; if it is open, you close it).
	The second time you only visit every 2nd door (door
	#2, #4, #6, ...). The third time, every 3rd door
	(door #3, #6, #9, ...), etc, until you only visit
	the 100th door.
	Question: What state are the doors in after the last
	pass? Which are open, which are closed?
	[Source http://rosettacode.org]
	*/
	// -> 일단 이게 요구사항이다. 요구사항 파악이 먼저다.
	// 문이 존재하고, 열고 닫는 행위를 한다.
	// 근데 100개의 문이라면 1개의 문으로 범위를 축소시켜도 같은 모델아닌가?
	// 1개의 문, 한번도 통과안한 상태가 가장 작은 모델일테지.
	@Test 
	public void one_door_no_pass() {
		HunnitDoors doors = new HunnitDoors(1);
		assertArrayEquals(new boolean[]{false}, doors.getState()); 
	}
	// 1개의 문 / 통과
	@Test 
	public void one_door_pass() {
		//Arrange
		HunnitDoors doors = new HunnitDoors(1);
		doors.pass(); //통과함수 만들기
		//Act
		
		//Assert
		assertArrayEquals(new boolean[]{true}, doors.getState()); 
	}
	// 2개의 문 / 
	@Test 
	public void two_door() {
		//Arrange
		HunnitDoors doors = new HunnitDoors(2); //2개의 문을 어떻게 만들지? 생성자에 있어야 될듯.

		//Act
		
		//Assert
		assertArrayEquals(new boolean[]{false,false}, doors.getState()); 
	}
	// 2개의 문 / 1번 pass
	@Test 
	public void two_door_one_pass() {
		//Arrange
		HunnitDoors doors = new HunnitDoors(2); //2개의 문을 어떻게 만들지? 생성자에 있어야 될듯.
		doors.pass();
		//Act
		
		//Assert
		assertArrayEquals(new boolean[]{true,true}, doors.getState()); 
	}
	// 2개의 문 / 2번 pass
	@Test 
	public void two_door_two_pass() {
		//Arrange
		HunnitDoors doors = new HunnitDoors(2); //2개의 문을 어떻게 만들지? 생성자에 있어야 될듯.
		doors.pass();
		doors.pass();
		//Act 
		
		//Assert
		assertArrayEquals(new boolean[]{true,false}, doors.getState()); 
	}
	// 3개의 문 / 2번 pass
	@Test 
	public void three_door_one_pass() {
		//Arrange
		HunnitDoors doors = new HunnitDoors(3); //2개의 문을 어떻게 만들지? 생성자에 있어야 될듯.
		doors.pass(1);
		//Act
		
		//Assert
		assertArrayEquals(new boolean[]{true,true,true}, doors.getState()); 
	}
	@Test 
	public void three_door_two_pass() {
		//Arrange
		HunnitDoors doors = new HunnitDoors(3); //2개의 문을 어떻게 만들지? 생성자에 있어야 될듯.
		doors.pass(2);
		//Act
		
		//Assert
		assertArrayEquals(new boolean[]{true,false,true}, doors.getState()); 
	}
	@Test 
	public void three_door_three_pass() {
		//Arrange
		HunnitDoors doors = new HunnitDoors(3); //2개의 문을 어떻게 만들지? 생성자에 있어야 될듯.
		doors.pass(3);
		//Act
		
		//Assert
		assertArrayEquals(new boolean[]{true,false,false}, doors.getState()); 
	}
	@Test 
	public void four_door_three_pass() {
		//Arrange
		HunnitDoors doors = new HunnitDoors(4); //2개의 문을 어떻게 만들지? 생성자에 있어야 될듯.
		doors.pass(1);
		//Act
		
		//Assert
		assertArrayEquals(new boolean[]{true,true,true,true}, doors.getState()); 
	}

}
