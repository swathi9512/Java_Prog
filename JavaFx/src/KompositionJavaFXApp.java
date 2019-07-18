
public class KompositionJavaFXApp extends Application 
{
	@Override
	public void start(Stage primaryStage)
	{
		Label lbEast = new Label("East");
		Label lbEast = new Label("South");
		Label lbEast = new Label("West");
		Label lbEast = new Label("North");
		Label lbEast = new Label("Center");
		
		BorderPane root = new BorderPane();
		
		root.setLeft(lbWest);
		root.setRight(lbRight);
		root.setTop(lbTop);
		root.setBottom(lbSouth);
		root.setCenter(lbCenter);
		
		Scene scene = new Scene (root, 250, 50);
		
		//// 1. STAGE
		// Damit setzen wir den Titel unseres Fensters
		primaryStage.setTitle (":KompositionJavaFXApp!");
		
		// nun Setzen wir die Scene zu unserem Stage und zeigen ihn an
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}


//AUSGABE: KompositionJavaFXApp