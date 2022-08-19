import java.util.*;
public class Bac1297 {
	public static void main(String[]args) {
		//https://www.acmicpc.net/problem/1297
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();//입력을 받을때 한줄이어도 공백이 있으면 다음 변수에 저장하게 된다.
		int h = sc.nextInt();
		int w  = sc.nextInt();
		double answer = Math.sqrt(1.0*d*d/(h*h+w*w));  //sqrt =루트값. 만약 sqrt(25)을 출력하면 5.0이 나온다
		
		System.out.println((int) Math.floor(answer*h)+" "+(int) Math.floor(answer*w));
		//floor은 바닥값. 뒤에 소수점이 있어도 삭감한다. int로 강제 형변환 할때랑 비슷함.
	
	}
}
