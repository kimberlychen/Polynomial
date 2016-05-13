
public class Driver {
	
	public static void main (String [] Arg){
		Monomial m = new Monomial (3, 2);
		Monomial x = new Monomial (4, 1);
		Polynomial p = new Polynomial();
		p.add(m);
		p.add(x);
		
		System.out.println(p);
	}

}
