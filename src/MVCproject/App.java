package MVCproject;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {

	
	public static void main(String[] args) {

        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

        Model model = new Model();
        View view = new View(queue, model.getNum1(), model.getNum2(),model.getNum3());
        Controller controller = new Controller(queue, model, view);
        controller.mainLoop();
    }
	
}
