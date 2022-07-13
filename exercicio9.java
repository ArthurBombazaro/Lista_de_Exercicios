import java.util.Scanner;
import javax.swing.JOptionPane;
public class exercicio9 {
    public static void main(String[] args){
        float n1,n2,media;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite nota1: ");
        n1 = ler.nextFloat();
        System.out.println("Digite nota2: ");
        n2 = ler.nextFloat();
        media = (n1 + n2) /2;
        JOptionPane.showMessageDialog(null,"média: " + media);


    }    
}
