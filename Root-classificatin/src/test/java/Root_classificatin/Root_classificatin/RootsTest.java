package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;
	
	//a

	@Test
	public void testPartion1() 
	{
		//(0,1,2)
		Roots.calculate_roots(-2, 1, 2);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void a_min() {
		Roots.calculate_roots(0,50,45);
		
		String  root_expected = Root_Types.Not_quadratic.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void a_min_plus_1() {
		Roots.calculate_roots(1,51,46);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void a_nominal() {
		Roots.calculate_roots(50,52,47);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void a_max_munis_1() {
		Roots.calculate_roots(99,53,48);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void a_max() {
        Roots.calculate_roots(100,54,47);
		String  root_expected = Root_Types.No_roots.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void a_error() {
		Roots.calculate_roots(-5, 7, 10);
		String  root_expected = Root_Types.ERROR.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	//b
//	@Test
//	public void b_min() {
//		Roots.calculate_roots(40,0, 42);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//		
//	}
//	
//	@Test
//	public void b_min_plus_1() {
//		Roots.calculate_roots(44,1, 46);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//	}
//	@Test
//	public void b_nominal() {
//		Roots.calculate_roots(48,50, 52);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//	}
//	@Test
//	public void b_max_minus_1() {
//		Roots.calculate_roots(54,99,56);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//	}
//	@Test
//	public void b_max() {
//		Roots.calculate_roots(58,100,60);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//	}
//	
//	//c 
//	@Test
//	public void c_min() {
//		Roots.calculate_roots(50,51,0);
//		String  root_expected = Root_Types.Two_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//	}
//	@Test
//	public void c_min_plus_1() {
//		Roots.calculate_roots(30,11,1);
//		String  root_expected = Root_Types.Two_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//	}
//	@Test
//	public void c_nominal() {
//		Roots.calculate_roots(54,55,50);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//	}
//	@Test
//	public void c_max_minus_1() {
//		Roots.calculate_roots(56,57,99);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//	}
//	@Test
//	public void c_max() {
//		Roots.calculate_roots(58,59,100);
//		String  root_expected = Root_Types.No_roots.toString();
//		assertEquals(root_expected , Roots.root_types().toString());
//	}
	}