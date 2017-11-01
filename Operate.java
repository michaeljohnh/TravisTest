import javafx.scene.control.TextField;

public class Operate {
	
	protected double[] operands;
	
	public Operate(TextField op1, TextField op2) {
		operands = new double[2];
		operands[0] = Double.parseDouble(op1.getText());
		operands[1] = Double.parseDouble(op2.getText());	
		
	}
}
