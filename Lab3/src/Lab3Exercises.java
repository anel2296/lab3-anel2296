import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame AnelMartinezGomez = new JFrame("Hello, world!");
	 	AnelMartinezGomez.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		AnelMartinezGomez.setLocation(900, 430);
		AnelMartinezGomez.setSize(200, 200);
		AnelMartinezGomez.setVisible(true);
		MyPanelClass myPanel = new MyPanelClass();
        AnelMartinezGomez.getContentPane().add(myPanel);
	}
}