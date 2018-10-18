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
		HunnitDoors doors = new HunnitDoors();
		assertArrayEquals(new boolean[]{false}, doors.getState()); 
	}

}
