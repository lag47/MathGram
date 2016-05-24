package ast;

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
		double l=(Double)visit(e.left);
		double r=(Double)visit(e.right);
		switch (e.symbol){
		case PLUS:
			break;
		}
		return null;
	}

	@Override
	/**Evaluates a Function and returns its result as a Double*/
	public Object visit(Function e) {
		double result=0;
		switch (e.funct) {
		case COS:
			Math.cos((Double)visit(e.arg));
			break;
		case SIN:
			Math.sin((Double)visit(e.arg));
			break;
			
		case LN:
			Math.log((Double)visit(e.arg));
			break;
		}
		return result;
	}

	@Override
	public Object visit(Number e) {
		return e.val;
	}

	@Override
	public Object visit(Variable e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Expr e) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
