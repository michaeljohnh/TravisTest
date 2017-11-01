import javafx.scene.control.TextField;

public class Divide extends Operate implements Calculate {
	
	public Divide(TextField op1, TextField op2) {
		super(op1,op2);
	}

	@Override
	public String calculate() {
		
		if (operands[1] == 0) {
			return "Error: DIVISION BY ZERO";
		}
		
		return Double.toString(operands[0] / operands[1]);
	}

}
