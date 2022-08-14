import java.util.*;
public class Bac1157 {
	public static void main(String[] args) {
		//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
		//일단 모든 알파벳을 upper을 이용해서 대문자로 만든 이후 카운팅을 하면 조금 더 쉬울 것 같다는 생각
		Scanner sc = new Scanner(System.in);
		//0부터 시작하는 배열을 만들어서 대문자 문자의 아스키값을 -해서 배열을 카운트를 올린다?
		//A~Z가 26개
		int[] arr = new int[26];
		String Word = sc.nextLine();
		Word = Word.toUpperCase();
		int length = Word.length();
		for(int i =0; i<length;i++) {
			//대문자 A는 65니까 
			arr[Word.charAt(i)-65]++;
			//문장의 i번째 있는 알파벳의 -64한것 = 배열의 위치 A는 arr[0]의 값에 ++해준다
		}
		int often = 0;
		char Woften= '?';
		for (int i = 0; i < 26; i++) {//arr이 26번쨰까지니까
			if (arr[i] > often) { //arr[i]원소가 often보다 자주 나올경우
				often = arr[i];//often=i번쨰 원소
				Woften = (char) (i + 65); // 자주나오는 원소 Woften는 i번쨰에서 65더한 유니코드 값을 char으로 형변환시킨것
			}
			else if (arr[i] == often) { //often(가장 많이 나온것)이 i번쨰 원소의 갯수와 같아지면(가장 많이나온것이 동점이면)
				Woften = '?'; //출력되는 Woften를 ? 로 한다
			}
		}
		/*
		 * 테스트
		int i =0 ;
		while(i<5) {
			i++;
			arr[(int)'M'-65]++;
		}
		System.out.println(arr[(int)'M'-65]);
		*/
		System.out.println(Woften);
		
	}
}
