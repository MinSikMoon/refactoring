package practice2;

public class HunnitDoors {

	private int passCnt;
	boolean[] statements;
	private int doorCnt;

	public HunnitDoors(int i) {
		passCnt = 0;
		doorCnt = i;
		statements = new boolean[doorCnt];
	}

	public boolean[] getState() {
		return statements; // test 1을 통과시키는 방법은 그냥 false 내뱉기
	}

	private void changeState() {
		for(int i = (passCnt-1); i<doorCnt; i+=passCnt){
			statements[i] = !statements[i];
		}
	}
/*	private void changeState() {
		if (doorCnt == 3) { //뭔가 패턴이 보이나? 보인다면 리팩토링해본다. 조금씩
			if (passCnt == 3) { 
				statements[2] = !statements[2];
			}else if (passCnt == 2) {
				statements[1] = !statements[1];
			}else if (passCnt == 1) {
				statements[2] = !statements[2];
				statements[1] = !statements[1];
				statements[0] = !statements[0];
			}
		}else if (doorCnt == 2) {
			if (passCnt == 2) {
				statements[1] = !statements[1];
			}else if (passCnt == 1) {
				statements[1] = !statements[1];
				statements[0] = !statements[0];
			}
		} else {
			if (passCnt == 1)
				statements[0] = !statements[0];
		}
	}
*/
	public void pass() {
		passCnt++;
		changeState();
	}

	public void pass(int passCnt) {
		for(int i=0; i<passCnt; i++)
			pass();
	}

}
