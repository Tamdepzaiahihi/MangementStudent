package PROG191.sample_project.controllers.admin;

import PROG191.sample_project.data.NotificationList;
import PROG191.sample_project.data.ProgramList;
import PROG191.sample_project.data.UserList;
import PROG191.sample_project.models.Global;
import PROG191.sample_project.models.Notification;
import PROG191.sample_project.models.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

public class NotificationController implements Initializable {
    @FXML
    private TextField addTitle, addNotification, searchCode;

    @FXML
    private Button btnAdd, btnEdit;

    @FXML
    private TableView listTable;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        viewAll();
    }

    private void clearInput() {
        addTitle.setText("");
        addNotification.setText("");
    }

    @FXML
    protected void addEnter(KeyEvent ke) {
        if (ke.getCode() == KeyCode.ENTER)
            add();
    }

    @FXML
    protected void add() throws NoSuchAlgorithmException {
        if (btnAdd.getText().equals("Add")) {
            Notification notification = new Notification(0,
                    addTitle.getText(),
                    addNotification.getText(),

            NotificationList.add(notification);

            clearInput();

            return;
        }

        resetForm();
    }
    private void resetForm() {
        clearInput();

        btnAdd.setText("Add");
        btnEdit.setDisable(true);
    }


}
