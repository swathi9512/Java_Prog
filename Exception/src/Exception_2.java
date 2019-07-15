import javax.swing.JOptionPane;

public class Exception_2 
{
	public static void main (String[] args) 
	{
		String input = JOptionPane.showInputDialog(null, "Wie alt bist du?");
		try {
			int alter = Integer.parseInt(input);
			JOptionPane.showMessageDialog(null, " Du bist " + alter + "Jahre alt");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Du Schlingel hast keine Zahl eigegeben!");
		}finally {
			JOptionPane.showMessageDialog(null, "Das Programm ist nicht abgestürtzt");
		}
	}
}
