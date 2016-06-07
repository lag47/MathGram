package ast;

import ast.BinExpr.Sym;

public class Differentiator implements ExprVisitor {
	private Variable x;

	public Differentiator(Variable x) {
		this.x = x;
	}

	@Override
	public Object visit(Expr e) {
		if (e instanceof Number) {
			return visit((Number) e);
		}
		if (e instanceof BinExpr) {
			return visit((BinExpr) e);
		}
		if (e instanceof Function) {
			return visit((Function) e);
		}
		if (e instanceof Variable) {
			return visit((Variable) e);
		}
		return null;
	}

	@Override
	public Object visit(BinExpr e) {
		Expr l=(Expr)visit(e.left);
		Expr r=(Expr)visit(e.right);
		switch (e.symbol){
		case PLUS:
			return new BinExpr(l,Sym.PLUS,r);
		case MINUS:
			return  new BinExpr(l,Sym.MINUS,r);
		case DIV:
			return null;
		case MULT:
			return null;
		case EXP:
			return null;
		
		}
		return null;
	}

	@Override
	public Object visit(Function e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(Number e) {
		return 0;
	}

	@Override
	public Object visit(Variable e) {
		if(e.name==x.name){
			return 1;
		}
		return 0;
	}

}
