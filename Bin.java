/**
 * 
 */
package aula20160314;

import java.util.Scanner;

/**
 * Este programa lê um número inteiro e imprime seu valor em binário.
 * @author 012239
 *
 */
public class Bin {

	/**
	 * @param args - unused
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("inteiro = ");
		int i = sc.nextInt();
		System.out.println("i = " + i + " = " + convBin(i));
		System.out.println("usando Integer.toBinaryString(i): i = " + Integer.toBinaryString(i));
	}
	/**
	 * Fornece um String com a configuração binária do argumento inteiro
	 * @param i valor a ser convertido para inteiro
	 * @return String com o binário do inteiro
	 */
	public static String convBin(int i) {
		if (i == 0) return "0";
		String res = "";
		while (i != 0) {
			res = (((i % 2) == 0) ? "0" : "1") + res;
			i /= 2;
		}
		return res;
	}

}
