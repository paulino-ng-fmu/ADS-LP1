package aula20160314;

import java.util.Scanner;
import aula20160314.Bin;

public class Operador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("primeiro inteiro = ");
		i = sc.nextInt();
		System.out.print("segundo inteiro = ");
		j = sc.nextInt();
		char sel;
		while (true) {
			String mes = "Selecione uma das op��es abaixo:" + "\n";
			mes += "+ : adi��o" + "\n";
			mes += "- : subtra��o" + "\n";
			mes += "* : multiplica��o" + "\n";
			mes += "/ : divis�o" + "\n";
			mes += "% : resto da divis�o" + "\n";
			mes += "= : iqualdade\n";
			mes += "! : desiqualdade\n";
			mes += "> : maior\n";
			mes += "< : menor\n";
			mes += "l : deslocamento para esquerda" + "\n";
			mes += "r : deslocamento l�gico para a direita" + "\n";
			mes += "a : deslocamento aritm�tico para a direita" + "\n";
			mes += "e : E bit-a-bit" + "\n";
			mes += "o : OU bit-a-bit" + "\n";
			mes += "x : XOU bit-a-bit" + "\n";
			mes += "q nada" + "\n" + "? = ";
			System.out.print(mes);
			sel = sc.next().trim().charAt(0);
			switch (sel) {
			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
			case '=':
			case '!':
			case '>':
			case '<':
			case 'r':
				System.out.println("deslocamento para a direita de: " +
						Bin.convBin(i) + " => " + Bin.convBin(i >> 1));
				break;
			case 'l':
			case 'a':
			case 'e':
			case 'o':
			case 'x':
			case 'q':
				return;
			default:
				System.out.println("Op��o n�o implementada");
				return;
				
			}
		}
		// escreva aqui o codigo para testar os operadores l�gicos
	}

}
