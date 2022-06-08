import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer h, b, B, area;
        System.out.println("digite a altura do trapezio: ");
        h = ler.nextInt();
        System.out.println("digite a base menor do trapezio: ");
        b = ler.nextInt();
        System.out.println("digite a base maior do trapezio: ");
        B = ler.nextInt();
        area = (h * (b + B)) / 2;
        System.out.println("a area do trapezio é: " + area);
    }
}