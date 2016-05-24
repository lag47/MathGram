package ast;
public class Function extends Expr{
	public enum Funct{
		SIN,COS,LN;
	}
	private Funct funct;
	private Expr arg;
	public Function(Funct funct, Expr arg){
		this.funct=funct;
		this.arg=arg;
	}

	
}
