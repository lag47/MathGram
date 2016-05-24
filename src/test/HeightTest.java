package test;

import static org.junit.Assert.*;

import org.junit.Test;
import ast.*;
import ast.BinExpr.Sym;
import ast.Number;
public class HeightTest {
	HeightVisitor hv= new HeightVisitor();
	@Test
	public void test() {
		Number n= new Number(5.0);
		int h=((Integer)n.accept(hv)).intValue();
		assertTrue(h==1);
	}
	@Test
	public void test1() {
		Number n= new Number(5.0);
		Variable v= new Variable('v');
		int h=((Integer)v.accept(hv)).intValue();
		assertTrue(h==1);
	}
	@Test
	public void test2() {
		Number n= new Number(5.0);
		Variable v= new Variable('v');
		BinExpr be= new BinExpr(n,Sym.PLUS,v);
		int h=((Integer)be.accept(hv)).intValue();
		assertTrue(h==2);
	}
	
	@Test
	public void test3() {
		Number n= new Number(5.0);
		Number m= new Number(5.0);
		Variable v= new Variable('v');
		BinExpr be= new BinExpr(n,Sym.PLUS,v);
		BinExpr bet= new BinExpr(m,Sym.PLUS,be);
		int h=((Integer)bet.accept(hv)).intValue();
		assertTrue(h==3);
	}

}
