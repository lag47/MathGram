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
		HeightVisitor hv=new HeightVisitor();
		int le= (Integer)e.left.accept(hv);
		int re= (Integer)e.right.accept(hv);
		String lString=visit(e.left).toString();
		String rString= visit(e.right).toString();
		if(le>1){
			lString="("+lString+")";
		}
		if(re>1){
			rString="("+rString+")";
		}
		switch(e.symbol){
		case PLUS:
			return lString+"+"+rString;
		case MINUS:
			return lString+"-"+rString;
		case MULT:
			return lString+"*"+rString;
		case DIV:
			return lString+"/"+rString;
		case EXP:
			return lString+"^"+rString;
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
