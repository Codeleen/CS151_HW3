package MVCproject;

public class UpdateMessage implements Message{

	int firstInput;
	int secondInput;
	int thirdInput;
	public UpdateMessage(int one, int two, int three) {
		firstInput = one;
		secondInput = two;
		thirdInput = three;
	}
	
	public int getInputOne() {
		return firstInput;
	}
	public int getInputTwo() {
		return secondInput;
	}
	public int getInputThree() {
		return thirdInput;
	}
}
