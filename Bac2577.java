import java.util.*;
public class Bac2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mul = a*b*c;
		String multi = Integer.toString(mul);
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < multi.length(); j++) {
				if ((multi.charAt(j) - '0') == i) {
					//-0을 하는 이유 https://cokes.tistory.com/80
					count++;
				}
			}
			System.out.println(count);
		}

}
}
