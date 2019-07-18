
public class Mouse_Click 
{
	............
	
	Button button = new Button ("button");
	
	HBox hbox = new HBox();
	hbox.getChildren().add(button);
	
	button.setOnMousePressed(new EventHanler<MouseEvent>()
	{
		public void handle(MouseEvent event) {
			System.out.println("Mouse pressed");
		}
	} );
	
	Scene scene = new Scene(hbox, 250, 50);
	
	.........
}


-----------------------------------------------------------

@Override
public void start(Stage primaryStage)
{
	Label label = new Label("Label");
	Button button = new Button("button");
	
	VBox vbox = new VBox();
	vbox.getChildren().add(label);
	vbox.getChildren().add(button);
	
	button.setOnMousePressed(new EventHandler<MouseEvent>() {
		public void handle(MouseEvent event) {
			label.setText("Mouse pressed");
		}
	});
	
	Scene scene = new Scene(vbox, 250, 50);
	
	......
}




