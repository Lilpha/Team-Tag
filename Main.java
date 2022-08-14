import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	//https://www.acmicpc.net/problem/1152
        Scanner sc = new Scanner(System.in);
        String inputWord;
        int Counter = 0;
        inputWord = sc.nextLine(); //문장 입력
        for(int j = 0; j < inputWord.length(); j ++){	
            if(inputWord.charAt(j) == ' '){//i번째 문자가 공백일시
                Counter++; //카운트 ++
            }
        }
        if(inputWord.charAt(0) != ' ' && inputWord.charAt(inputWord.length()-1) != ' '){ 
            Counter++;//만약 앞 뒤에 공백이 아닐때 카운트 ++
        }
        if(inputWord.charAt(0) == ' ' && inputWord.charAt(inputWord.length()-1) == ' '){ 
          	Counter--;//만약 앞 뒤에 공백이 있으면 카운트를 하나 빼버림
        }
        System.out.println(Counter);
        
    }
}