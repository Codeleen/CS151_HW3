package MVCproject;


public class Model {
 private int block1;
 private int block2;
 private int block3;
 //private String outputGraph;


public int getNum1() {
	return block1;
}
public int getNum2() {
	return block2;
}
public int getNum3() {
	return block3;
}
public void setAllBlocks(int one, int two, int three) {
	block1= one;
	block2 = two;
	block3 = three;
	
}

}