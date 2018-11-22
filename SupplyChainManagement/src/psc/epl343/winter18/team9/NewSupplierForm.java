package psc.epl343.winter18.team9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

public class NewSupplierForm extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("New Supplier Form");

        // Create the registration form grid pane
        GridPane gridPane = createRegistrationFormPane();
        // Add UI controls to the registration form grid pane
        addUIControls(gridPane);
        // Create a scene with registration form grid pane as the root node
        Scene scene = new Scene(gridPane, 800, 500);
        // Set the scene in primary stage
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    private GridPane createRegistrationFormPane() {
        // Instantiate a new Grid Pane
        GridPane gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        gridPane.setHgap(10);

        // Set the vertical gap between rows
        gridPane.setVgap(10);

        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {
        // Add Header
        Label headerLabel = new Label("Add Supplier Item");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add Supplier
        Label Supplier = new Label("Supplier ID : ");
        gridPane.add(Supplier, 0,1);

        // Add Supplier Text Field
        TextField SupplierField = new TextField();
        SupplierField.setPrefHeight(40);
        gridPane.add(SupplierField, 1,1);


        // Add Name
        Label Name = new Label("Supplier Name : ");
        gridPane.add(Name, 0, 2);

        // Add Name Field
        TextField NameField = new TextField();
        NameField.setPrefHeight(40);
        gridPane.add(NameField, 1, 2);


        // Add Surname Size Label
        Label SurnameLabel = new Label("Supplier Surname : ");
        gridPane.add(SurnameLabel, 0, 3);

        // Add Surname Field
        TextField SurnameField = new TextField();
        SurnameField.setPrefHeight(40);
        gridPane.add(SurnameField, 1, 3);

        // Add Email Label
        Label Email = new Label("Supplier Email : ");
        gridPane.add(Email, 0, 4);

        // Add Email Field
        TextField EmailField = new TextField();
        EmailField.setPrefHeight(40);
        gridPane.add(EmailField, 1, 4);


        // Add MinimumOrderWeight Price Label
        Label MinimumOrderWeight = new Label("Minimum Order Weight : ");
        gridPane.add(MinimumOrderWeight, 0, 5);

        // Add MinimumOrderWeight Field
        TextField MinimumOrderWeightField = new TextField();
        MinimumOrderWeightField.setPrefHeight(40);
        gridPane.add(MinimumOrderWeightField, 1, 5);

        // Add Telephone Label
        Label Telephone = new Label("Telephone : ");
        gridPane.add(Telephone, 0, 6);

        // Add Telephone Field
        TextField TelephoneField = new TextField();
        TelephoneField.setPrefHeight(40);
        gridPane.add(TelephoneField, 1, 6);

        // Add Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 0, 7, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(SupplierField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the supplier ID");
                    return;
                }
                if(NameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the supplier's name");
                    return;
                }
                if(SurnameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the supplier's surname");
                    return;
                }
                if(EmailField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the supplier's email");
                    return;
                }
                if(MinimumOrderWeightField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the supplier's minimum order weight");
                    return;
                }
                if(TelephoneField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the supplier's telephone");
                    return;
                }

                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Supplier Added Successfully!", "Press OK to continue");
            }
        });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
