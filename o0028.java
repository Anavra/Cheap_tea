import javax.swing.*;

/* Deklarera 2 String-variabel a och b och tilldela texten "Programspråk" till a. 
 * Genom att plocka ut delar av texten i a, tilldela b texten "ramsa".*/

public class o0028 {
	public static void main (String[] arg) { 
		String a = "Programspråk";
		String b = a.substring(4, 8) + a.charAt(5);
		JOptionPane.showMessageDialog(null, b);
	}
} 
