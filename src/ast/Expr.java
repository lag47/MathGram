package ast;

public abstract class Expr {
	
	public Object accept(ExprVisitor ev){
		return ev.visit(this);
	}
	
}
