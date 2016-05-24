package ast;
/**A visitor designed to print an expression*/
public class PrettyPrinter implements ExprVisitor{

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
		switch(e.symbol){//consider adding parentheses
		case PLUS:
			return visit(e.left).toString()+"+("+visit(e.right).toString()+")";
		case MINUS:
			return visit(e.left).toString()+"-("+visit(e.right).toString()+")";
		case MULT:
			return visit(e.left).toString()+"*("+visit(e.right).toString()+")";
		case DIV:
			return visit(e.left).toString()+"/("+visit(e.right).toString()+")";
		case EXP:
			return visit(e.left).toString()+"^("+visit(e.right).toString()+")";
		}
		return null;
	}

	@Override
	public Object visit(Function e) {
		switch(e.funct){
		case COS:
			return "cos("+visit(e.arg).toString()+")";
		case SIN:
			return "sin("+visit(e.arg).toString()+")";
		case LN:
			return "ln("+visit(e.arg).toString()+")";
		}
		return null;
	}

	@Override
	public Object visit(Number e) {
		
		return String.valueOf(e.val);
	}

	@Override
	public Object visit(Variable e) {
		
		return String.valueOf(e.name);
	}

}
