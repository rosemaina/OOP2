import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Movies extends Application {
   
    @Override
    public void start(Stage stage) {
         Text textA=new Text("Genres");
         Text textB = new Text("Name");
         Text textC = new Text("Registerd");
       
         ComboBox comboBoxA=new ComboBox();
         ComboBox comboBoxB=new ComboBox();
         
        TextField textfieldA = new TextField();
       
        Button buttonA= new Button("Save Movie");
        Button buttonB = new Button("Remove");
       
     
        GridPane gridPaneA = new GridPane();
       
        gridPaneA.setMinSize(600,400);
       
        gridPaneA.setPadding(new Insets(15,15,15,15));
       
        gridPaneA.setVgap(10);
        gridPaneA.setHgap(10);
       
        gridPaneA.setAlignment(Pos.CENTER);
       
        gridPaneA.add(textA,0,0);
          gridPaneA.add(comboBoxA,1,0);
         
     
       
        gridPaneA.add(textB,0,2);
        gridPaneA.add(textfieldA,1,2);
        gridPaneA.add(buttonA,1,3);
       
        gridPaneA.add(textC,0,4);//column row
          gridPaneA.add(comboBoxB,1,4);;
        gridPaneA.add(buttonB,1,5);
       
       buttonA.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 12 30 12 30; -fx-text-fill: white; -fx-font-size: 12px;");
        buttonB.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 12 30 12 30; -fx-text-fill: white; -fx-font-size: 12px;");
       
        textA.setStyle(" -fx-font: normal bold 20px 'serif'");
        textB.setStyle(" -fx-font: normal bold 20px 'serif'");
        textC.setStyle(" -fx-font: normal bold 20px 'serif'");
      gridPaneA.setStyle("-fx-border-color: #000000;\n" +
                "    -fx-border-width: 2px;\n" +
                "    -fx-border-radius: 5px;\n" +
                "    -fx-border-insets: 5px;\n" +
                "    -fx-padding: 10px;\n" +
                "    -fx-spacing: 5px;\n" +
                "    -fx-background-image: url(image1.jpg);\n" +
                "    -fx-background-insets: 5px;");
        Scene sceneA = new Scene(gridPaneA);
       
        stage.setTitle("Movies");
       
        stage.setScene(sceneA);
       
        stage.show();
       
    }

    /**
     * @param args the command line arguments
     */
    public void animation() {
        launch();
    }
   
}