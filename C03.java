import java.util.*;

class C03 {
	int month, day;
	int day_count;

	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하시오. ");
		this.month = s.nextInt();
		System.out.print("일을 입력하시오. ");
		this.day = s.nextInt();

		if(month==1){
			day_count = day;
		}
		else if(month==2){
			day_count = day + 31;
		}
		else if(month==3){
			day_count = day + 59;
		}
		else if(month==4){
			day_count = day + 90;
		}
		else if(month==5){
                        day_count = day + 120;
                }
                else if(month==6){
                        day_count = day + 151;
                }
		else if(month==7){
			day_count = day + 181;
		}
		else if(month==8){
			day_count = day + 212;
		}
		else if(month==9){
			day_count = day + 242;
		}
		else if(month==10){
			day_count = day + 273;
		}
		else if(month==11){
			day_count = day + 303;
		}
		else if(month==12){
			day_count = day + 344;
		}
		else {
			System.out.print("잘못 입력하셨습니다.");
		}

		s.close();
		output();
	}

	void output(){
		System.out.print("이 날짜는 1년 중 " + day_count + " 번째 날에 해당됩니다.");
	}

	public static void main(String[] args){
		new C03().input();
	}
}
