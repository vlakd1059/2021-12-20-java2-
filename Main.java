package gagame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		function fun = new function();
		String mychar[] = { "0" };
//		while(true) {
//			
//			System.out.println("���� ����");
//			System.out.println("1���� ��â,2���� ���,3���� ũ��������,"+"\n"
//					+ "4�븻 �л�,5�븻 �,6�븻 ��ȣ��,7����ũ�� ����"+"\n"
//					+ "8��忣�� �ڷγ�,9��忣�� ���̹��̷���,10 ��忣�� ����"+"\n"
//					+ "11.���� ���ڿ� , 12 ?? , 13 ������, "
//					+ "14. �Ÿ��α� , 15.���Ͽ��� 100 = �н�");
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
		//������� ������ ���� ���� ��â ���� ���xx ũ�������� 
		//��忣�� ���λ� �ڷγ� ���̹��̷���
//		System.out.println("������!");
		
		System.out.println(" �ڷγ� ���������� ���� ���ѹα��� �ɰ��� ħü�⸦ �ް� �ִ�... ");
		fun.timelate(1);
		System.out.println(" 2021��... ����� �ڷγ��� �ɸ��� �ʰ� ���ѹα����� ��Ƴ����� ���� ���ΰ�...  ");
		fun.timelate(1);
		System.out.println(" ȭ���� ��ħ�޻��� ���� ���δ� ���... �����߸� �Ϸ��� �ϰ��� �����ϰ� �ȴ�... ");
		System.out.println("");
		     
		seoul se = new seoul();
		while (true) {
			charchoice(mychar);
			
			System.out.println("========���ø� ������========");
			System.out.println("===========================");
			System.out.println("1.������  2.���� 3.������ �θ޻��");
			System.out.println("(Hell) (Normal) (���־ֱ�����)");
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
				System.out.println("�峭 ����");
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
			System.out.println("=======�ɸ��͸� ������=======");
			System.out.println("===========================");
			System.out.println("1.��ȣ�� >> ü��(����) �������ס�");
			System.out.println("2.����� >> ü�¡�  ��������(����)");
			System.out.println("3.�л� >> ü��(����)  ��������(����)");
			System.out.println("�л��� Ư¡ : �������� ��ŵ �� �� �ִ�.");
			mychar[0] = in.next();
			if (mychar[0].equals("1") || mychar[0].equals("2") || mychar[0].equals("3")) {
				if(mychar[0].equals("1")) {
					System.out.print("��ȣ�� ");
				}
				else if(mychar[0].equals("2")) {
					System.out.print("����� ");
				}
				else {
					System.out.print("�л� ");
				}
				System.out.println("���� �Ϸ�!");
				break;
			} else {
				System.out.println(mychar[0]);
				mychar[0] = "0";
				System.out.println("�̻��ѰŴ� �ٸ޴ٸޡ�");

			}
		}
//		in.close();
	}
}
