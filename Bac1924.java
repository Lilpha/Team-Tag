import java.util.*;
 
public class Bac1924 {
    public static void main(String[] args){
        //https://www.acmicpc.net/problem/1924
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        int sum = 0;
        
        int [] endDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //달마다 끝나는 요일설정 months[0]은 사용하지 않는다
        for(int i=1; i<=12; i++) { 
            if(i==m) {//입력된 달일때 탈출
                break;
            }
            sum += endDays[i];     //sum = sum+endDays[i]         
        }
        
        sum += d;//해당 월이 끝나는 날에 현재 일을 더한다 ex(31+5=36)
        
        int less = sum%7;  //sum을 7로 나누고 남는값이 요일이 될 것이다 일월화~토
        String [] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
   System.out.println(day[less]);
    }
}
 