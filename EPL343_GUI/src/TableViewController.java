import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewController implements Initializable {

	@FXML private TableView<String> tableView;
	@FXML private TableColumn<String,String> barcode;
	@FXML private TableColumn<String,String> quantity;
	@FXML private TableColumn<String,String> weight;
	@FXML private TableColumn<String,String> volume;
	@FXML private TableColumn<String,String> supplier;
	

//	ObservableList<String> data = FXCollections.observableArrayList(
//			new String()
//			
//	);
//	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		barcode.setCellValueFactory(new PropertyValueFactory<String, String>("barcode"));
		quantity.setCellValueFactory(new PropertyValueFactory<String, String>("quantity"));
		weight.setCellValueFactory(new PropertyValueFactory<String, String>("weight"));
		volume.setCellValueFactory(new PropertyValueFactory<String, String>("volume"));
		supplier.setCellValueFactory(new PropertyValueFactory<String, String>("supplier"));
	}
}
