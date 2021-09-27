package primeiroprograma;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        System.out.println("Olá, Mundo");
        Date data = new Date();
        System.out.print("A hora Atual do Sistema é: ");
        System.out.println(data.toString());
        Locale loc = Locale.getDefault();
        System.out.print("O Idioma do Sistema é: ");
        System.out.println(loc.getDisplayLanguage());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A Resolção do Sistema é: "+d.width+" X "+d.height);
    }  
}
