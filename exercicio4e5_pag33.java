import java.util.Scanner;
public class exercicio4e5_pag33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer horas;
        Float valor;
        System.out.println("digite quantas horas voce trabalhou");
        horas = ler.nextInt();
        valor = horas * 10.25f;
        System.out.println("o salario a ser recebido sera de " + valor);

        if (valor < 50f){
            System.out.println("atenção, dirija-se à direção do hotel");
        }
    }
}
