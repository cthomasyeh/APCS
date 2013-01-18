import java.util.Scanner;

class Easter {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		System.out.println(y);
		int a, b, c, d, e, f, g, h, i, k, r, m, n, p;
		a = y%19;
		b = y/100; c = y%100;
		d = b/4; e = b%4;
		f = (b + 8)/25; 
		g = (b - f + 1) / 3;
		h = (19 * a + b - d - g + 15)%30;
		i = c/4;  k = c%4;
		r = (32 + 2 * e + 2 * i - h - k)%7;
		m = (a + 11 * h + 22 * r)/451;
		n = (h + r - 7 * m + 114) / 31; p = (h + r - 7 * m + 114) % 31;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		System.out.println("i = " + i);
		System.out.println("k = " + k);
		System.out.println("r = " + r);
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		System.out.println("p = " + p);
	}

}