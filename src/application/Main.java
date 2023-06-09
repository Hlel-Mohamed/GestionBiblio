package application;

import controllers.ControllerMethods;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application implements ControllerMethods {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/scenes/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 400);
        stage.setTitle("Bibliothéque Tek-Up");
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        centerScene(stage,scene);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}