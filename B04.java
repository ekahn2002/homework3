import java.util.*;
class B04 {
  public static void main(Stirng[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("연봉을 원단위로 입력하세요 ");
    long salary = s.nextLong();
    float tax;
    if(salary < 10000000) {
      tax = salary*0.95;
    }
    else if(10000000 <= salary && salary < 40000000) {
      tax = salary*1.9;
    }
    else if(40000000 <= salary && salary < 80000000) {
      tax = salary*2.8;
    }
    else if(80000000 <= salary) {
      tax = salary*3.7;
    }
    else{
      System.out.print("잘못된 숫자 입니다");
    }
    System.out.print("연봉 금액에 대한 소득세는" + tax + "입니다."); 
  }
}
