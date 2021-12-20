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
	String a = "수도";
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
		if (b.equals("지방")) {
			return a = "지방";
		} else if (b.equals("강원")) {
			return a = "강원";
		} else {
			return a = "수도";
		}

	}

	public void witch() {
		if (a.equals("지방") && x == 0) {
			defend_vir += 15;
			x++;
		}
		if (a.equals("강원") && x == 0) {
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
			System.out.println("아침에 무엇을 할 것인가요?");
			System.out.println("1.아침먹기 2.유산소 3.단백질 쉐이크");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("식단은 운동의 일부!");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("돼지새기 얼마나 먹는거야!!");
					healthcnt += minfive;
					System.out.println("체력이 " + minfive + "증가!");
					defend_vir += minfive;
					System.out.println("면역력이 " + minfive + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("적당한 식단 적당한 운동!");
					healthcnt += five;
					System.out.println("체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("너무 적게 먹어 공복감이 느껴진다....");
					healthcnt += minfive;
					System.out.println("체력이 " + minfive + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("적당한 유산소는 운동의 시작이지!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("체력이 " + ten + "증가!");
					System.out.println("면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("유산소만 해서 근손실이 일어났다..");
					healthcnt += minten;

					System.out.println("체력이 " + minten + "증가!");
					status();
				} else {
					System.out.println("하지만 오늘은 미세먼지 최악.....");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("체력이 " + five + "증가!");
					System.out.println("면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("아니... 민트초코맛 단백질 쉐이크가 왜 있는거지?");
					fun.timelate(1);
					System.out.println("미각을 잃고 바이러스를 죽였따...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("체력이 " + minten + "증가!");
					System.out.println("면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("든든한 쉐이크 뜨뜻하게 먹어야지!");
					healthcnt += five;
					System.out.println("체력이 " + five + "증가!");
					status();
				} else {
					System.out.println("신제품 3가지맛 쉐이크를 먹었다");
					fun.timelate(1);
					System.out.println("신선한 맛의 세계이다");
					healthcnt += five;
					defend_vir += five;
					System.out.println("체력이 " + five + "증가!");
					System.out.println("면역력이 " + five + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("힝");
			}
		}

	}

	public void nor_student_evening() {

		while (true) {
			System.out.println("점심에 무엇을 할 것인가요?");
			System.out.println("1. 학식먹기 2. 맛집탐방 3. 놀러가기");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("든든하게 점심을 먹어야지");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("아 피곤해 ㅠ 휴강안하나?");
					fun.timelate(1);
					healthcnt += minfive;
					System.out.println("체력이 " + minfive + "증가!");
					defend_vir += minfive;
					System.out.println("면역력이 " + minfive + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("좋아하는 여자애랑 같이 듣는 수업이다");
					fun.timelate(1);
					System.out.println("언능 가야지!");
					healthcnt += five;
					System.out.println("체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("등교하려던 찰나 휴강문자가 날라왔다");
					fun.timelate(1);
					System.out.println("더 자야지~");
					healthcnt += ten;
					System.out.println("체력이 " + ten + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("전날 배달시킨 찜닭이 상한 것 같다");
					System.out.println("모르겠고 배고프니 일단 먹는다");
					defend_vir += minfive;
					System.out.println("면역력 " + minfive + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("아침은 든든하게 먹어야지~");
					healthcnt += ten;
					System.out.println("체력이 " + ten + "증가!");
					status();
				} else {
					System.out.println("아침을 먹으려고 한시간 일찍 일어났다");
					System.out.println("잠을 잘 못잤더니 피곤하다");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("체력이 " + minfive + "증가!");
					System.out.println("면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("아 몰라~ 1교시 쿨하게 째고 더잤다");
					fun.timelate(1);
					System.out.println("너무개운한걸?");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("체력이 " + ten + "증가!");
					System.out.println("면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("교수님이 화가나서 f를 줬다");
					fun.timelate(1);
					System.out.println("인생 망한 것 같다");
					defend_vir += minfive;
					System.out.println("면역력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("푹자고 일어났는데 휴강이었다고 카톡이 왔다");
					fun.timelate(1);
					System.out.println("마음이 편한해졌다");
					healthcnt += five;
					defend_vir += ten;
					System.out.println("체력이 " + five + "증가!");
					System.out.println("면역력이 " + ten + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("장난 멈춰!");
			}
		}

	}

	public int nor_student_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("밤에는 무엇을 할고야?");
				System.out.println("1.술마시기 2.클럽가기 3.과제하기");
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
						System.out.println("과제하느라 밤샜다..");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("체력이 " + minten + "증가!");
						defend_vir += minfive;
						System.out.println("면역력이 " + minfive + "증가!");
						status();
					} else if(rancnt==1) {
						System.out.println("과제 해야지..zzZZ~");
						System.out.println("과제 하다가 잠 들었다 망했다.");
						fun.timelate(1);
						healthcnt += ten;
						System.out.println("체력이 " + ten + "증가!");
						defend_vir += five;
						System.out.println("면역력이 " + five + "증가!");
						status();
					}
					
					else {
						System.out.println("좋아하는 여자애가 과제 대신 해달라고 했다");
						System.out.println("과제 2개 하느라 밤샜다");
						System.out.print("헤헤.. 그래도 행복해...");
						healthcnt += minten;
						System.out.println("체력이 " + minten + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("다메다메 다메요");
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
			System.out.print("코로나 검사중..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println((corona_persent(defend_vir) * 100) / 100.00 + "%의 확률로 코로나에 걸렸습니다" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println((corona_persent(defend_vir) * 100) / 100.00 + "%의 확률을 피해 살아남았습니다." + "\n");
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
			System.out.println("아침에 무엇을 할 것인가요?");
			System.out.println("1.아침먹기 2.유산소 3.단백질 쉐이크");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("식단은 운동의 일부!");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("돼지새기 얼마나 먹는거야!!");
					healthcnt += minfive;
					System.out.println("체력이 " + minfive + "증가!");
					defend_vir += minfive;
					System.out.println("면역력이 " + minfive + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("적당한 식단 적당한 운동!");
					healthcnt += five;
					System.out.println("체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("너무 적게 먹어 공복감이 느껴진다....");
					healthcnt += minfive;
					System.out.println("체력이 " + minfive + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("적당한 유산소는 운동의 시작이지!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("체력이 " + ten + "증가!");
					System.out.println("면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("유산소만 해서 근손실이 일어났다..");
					healthcnt += minten;

					System.out.println("체력이 " + minten + "증가!");
					status();
				} else {
					System.out.println("하지만 오늘은 미세먼지 최악.....");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("체력이 " + five + "증가!");
					System.out.println("면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("아니... 민트초코맛 단백질 쉐이크가 왜 있는거지?");
					fun.timelate(1);
					System.out.println("미각을 잃고 바이러스를 죽였따...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("체력이 " + minten + "증가!");
					System.out.println("면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("든든한 쉐이크 뜨뜻하게 먹어야지!");
					healthcnt += five;
					System.out.println("체력이 " + five + "증가!");
					status();
				} else {
					System.out.println("신제품 3가지맛 쉐이크를 먹었다");
					fun.timelate(1);
					System.out.println("신선한 맛의 세계이다");
					healthcnt += five;
					defend_vir += five;
					System.out.println("체력이 " + five + "증가!");
					System.out.println("면역력이 " + five + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("힝");
			}
		}
	}

	public void nor_sport_evening() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "점심에 무엇을 할 것인가요?");
			System.out.println("\t\t\t\t\t\t" + "1.점심먹기 2.중량 3.맨몸");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" + "든든하게 점심을 먹어야지");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "치팅데이라 기름진 간짜장을 비벼먹었다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "기분이 좋아 감성근육이 증가했다!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + five + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" + "식단관리중이라 샐러드만 먹었다.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "벌레형이 여기서 왜...??");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minfive + "증가!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "닭 가 슴 살 닭 가 슴 살 닭 가 슴 살");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "가슴이 없는 닭의 저주를 받아 면역력 감소!!");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minten + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "멋진 등 그것은 나의 로망");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" + "덤벨을 발에 떨어뜨려버렷다.....젠장");
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "나의 목표는 언더아머 무리해서라도 운동이다!");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "진정한 맨몸은 등산이 아닐까?");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "등산 끝나고 마시는 막걸리는 못참지 ㅋㅋ");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minten + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" + "무호흡(無呼吸) 100연 버피");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "과도한 운동은 오히러 득이 됩니다.");
					healthcnt += ten;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "근처 호수공원에 간단히 조깅하러 갔다.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "지나가는 길고양이한테 냥냥슬래시를 당했다");
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minten + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "장난 멈춰!");
			}
		}

	}

	public int nor_sport_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" + "밤에는 무엇을 할고야?");
				System.out.println("\t\t\t\t\t\t" + "1.잠자기 2.클럽가기 3.종국이형 유튜브보기");
				choice = in.next();
				if (choice.equals("1")) {
					sleep();

					break;
				} else if (choice.equals("2")) {
					System.out.println("\t\t\t\t\t\t" + "헬창의 클럽은 '헬스'클럽이지");
					fun.timelate(1);
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" + "마스크를 깜빡하고 나왔다..!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "마스크를 가져오는 것도 운동이다");
						healthcnt += five;
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
						System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" + "내 목표는 언더아머");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "오늘 헬스장에 사람이많네");
						healthcnt += ten;
						defend_vir += minten;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
						System.out.println("\t\t\t\t\t\t" + "면역력이 " + minten + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "친구한테 전화가왔다");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "하...하지만...루틴을 깰순 없는걸?");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
						status();
					}

					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" + "유튭을보다 새볔 4시가되었다.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "\"종국이형이랑 같이 받는 자극...짜릿해♡\"");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" + "유튭을보다 새볔 4시가되었다.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "지나친 늦잠은 근손실을 유발합니다...");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + minten + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "종국이형 유튜브는 인생에 도움이 된다!!");
						healthcnt += 5;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + healthcnt + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" + "다메다메 다메요");
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
			System.out.print("\t\t\t\t\t\t" + "코로나 검사중..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("\t\t\t\t\t\t" + "..");
			}
			System.out.println(" ");

			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(
						"\t\t\t\t\t\t" + (corona_persent(defend_vir) * 100) / 100.00 + "%의 확률로 코로나에 걸렸습니다" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(
						"\t\t\t\t\t\t" + (corona_persent(defend_vir) * 100) / 100.00 + "%의 확률을 피해 살아남았습니다." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public int backsin(int endcnt) {
		System.out.println("\t\t\t\t\t\t" + "오늘은 백신 접종의 날이다");
		System.out.println(" ");
		fun.timelate(1);
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "무엇을 할까요?");
			System.out.println("\t\t\t\t\t\t" + "1.백신맞기 2.백신맞기 3.백신맞기");
			choice = in.next();
			if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "화이자");
					System.out.println("\t\t\t\t\t\t" + "25퍼확률");
					rancnt = ran.nextInt(4);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" + "die");
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" + "생존");

					}
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" + "모더나");
					System.out.println("\t\t\t\t\t\t" + "33퍼확률");
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" + "die");
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" + "생존");

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
			System.out.println("\t\t\t\t\t\t" + "아침에 무엇을 할 것인가요?");
			System.out.println("\t\t\t\t\t\t" + "1.출근하기 2.손씻고 출근하기 3.아침은 든든하게");
			choice = in.next();
			if (choice.equals("\t\t\t\t\t\t" + "1")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "출근은 건강에 해롭습니다");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minfive + "증가!");

					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "출근길에 선배를 만나 차를 타고 같이 왔습니다!");
					System.out.println("\t\t\t\t\t\t" + "기분이 좋아졌다!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" + "체력이" + five + "증가!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "세상에 화장실에서 바퀴벌레를 발견!");
					System.out.println("\t\t\t\t\t\t" + "나는 그만 정신을 잃어버렸다...");
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minten + "증가!");
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "건강을 챙겻따!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + ten + "증가!");
					status();
				}

				break;

			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "전날 남긴 음식이 상한거 같다... 맛이 이상하다...");
					healthcnt -= ten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minten + "증가!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
					status();
				}

				else {
					System.out.println("\t\t\t\t\t\t" + "아침은 역시 든든한 국밥이지!!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "다시골라조 뿌잉");
				fun.timelate(1);
			}
		}

	}

	public void seoul_nur_afternoon() {
		while (true) {
			System.out.println("점심엔 무엇을 할건가요?");
			rancnt = ran.nextInt(10);
			if (rancnt == 0) {
				fun.timelate(1);
				System.out.println("하지만 밀려드는 환자에 의해 나는 환자를 보게 되었다.");
				fun.timelate(1);
				healthcnt += minten;
				System.out.println("체력이 " + minten + "증가!");
				status();
				break;
			} else {
				System.out.println("1.밥먹기 2.낮잠자기 3.수다떨기");
				choice = in.next();
				if (choice.equals("1")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("밥을 맛있게 먹었다!");
						healthcnt += ten;
						System.out.println("체력이 " + ten + "증가!");
						status();
					} else {
						System.out.println("밥을 급하게 먹다 체해버렸다...");
						healthcnt += minten;
						System.out.println("체력이 " + minten + "증가!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("쪽잠이야말로 세계최고의 시간!");
						healthcnt += five;
						System.out.println("체력이 " + five + "증가!");
						defend_vir += five;
						System.out.println("면역력이 " + five + "증가!");
						status();
					} else {
						System.out.println("늦잠을 자 수간호사님께 혼났다....");
						System.out.println("정신적 타격이 생겼다");
						healthcnt += minfive;
						System.out.println("체력이 " + minfive + "증가!");
						status();
					}
					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("저년 남자친구가 에르메스를 선물해줬다네 참나");
						fun.timelate(1);
						System.out.println("짝퉁이여라--(감성체력 감소)");
						healthcnt += minten;
						System.out.println("체력이 " + minten + "증가!");
						status();
					} else {
						System.out.println("시간가는줄 모르고 있었따! 소소한 행복");
						healthcnt += five;
						System.out.println("체력이 " + five + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("잉");
					fun.timelate(1);
				}
			}

		}

	}

	public int seoul_nur_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("밤에는 무엇을 할고야?");
//				rancnt = ran.nextInt(2);
//				if (rancnt == 0) {
//					fun.timelate(1);
//					System.out.println("그러나 오늘은 야근하는날 ★");
//					healthcnt += minten;
//					defend_vir += minfive;
//					System.out.println("체력이 " + minten + "증가!");
//					System.out.println("면역력이 " + minfive + "증가!");
//					status(healthcnt, defend_vir);
//					break;
//				} else {
				System.out.println("1.잠자기 2.술먹기 3.유튜브보기");
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
						System.out.println("유튭읇보다 새볔 4시가되었다.....");
						fun.timelate(1);
						System.out.println("하나만 더보고자야지");
						healthcnt -= 10;
						System.out.println("체력이 " + minten + "증가!");
						defend_vir -= 5;
						System.out.println("면역력이 " + minfive + "증가!");
						status();
					} else {
						System.out.println("적당한 유튜브는 인생에 도움이 된다!!");
						healthcnt += 5;
						System.out.println("체력이 " + healthcnt + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("다메다메 다메요");
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
			System.out.print("코로나 검사중..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println((corona_persent(defend_vir) * 100) / 100.00 + "%의 확률로 코로나에 걸렸습니다" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println((corona_persent(defend_vir) * 100) / 100.00 + "%의 확률을 피해 살아남았습니다." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;
	}

	public void nurse_baksin() {
		System.out.println("오늘은 백신 접종의 날이다");
		System.out.println(" ");
		fun.timelate(1);
		int cnt = 0;
		while (cnt == 0 || cnt == 1) {

			if (cnt == 0) {
				System.out.println("출근했다!!");
				fun.timelate(1);
			}
			if (cnt == 1) {
				System.out.println("밥을 먹고 왔다");
				fun.timelate(1);
			}
			System.out.println("무엇을 할까?");
			System.out.println("1.백신 놓아주기 2.백신 놀아주기 3.백신 놓아주기");
			choice = in.next();
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("환자 폭주! 백신 환자가 너무 많습니다!!");
				healthcnt += minfive;
				status();
			} else {
				System.out.println("오늘은 환자가 별로 안계신다 히히!");
				healthcnt += five;
				status();
			}
			cnt++;
		}
		while (true) {
			System.out.println("저녘이다...");
			fun.timelate(1);
			System.out.println("1.백신 놓아주기 2.백신 놓아주기 3.술먹기");
			choice = in.next();
			if (choice.equals("3")) {
				alcol();
				break;
			} else if (choice.equals("1") || choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("환자 폭주! 백신 환자가 너무 많습니다!!");
					healthcnt += minfive;
					status();
				} else {
					System.out.println("오늘은 환자가 별로 안계신다 히히!");
					healthcnt += five;
					status();
				}
				break;
			} else {
				System.out.println("응애 나 애기선택지 이건모르겟오 응애");
			}
		}
	}

	public void status() {

		System.out.println("================================");
		System.out.println("체력 >> " + healthcnt);
		System.out.println("감염 저항률 >> " + defend_vir);
		System.out.println("================================");
		System.out.println(" ");

		fun.timelate(1);

	}

	public void sleep() {
		rancnt = ran.nextInt(3);
		System.out.println("잠을잤다");
		fun.timelate(1);
		if (rancnt == 0) {

			System.out.println("꿀잠을 잤다");
			fun.timelate(1);
			System.out.println("체력이 " + ten + "증가!");
			System.out.println("면역력이 " + ten + "증가!");
			healthcnt += ten;
			defend_vir += ten;
			status();
		} else if (rancnt == 1) {
			System.out.println("악몽을 꿧다");
			fun.timelate(1);
			System.out.println("귀신이 정우성 신민아다...오...ㄱㅇㄷ");
			healthcnt += five;
			System.out.println("체력이 " + five + "증가!");
			status();
		} else {
			System.out.println("몸살이 났다");
			fun.timelate(1);
			System.out.println("체력이 " + minten + "증가!");
			healthcnt += minten;
			defend_vir += ten;
			System.out.println("면역력이 " + minten + "증가!");
			status();
		}

	}

	public void alcol() {
		alcol_cnt++;
		System.out.println("술을먹는다?");
		rancnt = ran.nextInt(2);
		if (rancnt == 0) {
			System.out.println("몸과 마음을 알코올로 소독하였다.");
			healthcnt += five;
			defend_vir += five;
			System.out.println("체력이 " + five + "증가!");
			System.out.println("면역력이 " + five + "증가!");
			status();

		} else {
			System.out.println("과도한 음주는 건강에 해롭지..");
			healthcnt += minfive;
			defend_vir += five;
			System.out.println("면역력이 " + five + "증가!");
			System.out.println("체력이 " + minfive + "증가!");
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
