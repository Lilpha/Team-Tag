import java.util.*;
public class Bac1100 {
	public static void main(String[]args) {
		//https://www.acmicpc.net/problem/1100
		//�⺻������ �Է¹��� ü������ �Ͼ�� ĭ ���� �ִ� ���� ���� �Ǵ� �����̴�.
		//�Ͼ�� ĭ�� ��ġ�� 0,0  0,2  0,4		1,1  1,3
		//�� ��Ģ���� �����غ��� �Ͼ�� ĭ�� for������ ó������ ������ ¦��, �״������� Ȧ�� , ¦���� ���ư���.
		//for�������� i�� ¦��, Ȧ�� �϶��� ���� if���� �ۼ� �� �� ī��Ʈ�� �ø��� ���� ������?
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		String[] arr = new String[8];//���پ� ���� �迭 8��
		
		for(int i=0; i<8;i++) {
			arr[i] = sc.nextLine();
		}
		
		/*
		 * for(int i=0; i<8;i++) { for (int j=0;j<8;j++) { if(i%2==0&& line.charAt(j%2)
		 * =='F') { //¦����° ü������ ��� 0��° �� ���� ¦���� �����Ѵ� counter++; } else if(i%2==1&&
		 * line.charAt(j%2+1) =='F') { //Ȧ����° ü������ ��� counter++; } } }
		 */
		
		for (int i=0;i<8;i++) {
			for(int j =0;j<8;j++) {
				if(i%2==0 && j%2==0 && arr[i].charAt(j)=='F') {
					//i�� ¦����° && j�� ¦����° && �� ��ġ�� �ִ°� ���ϰ��??
					counter++;
				}
				else if(i%2==1 && j%2==1 && arr[i].charAt(j)=='F') {
					//i�� Ȧ����° && j�� Ȧ����° && �� ��ġ�� �ִ°� ���ϰ��??
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}
