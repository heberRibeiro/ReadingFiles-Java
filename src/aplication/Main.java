package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		// System.out.println("Caminho do arquivo para leitura: ");
		// String path = sc.next();
		String path = "..\\readingFiles-java\\ArquivoLeitura.txt";

		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String conteudo = br.readLine();

			while (conteudo != null) {
				System.out.println(conteudo);
				conteudo = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} 
		//sc.close();
	}

}
