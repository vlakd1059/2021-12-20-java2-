package gagame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		function fun = new function();
		String mychar[] = { "0" };
//		while(true) {
//			
//			System.out.println("엔딩 고르기");
//			System.out.println("1히든 헬창,2히든 백신,3히든 크리스마스,"+"\n"
//					+ "4노말 학생,5노말 운동,6노말 간호사,7오미크론 등장"+"\n"
//					+ "8배드엔드 코로나,9배드엔드 변이바이러스,10 배드엔드 과로"+"\n"
//					+ "11.히든 알코올 , 12 ?? , 13 대유행, "
//					+ "14. 거리두기 , 15.고라니엔딩 100 = 패스");
//			int x = in.nextInt();
//			onlyend(x);
//			
//			if(x==100) {
//				break;
//			}
//			else {
//			fun.timelate(2);
//			}
//		}
		//현재까지 구현된 엔딩 히든 헬창 히든 백신xx 크리스마스 
		//배드엔드 과로사 코로나 변이바이러스
//		System.out.println("끝나면!");
		
		System.out.println(" 코로나 대유행으로 인해 대한민국은 심각한 침체기를 겪고 있다... ");
		fun.timelate(1);
		System.out.println(" 2021년... 당신은 코로나를 걸리지 않고 대한민국에서 살아남을수 있을 것인가...  ");
		fun.timelate(1);
		System.out.println(" 화려한 아침햇살이 나를 감싸는 방안... 눈을뜨며 하루의 일과를 시작하게 된다... ");
		System.out.println("");
		     
		seoul se = new seoul();
		while (true) {
			charchoice(mychar);
			
			System.out.println("========도시를 고르세요========");
			System.out.println("===========================");
			System.out.println("1.수도권  2.지방 3.강원도 두메산골");
			System.out.println("(Hell) (Normal) (응애애기유저)");
			String choice = in.next();
			if(choice.equals("1")) {
				se.main(mychar);
				break;
			}
			else if(choice.equals("2")) {
				se.zibang(mychar);
				break;
			}
			else if(choice.equals("3")) {
				se.dume(mychar);
				break;
			}
			else {
				System.out.println("장난 멈춰");
			}
			
		}
//		se.main();
//		in.close();
	}

	static void onlyend(int x) {
		endcredit end = new endcredit();

		if (x == 1) {
			end.hidden_healcang();
		}
		if (x == 2) {
			end.hidden_bacsin();
		}
		if (x == 4) {
			end.normal_student_end();
		}
		if (x == 3) {
			end.hidden_x_mas_solo();
		}
		if (x == 9) {
			end.bad_omicron_die();
		}
		if (x == 11) {
			end.hidden_Alcohol();
		}
		if (x == 7) {
			end.event_hi_omicron();
		}
		if (x == 8) {
			end.bad_corona_end();
		}
		if (x == 5) {
			end.normal_sport_end();
		}
		if (x == 10) {
			end.bad_overwork();
		}
		if (x == 6) {
			end.normal_nurse_end();
		}
		if (x == 12) {
			end.normal_nurse_end2();
		}
		if (x == 13) {
			end.event_u_hang();
		}
		if(x==14) {
			end.goridugi();
		}
		if(x==15) {
			end.gorani();
		}
		if(x==16) {
			end.test();
		}

	}
	static void charchoice(String mychar[]) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("=======케릭터를 고르세요=======");
			System.out.println("===========================");
			System.out.println("1.간호사 >> 체력(보통) 감염저항↑");
			System.out.println("2.운동선수 >> 체력↑  감염저항(보콩)");
			System.out.println("3.학생 >> 체력(보통)  감염저항(보통)");
			System.out.println("학생의 특징 : 대유행을 스킵 할 수 있다.");
			mychar[0] = in.next();
			if (mychar[0].equals("1") || mychar[0].equals("2") || mychar[0].equals("3")) {
				if(mychar[0].equals("1")) {
					System.out.print("간호사 ");
				}
				else if(mychar[0].equals("2")) {
					System.out.print("운동선수 ");
				}
				else {
					System.out.print("학생 ");
				}
				System.out.println("선택 완료!");
				break;
			} else {
				System.out.println(mychar[0]);
				mychar[0] = "0";
				System.out.println("이상한거는 다메다메☆");

			}
		}
//		in.close();
	}
}
