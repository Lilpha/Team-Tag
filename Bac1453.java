import java.util.*;
public class Bac1453 {
	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/1453
		//ó�� �Է¿��� ���� �մ��� ���	�ι�° �Է��� �մ��� ���ϴ� �ڸ�
		//100���� �迭�� ���� �״����� �Է� �޴� ���Ҹ� �迭�� ����־� boolean�������� �ϸ� ���� ������?
		Scanner sc = new Scanner(System.in);
		boolean [] Chairs = new boolean [101];
		int counter =0;
		int Customer = sc.nextInt();
		for(int i=0; i<Customer;i++) {
			int num = sc.nextInt();
			if(Chairs[num] == true) {
				counter++;
			}
            else{
                Chairs[num] = true;
            }
			
			
		}
		System.out.println(counter);
	}

}
