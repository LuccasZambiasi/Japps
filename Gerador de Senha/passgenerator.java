import java.util.Random;
import java.util.Scanner;

public class passgenerator {
	// Main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len;

		System.out.println("Digite o tamanho da senha:");
		len = sc.nextInt();
		System.out.println(generatePassword(len));
	}

	// Função para gerar a senha
	public static String generatePassword(int len) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<len;i++) {
			sb.append(str.charAt(random.nextInt(str.length())));
		}
		return sb.toString();
	}

}
