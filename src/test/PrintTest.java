package test;

import static org.junit.Assert.*;

import org.junit.Test;
import ast.*;
import ast.BinExpr.Sym;
import ast.Function.Funct;
import ast.Number;
public class PrintTest {

	@Test
	public void test1() {
		Number e= new Number(5.0);
		Object o=e.accept(new PrettyPrinter());
		assertTrue(o.toString().equals("5.0"));
	}
	
	@Test
	public void test2(){
		Variable x=new Variable('x');
		Object o=x.accept(new PrettyPrinter());
		assertTrue(o.toString().equals("x"));
	}
	@Test
	public void test3(){
		Variable x=new Variable('x');
		Number e= new Number(5.0);
		BinExpr be= new BinExpr(e,Sym.MULT,x);
		System.out.println(be.accept(new PrettyPrinter()));
	}
	
	@Test
	public void test4(){
		Function f=new Function(Funct.COS,new Variable('x'));
		System.out.println(f.accept(new PrettyPrinter()));
	}

}
