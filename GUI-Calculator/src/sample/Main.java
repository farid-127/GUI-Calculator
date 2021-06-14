package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            FXMLLoader loader = new FXMLLoader ( getClass().getResource( "sample.fxml" ));
            loader.setController(new Controller());
            Parent root = loader.load();
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
