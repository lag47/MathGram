package interpreters;

import ast.Expr;

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
	public Object visit(Expr e) {

		return null;
	}

}
