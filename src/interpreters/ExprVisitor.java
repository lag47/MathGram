package interpreters;
import ast.Expr;
public interface ExprVisitor {
	/**Visits an Expr and returns an appropriate object*/
	public Object visit(Expr e);
}
