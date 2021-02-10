
public class OperacaoBooleanos {
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		if(a) {
			System.out.println("a eh " + a);
			System.out.println("     " + a);
		}
		
		if(b) {
			System.out.println("b eh " + b);
		}
		
		if (a || b) {
			System.out.println("a ou b eh " + (a || b));
		}
		
		if (a && b) {
			System.out.println("a e b eh " + (a && b));
		}
		
	}

}
