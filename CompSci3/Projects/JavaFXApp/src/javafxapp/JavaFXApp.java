package javafxapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Caelan Kimball
 */
public class JavaFXApp extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       launch();
    }
    @Override
    public void start(Stage stage) throws Exception{
        String javaVersion = System.getProperty("java.version");
        String javaFXVersion = System.getProperty("javafx.version");
        Label labl = new Label("Hello Number 7.\n JavaFX " + javaFXVersion + " running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(labl), 480, 240);
        stage.setScene(scene);
        stage.show();
    }
//    
    //@Override
//     public void Launch(){
//        Stage buddy = new Stage();
//        try{
//        start(buddy);
//        }catch(Exception ex){
//            
//        }
//    }
}
