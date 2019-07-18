
public class Eingabedialog 
{
	............
	
	
	preferenceItem.setOnAction(new EventHandler<ActionEvent> () {
		@Override
		public void handle(ActionEvent event) {
			TextInputDialog dialog = new TextInputDialog(temp.getText());
			dialog.setTitle("Temperatur");
			dialog.setHeaderText("Soll-Temeratur");
			dialog.setContentText("°C");
			Optional<String> result = dialog.showAndWait();
			tmp.setText(resutl.get());
		}
	});
}
