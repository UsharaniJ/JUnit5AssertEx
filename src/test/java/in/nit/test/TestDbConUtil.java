package in.nit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import in.nit.util.DbConUtil;

class TestDbConUtil {

	@Test
	public void testGetCon() {
		Connection con1 = DbConUtil.getCon();
		Connection con2 = DbConUtil.getCon();
		
		System.out.println("con1 : " + con1);
		System.out.println("con2 : " + con2);
		
		// assertNotNull(con1,"Connection not created..");
		if (con1 == null || con2 == null) {
			// TEST CASE IS FAILED
			fail("CONNECTIONS ARE NOT CRATED..");
		}
		assertSame(con1, con2, "May not be Same Connection!");
	}

}
