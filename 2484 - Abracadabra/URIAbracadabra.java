import java.io.IOException;
import java.util.*;

public class URIAbracadabra {
	public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    String palavra;
    do {
      palavra = leitor.next();
      int tamanhoPalavra = palavra.length();
      String espacos = "";
      for(int i = 0; i < palavra.length(); i++) {
        if(i > 0) {
          espacos += " ";
          System.out.print(espacos);
        }
        for(int j = 0; j < tamanhoPalavra; j++) {
          if(j != (tamanhoPalavra - 1)) {
            if(j > 0) {
              System.out.print(" " + palavra.charAt(j));
            } else {
              System.out.print("" + palavra.charAt(j));
            }
          } else {
            if(j > 0) {
              System.out.print(" " + palavra.charAt(j));
            } else {
              System.out.print("" + palavra.charAt(j));
            }
          }
        }
        tamanhoPalavra--;
        System.out.println();
      }
      System.out.println();
    } while(leitor.hasNextLine());
  }
}
