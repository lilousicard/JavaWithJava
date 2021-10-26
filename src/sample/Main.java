package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.Color;




public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("UserInterface.fxml"));
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: #c87a4f");
        root.setPadding(new Insets(20,20,20,20));
        primaryStage.setTitle("Learning Java With Java");

        Button signIn = new Button("Sign In");
        signIn.setStyle("-fx-background-color: #cd8765");
        signIn.setMinSize(300,10);
        signIn.setPrefHeight(55);
        signIn.setFont(new Font("Aria",30));

        Button signUp = new Button("Sign Up");
        signUp.setStyle("-fx-background-color: #cd8765");
        signUp.setMinSize(300,10);
        signUp.setPrefHeight(55);
        signUp.setFont(new Font("Aria",30));


        VBox vbButton = new VBox();
        vbButton.setSpacing(10);
        vbButton.setPadding(new Insets(0,20,10,20));
        vbButton.getChildren().addAll(signUp,signIn);
        vbButton.setAlignment(Pos.BOTTOM_CENTER);
        root.getChildren().addAll(vbButton);

        Scene scene = new Scene(root, 800, 400);
        primaryStage.setScene(scene);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
