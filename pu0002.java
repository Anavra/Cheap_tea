import javax.swing.*; //has the class JOptionPane


//Programmet visar 3 dialogrutor med olika ramar

public class pu0002 {
	public static void main (String[] arg) {
		JOptionPane.showMessageDialog(null, "Det står Information i ramen", "Information", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Det står Varning i ramen", "Varning", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Det står Fel i ramen", "Fel", JOptionPane.ERROR_MESSAGE);
	}
}
