package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField textLogin, textPassword;
    @FXML
    private Button buttonSubmit;
    @FXML
    private Label labelUserError;
    @FXML
    public void onClick(ActionEvent actionEvent) {
        String login = textLogin.getText();
        String password = textPassword.getText();
        System.out.println(login + "--" + password);
        //Consultamos a la BD y para manuel la contraseña es 1234.
        if (login.equals("manuel") && password.equals("1234"))
            System.out.println("Cambiamos de ventana.");
        else
            labelUserError.setText("Usuario incorrecto.");
        //SI CORRECTO, CAMBIAR DE VENTANA
        //SINO MENSAJE DE ERROR
    }
}