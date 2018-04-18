import java.io.IOException;
import java.util.*;

public class URIFrequenciaNumeros {
	public static void main(String[] args) throws IOException {
    Scanner p = new Scanner(System.in);

    int Qtd = p.nextInt();
    String[] Numeros        = new String[Qtd];

    Map<Integer,Integer> Saida = new HashMap<Integer,Integer>();

    for (int i = 0;i < Qtd;i++){
      Numeros[i] = p.next();

      if(Saida.get(Integer.parseInt(Numeros[i])) == null){
        Saida.put( Integer.parseInt(Numeros[i]), 1 );
      } else {
        Saida.put( Integer.parseInt(Numeros[i]), Saida.get(Integer.parseInt(Numeros[i])) + 1);
      }
    }

    SortedSet<Integer> keys = new TreeSet<Integer>(Saida.keySet());

    for (Integer key : keys) {
      String value = String.valueOf(Saida.get(key));
      System.out.println(key + " aparece " + value + " vez(es)");
    }
  }
}
