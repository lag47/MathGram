package interpreters;
import ast.*;
import ast.Number;
public interface ExprVisitor {
	/**Visits an Expr and returns an appropriate object*/
	public Object visit(BinExpr e);
	public Object visit(Function e);
	public Object visit(Number e);
	public Object visit(Variable e);
}
