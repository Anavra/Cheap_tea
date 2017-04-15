import javax.swing.*; //has the class JOptionPane
import java.util.*; //has the class Calendar

//Programmet visar en dialogruta med två rader. På andra raden visas datum och tid.

public class pu0001 {
	public static void main (String[] arg) {
		JOptionPane.showMessageDialog(null, "Datum och tid \n" + Calendar.getInstance().getTime().toString());
	}
}
