package ast;
import interpreters.*;
public interface Expr {
	
	public Object accept(ExprVisitor ev);
	
}
