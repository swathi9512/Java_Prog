
public class Layout_JavaFX_Application 
{
	............
	
	Label label1 = new Label("label1");
	Label label2 = new Label ("label2");
	
	Button button1 = new Button("button1");
	Button button2 = new Button ("button2");
	Button button3 = new Button ("button3");
	
	HBox HBox1 = new HBox();
	HBox HBox2 = new HBox();
	
	VBox VBox1 = new VBox();
	VBox VBox2 = new VBox();
	
	HBox1.getChildren().add(VBox1);
	HBox1.getChildren().add(VBox2);
	
	VBox1.getChildren().add(label1);
	VBox1.getChildren().add(button1);
	
	VBox2.getChildren().add(label2);
	VBox2.getChildren().add(HBox2);
	
	HBox2.getChildren().add(button2);
	HBox2.getChildren().add(button3);
	
	Scene scene = new Scene(HBox1, 250, 50);
	
	........

}


//AUSGABE: Layout2JavaFXApp