
public class Monomial {
	private int power;
	private double coefficient;
	private String variable = "x";
	
	public Monomial (double co, int pow){
		if (pow < 0  || co == 0){
			throw new IllegalArgumentException();
		}
		
		power = pow;
		coefficient = co;
		
	}
	
	public Monomial (){
		this(1, 1);
	}
	
	//METHODS
	
	public int getPower(){
		return power;
	}
	
	public double getCoefficient(){
		return coefficient;
	}
	
	public void add (Monomial m){
		if (power != m.getPower()){
			throw new IllegalArgumentException();
		}
		
		coefficient += m.getCoefficient();
	}
	
	public void subract (Monomial m){
		if (power != m.getCoefficient()){
			throw new IllegalArgumentException();
		}
		
		coefficient-= m.getCoefficient();
	}
	
	public void derive (){
		coefficient = coefficient * power;
		power--;
		if(power == 0){
			variable = null;
		}
	}
	
	public void antiderive(){
		if (power == 0){
			variable = "x";
		}
		power++;
		coefficient = coefficient / power;
	}
	
	public boolean isNegative(){
		return (coefficient < 0);
	}
	
	public String toString(){
		if (variable == null){
			return "" + coefficient;
		}
		return coefficient + variable + "^" + power;
	}
	
	
}
