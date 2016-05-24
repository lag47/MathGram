package interpreters;

import ast.BinExpr;
import ast.Expr;
import ast.Function;
import ast.Number;
import ast.Variable;

/**A visitor for the Expr interface that assigns values to all of the variable
 * in the expression and computes a value*/
public class Interpreter implements ExprVisitor {
	private char[] vars;
	private double[] vals;

	public Interpreter (char [] vars, double [] vals){
		this.vars=vars;
		this.vals=vals;
		assert invariant();
	}

	private boolean invariant() {
		return vars != null 
				&& vals != null 
				&& vars.length == vals.length 
				&& vars.length != 0;
	}

	@Override
	public Object visit(BinExpr e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Function e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Number e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Variable e) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
