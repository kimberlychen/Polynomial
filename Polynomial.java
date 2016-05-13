import java.util.ArrayList;

public class Polynomial {
	private ArrayList<Monomial> monomials;
	
	public Polynomial (){
		monomials = new ArrayList<Monomial>();
	}

	//METHODS
	
	public void add(Monomial m){
		monomials.add(m);
	}
	
	public void derive(){
		for (int i = 0; i < monomials.size(); i++){
			monomials.get(i).derive();
		}
	}
	
	public void antiderive(){
		for (int i = 0; i < monomials.size(); i++){
			monomials.get(i).antiderive();
		}
	}
	
	public String toString(){
		String str = "";
		for (int i = 0; i < monomials.size(); i++){
			str += monomials.get(i).toString();
			if (i < monomials.size()-1){
				str += " + ";
			}
		}
		
		return str;
	}
	
	
}
