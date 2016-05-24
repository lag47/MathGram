package ast;

import java.util.LinkedList;

public class VarFinder implements ExprVisitor{
	LinkedList<Character> vars= new LinkedList<Character>();
	@Override
	public Object visit(Expr e) {
		if(e instanceof Number){
			return visit((Number)e);
		}
		if(e instanceof BinExpr){
			return visit((BinExpr)e);
		}
		if(e instanceof Function){
			return visit((Function)e);
		}
		if(e instanceof Variable){
			return visit((Variable)e);
		}
		return null;
	}

	@Override
	public Object visit(BinExpr e) {
		visit(e.left);
		visit(e.right);
		return vars;
	}

	@Override
	public Object visit(Function e) {
		return visit(e.arg);
	}

	@Override
	public Object visit(Number e) {
		return vars;
	}

	@Override
	public Object visit(Variable e) {
		vars.add(e.name);
		return vars;
	}

}
