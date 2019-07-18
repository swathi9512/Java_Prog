
public class Informationsdialog 
{
	...............................
	
	
	
	aboutItem.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			Alert helpInfo = new Alert(AlertType.INFORMATION);
			helpInfo.setTitle("ÜberHeizung");
			helpInfo.setHeaderText("null");
			helpInfo.setContentText("Telefon: +49 (0)228 99 9582 6166");
			helpInfo.show(); 
		}
	});
}
