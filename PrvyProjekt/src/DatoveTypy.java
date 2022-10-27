
public class DatoveTypy {

	public static void main(String[] args) {
		
		int cislo;
		
		cislo = 12;
		
		int bin = 0b10000000;
		int hex = 0xff;
		
		System.out.println(cislo);

		System.out.println(bin);
		System.out.println(hex);
		
		float f = 1.24f;
		double dd = 1.45789;
		
		byte bb = 10;
		int bbint = bb;
		
		
		bb = (byte)bbint;
		
		bbint = 123456789;
		
		double ddd = 1.89;
		int dddint = (int)ddd;
		System.out.println(dddint);
		
		char zav = '@';
		zav = 64;
		System.out.println(zav);
		char znak = '\u0123';
		System.out.println(znak);
		
		
		
	}

}
