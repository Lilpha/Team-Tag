import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	//https://www.acmicpc.net/problem/1152
        Scanner sc = new Scanner(System.in);
        String inputWord;
        int Counter = 0;
        inputWord = sc.nextLine(); //���� �Է�
        for(int j = 0; j < inputWord.length(); j ++){	
            if(inputWord.charAt(j) == ' '){//i��° ���ڰ� �����Ͻ�
                Counter++; //ī��Ʈ ++
            }
        }
        if(inputWord.charAt(0) != ' ' && inputWord.charAt(inputWord.length()-1) != ' '){ 
            Counter++;//���� �� �ڿ� ������ �ƴҶ� ī��Ʈ ++
        }
        if(inputWord.charAt(0) == ' ' && inputWord.charAt(inputWord.length()-1) == ' '){ 
          	Counter--;//���� �� �ڿ� ������ ������ ī��Ʈ�� �ϳ� ������
        }
        System.out.println(Counter);
        
    }
}