import java.util.*;
public class Bac1453 {
	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/1453
		//처음 입력에는 들어온 손님의 명수	두번째 입력은 손님이 원하는 자리
		//100개의 배열을 만들어서 그다음에 입력 받는 원소를 배열에 집어넣어 boolean형식으로 하면 되지 않을까?
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
