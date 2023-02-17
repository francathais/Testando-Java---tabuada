# fazendo-tabuadas

Primeiro, importamos a classe Scanner da biblioteca java.util. Esta classe é usada para receber entradas do usuário pelo teclado.
import java.util.Scanner;

Em seguida, declaramos a classe Main que conterá nosso método principal.
public class Main {

Dentro da classe Main, declaramos o método main que será o ponto de partida para a execução do programa.
public static void main(String[] args) {

Criamos um objeto da classe Scanner para receber a entrada do usuário.
Scanner input = new Scanner(System.in);

Pedimos ao usuário para inserir um número.
System.out.print("Digite um número: ");
int numero = input.nextInt();

Em seguida, usamos um loop for para imprimir a tabuada desse número. A variável i começa com 1 e é incrementada em 1 a cada iteração do loop, até que i seja igual a 10.
for (int i = 1; i <= 10; i++) {

Dentro do loop for, multiplicamos o número inserido pelo usuário pelo valor de i e armazenamos o resultado na variável produto.
int produto = numero * i;

Em seguida, imprimimos o resultado da multiplicação na tela, usando System.out.println().
System.out.println(numero + " x " + i + " = " + produto);

Fechamos o loop for e fechamos o objeto da classe Scanner.
}
input.close();

Fechamos o método main e fechamos a classe Main.
}
}


