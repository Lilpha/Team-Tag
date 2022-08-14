import java.util.*;
 
public class Bac1924 {
    public static void main(String[] args){
        //https://www.acmicpc.net/problem/1924
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        int sum = 0;
        
        int [] endDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //�޸��� ������ ���ϼ��� months[0]�� ������� �ʴ´�
        for(int i=1; i<=12; i++) { 
            if(i==m) {//�Էµ� ���϶� Ż��
                break;
            }
            sum += endDays[i];     //sum = sum+endDays[i]         
        }
        
        sum += d;//�ش� ���� ������ ���� ���� ���� ���Ѵ� ex(31+5=36)
        
        int less = sum%7;  //sum�� 7�� ������ ���°��� ������ �� ���̴� �Ͽ�ȭ~��
        String [] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
   System.out.println(day[less]);
    }
}
 