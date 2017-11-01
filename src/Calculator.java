
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Calculator extends Application{
	
	Label label1;
	Button button1;
	int i = 1;
	Calculate result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Calculator");
		label1 = new Label("My first labelllll ");
		OpFactory opFactory = new OpFactory();
		

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Scene scene = new Scene(grid, 400, 300);
		stage.setScene(scene);
	
		Text scenetitle = new Text("Wow Calulator");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label op1 = new Label("OP1");
		grid.add(op1, 0, 1);

		TextField operand1 = new TextField();
		grid.add(operand1, 1, 1);

		Label op2 = new Label("OP2");
		grid.add(op2, 0, 2);

		TextField operand2 = new TextField();
		grid.add(operand2, 1, 2);
		
		final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        actiontarget.setFill(Color.FIREBRICK);
		
		Button addButton = new Button("+");
		HBox addBtn = new HBox(10);
		addBtn.setAlignment(Pos.BOTTOM_RIGHT);
		addBtn.getChildren().add(addButton);
		grid.add(addBtn, 1, 4);
		
        addButton.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                
                result = opFactory.getCalc(operand1,operand2,"ADD");
                actiontarget.setText(result.calculate());
            }
        });
		
		Button subButton = new Button("-");
		HBox subBtn = new HBox(10);
		subBtn.setAlignment(Pos.BOTTOM_RIGHT);
		subBtn.getChildren().add(subButton);
		grid.add(subBtn, 2, 4);
		
        subButton.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {

                result = opFactory.getCalc(operand1,operand2,"SUBTRACT");
                actiontarget.setText(result.calculate());
            }
        });
        
		Button mulButton = new Button("*");
		HBox mulBtn = new HBox(10);
		mulBtn.setAlignment(Pos.BOTTOM_RIGHT);
		mulBtn.getChildren().add(mulButton);
		grid.add(mulBtn, 3, 4);
		
        mulButton.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {

                result = opFactory.getCalc(operand1,operand2,"MULTIPLY");
                actiontarget.setText(result.calculate());
            }
        });
        
		Button divButton = new Button("/");
		HBox divBtn = new HBox(10);
		divBtn.setAlignment(Pos.BOTTOM_RIGHT);
		divBtn.getChildren().add(divButton);
		grid.add(divBtn, 4, 4);
		
        divButton.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
            	
                result = opFactory.getCalc(operand1,operand2,"DIVIDE");
                actiontarget.setText(result.calculate());
            }
        });
        
		stage.show();
	}

}
