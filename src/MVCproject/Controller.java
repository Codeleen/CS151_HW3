package MVCproject;

import java.util.concurrent.BlockingQueue;

public class Controller {

	BlockingQueue<Message> queue;
    Model model;
    View view;
    
    public Controller(BlockingQueue<Message> queue, Model model, View view) {
    	this.queue = queue;
        this.model = model;
        this.view = view;
    }
    
    public void mainLoop() {
        while (view.isDisplayable()) {
            Message message = null;
            try {
                message = queue.take();
            } catch (InterruptedException exception) {
                // do nothing
            }

            if(message.getClass() == UpdateMessage.class) {
                // button updateMessage was clicked
            	UpdateMessage newInputs = (UpdateMessage) message;
            	int numb1 = newInputs.getInputOne();
            	int numb2 = newInputs.getInputTwo();
            	int numb3 = newInputs.getInputThree();
            	String outputBlocks = Integer.toString(numb1) + "  " +Integer.toString(numb2) + "  " +Integer.toString(numb3) ;
                model.setAllBlocks(numb1, numb2, numb3); // update model
                view.updateNumbersInView(outputBlocks); // update view
            }
            else if(message.getClass() == ResetMessage.class) {
                // button addClass was clicked4333333333333333333w3
                // update model and view
            	ResetMessage resetValues = (ResetMessage) message;
            	int theZero = resetValues.resetAll();
            	String outputBlocks = "0  0  0";
                model.setAllBlocks(theZero, theZero, theZero);
                view.updateNumbersInView(outputBlocks);
            }

        }
    }
}
