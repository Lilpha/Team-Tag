import java.util.*;
public class Bac2592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//https://www.acmicpc.net/problem/2592
		//10���� ������ �ް� �Ǵµ� �� ������ ��հ� �ֺ��� ���϶�.
		int [] NL = new int [1000];//NumberList
		int total=0;
		for(int i=0; i<10;i++) {
			int input = sc.nextInt();
			NL[input]++;
			total +=input;
		}
		//�ֺ� ����
		int oftencounter =0;
		int often =0;
		for(int i =0;i<NL.length;i++) {
			if(oftencounter<NL[i]) {
				oftencounter = NL[i];
				often =i;
			}
			
		}
		System.out.println(total/10);
		System.out.println(often);
		
		
		
		
	}
}
