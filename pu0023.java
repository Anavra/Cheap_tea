import javax.swing.*;

public class pu0023 {
	public static void main (String[] arg) {
		String a = JOptionPane.showInputDialog("Skriv en mening med minst två ord.");
		int tecken = a.length();
		int i = a.indexOf(' '); 		// i är slutet av det första ordet.
		int j = a.lastIndexOf(' ') + 1;		// j är början av det sista ordet.
		String text = "Du skrev en text med " + tecken + " tecken." +
			"\nDet första ordet var \"" + a.substring(0, i) + "\"" + 
			"\nDet sista ordet var \"" + a.substring(j, tecken) + "\"";
		JOptionPane.showMessageDialog(null, text);
	}
}
