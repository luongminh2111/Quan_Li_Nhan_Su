package resource.Login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Display/controll/Login.fxml"));
        primaryStage.setTitle("Trang chu Quan Li Nhan Su");
        primaryStage.setScene(new Scene(root, 1280, 700));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}