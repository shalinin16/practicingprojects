package simpleproj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class subsetsum2test {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		subsetsum2 ss=new subsetsum2();
		IllegalArgumentException exception= assertThrows(IllegalArgumentException.class,()-> ss.check(0,10), "length of the array should be greater than 0");    
		assertEquals("Array length should be greater than 0", exception.getMessage());
	}
	
	@Test
	void test1() {
		subsetsum2 ss=new subsetsum2();
		IllegalArgumentException exception= assertThrows(IllegalArgumentException.class,()-> ss.check(-1,3), "length of the array should be greater than 0");    
	//	assertEquals("Array length should be greater than 0", exception.getMessage());
		assertEquals("Array length should be greater than 0", exception.getMessage());
	}
	
	@Test
	void test2() {
		subsetsum2 ss=new subsetsum2();
		IllegalArgumentException exception= assertThrows(IllegalArgumentException.class,()-> ss.check(5,0), "target sum should be greater than 0");    
		//assertEquals("Array length should be greater than 0", exception.getMessage());
		assertEquals("Enter target sum greater than 0", exception.getMessage());
	}
	
	@Test
	void test3() {
		subsetsum2 ss=new subsetsum2();
		//IllegalArgumentException exception= assertThrows(IllegalArgumentException.class,()-> ss.check(5,35), "target sum should be greater than 0");    
		//assertEquals("Array length should be greater than 0", exception.getMessage());
		assertEquals(-1, ss.check(5,35));
	}
	
	@Test
	void test4() {
		subsetsum2 ss=new subsetsum2();
		IllegalArgumentException exception= assertThrows(IllegalArgumentException.class,()-> ss.check(5,31), "target sum should be within the range of array elements");    
		//assertEquals("Array length should be greater than 0", exception.getMessage());
		assertEquals("Enter target sum within the range of array elements", exception.getMessage());
	}
	
	@Test
	void test5() {
		subsetsum2 ss=new subsetsum2();
		//IllegalArgumentException exception= assertThrows(IllegalArgumentException.class,()-> ss.check(set,5,0), "target sum should be greater than 0");    
		//assertEquals("Array length should be greater than 0", exception.getMessage());
		assertEquals(-1, ss.check(5,9));
	}
	
	@Test
	void test6() {
		subsetsum2 ss=new subsetsum2();
		assertEquals(1, ss.check(5, 6));
	}
	
	
	
	
	

}

