package ast;

import interpreters.ExprVisitor;

public class Function implements Expr{
	public enum Funct{
		SIN,COS,LN;
	}
	private Funct funct;
	private Expr arg;
	public Function(Funct funct, Expr arg){
		this.funct=funct;
		this.arg=arg;
	}
	@Override
	public Object accept(ExprVisitor ev) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
