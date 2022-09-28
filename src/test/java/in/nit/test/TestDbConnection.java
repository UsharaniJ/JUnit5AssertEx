package in.nit.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import in.nit.util.DbConnection;

class TestDbConnection {

	private DbConnection dbc;
	private Connection con;

	@BeforeEach
	public void initData() {
		dbc=new DbConnection();
	}

	@Test
	public void testGetCon() {
		assertDoesNotThrow(()->{
			con=dbc.getCon();
		});
		assertNotNull(con,"Connection is Not created, Please check!");
	}

	@AfterEach
	public void clean() {
		dbc = null;
		con = null;
	}


}
