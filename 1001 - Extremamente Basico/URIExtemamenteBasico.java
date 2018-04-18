import java.io.IOException;
import java.util.Scanner;

public class URIExtemamenteBasico {
	public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int A, B, X;

        A = Integer.parseInt(s.next());
        B = Integer.parseInt(s.next());

        X = A + B;

        System.out.printf("X = %d\n", X);
 
    }
}
