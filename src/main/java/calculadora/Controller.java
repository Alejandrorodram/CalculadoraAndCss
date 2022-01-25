package calculadora;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import operaciones.Calculadora;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class Controller implements Initializable {
	
	public Calculadora calculadora;
	
	public Controller() throws IOException {
    	calculadora = new Calculadora();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/root.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	// view
	@FXML
    private Button divide;

    @FXML
    private Button equal;

    @FXML
    private Button eraseAll;

    @FXML
    private Button eraseOne;

    @FXML
    private Button minus;

    @FXML
    private Button mult;

    @FXML
    private Button n0;

    @FXML
    private Button n1;

    @FXML
    private Button n2;

    @FXML
    private Button n3;

    @FXML
    private Button n4;

    @FXML
    private Button n5;

    @FXML
    private Button n6;

    @FXML
    private Button n7;

    @FXML
    private Button n8;

    @FXML
    private Button n9;

    @FXML
    private Button plus;

    @FXML
    private Button point;

    @FXML
    private TextField screen;

    @FXML
    private GridPane view;

    @FXML
    void onDivideAction(ActionEvent event) {
    	calculadora.operar('/');
    }

    @FXML
    void onEqualsaction(ActionEvent event) {
    	calculadora.operar('=');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onEraseAllAction(ActionEvent event) {
    	calculadora.borrarTodo();
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onEraseOneAction(ActionEvent event) {
    	calculadora.borrar();
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onMinusAction(ActionEvent event) {
    	calculadora.operar('-');
    }

    @FXML
    void onMultiplyAction(ActionEvent event) {
    	calculadora.operar('*');
    }

    @FXML
    void onN0Action(ActionEvent event) {
    	calculadora.insertar('0');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onN1Action(ActionEvent event) {
    	calculadora.insertar('1');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onN2Action(ActionEvent event) {
    	calculadora.insertar('2');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onN3Action(ActionEvent event) {
    	calculadora.insertar('3');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onN4Action(ActionEvent event) {
    	calculadora.insertar('4');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onN5Action(ActionEvent event) {
    	calculadora.insertar('5');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onN6Action(ActionEvent event) {
    	calculadora.insertar('6');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onN7Action(ActionEvent event) {
    	calculadora.insertar('7');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onN8Action(ActionEvent event) {
    	calculadora.insertar('8');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onN9Action(ActionEvent event) {
    	calculadora.insertar('9');
    	screen.setText(calculadora.getPantalla());
    }

    @FXML
    void onPlusAction(ActionEvent event) {
    	calculadora.operar('+');
    }

    @FXML
    void onPointAction(ActionEvent event) {
    	calculadora.insertarComa();
    }    
    
	public void initialize(URL location, ResourceBundle resources) {
		ContextMenu contextMenu = new ContextMenu();
		MenuItem menuItem1 = new MenuItem("Calculadora Clásica");
        MenuItem menuItem2 = new MenuItem("Calculadora Moderna");
        
        contextMenu.getItems().add(menuItem1);
        contextMenu.getItems().add(menuItem2);
        
        menuItem1.setOnAction((event) -> {
        	System.out.println("Hola1");
        	view.getStylesheets().remove("/css/CalculadoraModerna.css");
        	view.getStylesheets().add("/css/Calculadora.css");
        	view.getStylesheets().setAll("/css/Calculadora.css");
        });
        menuItem2.setOnAction((event) -> {
        	System.out.println("Hola2");
        	view.getStylesheets().remove("/css/Calculadora.css");
        	view.getStylesheets().add("/css/CalculadoraModerna.css");
        	view.getStylesheets().setAll("/css/CalculadoraModerna.css");
        });
        
        view.setOnContextMenuRequested(e -> {
			contextMenu.show(view, e.getScreenX(), e.getScreenY());
		});

	}
	
	public GridPane getView() {
		return view;
	}

}
