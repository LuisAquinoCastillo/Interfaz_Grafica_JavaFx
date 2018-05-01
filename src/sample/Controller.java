package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //Valores de las flechas del fomulario
    @FXML private ImageView flechaUsuario;
    @FXML private ImageView flechaLocalidad;
    @FXML private ImageView flechaEducacion;

    //Valores de los paneles del fomulario
    @FXML private AnchorPane usuarioForm;
    @FXML private AnchorPane localidadForm;
    @FXML private AnchorPane educacionForm;

    //Valores de los comboBox para el listado de opciones
    @FXML private ComboBox<String> paises;
    @FXML private ComboBox<String> estados;
    @FXML private ComboBox<String> ciudades;

    //agregación de datos a los combo box
    ObservableList<String> paisesItems= FXCollections.observableArrayList(
            "México",
            "Estados Unidos",
            "Canada"
    );

    ObservableList<String> estadosItems= FXCollections.observableArrayList(
            "Houston",
            "Puebla",
            "Toronto"
    );
    //Implementacion de metodo de inicialización
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        paises.setItems(paisesItems);
        estados.setItems(estadosItems);
    }

    //Metodo para controlar el cierre de la aplicación y corte procesos
    public void exitAplicacionBoton(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }

    /*Metodos para controlar la aparicion de los paneles correspondientes
    * 1.- Usuario
    * 2.- Localidad
    * 3.- Educación */
//  ( 1 )
    public void usuarioAplicacionBoton(MouseEvent event){
        if (usuarioForm.isVisible()){
            usuarioForm.setVisible(false);
            flechaUsuario.setVisible(false);
            return;
        }

        usuarioForm.setVisible(true);
        flechaUsuario.setVisible(true);

        flechaLocalidad.setVisible(false);
        flechaEducacion.setVisible(false);
        localidadForm.setVisible(false);
        educacionForm.setVisible(false);

    }
//  ( 2 )
    public void localidadAplicacionBoton(MouseEvent event){
        if (localidadForm.isVisible()){
            localidadForm.setVisible(false);
            flechaLocalidad.setVisible(false);
            return;
        }

        localidadForm.setVisible(true);
        flechaLocalidad.setVisible(true);

        flechaEducacion.setVisible(false);
        flechaUsuario.setVisible(false);
        usuarioForm.setVisible(false);
        educacionForm.setVisible(false);
    }
//  ( 3 )
    public void educacionAplicacionBoton(MouseEvent event){
        if (educacionForm.isVisible()){
            educacionForm.setVisible(false);
            flechaEducacion.setVisible(false);
            return;
        }
        educacionForm.setVisible(true);
        flechaEducacion.setVisible(true);

        flechaUsuario.setVisible(false);
        flechaLocalidad.setVisible(false);
        localidadForm.setVisible(false);
        usuarioForm.setVisible(false);
    }

}
