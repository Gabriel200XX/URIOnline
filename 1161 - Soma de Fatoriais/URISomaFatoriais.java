import java.io.IOException;
import java.util.*;

public class URISomaFatoriais {
	public static void main(String[] args) throws IOException {
    Scanner p = new Scanner(System.in);

    do {
      String linha = p.nextLine();
      String[] valores = linha.split(" ");

      long ResultA = Fatorial(Integer.parseInt(valores[0]));
      long ResultB = Fatorial(Integer.parseInt(valores[1]));

      if((ResultA + ResultB) < 0) {
        System.out.println((ResultA + ResultB) * -1);
      } else {
        System.out.println(ResultA + ResultB);
      }
    } while (p.hasNextLine());
  }

  public static long Fatorial(int a){
    long Result = 1;

    for (int i = a;i > 0;i--){
      Result *= i;
    }

    return Result;
  }
}
