/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

 Exemplo de Entrada	
10
10 C
6 R
15 S
5 C
14 R
9 C
6 R
8 S
5 C
14 R

Exemplo de Saída
Total: 92 cobaias
Total de coelhos: 29
Total de ratos: 40
Total de sapos: 23
Percentual de coelhos: 31.52 %
Percentual de ratos: 43.48 %
Percentual de sapos: 25.00 %*/


import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int b;
    char c;
    int d = 0, r = 0, s = 0, qtd, t;

    int a = input.nextInt();

    for (int i = 0; i < a; i++) {

   qtd = input.nextInt();

   c = input.next().charAt(0);

  

   if (c == 'C') {

   d += qtd;

   }else if (c == 'R') {

   r += qtd;

   }else

   s += qtd;

  

  }

  t = s + r + d;

  System.out.println("Total: "+ t +" cobaias");

  System.out.println("Total de coelhos: "+ d);

  System.out.println("Total de ratos: "+ r);

  System.out.println("Total de sapos: "+ s);

  float pc = ((float) d * 100) / (float) t;

  System.out.println(String.format("Percentual de coelhos: %.2f", pc) + " %");

  pc = ((float) r * 100) / t;

  System.out.println(String.format("Percentual de ratos: %.2f", pc) + " %");

  pc = ((float) s * 100) / t;

  System.out.println(String.format("Percentual de sapos: %.2f", pc) + " %");

}

}