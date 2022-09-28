package in.nit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import in.nit.util.DbConUtil;

class TestSample {

//	@Test
//	public void testNormal() {
//		int expected[] = { 10, 20, 30 };
//		int actual[] = { 10, 20 };
//		assertArrayEquals(expected, actual, "Data may not be same in two arrays!");
//	}

//	@Test
//	public void testNormal() {
//		boolean exist = false;
//		assertTrue(exist,"Data may not exist!");
//	}
	
//	@Test
//	public void testNormal() {
//		assertThrows(NullPointerException.class, ()->{
//			throw new ArrayIndexOutOfBoundsException();
//		});
//		
//	}
	
	@Test
	public void testNormal() {
		assertAll(
				()->{
					assertNotNull(DbConUtil.getCon());
				},
				()->{
					Connection con1,con2;
					con1=DbConUtil.getCon();
					con2=DbConUtil.getCon();
					assertSame(con1, con2);
				},
				()->{
					Connection con1,con2;
					con1=DbConUtil.getCon();
					con2=DbConUtil.getCon();
					if(con1==null && con2==null) {
						fail();
					}
				}
				);
		
	}
}
