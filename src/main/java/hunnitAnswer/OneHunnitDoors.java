package hunnitAnswer;

public class OneHunnitDoors {

	// constructor
	private int pass = 0;
	private boolean[] doorStates;
	private int doorCount;

	public OneHunnitDoors() {
		doorStates = new boolean[] { false };
	}

	public OneHunnitDoors(int doorCount) {
		this.doorCount = doorCount;
		doorStates = new boolean[doorCount];
	}

	public boolean[] doorStates() {
		return doorStates;
	}

	public void changeDoorStates() {
		if (doorCount == 4) {
			for(int pass = 1; pass <=doorCount; pass ++){
				for(int doorIndex = pass-1; doorIndex < doorCount; doorIndex+=pass){
					doorStates[doorIndex] = !doorStates[doorIndex]; //0123 만 바뀌네 
				} 
			}
		} else if (doorCount == 3) { 
			for(int pass = 1; pass <=doorCount; pass ++){
				for(int doorIndex = pass-1; doorIndex < doorCount; doorIndex+=pass){
					doorStates[doorIndex] = !doorStates[doorIndex]; //0123 만 바뀌네 
				} 
			}
		} else if (doorCount == 2) {
			for(int pass = 1; pass <=doorCount; pass ++){
				for(int doorIndex = pass-1; doorIndex < doorCount; doorIndex+=pass){
					doorStates[doorIndex] = !doorStates[doorIndex]; //0123 만 바뀌네 
				} 
			}
		} else {
			for(int pass = 1; pass <=doorCount; pass ++){
				for(int doorIndex = pass-1; doorIndex < doorCount; doorIndex+=pass){
					doorStates[doorIndex] = !doorStates[doorIndex]; //0123 만 바뀌네 
				} 
			}
		}
		
	/*	if (doorCount == 4) {
			if (pass == 2) {
				doorStates[3] = !doorStates[3]; 
				doorStates[1] = !doorStates[1];
			}else if (pass == 1) {
				for(int doorIndex = pass-1; doorIndex < doorCount; doorIndex+=pass){
					doorStates[doorIndex] = !doorStates[doorIndex]; //0123 만 바뀌네 
				} 
				doorStates[0] = !doorStates[0];
				doorStates[1] = !doorStates[1];
				doorStates[2] = !doorStates[2];
				doorStates[3] = !doorStates[3];
			}
		} else if (doorCount == 3) {
			if (pass == 3) {
				doorStates[2] = !doorStates[2];
			} else if (pass == 2) {
				for(int doorIndex = pass-1; doorIndex < 3; doorIndex+=pass){
					doorStates[doorIndex] = !doorStates[doorIndex]; //0123 만 바뀌네 
				}   
				doorStates[1] = !doorStates[1];
			} else if (pass == 1) {
				for(int doorIndex = 0; doorIndex < 3; doorIndex++){
					doorStates[doorIndex] = !doorStates[doorIndex]; //0123 만 바뀌네
				} 
				doorStates[0] = !doorStates[0]; //0123 만 바뀌네
				doorStates[1] = !doorStates[1];
				doorStates[2] = !doorStates[2];
//				doorStates[0] = !doorStates[0]; //0123 만 바뀌네
//				doorStates[1] = !doorStates[1];
//				doorStates[2] = !doorStates[2];
			}
		} else if (doorCount == 2) {
			if (pass == 2) {
				doorStates[1] = !doorStates[1];
			} else if (pass == 1) {
				doorStates[0] = !doorStates[0];
				doorStates[1] = !doorStates[1];
			}
		} else {
			if (pass == 1)
				doorStates[0] = !doorStates[0];
		}*/

	}

	public void pass(int i) {
		for (int j = 0; j < i; j++){
			pass();
		}
	}

	public void pass() {
		pass++;
		changeDoorStates();
	}

}
