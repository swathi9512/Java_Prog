
public class Menu 
{
	...........
	
	MenuBar menuBar = new MenuBar();
	MEnu heatingMenu = new Menu("Heizung");
	MenuItem preferenceItem = new MenuItem ("Einstellungen");
	MenuItem profileItem = new MenuItem("Lade Profildatei");
	MenuItem stateItem = new MenuItem("Information");
	MenuItem exitItem = new MenuItem("Exit");
	heatingMenu.getItems().addAll(preferenceItem, profileItem, stateItem, ex
	Menu help Menu = new Menu("Hilfe");
	MenuItem aboutItem = new MenuItem("Uber Heizung");
	MenuItem helpItem = new MenuItem("Handbuch");
	helpMenu.getItem().addAll(aboutItem, helpItem);
	menuBar.getMenus().addAll(heatingMEnu, helpMenu);
	
	exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
	exitItem.setOnAction(new EventHandler<ActionHandler>() {
		@Override 
		public void handle(ActionEvent event) {
			System.exit(0);}});
	
		VBox vbox = new VBox();
		vbox.getChildren().add(menuBar);
}

}
