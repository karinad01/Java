package BasicsPage;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TextInADIalogWIndow {
    public static void main(String[] args) {
        String str, txt;

        txt = showInputDialog("Write your text:");
        int size = txt.length();
        char A = txt.charAt(0);
        char B = txt.charAt(size - 1);

        str = "Text: " + txt + "\n";
        str += "Symbols in the text: " + size + "\n";
        str += "First symbol: " + A + "\n";
        str += "Last symbol:" + B;

        showMessageDialog(null, str);
    }
}
