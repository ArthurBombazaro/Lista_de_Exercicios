public class exercicio1_pag33{
    public static void main(String[] args) {
        Integer i;
        Integer soma=0;
        long par=1;
        for(i = 0; i <= 30; i++){
            if (i % 2 == 1){
                soma += i;
            }else{
                if (i > 0)
                par *= i;
            }
        }
        System.out.println("soma dos numeros impares: " + soma);
        System.out.println("multiplicacao dos numeros pares: " + par);
    }
}