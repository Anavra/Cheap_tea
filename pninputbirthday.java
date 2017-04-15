import javax.swing.*;

public class pninputbirthday {
	public static void main (String[] arg) {
		String namn, pn, a, b; 
		namn = JOptionPane.showInputDialog("Vad heter du?");
		pn = JOptionPane.showInputDialog("Vad är ditt pn? XXXXX-XXXX");
		a = pn.substring(0, 6);		 //a får den första 6 nummer
		b = "Hej, " + namn + "\nDin födeseldag är: " + 
			a.substring(4, 6) + "/" + a.substring(2, 4);
		JOptionPane.showMessageDialog(null, b);		
	}
}
