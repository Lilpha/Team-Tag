import java.util.*;
public class Main15813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//https://www.acmicpc.net/problem/15813
		int length = sc.nextInt();
		String name = sc.next();
		int total = 0;
		for(int i=0;i<length;i++) {
			//�빮�� A�� 1�̴�.
			total = total + (int) name.charAt(i)-64;
		}
	System.out.println(total);	

	}

}
