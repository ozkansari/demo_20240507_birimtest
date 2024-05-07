package tr.edu.medipol.yova.birimtestornek1;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		String ornekMetin = "         yazilim ortam ve araclari          ";
		String sonuc = metniFormatla(ornekMetin);
		System.out.println("'" + ornekMetin + "' formatlandi: --> '" + sonuc + "'");
	}
	
	public static String metniFormatla(String kaynakMetin) {
		String formatliMetin;
		// ADIM-1: Bosluklari temizle
		formatliMetin = StringUtils.normalizeSpace(kaynakMetin);
		// ADIM-2: Bas harfi buyut
		formatliMetin = StringUtils.capitalize(formatliMetin);
		// ADIM-3: Uzunsa metni kisalt
		formatliMetin = StringUtils.abbreviate(formatliMetin, 25);
		return formatliMetin;
	}

}
