import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
	private static Stage primaryStage;
	private static VBox mainLayout;
	

	@Override
	public void start(Stage primaryStage) throws IOException{
		Main.primaryStage = primaryStage;
		Main.primaryStage.setTitle("Supply Chain Management System");
		showLoginView();
		//showWrongCredentialsView();
	}
	
	private void showLoginView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("SCMS_GUI_final.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public  static void showAddNewItemScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddNewItem.fxml"));
		AnchorPane newItem = loader.load();
		
		Stage addNewItem = new Stage();
		addNewItem.setTitle("Add New Item");
		addNewItem.initModality(Modality.WINDOW_MODAL);
		addNewItem.initOwner(primaryStage);
		Scene scene = new Scene(newItem);
		addNewItem.setScene(scene);
		addNewItem.showAndWait();
	}
	
	public  static void showAddNewOrder() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddNewOrder.fxml"));
		AnchorPane newOrder = loader.load();
		
		Stage addNewOrder = new Stage();
		addNewOrder.setTitle("Add New Order");
		addNewOrder.initModality(Modality.WINDOW_MODAL);
		addNewOrder.initOwner(primaryStage);
		Scene scene = new Scene(newOrder);
		addNewOrder.setScene(scene);
		addNewOrder.showAndWait();
	}
	
	public  static void showAddNewSupplier() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddNewSupplier.fxml"));
		AnchorPane newSupplier = loader.load();
		
		Stage addNewSupplier = new Stage();
		addNewSupplier.setTitle("Add New Supplier");
		addNewSupplier.initModality(Modality.WINDOW_MODAL);
		addNewSupplier.initOwner(primaryStage);
		Scene scene = new Scene(newSupplier);
		addNewSupplier.setScene(scene);
		addNewSupplier.showAndWait();
	}
	
	public  static void showAddNewTransfer() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddNewTransfer.fxml"));
		AnchorPane newTransfer = loader.load();
		
		Stage addNewTransfer = new Stage();
		addNewTransfer.setTitle("Add New Transfer");
		addNewTransfer.initModality(Modality.WINDOW_MODAL);
		addNewTransfer.initOwner(primaryStage);
		Scene scene = new Scene(newTransfer);
		addNewTransfer.setScene(scene);
		addNewTransfer.showAndWait();
	}
	
	public  static void showAddNewTransferItem() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddNewTranfserItem.fxml"));
		AnchorPane newTranferItem = loader.load();
		
		Stage addNewTransferItem = new Stage();
		addNewTransferItem.setTitle("Add New Transfer Item");
		addNewTransferItem.initModality(Modality.WINDOW_MODAL);
		addNewTransferItem.initOwner(primaryStage);
		Scene scene = new Scene(newTranferItem);
		addNewTransferItem.setScene(scene);
		addNewTransferItem.showAndWait();
	}
	
	public  static void showEditItem() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("EditItem.fxml"));
		AnchorPane newEditItem = loader.load();
		
		Stage editItem = new Stage();
		editItem.setTitle("Edit Item");
		editItem.initModality(Modality.WINDOW_MODAL);
		editItem.initOwner(primaryStage);
		Scene scene = new Scene(newEditItem);
		editItem.setScene(scene);
		editItem.showAndWait();
	}
	
	public  static void showEditOrder() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("EditOrder.fxml"));
		AnchorPane newEditOrder = loader.load();
		
		Stage editOrder = new Stage();
		editOrder.setTitle("Add New Item");
		editOrder.initModality(Modality.WINDOW_MODAL);
		editOrder.initOwner(primaryStage);
		Scene scene = new Scene(newEditOrder);
		editOrder.setScene(scene);
		editOrder.showAndWait();
	}
	
	public  static void showEditSupplier() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("EditSupplier.fxml"));
		AnchorPane newEditSupplier = loader.load();
		
		Stage editSupplier = new Stage();
		editSupplier.setTitle("Edit Supplier");
		editSupplier.initModality(Modality.WINDOW_MODAL);
		editSupplier.initOwner(primaryStage);
		Scene scene = new Scene(newEditSupplier);
		editSupplier.setScene(scene);
		editSupplier.showAndWait();
	}
	
	public  static void showEditTransfer() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("EditTransfer.fxml"));
		AnchorPane newEditTranfer = loader.load();
		
		Stage editTranfer = new Stage();
		editTranfer.setTitle("Edit Transfer");
		editTranfer.initModality(Modality.WINDOW_MODAL);
		editTranfer.initOwner(primaryStage);
		Scene scene = new Scene(newEditTranfer);
		editTranfer.setScene(scene);
		editTranfer.showAndWait();
	}
	
	public  static void showEditTransferItem() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("AddNewOrder.fxml"));
		AnchorPane newEditTransferItem = loader.load();
		
		Stage editTransferItem = new Stage();
		editTransferItem.setTitle("Add New Item");
		editTransferItem.initModality(Modality.WINDOW_MODAL);
		editTransferItem.initOwner(primaryStage);
		Scene scene = new Scene(newEditTransferItem);
		editTransferItem.setScene(scene);
		editTransferItem.showAndWait();
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}

