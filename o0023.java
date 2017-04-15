import javax.swing.*;

public class o0023 {
	public static void main (String[] arg) {
		String namn, result;
		namn = JOptionPane.showInputDialog("Vad heter du?");
		result = "Hej, " + namn;
		JOptionPane.showMessageDialog(null, result);
	}
}
