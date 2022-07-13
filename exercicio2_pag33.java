public class exercicio2_pag33 {
    public static void main(String[] args) {
        System.out.println("Esses são os números primos entre 1 e 123: ");
        for (int i=2; i<=123; i++){
            if (ehprimo(i))
            System.out.println(i);
            } 
        }   

    private static Boolean ehprimo(int numero){
        for (int j = 2; j < numero; j++){
        if (numero % j == 0)
        return false;
    }
        return true;        
    }
       
} 
