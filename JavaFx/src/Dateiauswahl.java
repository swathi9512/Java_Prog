
public class Dateiauswahl 
{
	.............................
	
	profileItem.setOnAction(new EventHAndler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			FileChooser fileChooser = new FileCHooser();
			fileChooser.setInitialDirectory(new File("./heatingprofile"));
			fileChooser.setTitle("�ffne Heizprofil");
			File selectedFile = fileChooser.showOpenDialog(primaryStage);
			if(selectedFile != null)
			{
				temp.setText(selectedFile.getName());
			}});

	}
}
