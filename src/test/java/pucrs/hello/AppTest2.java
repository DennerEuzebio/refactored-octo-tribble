package pucrs.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest2 {

	@Test
	public void testGetSaudacaoEhOlaMundo() {
		String expected = "Olá, mundo";
    	String actual = App.getSaudacao();
        assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSaudacaoIniciaComO() {
    	String actual = App.getSaudacao();
        assertTrue(actual.startsWith("o"));
	}

}
