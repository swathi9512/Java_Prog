
public class KompositionJavaFXApp extends Application 
{
	@Override
	public void start(Stage primaryStage)
	{
		Label lbCenterTop = new Label("Top");
		Label lbCenterMid = new Label("Middle");
		Label lbCenterBot = new Label("Bottom");
	
		
		BorderPane root = new BorderPane();
		GridPane pCenter = new GridPane();
		
		root.setLeft(lbWest);
		root.setRight(lbEast);
		root.setTop(lbNorth);
		root.setBottom(lbSouth);
		
		root.setCenter(lbCenterTop);
		root.setCenter(lbCenterMid);
		root.setCenter(lbCenterBot);
		
		root.setCenter(pCenter);
		pCenter.add(lbCenterTop, 0,0);
		pCenter.add(lbCenterMid,0,1);
		pCenter.add(lbCenterBot,0,2);
		
		....
	}

}


//AUSGABE: KompositionJavaFXApp