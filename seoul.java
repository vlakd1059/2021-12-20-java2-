package gagame;

import java.util.Random;
import java.util.Scanner;

public class seoul {
	function fun = new function();
	Scanner in = new Scanner(System.in);
	endcredit end = new endcredit();
	Random ran = new Random();
//	int healthcnt =100;
//	int defend_vir=0;

	character character = new character();
	omicron omi = new omicron();

	public void main(String[] mychar) {
		while (true) {
			int a = 0;
			if (mychar[0].equals("1")) {

				System.out.println("��ȣ��� ���� ������� �鿪�� 15�� ������ �ֽ��ϴ�.");
				nurse_print(a);
				break;

			} else if (mychar[0].equals("2")) {
				System.out.println("�����");
				sport_print(a);
				break;
			} else if (mychar[0].equals("3")) {
				System.out.println("�л�");
				student_print(a);
			} else {
				System.out.println("�ٽð���ּ�����");
			}
		}
	}

	public void zibang(String[] mychar) {
		while (true) {
			int a = 1;
			if (mychar[0].equals("1")) {

				System.out.println("��ȣ��� ���� ������� �鿪�� 15 �����մϴ�.");
				System.out.println("���濡���� ���� ���׷��� 15 �����մϴ�.");
				nurse_print(a);
				break;

			} else if (mychar[0].equals("2")) {
				System.out.println("�����");
				sport_print(a);
				break;
			} else if (mychar[0].equals("3")) {
				System.out.println("�л�");
				student_print(a);
			} else {
				System.out.println("�ٽð���ּ�����");
			}
		}

	}
	//�θ޻�� ���� �̱���
	public void dume(String[] mychar) {
		while (true) {
			int a = 2;
			if (mychar[0].equals("1")) {

				System.out.println("��ȣ��� ���� ������� �鿪�� 15 �����մϴ�.");
				System.out.println("���濡���� ���� ���׷��� 15 �����մϴ�.");
				nurse_print(a);
				break;

			} else if (mychar[0].equals("2")) {
				System.out.println("������� ü���� 20 �����մϴ�.");
				System.out.println("���濡���� ���� ���׷��� 15 �����մϴ�.");
				sport_print(a);
				break;
			} else if (mychar[0].equals("3")) {
				System.out.println("�л�");
				student_print(a);
			} else {
				System.out.println("�ٽð���ּ�����");
			}
		}
		
	}
	public void nurse_print(int a) {
		character character = new character();
		int endcnt = 0;
		int omicron = 0;
		int guri_cnt = 1;
		String witch = null;
		if (a == 1) {
			witch = "����";
		} 
		else if(a==2) {
			witch = "����";
		}
		else {
			witch = "����";
		}
		for (int month = 1; month <= 13; month++) {
			if (omicron == 0) {
				gagame.omicron.omicron_cnt(0);
			}
			if (month == 12) {
				if (month >= 6 && omicron == 0) {
					omicron(omicron);
				}
				endcnt = character.x_mas(endcnt);

			}
			if (endcnt == 1) {
				break;
			}

			if (month < 13) {
				System.out.println("==========");
				System.out.println(month + " ��° ��");
				System.out.println("==========");
			}
			if (month == 3 || month == 6 || month == 9) {
				System.out.println((month / 3) + "�ܰ� �Ÿ��αⰡ ����ƴ�!!");
				end.goridugi();
				gagame.omicron.goridugi(1, guri_cnt);
				guri_cnt++;
			}
			gagame.omicron.goridugi(0, 0);
			if (month == 4 || month == 8) {
				if (month >= 6 && omicron == 0) {
					omicron(omicron);
				}
				gagame.omicron.dae_u_hang(1);
				end.event_u_hang();
			}
			gagame.omicron.dae_u_hang(0);
			if (month == 13) {
				end.normal_nurse_end();
				break;
			}

			else if (month == 12) {

				character.seoul_nur_mornig();
				character.seoul_nur_afternoon();
				endcnt = character.seoul_nur_night(endcnt);
			}
			if (month == 5 || month == 10) {
				if (month >= 6 && omicron == 0) {
					omicron(omicron);
				}
				character.nurse_baksin();
			}

			else {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				character.zibang(witch);
				character.seoul_nur_mornig();
				character.seoul_nur_afternoon();
				endcnt = character.seoul_nur_night(endcnt);

			}
		}
	}

	public void sport_print(int a) {
		character character = new character();
		int endcnt = 0;
		int omicron = 0;
		int guri_cnt = 1;
		String witch = null;
		if (a == 1) {
			witch = "����";
		} 
		else if(a==2) {
			witch = "����";
		}
		else {
			witch = "����";
		}
		for (int i = 1; i <= 13; i++) {
			if (omicron == 0) {
				gagame.omicron.omicron_cnt(0);
			}
			if (i == 12) {
				if (i >= 6 && omicron == 0) {
					omicron(omicron);
				}
				endcnt = character.x_mas(endcnt);

			}
			if (endcnt == 1) {
				break;
			}

			if (i < 13) {
				System.out.println("==========");
				System.out.println(i + " ��° ��");
				System.out.println("==========");
			}
			if (i == 3 || i == 6 || i == 9) {
				System.out.println((i / 3) + "�ܰ� �Ÿ��αⰡ ����ƴ�!!");
				end.goridugi();
				gagame.omicron.goridugi(1, guri_cnt);
				guri_cnt++;
			}
			gagame.omicron.goridugi(0, 0);
			if (i == 4 || i == 8) {
				if (i >= 6 && omicron == 0) {
					omicron(omicron);
				}
				gagame.omicron.dae_u_hang(1);
				end.event_u_hang();
			}
			gagame.omicron.dae_u_hang(0);
			if (i == 13) {
				end.normal_nurse_end();
				break;
			}

			else if (i == 12) {

				character.nor_sport_morning();
				character.nor_sport_evening();
				endcnt = character.nor_sport_night(endcnt);
			}
			if (i == 5 || i == 10) {
				if (i >= 6 && omicron == 0) {
					omicron(omicron);
				}
				endcnt = character.backsin(endcnt);
			}

			else {
				if (i >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				character.zibang(witch);
				character.nor_sport_morning();
				character.nor_sport_evening();
				endcnt = character.nor_sport_night(endcnt);

			}
		}
	

	}

	public void student_print(int a) {

		character character = new character();
		int endcnt = 0;
		int omicron = 0;
		int guri_cnt = 1;
		String witch = null;
		if (a == 1) {
			witch = "����";
		} 
		else if(a==2) {
			witch = "����";
		}
		else {
			witch = "����";
		}
		for (int i = 1; i <= 13; i++) {
			if (omicron == 0) {
				gagame.omicron.omicron_cnt(0);
			}
			if (i == 12) {
				if (i >= 6 && omicron == 0) {
					omicron(omicron);
				}
				endcnt = character.x_mas(endcnt);

			}
			if (endcnt == 1) {
				break;
			}

			if (i < 13) {
				System.out.println("==========");
				System.out.println(i + " ��° ��");
				System.out.println("==========");
			}
			if (i == 3 || i == 6 || i == 9) {
				System.out.println((i / 3) + "�ܰ� �Ÿ��αⰡ ����ƴ�!!");
				end.goridugi();
				gagame.omicron.goridugi(1, guri_cnt);
				guri_cnt++;
			}
			gagame.omicron.goridugi(0, 0);
			if (i == 4 || i == 8) {
				if (i >= 6 && omicron == 0) {
					omicron(omicron);
				}
				gagame.omicron.dae_u_hang(1);
				end.event_u_hang();
			}
			gagame.omicron.dae_u_hang(0);
			if (i == 13) {
				end.normal_nurse_end();
				break;
			}

			else if (i == 12) {

				character.nor_student_morning();
				character.nor_student_evening();
				endcnt = character.nor_student_night(endcnt);
			}
			if (i == 5 || i == 10) {
				if (i >= 6 && omicron == 0) {
					omicron(omicron);
				}
				endcnt = character.backsin(endcnt);
			}

			else {
				if (i >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				character.zibang(witch);
				character.nor_student_morning();
				character.nor_student_evening();
				endcnt = character.nor_student_night(endcnt);

			}
		}
	

	
	}
	public int omicron(int omicron) {

		if (ran.nextInt(10) < 2) {
			end.event_hi_omicron();
			omicron = 1;

			gagame.omicron.omicron_cnt(1);
			return omicron;
		}

		return 0;

	}

}
