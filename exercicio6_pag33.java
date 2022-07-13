import java.util.Scanner;
public class exercicio6_pag33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Float valor, conversao;
        Integer opcao;
        System.out.println("digite 1 para converter para libras e 2 para quilos");
        opcao = ler.nextInt();
        System.out.println("digite o valor a ser convertido");
        valor = ler.nextFloat();
        if (opcao == 1){
            conversao = valor * 2.205f;
            System.out.println("o valor convertido sera de aproximadamente " + conversao);
        }else
        if (opcao == 2){
            conversao = valor / 2.205f;
            System.out.println("o valor convertido sera de aproximadamente " + conversao);
        }
    }
}