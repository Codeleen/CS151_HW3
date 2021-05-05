package MVCproject;

public class ResetMessage implements Message{

	int value;
	public ResetMessage(int value) {
		this.value = value;
	}
	
	public int resetAll() {
		return value;
	}
}
