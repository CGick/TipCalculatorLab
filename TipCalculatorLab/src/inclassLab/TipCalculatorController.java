package inclassLab;

import java.text.DecimalFormat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TipCalculatorController {

	DecimalFormat money = new DecimalFormat("$#,##0.00");
	
    @FXML
    private Button btnCalculate;

    @FXML
    private TextField tfBill;

    @FXML
    private Label lblTax;

    @FXML
    private Label lblTip;

    @FXML
    private Label lblTotal;

    private double amount=0, tax=0, tip=0, total =0;
    
    @FXML
    void calculateTip() {
    	amount = Double.parseDouble(tfBill.toString());
    	tax = (amount * .06);
    	tip = ((amount + tax) *.15);
    	total = (amount + tax + tip);
    	lblTax.setText(money.format(tax));
    	lblTip.setText(money.format(tip));
    	lblTotal.setText(money.format(total));
    }

}
