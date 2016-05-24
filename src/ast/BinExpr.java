package ast;

import interpreters.ExprVisitor;

public class BinExpr implements Expr{
	public enum sym{
		PLUS,MINUS,DIV,MULT;
	}
	private Expr left;
	private Expr right;
	private sym symbol;
	
	
	@Override
	public Object accept(ExprVisitor ev) {
		// TODO Auto-generated method stub
		return null;
	}

}
