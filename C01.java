import java.util.*;
class C01 {
	int num1, num2, num3, temp;
	int max_num, min_num;
	
	void input(){
       
        	Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		this.num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		this.num2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		this.num3 = s.nextInt();
		       
		this.max_num = num1;
		this.min_num = num1;
			     
		if(num2 >= max_num) max_num = num2;
	        if(num3 >= max_num) max_num = num3;
		if(num2 <= min_num) min_num = num2;
  	        if(num3 <= min_num) min_num = num3;
				       
		s.close();
		output();
	}
				      
	void output(){
		System.out.printf("가장 큰 수는 : %d이고,\n가장 작은 수는 : %d입니다.\n", this.max_num, this.min_num);
	}
						   
	public static void main(String[] args){
		new C01().input();
	}
}
