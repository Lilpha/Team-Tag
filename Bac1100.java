import java.util.*;
public class Bac1100 {
	public static void main(String[]args) {
		//https://www.acmicpc.net/problem/1100
		//기본적으로 입력받은 체스판의 하얀색 칸 위에 있는 말을 세면 되는 문제이다.
		//하얀색 칸의 위치는 0,0  0,2  0,4		1,1  1,3
		//이 규칙으로 정리해보면 하얀색 칸은 for구문이 처음으로 돌때는 짝수, 그다음에는 홀수 , 짝수로 돌아간다.
		//for구문에서 i가 짝수, 홀수 일때의 따라서 if문을 작성 한 후 카운트를 올리면 되지 않을까?
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		String[] arr = new String[8];//한줄씩 담을 배열 8개
		
		for(int i=0; i<8;i++) {
			arr[i] = sc.nextLine();
		}
		
		/*
		 * for(int i=0; i<8;i++) { for (int j=0;j<8;j++) { if(i%2==0&& line.charAt(j%2)
		 * =='F') { //짝수번째 체스판인 경우 0번째 줄 또한 짝수로 가정한다 counter++; } else if(i%2==1&&
		 * line.charAt(j%2+1) =='F') { //홀수번째 체스판인 경우 counter++; } } }
		 */
		
		for (int i=0;i<8;i++) {
			for(int j =0;j<8;j++) {
				if(i%2==0 && j%2==0 && arr[i].charAt(j)=='F') {
					//i가 짝수번째 && j가 짝수번째 && 그 위치에 있는게 말일경우??
					counter++;
				}
				else if(i%2==1 && j%2==1 && arr[i].charAt(j)=='F') {
					//i가 홀수번째 && j가 홀수번째 && 그 위치에 있는게 말일경우??
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}
