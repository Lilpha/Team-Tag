import java.util.*;
public class Bac1157 {
	public static void main(String[] args) {
		//���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
		//�ϴ� ��� ���ĺ��� upper�� �̿��ؼ� �빮�ڷ� ���� ���� ī������ �ϸ� ���� �� ���� �� ���ٴ� ����
		Scanner sc = new Scanner(System.in);
		//0���� �����ϴ� �迭�� ���� �빮�� ������ �ƽ�Ű���� -�ؼ� �迭�� ī��Ʈ�� �ø���?
		//A~Z�� 26��
		int[] arr = new int[26];
		String Word = sc.nextLine();
		Word = Word.toUpperCase();
		int length = Word.length();
		for(int i =0; i<length;i++) {
			//�빮�� A�� 65�ϱ� 
			arr[Word.charAt(i)-65]++;
			//������ i��° �ִ� ���ĺ��� -64�Ѱ� = �迭�� ��ġ A�� arr[0]�� ���� ++���ش�
		}
		int often = 0;
		char Woften= '?';
		for (int i = 0; i < 26; i++) {//arr�� 26���������ϱ�
			if (arr[i] > often) { //arr[i]���Ұ� often���� ���� ���ð��
				often = arr[i];//often=i���� ����
				Woften = (char) (i + 65); // ���ֳ����� ���� Woften�� i�������� 65���� �����ڵ� ���� char���� ����ȯ��Ų��
			}
			else if (arr[i] == often) { //often(���� ���� ���°�)�� i���� ������ ������ ��������(���� ���̳��°��� �����̸�)
				Woften = '?'; //��µǴ� Woften�� ? �� �Ѵ�
			}
		}
		/*
		 * �׽�Ʈ
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
