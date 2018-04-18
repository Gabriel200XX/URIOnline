import java.io.IOException;
import java.util.*;

public class URIBlobs {
	public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);

    int quantidade = leitor.nextInt();

    for(int i = 0; i < quantidade; i++) {
      double numero = leitor.nextDouble();
      int qtde = 0;

      while(numero > 1.0) {
        numero /= 2.0;
        qtde++;
      }
      System.out.println(qtde + " dias");
    }
  }
}
