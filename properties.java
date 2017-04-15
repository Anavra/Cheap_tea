import javax.swing.*;

public class properties {
	public static void main (String[] arg) {
		JOptionPane.showMessageDialog(null, "Du kör " +
				System.getProperty("os.name") + " idag och Gobito tycker att du är det bästa som finns.", "Gobi", JOptionPane.INFORMATION_MESSAGE);
	}
}
