package util.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import util.ConnectionManager;

public class ConnectionManagerTest {

	@Test
	public void testConectar() {
	
			try {
				ConnectionManager.conectar();
				assertTrue(true);
			} catch (ClassNotFoundException | SQLException e) {
				assertTrue(false);
				e.printStackTrace();
			}
		}

}
