import javafx.scene.control.TextField;

public class Add extends Operate implements Calculate{
	
	public Add(TextField op1, TextField op2) {
		super(op1,op2);
	}

	@Override
	public String calculate() {
		return Double.toString(operands[0] + operands[1]);
	}
}
