package gagame;

import java.util.Random;
import java.util.Scanner;

public class character {
	int healthcnt = 100;
	double defend_vir = 10;
	Scanner in = new Scanner(System.in);
	String choice;
	endcredit end = new endcredit();
	Random ran = new Random();
	int rancnt = 0;
	String a = "����";
	int ten;
	int five;
	int minfive;
	int minten;

	int alcol_cnt = 0;
	int n = 0;
	int h = 0;
	int x = 0;
	function fun = new function();
	omicron omi = new omicron();

	public void omi_change() {
		five = omi.getFive();
		minten = omi.getMinten();
		minfive = omi.getMinfive();
		ten = omi.getTen();
	}

	public void da_u_hang() {
		five = omi.getFive();
		minten = omi.getMinten();
		minfive = omi.getMinfive();
		ten = omi.getTen();
	}

	public void only_nur() {
		if (n == 0) {
			defend_vir = 25;
		}
		n++;
	}

	public void only_hel() {
		if (h == 0) {
			healthcnt += 20;
			h++;
		}
	}

	public int x_mas(int x) {
		rancnt = ran.nextInt(5);
		if (rancnt >= 3) {
			end.hidden_x_mas_solo();
			return 1;
		} else {
			return 0;
		}

	}

	public String zibang(String b) {
		if (b.equals("����")) {
			return a = "����";
		} else if (b.equals("����")) {
			return a = "����";
		} else {
			return a = "����";
		}

	}

	public void witch() {
		if (a.equals("����") && x == 0) {
			defend_vir += 15;
			x++;
		}
		if (a.equals("����") && x == 0) {
			defend_vir += 40;
			x++;
		} else {
			defend_vir += 0;
		}
	}

	public void gori() {

		five = omi.getFive();
		minten = omi.getMinten();
		minfive = omi.getMinfive();
		ten = omi.getTen();
	}

	public void nor_student_morning() {
		omi_change();
		da_u_hang();
		gori();
		witch();
		while (true) {
			System.out.println("��ħ�� ������ �� ���ΰ���?");
			System.out.println("1.��ħ�Ա� 2.����� 3.�ܹ��� ����ũ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("�Ĵ��� ��� �Ϻ�!");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("�������� �󸶳� �Դ°ž�!!");
					healthcnt += minfive;
					System.out.println("ü���� " + minfive + "����!");
					defend_vir += minfive;
					System.out.println("�鿪���� " + minfive + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("������ �Ĵ� ������ �!");
					healthcnt += five;
					System.out.println("ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("�ʹ� ���� �Ծ� �������� ��������....");
					healthcnt += minfive;
					System.out.println("ü���� " + minfive + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("������ ����Ҵ� ��� ��������!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("ü���� " + ten + "����!");
					System.out.println("�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("����Ҹ� �ؼ� �ټս��� �Ͼ��..");
					healthcnt += minten;

					System.out.println("ü���� " + minten + "����!");
					status();
				} else {
					System.out.println("������ ������ �̼����� �־�.....");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("ü���� " + five + "����!");
					System.out.println("�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("�ƴ�... ��Ʈ���ڸ� �ܹ��� ����ũ�� �� �ִ°���?");
					fun.timelate(1);
					System.out.println("�̰��� �Ұ� ���̷����� �׿���...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("ü���� " + minten + "����!");
					System.out.println("�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("����� ����ũ �߶��ϰ� �Ծ����!");
					healthcnt += five;
					System.out.println("ü���� " + five + "����!");
					status();
				} else {
					System.out.println("����ǰ 3������ ����ũ�� �Ծ���");
					fun.timelate(1);
					System.out.println("�ż��� ���� �����̴�");
					healthcnt += five;
					defend_vir += five;
					System.out.println("ü���� " + five + "����!");
					System.out.println("�鿪���� " + five + "����!");
					status();
				}

				break;
			} else {
				System.out.println("��");
			}
		}

	}

	public void nor_student_evening() {

		while (true) {
			System.out.println("���ɿ� ������ �� ���ΰ���?");
			System.out.println("1. �нĸԱ� 2. ����Ž�� 3. �����");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("����ϰ� ������ �Ծ����");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("�� �ǰ��� �� �ް����ϳ�?");
					fun.timelate(1);
					healthcnt += minfive;
					System.out.println("ü���� " + minfive + "����!");
					defend_vir += minfive;
					System.out.println("�鿪���� " + minfive + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("�����ϴ� ���ھֶ� ���� ��� �����̴�");
					fun.timelate(1);
					System.out.println("��� ������!");
					healthcnt += five;
					System.out.println("ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("��Ϸ��� ���� �ް����ڰ� ����Դ�");
					fun.timelate(1);
					System.out.println("�� �ھ���~");
					healthcnt += ten;
					System.out.println("ü���� " + ten + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("���� ��޽�Ų ����� ���� �� ����");
					System.out.println("�𸣰ڰ� ������� �ϴ� �Դ´�");
					defend_vir += minfive;
					System.out.println("�鿪�� " + minfive + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("��ħ�� ����ϰ� �Ծ����~");
					healthcnt += ten;
					System.out.println("ü���� " + ten + "����!");
					status();
				} else {
					System.out.println("��ħ�� �������� �ѽð� ���� �Ͼ��");
					System.out.println("���� �� ������� �ǰ��ϴ�");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("ü���� " + minfive + "����!");
					System.out.println("�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("�� ����~ 1���� ���ϰ� °�� �����");
					fun.timelate(1);
					System.out.println("�ʹ������Ѱ�?");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("ü���� " + ten + "����!");
					System.out.println("�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("�������� ȭ������ f�� ���");
					fun.timelate(1);
					System.out.println("�λ� ���� �� ����");
					defend_vir += minfive;
					System.out.println("�鿪���� " + minfive + "����!");
					status();
				} else {
					System.out.println("ǫ�ڰ� �Ͼ�µ� �ް��̾��ٰ� ī���� �Դ�");
					fun.timelate(1);
					System.out.println("������ ����������");
					healthcnt += five;
					defend_vir += ten;
					System.out.println("ü���� " + five + "����!");
					System.out.println("�鿪���� " + ten + "����!");
					status();
				}

				break;
			} else {
				System.out.println("�峭 ����!");
			}
		}

	}

	public int nor_student_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("�㿡�� ������ �Ұ��?");
				System.out.println("1.�����ñ� 2.Ŭ������ 3.�����ϱ�");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					alcol();

					break;
				} else if (choice.equals("2")) {
					alcol();
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("�����ϴ��� �����..");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("ü���� " + minten + "����!");
						defend_vir += minfive;
						System.out.println("�鿪���� " + minfive + "����!");
						status();
					} else if(rancnt==1) {
						System.out.println("���� �ؾ���..zzZZ~");
						System.out.println("���� �ϴٰ� �� ����� ���ߴ�.");
						fun.timelate(1);
						healthcnt += ten;
						System.out.println("ü���� " + ten + "����!");
						defend_vir += five;
						System.out.println("�鿪���� " + five + "����!");
						status();
					}
					
					else {
						System.out.println("�����ϴ� ���ھְ� ���� ��� �ش޶�� �ߴ�");
						System.out.println("���� 2�� �ϴ��� �����");
						System.out.print("����.. �׷��� �ູ��...");
						healthcnt += minten;
						System.out.println("ü���� " + minten + "����!");
						status();
					}
					break;
				} else {
					System.out.println("�ٸ޴ٸ� �ٸ޿�");
				}

			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("�ڷγ� �˻���..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println((corona_persent(defend_vir) * 100) / 100.00 + "%�� Ȯ���� �ڷγ��� �ɷȽ��ϴ�" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println((corona_persent(defend_vir) * 100) / 100.00 + "%�� Ȯ���� ���� ��Ƴ��ҽ��ϴ�." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public void nor_sport_morning() {
		omi_change();
		da_u_hang();
		only_hel();
		gori();
		witch();
		while (true) {
			System.out.println("��ħ�� ������ �� ���ΰ���?");
			System.out.println("1.��ħ�Ա� 2.����� 3.�ܹ��� ����ũ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("�Ĵ��� ��� �Ϻ�!");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("�������� �󸶳� �Դ°ž�!!");
					healthcnt += minfive;
					System.out.println("ü���� " + minfive + "����!");
					defend_vir += minfive;
					System.out.println("�鿪���� " + minfive + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("������ �Ĵ� ������ �!");
					healthcnt += five;
					System.out.println("ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("�ʹ� ���� �Ծ� �������� ��������....");
					healthcnt += minfive;
					System.out.println("ü���� " + minfive + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("������ ����Ҵ� ��� ��������!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("ü���� " + ten + "����!");
					System.out.println("�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("����Ҹ� �ؼ� �ټս��� �Ͼ��..");
					healthcnt += minten;

					System.out.println("ü���� " + minten + "����!");
					status();
				} else {
					System.out.println("������ ������ �̼����� �־�.....");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("ü���� " + five + "����!");
					System.out.println("�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("�ƴ�... ��Ʈ���ڸ� �ܹ��� ����ũ�� �� �ִ°���?");
					fun.timelate(1);
					System.out.println("�̰��� �Ұ� ���̷����� �׿���...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("ü���� " + minten + "����!");
					System.out.println("�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("����� ����ũ �߶��ϰ� �Ծ����!");
					healthcnt += five;
					System.out.println("ü���� " + five + "����!");
					status();
				} else {
					System.out.println("����ǰ 3������ ����ũ�� �Ծ���");
					fun.timelate(1);
					System.out.println("�ż��� ���� �����̴�");
					healthcnt += five;
					defend_vir += five;
					System.out.println("ü���� " + five + "����!");
					System.out.println("�鿪���� " + five + "����!");
					status();
				}

				break;
			} else {
				System.out.println("��");
			}
		}
	}

	public void nor_sport_evening() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "���ɿ� ������ �� ���ΰ���?");
			System.out.println("\t\t\t\t\t\t" + "1.���ɸԱ� 2.�߷� 3.�Ǹ�");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" + "����ϰ� ������ �Ծ����");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "ġ�õ��̶� �⸧�� ��¥���� �񺭸Ծ���");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "����� ���� ���������� �����ߴ�!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + five + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" + "�Ĵܰ������̶� �����常 �Ծ���.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "�������� ���⼭ ��...??");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minfive + "����!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "�� �� �� �� �� �� �� �� �� �� �� ��");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "������ ���� ���� ���ָ� �޾� �鿪�� ����!!");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minten + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "���� �� �װ��� ���� �θ�");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" + "������ �߿� ����߷����Ǵ�.....����");
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "���� ��ǥ�� ����Ƹ� �����ؼ��� ��̴�!");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "������ �Ǹ��� ����� �ƴұ�?");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "��� ������ ���ô� ���ɸ��� ������ ����");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minten + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" + "��ȣ��(������) 100�� ����");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "������ ��� ������ ���� �˴ϴ�.");
					healthcnt += ten;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "��ó ȣ�������� ������ �����Ϸ� ����.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "�������� ���������� �ɳɽ����ø� ���ߴ�");
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minten + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "�峭 ����!");
			}
		}

	}

	public int nor_sport_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" + "�㿡�� ������ �Ұ��?");
				System.out.println("\t\t\t\t\t\t" + "1.���ڱ� 2.Ŭ������ 3.�������� ��Ʃ�꺸��");
				choice = in.next();
				if (choice.equals("1")) {
					sleep();

					break;
				} else if (choice.equals("2")) {
					System.out.println("\t\t\t\t\t\t" + "��â�� Ŭ���� '�ｺ'Ŭ������");
					fun.timelate(1);
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" + "����ũ�� �����ϰ� ���Դ�..!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "����ũ�� �������� �͵� ��̴�");
						healthcnt += five;
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
						System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" + "�� ��ǥ�� ����Ƹ�");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "���� �ｺ�忡 ����̸���");
						healthcnt += ten;
						defend_vir += minten;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
						System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minten + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "ģ������ ��ȭ���Դ�");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "��...������...��ƾ�� ���� ���°�?");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
						status();
					}

					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" + "���Z������ ���� 4�ð��Ǿ���.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "\"���������̶� ���� �޴� �ڱ�...¥���آ�\"");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" + "���Z������ ���� 4�ð��Ǿ���.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "����ģ ������ �ټս��� �����մϴ�...");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + minten + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "�������� ��Ʃ��� �λ��� ������ �ȴ�!!");
						healthcnt += 5;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + healthcnt + "����!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" + "�ٸ޴ٸ� �ٸ޿�");
				}

			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
//			if (alcol_cnt == 3) {
//				end.hidden_Alcohol();
//				endcnt = 1;
//			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" + "�ڷγ� �˻���..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("\t\t\t\t\t\t" + "..");
			}
			System.out.println(" ");

			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(
						"\t\t\t\t\t\t" + (corona_persent(defend_vir) * 100) / 100.00 + "%�� Ȯ���� �ڷγ��� �ɷȽ��ϴ�" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(
						"\t\t\t\t\t\t" + (corona_persent(defend_vir) * 100) / 100.00 + "%�� Ȯ���� ���� ��Ƴ��ҽ��ϴ�." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public int backsin(int endcnt) {
		System.out.println("\t\t\t\t\t\t" + "������ ��� ������ ���̴�");
		System.out.println(" ");
		fun.timelate(1);
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "������ �ұ��?");
			System.out.println("\t\t\t\t\t\t" + "1.��Ÿ±� 2.��Ÿ±� 3.��Ÿ±�");
			choice = in.next();
			if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "ȭ����");
					System.out.println("\t\t\t\t\t\t" + "25��Ȯ��");
					rancnt = ran.nextInt(4);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" + "die");
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" + "����");

					}
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" + "�����");
					System.out.println("\t\t\t\t\t\t" + "33��Ȯ��");
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" + "die");
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" + "����");

					}
				}

				break;
			}

			else {
				System.out.println("\t\t\t\t\t\t" + "xxxxxxxxxxxx");
			}
		}

		return endcnt;
	}

	public void seoul_nur_mornig() {
		omi_change();
		da_u_hang();
		only_nur();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "��ħ�� ������ �� ���ΰ���?");
			System.out.println("\t\t\t\t\t\t" + "1.����ϱ� 2.�վİ� ����ϱ� 3.��ħ�� ����ϰ�");
			choice = in.next();
			if (choice.equals("\t\t\t\t\t\t" + "1")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "����� �ǰ��� �طӽ��ϴ�");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minfive + "����!");

					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "��ٱ濡 ���踦 ���� ���� Ÿ�� ���� �Խ��ϴ�!");
					System.out.println("\t\t\t\t\t\t" + "����� ��������!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" + "ü����" + five + "����!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "���� ȭ��ǿ��� ���������� �߰�!");
					System.out.println("\t\t\t\t\t\t" + "���� �׸� ������ �Ҿ���ȴ�...");
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minten + "����!");
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "�ǰ��� ì���!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + ten + "����!");
					status();
				}

				break;

			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "���� ���� ������ ���Ѱ� ����... ���� �̻��ϴ�...");
					healthcnt -= ten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minten + "����!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
					status();
				}

				else {
					System.out.println("\t\t\t\t\t\t" + "��ħ�� ���� ����� ��������!!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "�ٽð���� ����");
				fun.timelate(1);
			}
		}

	}

	public void seoul_nur_afternoon() {
		while (true) {
			System.out.println("���ɿ� ������ �Ұǰ���?");
			rancnt = ran.nextInt(10);
			if (rancnt == 0) {
				fun.timelate(1);
				System.out.println("������ �з���� ȯ�ڿ� ���� ���� ȯ�ڸ� ���� �Ǿ���.");
				fun.timelate(1);
				healthcnt += minten;
				System.out.println("ü���� " + minten + "����!");
				status();
				break;
			} else {
				System.out.println("1.��Ա� 2.�����ڱ� 3.���ٶ���");
				choice = in.next();
				if (choice.equals("1")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("���� ���ְ� �Ծ���!");
						healthcnt += ten;
						System.out.println("ü���� " + ten + "����!");
						status();
					} else {
						System.out.println("���� ���ϰ� �Դ� ü�ع��ȴ�...");
						healthcnt += minten;
						System.out.println("ü���� " + minten + "����!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("�����̾߸��� �����ְ��� �ð�!");
						healthcnt += five;
						System.out.println("ü���� " + five + "����!");
						defend_vir += five;
						System.out.println("�鿪���� " + five + "����!");
						status();
					} else {
						System.out.println("������ �� ����ȣ��Բ� ȥ����....");
						System.out.println("������ Ÿ���� �����");
						healthcnt += minfive;
						System.out.println("ü���� " + minfive + "����!");
						status();
					}
					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("���� ����ģ���� �����޽��� ��������ٳ� ����");
						fun.timelate(1);
						System.out.println("¦���̿���--(����ü�� ����)");
						healthcnt += minten;
						System.out.println("ü���� " + minten + "����!");
						status();
					} else {
						System.out.println("�ð������� �𸣰� �־���! �Ҽ��� �ູ");
						healthcnt += five;
						System.out.println("ü���� " + five + "����!");
						status();
					}
					break;
				} else {
					System.out.println("��");
					fun.timelate(1);
				}
			}

		}

	}

	public int seoul_nur_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("�㿡�� ������ �Ұ��?");
//				rancnt = ran.nextInt(2);
//				if (rancnt == 0) {
//					fun.timelate(1);
//					System.out.println("�׷��� ������ �߱��ϴ³� ��");
//					healthcnt += minten;
//					defend_vir += minfive;
//					System.out.println("ü���� " + minten + "����!");
//					System.out.println("�鿪���� " + minfive + "����!");
//					status(healthcnt, defend_vir);
//					break;
//				} else {
				System.out.println("1.���ڱ� 2.���Ա� 3.��Ʃ�꺸��");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					sleep();

					break;
				} else if (choice.equals("2")) {
					alcol();
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("���Z������ ���� 4�ð��Ǿ���.....");
						fun.timelate(1);
						System.out.println("�ϳ��� �������ھ���");
						healthcnt -= 10;
						System.out.println("ü���� " + minten + "����!");
						defend_vir -= 5;
						System.out.println("�鿪���� " + minfive + "����!");
						status();
					} else {
						System.out.println("������ ��Ʃ��� �λ��� ������ �ȴ�!!");
						healthcnt += 5;
						System.out.println("ü���� " + healthcnt + "����!");
						status();
					}
					break;
				} else {
					System.out.println("�ٸ޴ٸ� �ٸ޿�");
				}

//				}

			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("�ڷγ� �˻���..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println((corona_persent(defend_vir) * 100) / 100.00 + "%�� Ȯ���� �ڷγ��� �ɷȽ��ϴ�" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println((corona_persent(defend_vir) * 100) / 100.00 + "%�� Ȯ���� ���� ��Ƴ��ҽ��ϴ�." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;
	}

	public void nurse_baksin() {
		System.out.println("������ ��� ������ ���̴�");
		System.out.println(" ");
		fun.timelate(1);
		int cnt = 0;
		while (cnt == 0 || cnt == 1) {

			if (cnt == 0) {
				System.out.println("����ߴ�!!");
				fun.timelate(1);
			}
			if (cnt == 1) {
				System.out.println("���� �԰� �Դ�");
				fun.timelate(1);
			}
			System.out.println("������ �ұ�?");
			System.out.println("1.��� �����ֱ� 2.��� ����ֱ� 3.��� �����ֱ�");
			choice = in.next();
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("ȯ�� ����! ��� ȯ�ڰ� �ʹ� �����ϴ�!!");
				healthcnt += minfive;
				status();
			} else {
				System.out.println("������ ȯ�ڰ� ���� �Ȱ�Ŵ� ����!");
				healthcnt += five;
				status();
			}
			cnt++;
		}
		while (true) {
			System.out.println("�����̴�...");
			fun.timelate(1);
			System.out.println("1.��� �����ֱ� 2.��� �����ֱ� 3.���Ա�");
			choice = in.next();
			if (choice.equals("3")) {
				alcol();
				break;
			} else if (choice.equals("1") || choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("ȯ�� ����! ��� ȯ�ڰ� �ʹ� �����ϴ�!!");
					healthcnt += minfive;
					status();
				} else {
					System.out.println("������ ȯ�ڰ� ���� �Ȱ�Ŵ� ����!");
					healthcnt += five;
					status();
				}
				break;
			} else {
				System.out.println("���� �� �ֱ⼱���� �̰Ǹ𸣰ٿ� ����");
			}
		}
	}

	public void status() {

		System.out.println("================================");
		System.out.println("ü�� >> " + healthcnt);
		System.out.println("���� ���׷� >> " + defend_vir);
		System.out.println("================================");
		System.out.println(" ");

		fun.timelate(1);

	}

	public void sleep() {
		rancnt = ran.nextInt(3);
		System.out.println("�������");
		fun.timelate(1);
		if (rancnt == 0) {

			System.out.println("������ ���");
			fun.timelate(1);
			System.out.println("ü���� " + ten + "����!");
			System.out.println("�鿪���� " + ten + "����!");
			healthcnt += ten;
			defend_vir += ten;
			status();
		} else if (rancnt == 1) {
			System.out.println("�Ǹ��� �f��");
			fun.timelate(1);
			System.out.println("�ͽ��� ���켺 �Źξƴ�...��...������");
			healthcnt += five;
			System.out.println("ü���� " + five + "����!");
			status();
		} else {
			System.out.println("������ ����");
			fun.timelate(1);
			System.out.println("ü���� " + minten + "����!");
			healthcnt += minten;
			defend_vir += ten;
			System.out.println("�鿪���� " + minten + "����!");
			status();
		}

	}

	public void alcol() {
		alcol_cnt++;
		System.out.println("�����Դ´�?");
		rancnt = ran.nextInt(2);
		if (rancnt == 0) {
			System.out.println("���� ������ ���ڿ÷� �ҵ��Ͽ���.");
			healthcnt += five;
			defend_vir += five;
			System.out.println("ü���� " + five + "����!");
			System.out.println("�鿪���� " + five + "����!");
			status();

		} else {
			System.out.println("������ ���ִ� �ǰ��� �ط���..");
			healthcnt += minfive;
			defend_vir += five;
			System.out.println("�鿪���� " + five + "����!");
			System.out.println("ü���� " + minfive + "����!");
			status();
		}
	}

	public double corona_persent(double defend_vir) {
//		double corona_persent = 0;
//		double corona_persent =100;
		if (defend_vir >= 100) {
			double corona_persent = 0;
			return corona_persent;
		} else if (defend_vir <= 0) {
			double corona_persent = 10;
			return corona_persent;
		} else {
			double corona_persent = 10 - (10 * (defend_vir / 100));
			return corona_persent;
		}
	}

}
