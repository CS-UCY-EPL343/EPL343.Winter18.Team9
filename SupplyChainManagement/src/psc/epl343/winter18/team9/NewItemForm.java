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

public class NewItemForm extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("New Item Form");

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
        Label headerLabel = new Label("Add New Item");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add Product
        Label Product = new Label("Product ID : ");
        gridPane.add(Product, 0,1);

        // Add Product Text Field
        TextField ProductField = new TextField();
        ProductField.setPrefHeight(40);
        gridPane.add(ProductField, 1,1);


        // Add Material
        Label Material = new Label("Material : ");
        gridPane.add(Material, 0, 2);

        // Add MaterialText Field
        TextField MaterialField = new TextField();
        MaterialField.setPrefHeight(40);
        gridPane.add(MaterialField, 1, 2);


        // Add Product Size Label
        Label ProductSizeLabel = new Label("Product Size : ");
        gridPane.add(ProductSizeLabel, 0, 3);

        // Add Size Field
        TextField SizeField = new TextField();
        SizeField.setPrefHeight(40);
        gridPane.add(SizeField, 1, 3);

        // Add Product Weight Label
        Label ProductWeight = new Label("Product Weight : ");
        gridPane.add(ProductWeight, 0, 4);

        // Add ProductWeight Field
        TextField ProductWeightField = new TextField();
        ProductWeightField.setPrefHeight(40);
        gridPane.add(ProductWeightField, 1, 4);


        // Add Product Price Label
        Label ProductPrice = new Label("Product Price : ");
        gridPane.add(ProductPrice, 0, 5);

        // Add Product Price Field
        TextField ProductPriceField = new TextField();
        ProductPriceField.setPrefHeight(40);
        gridPane.add(ProductPriceField, 1, 5);

        // Add ReorderLevel Label
        Label ReorderLevel = new Label("Reorder Level : ");
        gridPane.add(ReorderLevel, 0, 6);

        // Add ReorderLevel Field
        TextField ReorderLevelField = new TextField();
        ReorderLevelField.setPrefHeight(40);
        gridPane.add(ReorderLevelField, 1, 6);

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
                    if(ProductField.getText().isEmpty()) {
                        showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the product ID");
                        return;
                    }
                    if(MaterialField.getText().isEmpty()) {
                        showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the product material");
                        return;
                    }
                    if(SizeField.getText().isEmpty()) {
                        showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the product size");
                        return;
                    }
                    if(ProductWeightField.getText().isEmpty()) {
                        showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the product weight");
                        return;
                    }
                    if(ProductPriceField.getText().isEmpty()) {
                        showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the product price");
                        return;
                    }
                    if(ReorderLevelField.getText().isEmpty()) {
                        showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter the product reorder level");
                        return;
                    }

                    showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Item Added Successfully!", "Press OK to continue");
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
