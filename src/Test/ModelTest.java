package Test;


import org.junit.Test;

import MVCproject.Model;
	
public class ModelTest {
	
	
	@Test
	public void setAllBlocksTest() {
		Model myModel = new Model();
		 myModel.setAllBlocks(22, 33, 44);
		 int numOne = myModel.getNum1();
		 int numTwo = myModel.getNum2();
		 int numThree = myModel.getNum3();
		 
		 assertEquals(22, numOne);
		 assertEquals(33, numTwo);
		 assertEquals(44, numThree);
	}

}
