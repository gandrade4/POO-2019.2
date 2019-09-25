import java.util.ArrayList;

public class Questao_03 {
    public static void main(String[] args) {
        //3. Imprima todos os múltiplos de 3, entre 1 e 100.
        int n = 0;
        while (n < 100){
            int resto = n % 3;
            if (resto == 0){
                System.out.println(n);
            }
            n = n + 1;
        }
    }
}
