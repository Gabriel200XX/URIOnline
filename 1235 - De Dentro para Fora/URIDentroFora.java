import java.io.IOException;
import java.util.*;

public class URIDentroFora {
	public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);

    int quantidade = leitor.nextInt();

    leitor.nextLine();

    for(int i = 0; i < quantidade; i++) {
      String frase = leitor.nextLine();
      String[] split = new String[2];
      split[0] = frase.substring(0, (frase.length() / 2));
      split[1] = frase.substring((frase.length() / 2), frase.length());
      System.out.print(new StringBuilder(split[0]).reverse().toString());
      System.out.println(new StringBuilder(split[1]).reverse().toString());
    }
  }
}
