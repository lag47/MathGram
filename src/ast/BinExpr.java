package ast;

public class BinExpr extends Expr {
	public enum Sym {
		PLUS, MINUS, DIV, MULT,EXP;
	}

	Expr left;
	Expr right;
	Sym symbol;
	public BinExpr(Expr left, Sym symbol, Expr right){
		this.left=left;
		this.symbol=symbol;
		this.right=right;
	}

}
