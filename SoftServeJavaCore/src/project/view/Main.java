package project.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("resources/sample.fxml"));
        stage.setTitle("Game");
        Scene scene = new Scene(root, 230, 270);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("resources/main.css").toExternalForm());
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
