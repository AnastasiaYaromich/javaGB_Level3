package Chat.Client;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("sample.fxml"));
        Pane root = loader.load();
        primaryStage.setTitle("Chat");
        primaryStage.setScene(new Scene(root, 355, 492));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


