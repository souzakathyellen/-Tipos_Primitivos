import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");

        String nome = teclado.next();

        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.printf("A nota de %s é: %f", nome, nota);
    }
}
