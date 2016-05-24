package ast;

import interpreters.ExprVisitor;

public class Number implements Expr{
	private double val;
	public Number(double val){
		this.val=val;
	}
	@Override
	public Object accept(ExprVisitor ev) {
		
		return Double.valueOf(val);//this isn't right
	}

}
