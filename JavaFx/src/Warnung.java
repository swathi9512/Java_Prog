
public class Warnung
{
	...............
	
	
	stateItem.setOnAction (new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Warnung");
			alert.setHEaderText("Vorsicht beim Baden!");
			alert.setContentText("Die Wassertemperatur ist niedrig");
			alert.showAndWait();
		}
	});

}
