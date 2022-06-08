import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double h, b, B, area;
        System.out.println("digite a altura do trapezio: ");
        h = ler.nextFloat();
        System.out.println("digite a base menor do trapezio: ");
        b = ler.nextFloat();
        System.out.println("digite a base maior do trapezio: ");
        B = ler.nextFloat();
        area = (h * (b + B)) / 2.0f;
        System.out.println("a area do trapezio é: " + area);
        System.out.println("a area arredondada é: " + Math.round(area));
    }
}
