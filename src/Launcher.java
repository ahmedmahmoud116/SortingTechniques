import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        initialize(primaryStage);
    }
    private void initialize(Stage primaryStage)
    {
        Tester.test(primaryStage,10,1280,720);
    }
    public static void main(String[] args)
    {
    	Application.launch();
    }

}