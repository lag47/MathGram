package ast;

import interpreters.ExprVisitor;

public class BinExpr implements Expr {
	public enum Sym {
		PLUS, MINUS, DIV, MULT;
	}

	private Expr left;
	private Expr right;
	private Sym symbol;
	public BinExpr(Expr left, Sym symbol, Expr right){
		this.left=left;
		this.symbol=symbol;
		this.right=right;
	}
	@Override
	public Object accept(ExprVisitor ev) {
		// TODO Auto-generated method stub
		return null;
	}

}
