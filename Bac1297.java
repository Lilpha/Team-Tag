import java.util.*;
public class Bac1297 {
	public static void main(String[]args) {
		//https://www.acmicpc.net/problem/1297
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();//�Է��� ������ �����̾ ������ ������ ���� ������ �����ϰ� �ȴ�.
		int h = sc.nextInt();
		int w  = sc.nextInt();
		double answer = Math.sqrt(1.0*d*d/(h*h+w*w));  //sqrt =��Ʈ��. ���� sqrt(25)�� ����ϸ� 5.0�� ���´�
		
		System.out.println((int) Math.floor(answer*h)+" "+(int) Math.floor(answer*w));
		//floor�� �ٴڰ�. �ڿ� �Ҽ����� �־ �谨�Ѵ�. int�� ���� ����ȯ �Ҷ��� �����.
	
	}
}
