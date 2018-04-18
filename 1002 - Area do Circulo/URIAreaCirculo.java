import java.io.IOException;
import java.util.*;

public class URIAreaCirculo {
	public static void main(String[] args) throws IOException {
	    Scanner leitor = new Scanner(System.in);
	    
	    double raio = leitor.nextDouble();
	    double area = (raio * raio) * 3.14159;
	    
	    System.out.printf("A=%.4f\n",area);
	}
}
