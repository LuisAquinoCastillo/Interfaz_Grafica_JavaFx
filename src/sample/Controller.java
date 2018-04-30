package sample;

import javafx.application.Platform;
import javafx.scene.input.MouseEvent;

public class Controller {

    //Metodo para controlar el cierre de la aplicación y corte procesos
    public void exitAplicacionBoton(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }

    /*Metodo para controlar la aparicion de los paneles correspondientes
    * 1.- Usuario
    * 2.- Localidad
    * 3.- Educación */
//  ( 1 )
    public void usuarioAplicacionBoton(MouseEvent event){

    }
//  ( 2 )
    public void localidadAplicacionBoton(MouseEvent event){

    }
//  ( 3 )
    public void educacionAplicacionBoton(MouseEvent event){

    }

}
