import java.io.IOException;
import java.util.*;

public class URIAlarmeDespertador {
	public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    String tempo = leitor.nextLine();
    while(!tempo.equals("0 0 0 0")) {
      String[] valores = tempo.split(" ");

      int hora = 0;
      if(Integer.parseInt(valores[0]) != Integer.parseInt(valores[2])) {
        hora = Integer.parseInt(valores[0]) - Integer.parseInt(valores[2]);
        if(hora > 0) {
          hora = 24 - hora;
        }
      } else {
        if(Integer.parseInt(valores[1]) > Integer.parseInt(valores[3])) {
          hora = 24;
        }
      }

      if(hora < 0) {
        hora = hora * -1;
      }
      int minuto = Integer.parseInt(valores[1]) - Integer.parseInt(valores[3]);
      if(Integer.parseInt(valores[1]) > Integer.parseInt(valores[3])){
        if(minuto < 0){
          minuto = minuto * -1;
        }
      }
      System.out.println(hora * 60 - minuto);
      tempo = leitor.nextLine();
    }
  }
}
