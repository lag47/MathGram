package ast;

public class HeightVisitor implements ExprVisitor{

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
		
		return 1+Math.max((Integer)visit(e.left), (Integer)visit(e.right));
	}

	@Override
	public Object visit(Function e) {
		
		return 1+(Integer)visit(e.arg);
	}

	@Override
	public Object visit(Number e) {	
		return 1;
	}

	@Override
	public Object visit(Variable e) {
		return 1;
	}

}
