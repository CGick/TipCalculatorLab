package inclassLab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TipCalculatorApplication extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = FXMLLoader.load(TipCalculatorApplication.class.getResource("Calculator.fxml"));
		
		Scene scene = new Scene(parent);
		
		stage.setScene(scene);
		
		stage.setTitle("Tip Lab!");
		stage.show();
	}

}