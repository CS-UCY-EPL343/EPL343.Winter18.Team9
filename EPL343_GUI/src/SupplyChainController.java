import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SupplyChainController implements Initializable {

	private Main main;

	@FXML
	private TableView<Inventory> tableView;
	@FXML
	private TableColumn<Inventory, String> barcode;
	@FXML
	private TableColumn<Inventory, String> quantity;
	@FXML
	private TableColumn<Inventory, String> weight;
	@FXML
	private TableColumn<Inventory, String> volume;
	@FXML
	private TableColumn<Inventory, String> supplier;

	ObservableList<Inventory> data = FXCollections.observableArrayList(
					new Inventory("3453534535", "27", "23", "56", "400"),
					new Inventory("3453534535", "10", "27", "32", "150"),
					new Inventory("3453534535", "45", "25", "45", "200"),
					new Inventory("3465324535", "12", "30", "65","100"),
					new Inventory("3457464535", "10", "27", "45", "200"),
					new Inventory("3453235735", "15", "26", "25", "150"),
					new Inventory("3451567535", "18", "23", "46", "250"),
					new Inventory("3456664535", "16", "26", "45", "150"),
					new Inventory("3453558635", "16", "23", "55", "450"),
					new Inventory("3452535535", "20", "13", "25", "150"),
					new Inventory("3453566455", "10", "16", "2", "200"),
					new Inventory("3427285535", "66", "5", "47","150"),
					new Inventory("3453536535", "50", "4", "45", "300"),
					new Inventory("3453302535", "25", "23", "35", "150"),
					new Inventory("3453536595", "10", "25", "45", "450"),
					new Inventory("3453430135", "47", "3", "45", "100"),
					new Inventory("3452584535", "16", "2", "10", "650")
					);
	
	
	@FXML
	private TableView<ManualOrder> tableView2;
	@FXML
	private TableColumn<ManualOrder, String> barcode2;
	@FXML
	private TableColumn<ManualOrder, String> quantity2;
	@FXML
	private TableColumn<ManualOrder, String> weight2;
	@FXML
	private TableColumn<ManualOrder, String> volume2;
	@FXML
	private TableColumn<ManualOrder, String> supplier2;

	ObservableList<ManualOrder> data2 = FXCollections.observableArrayList(
					new ManualOrder("3453534535", "27", "23", "56", "400"),
					new ManualOrder("3453534535", "10", "27", "32", "150"),
					new ManualOrder("3453534535", "45", "25", "45", "200"),
					new ManualOrder("3465324535", "12", "30", "65","100"),
					new ManualOrder("3457464535", "10", "27", "45", "200"),
					new ManualOrder("3453235735", "15", "26", "25", "150"),
					new ManualOrder("3451567535", "18", "23", "46", "250"),
					new ManualOrder("3456664535", "16", "26", "45", "150"),
					new ManualOrder("3453558635", "16", "23", "55", "450"),
					new ManualOrder("3452535535", "20", "13", "25", "150"),
					new ManualOrder("3453566455", "10", "16", "2", "200"),
					new ManualOrder("3427285535", "66", "5", "47","150"),
					new ManualOrder("3453536535", "50", "4", "45", "300"),
					new ManualOrder("3453302535", "25", "23", "35", "150"),
					new ManualOrder("3453536595", "10", "25", "45", "450"),
					new ManualOrder("3453430135", "47", "3", "45", "100"),
					new ManualOrder("3452584535", "16", "2", "10", "650")
					);

	@FXML
	private TableView<Supplier> tableView1;

	@FXML
	private TableColumn<Supplier, String> id1;
	
	@FXML
	private TableColumn<Supplier, String> company1;
	
	@FXML
	private TableColumn<Supplier, String> supplier1;
	@FXML
	private TableColumn<Supplier, String> address1;
	@FXML
	private TableColumn<Supplier, String> telephone1;
	@FXML
	private TableColumn<Supplier, String> email1;


	ObservableList<Supplier> data1 = FXCollections.observableArrayList(
			new Supplier("1","Company1","Rio Tinto Group", "Shang Hai Shi Lin Gang Xin Cheng Hu Cheng Huan Lu 999hao", "+86-18021006399", "steelhu@union-tio2.com"),
			new Supplier("2","Company2","Aluminum Corporation of China Limited", "Block A, Software Building, No.9, Xinghuo Road, Nanjing New & High Technology Industry Development Zone, Nanjing, Jiangsu, China", "+86-1806325396", "jane_doe@chalco.com.cn"),
			new Supplier("3","Company3","Rusal chinese aluminum companies", "Bei Nong Lu Bei Jing Nong Xue Yuan Shi Pin Ke Xue Xue Yuan 2010gong Cheng Si Ban", "+86-18336006322", "rusal@support.com.cn"),
			new Supplier("4","Company4","China Hongqiao Group", "Xiang Cheng Zhong Lu 38hao Xin Guang Huan Huo", "+86-18321001799", "honqiao@yopmail.com")
			);
	
//	private TableView<ManualOrder> tableView2;
//
//	@FXML
//	private TableColumn<ManualOrder, String> barcode2;
//	@FXML
//	private TableColumn<ManualOrder, String> quantity2;
//	@FXML
//	private TableColumn<ManualOrder, String> weight2;
//	@FXML
//	private TableColumn<ManualOrder, String> volume2;
//	@FXML
//	private TableColumn<ManualOrder, String> supplier2;
//
//	ObservableList<ManualOrder> data2 = FXCollections.observableArrayList(
//			new ManualOrder("3453534535", "27", "23", "56", "400"),
//			new ManualOrder("3453534535", "10", "27", "32", "150"),
//			new ManualOrder("3453534535", "45", "25", "45", "200"),
//			new ManualOrder("3465324535", "12", "30", "65","100"),
//			new ManualOrder("3457464535", "10", "27", "45", "200"),
//			new ManualOrder("3453235735", "15", "26", "25", "150"),
//			new ManualOrder("3451567535", "18", "23", "46", "250"),
//			new ManualOrder("3456664535", "16", "26", "45", "150"),
//			new ManualOrder("3453558635", "16", "23", "55", "450"),
//			new ManualOrder("3452535535", "20", "13", "25", "150"),
//			new ManualOrder("3453566455", "10", "16", "2", "200"),
//			new ManualOrder("3427285535", "66", "5", "47","150"),
//			new ManualOrder("3453536535", "50", "4", "45", "300"),
//			new ManualOrder("3453302535", "25", "23", "35", "150"),
//			new ManualOrder("3453536595", "10", "25", "45", "450"),
//			new ManualOrder("3453430135", "47", "3", "45", "100"),
//			new ManualOrder("3452584535", "16", "2", "10", "650")
//			);
//	
//	private TableView<AutomaticOrder> tableView3;
//
//	@FXML
//	private TableColumn<AutomaticOrder, String> barcode3;
//	@FXML
//	private TableColumn<AutomaticOrder, String> quantity3;
//	@FXML
//	private TableColumn<AutomaticOrder, String> weight3;
//	@FXML
//	private TableColumn<AutomaticOrder, String> volume3;
//	@FXML
//	private TableColumn<AutomaticOrder, String> supplier3;
//
//	ObservableList<AutomaticOrder> data3 = FXCollections.observableArrayList(
//			new AutomaticOrder("3453534535", "27", "23", "56", "400"),
//			new AutomaticOrder("3453534535", "10", "27", "32", "150"),
//			new AutomaticOrder("3453534535", "45", "25", "45", "200"),
//			new AutomaticOrder("3465324535", "12", "30", "65","100"),
//			new AutomaticOrder("3453536535", "50", "4", "45", "300"),
//			new AutomaticOrder("3453430135", "47", "3", "45", "100"),
//			new AutomaticOrder("3452584535", "16", "2", "10", "650")
//			);
//	
//	private TableView<Trends> tableView4;
//
//	@FXML
//	private TableColumn<Trends, String> trends;
//	@FXML
//	private TableColumn<Trends, String> salespermonth;
//
//
//	ObservableList<Trends> data4 = FXCollections.observableArrayList(
//			new Trends("3453534535", "24"),
//			new Trends("3453536595", "52"),
//			new Trends("3453536595", "62"),
//			new Trends("3456664535", "82"),
//			new Trends("3452584535", "30"),
//			new Trends("3453430135", "15"),
//			new Trends("3452535535", "32"),
//			new Trends("3453566455", "40"),
//			new Trends("3427285535", "43"),
//			new Trends("3452584535", "12")
//			
//			);
//	
//	private TableView<Trends> tableView5;
//
//	@FXML
//	private TableColumn<Trends, String> barcode5;
//	@FXML
//	private TableColumn<Trends, String> quantity5;
//
//
//	ObservableList<Trends> data5 = FXCollections.observableArrayList(
//			new Trends("0.0235", "35"),
//			new Trends("0.0564", "62"),
//			new Trends("0.0654", "72"),
//			new Trends("0.0873", "80"),
//			new Trends("0.564", "50"),
//			new Trends("0.0125", "10"),
//			new Trends("0.0394", "35"),
//			new Trends("0.0964", "102"),
//			new Trends("0.1002", "117"),
//			new Trends("0.0325", "40"),
//			new Trends("0.0548", "63"),
//			new Trends("0.0321", "39"),
//			new Trends("0.0128", "11"),
//			new Trends("0.0347", "41"),
//			new Trends("0.0068", "3")
//			
//			);
	
	

	@FXML
	private void addNewItem() throws IOException {
		// main.showAddNewItemScene();
		Main.showAddNewItemScene();
	}

	@FXML
	private void addNewOrder() throws IOException {
		// main.showAddNewItemScene();
		Main.showAddNewOrder();
	}

	@FXML
	private void addNewSupplier() throws IOException {
		// main.showAddNewItemScene();
		Main.showAddNewSupplier();
	}

	@FXML
	private void addNewTransfer() throws IOException {
		// main.showAddNewItemScene();
		Main.showAddNewTransfer();
	}

	@FXML
	private void addNewTransferItem() throws IOException {
		// main.showAddNewItemScene();
		Main.showAddNewTransferItem();
	}

	@FXML
	private void editItem() throws IOException {
		// main.showAddNewItemScene();
		Main.showEditItem();
	}

	@FXML
	private void editOrder() throws IOException {
		// main.showAddNewItemScene();
		Main.showEditOrder();
	}

	@FXML
	private void editSupplier() throws IOException {
		// main.showAddNewItemScene();
		Main.showEditSupplier();
	}

	@FXML
	private void editTransfer() throws IOException {
		// main.showAddNewItemScene();
		Main.showEditTransfer();
	}

	@FXML
	private void editTransferItem() throws IOException {
		// main.showAddNewItemScene();
		Main.showEditTransferItem();
	}

	// @Override
	public void initialize(URL location, ResourceBundle resources) {
		barcode.setCellValueFactory(new PropertyValueFactory<Inventory, String>("barcode"));
		quantity.setCellValueFactory(new PropertyValueFactory<Inventory, String>("quantity"));
		weight.setCellValueFactory(new PropertyValueFactory<Inventory, String>("weight"));
		volume.setCellValueFactory(new PropertyValueFactory<Inventory, String>("volume"));
		supplier.setCellValueFactory(new PropertyValueFactory<Inventory, String>("supplier"));
		tableView.setItems(data);
		
		id1.setCellValueFactory(new PropertyValueFactory<Supplier, String>("id1"));
		company1.setCellValueFactory(new PropertyValueFactory<Supplier, String>("company1"));
		address1.setCellValueFactory(new PropertyValueFactory<Supplier, String>("address1"));
		supplier1.setCellValueFactory(new PropertyValueFactory<Supplier, String>("supplier1"));
		telephone1.setCellValueFactory(new PropertyValueFactory<Supplier, String>("telephone1"));
		email1.setCellValueFactory(new PropertyValueFactory<Supplier, String>("email1"));
		tableView1.setItems(data1);
		
		barcode2.setCellValueFactory(new PropertyValueFactory<ManualOrder, String>("barcode2"));
		quantity2.setCellValueFactory(new PropertyValueFactory<ManualOrder, String>("quantity2"));
		weight2.setCellValueFactory(new PropertyValueFactory<ManualOrder, String>("weight2"));
		volume2.setCellValueFactory(new PropertyValueFactory<ManualOrder, String>("volume2"));
		supplier2.setCellValueFactory(new PropertyValueFactory<ManualOrder, String>("supplier2"));
		tableView2.setItems(data2);
		
	}

	// public void showAlert() {
	// Alert alert = new Alert(AlertType.INFORMATION);
	// alert.setTitle("Information Dialog");
	// alert.setHeaderText("Look, an Information Dialog");
	// alert.setContentText("I have a great message for you!");
	//
	// alert.showAndWait();
	// }
}
