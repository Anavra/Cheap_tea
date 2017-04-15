import javax.swing.*;

public class personm {
	public static void main (String[] arg) {
		String a = " Vanessa Rojas 861113-1528 ", b, c;
		a = a.trim(); // ta bort inledande och avslutande blanka tecken
		int i = a.lastIndexOf(' ') + 1;  //i får värdet 14
		int j = a.lastIndexOf('-');	 //j får värdet 20
		b = a.substring(i, j);		 //b får värdet 861113
		c = "Din födeseldag: " + b.substring(4, 6) + "/" + b.substring(2, 4);
		JOptionPane.showMessageDialog(null, c);		
	}
}
