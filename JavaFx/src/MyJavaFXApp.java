
...

public class MyJavaFXApp extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		Label aLabel = new Label("HelloWorld");
	//	Label xLabel = new Label ("XXXXX"); // Überdeckt XXXX das HelloWorld---hässlich
		
		Pane root = new Pane();
		root.getChildren().add(aLabel);
		
		Scene scene = new Scene (root, 250, 50);
		
		primaryStage.setTitle (":MyJavaFXApp!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}

//AUSGABE : siehe JavaFXApp
// Positionieren des Wortes: HelloWorld in der Mitte 