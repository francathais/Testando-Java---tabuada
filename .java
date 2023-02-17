import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Cria um objeto Scanner para ler a entrada do usuário
    Scanner input = new Scanner(System.in);
    
    // Solicita um número para o usuário
    System.out.print("Digite um número para gerar a tabuada: ");
    int numero = input.nextInt();
    
    // Imprime a tabuada do número
    for (int i = 1; i <= 10; i++) {
      int resultado = numero * i;
      System.out.println(numero + " x " + i + " = " + resultado);
    }
  }
}
