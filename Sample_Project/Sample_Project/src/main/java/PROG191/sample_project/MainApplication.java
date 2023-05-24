package PROG191.sample_project;

import PROG191.sample_project.data.*;
import PROG191.sample_project.models.Global;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("CMS Project");
        //stage.setFullScreen(true);
        stage.setResizable(false);
        stage.setScene(scene);

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                saveData();
            }
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void saveData() {
        ProgramList.saveData();
        CourseList.saveData();
        UserList.saveData();
        SessionList.saveData();
        NotificationList.saveData();
    }
}