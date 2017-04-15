import javax.swing.*; //has the class JOptionPane


//Programmet visar 3 dialogrutor med olika ramar
//Med variabler

public class pu0002var {
	public static void main (String[] arg) {
		String infoVar = "Information";
		String varningVar = "Varning";
		String felVar = "Fel";
		JOptionPane.showMessageDialog(null, "Det står " + infoVar + " i ramen", infoVar, JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Det står " + varningVar + " i ramen", varningVar, JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Det står " + felVar + " i ramen", felVar, JOptionPane.ERROR_MESSAGE);
	}
}
