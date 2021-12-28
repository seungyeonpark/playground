package mc.ys.lesson2;

public class Variable {
	public static void main(String[] args) {
		// literal
		int octNum = 010;
		int hexNum = 0x10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		float pi = 3.14f;
		double rate = 1.618d;
		
		double d = 1.4e3f; // OK! 암시적 변환
		
		char ch1 = 'J';
		String str1 = "Java";
		
		String str2 = ""; // OK
		// char ch2 = ''; error! '' 안에 반드시 하나의 문자가 필요
		char ch2 = ' ';
		
		String name1 = new String("yeon");
		String name2 = "yeon";
		
		// 문자열 결합
		String str3 = "Ja" + "va";
		String str4 = str3 + 8.0;
		
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		
		// overflow, underflow
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin - 1 = " + (short)(sMin - 1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax + 1 = " + (short)(sMax + 1));
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin - 1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax + 1 = " + (int)++cMax);
		
		// 타입 간 변환
		String str5 = "3";
		
		System.out.println(str5.charAt(0) - '0');
		System.out.println('3' - '0' + 1);
		System.out.println(Integer.parseInt("3") + 1);
		System.out.println("3" + 1);
		System.out.println((char)(3 + '0'));
	}
}
