import javafx.scene.control.TextField;

public class OpFactory {
	
	public OpFactory() {
	}
	
	public static Calculate getCalc(TextField op1, TextField op2, String op) {
		if (op.equalsIgnoreCase("ADD")) {
			return new Add(op1,op2);
		}
		else if (op.equalsIgnoreCase("SUBTRACT")) {
			return new Subtract(op1,op2);
		}
		else if (op.equalsIgnoreCase("MULTIPLY")) {
			return new Multiply(op1,op2);
		}
		else if (op.equalsIgnoreCase("DIVIDE")) {
			return new Divide(op1,op2);
		}
		return null;
	}

}
