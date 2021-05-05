package MVCproject;

import java.util.concurrent.BlockingQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;


public class View extends JFrame{

	BlockingQueue<Message> queue;
	JTextField value1;
	JTextField value2;
	JTextField value3;
	JButton resetButton;
	JButton updateButton;
	JLabel outputBlocks;
	
	public View(BlockingQueue<Message> queue, int input1,int input2,int input3) {
		String labelValues = Integer.toString(input1) + " " +Integer.toString(input2) + " " +Integer.toString(input3) + " ";
		this.queue = queue;
		value1 = new JTextField(6);
		value2 = new JTextField(6);
		value3 = new JTextField(6);
		this.resetButton = new JButton("Reset");
		this.updateButton = new JButton("Update");
		this.outputBlocks = new JLabel(labelValues);
	
	
	
	updateButton.addActionListener(e -> {
         int num1 = Integer.parseInt(value1.getText());
         int num2 = Integer.parseInt(value2.getText());
         int num3 = Integer.parseInt(value3.getText());
         
         try {
             Message msg = new UpdateMessage(num1,num2,num3);
             queue.put(msg);
         } catch (InterruptedException exception) {
             // do nothing
         }
     });

     resetButton.addActionListener(e -> {
    	 int ToZero = 0;
         try {
             queue.put(new ResetMessage(ToZero));
         } catch (InterruptedException exception) {
             // do nothing
         }
     });
	
     
     this.add(outputBlocks);
     this.add(value1);
     this.add(value2);
     this.add(value3);
     this.add(updateButton);
     this.add(resetButton);


     this.setSize(600, 150);
     this.setLayout(new FlowLayout());
     this.setVisible(true);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     
     
     
	}
	public void updateNumbersInView(String values) {
		this.outputBlocks.setText(values);
	}
	
}
