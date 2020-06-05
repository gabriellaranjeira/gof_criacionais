package ex_2_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FerramentaArquivo extends Ferramenta {
	private File arquivoLog;

	public FerramentaArquivo() {
		String pacote = "C:\\Users\\Gabriel\\Aplicativos\\Faculdade\\arqdsis\\gof_comportamental\\2.3\\";
		arquivoLog = new File(pacote, "log.txt");

		try {
			if (!arquivoLog.exists())
				arquivoLog.createNewFile();
		} catch (IOException e) {
			System.out.println("Nao foi possivel criar o arquivo de log:\n" + e);
			System.exit(1);
		}
	}

	public void registrarLog(String mensagem) {
		try {
			FileWriter writer = new FileWriter(arquivoLog, true);
			writer.write(mensagem + "\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("Nao foi possivel escrever no arquivo de log:\n" + e);
			System.exit(1);
		}
	}
}
