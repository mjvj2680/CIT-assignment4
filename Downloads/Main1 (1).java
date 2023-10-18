import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group(); // the root is Group or Pane
        Scene scene = new Scene(root, 500, 500, Color.BLUE);
        stage.setTitle("JavaFX Demo");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
// add jar files to project
//    right click project name
//    Open Module settings > Libraries > + > java > select javafx jar files
//    Apply , OK
// add Virtual machine access to controls
//    edit configuration (next to run button)
//    add new run configuration > Application
//    modify option > add VM options
//    VM options:  -p C:\mads\progs\javafx\lib --add-modules javafx.controls
//    (replace directory with your directory for jar files) 
//    Main class: Main
//    Apply , OK
