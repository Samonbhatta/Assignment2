

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;

public class length extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridPane=new GridPane();
        gridPane.setPadding( new Insets( 10,10,10,10 ) );
        gridPane.setVgap( 30 );
        gridPane.setHgap( 30 );

        Label velocitylabel = new Label("Velocity"  );
        GridPane.setConstraints( velocitylabel,0,0 );
        gridPane.getChildren().addAll( velocitylabel );

        TextField velocity = new TextField(  );
        velocity.setPrefColumnCount( 5 );
        velocity.setPromptText( "v=??" );
        GridPane.setConstraints( velocity,1,0 );
        gridPane.getChildren().addAll( velocity );

        Label accnlabel = new Label("Acceleration"  );
        GridPane.setConstraints( accnlabel,0,1 );
        gridPane.getChildren().addAll( accnlabel );

        TextField acceleration = new TextField(  );
        velocity.setPrefColumnCount( 5 );
        velocity.setPromptText( "a=??" );
        GridPane.setConstraints(acceleration,1,1 );
        gridPane.getChildren().addAll( acceleration );

        Button button = new Button("Calcuate Length" );
        GridPane.setConstraints( button,2,1 );

        gridPane.getChildren().addAll( button );
        button.setOnAction( e->{
            double v=Double.parseDouble( velocity.getText() );
            double a= Double.parseDouble(acceleration.getText());
            double length= (v*v)/(2*a);
            JOptionPane.showMessageDialog( null,"The minimum length for the runway is " + length + "meter" );

        } );





        primaryStage.setScene(new Scene(gridPane, 600, 275));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
