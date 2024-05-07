package tr.edu.medipol.yova.birimtestornek1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testMetniFormatla1( ) {
		// 1. ON KOSULLAR (GIVEN)
		String kaynakMetin = "     ders 1    ";
		
		// 2. TEST EDILECEK KOD CAGRILDIGINDA (WHEN)
		String sonuc = Main.metniFormatla(kaynakMetin);
		
		// 3. KONTROLLER (THEN)
		assertNotNull(sonuc);
		assertEquals("Ders 1", sonuc);
	}
}
