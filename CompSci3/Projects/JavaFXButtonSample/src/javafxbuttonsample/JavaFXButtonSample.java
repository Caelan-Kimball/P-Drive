package javafxbuttonsample;


import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.*;
import static javafx.application.Application.*;
import javafx.scene.text.*;
import javafx.stage.*;
import static java.lang.System.*;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Caelan Kimball
 */


public class JavaFXButtonSample extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    public void start(Stage primaryStage){
        Button btn = new Button();
        Text txt = new Text(100, 0, "");
        //label lbl
        
        btn.setText("Say Hello World!");
        btn.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
            out.println("Hello World!");
            txt.setText("Hello World!");
        }
        });
        
        BorderPane rootPane = new BorderPane();
        
        rootPane.setPadding(new Insets(20, 0, 20, 20));
        rootPane.setBottom(btn);
        rootPane.setCenter(txt);
        
        Scene scene = new Scene(rootPane, 300, 250);
        
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
