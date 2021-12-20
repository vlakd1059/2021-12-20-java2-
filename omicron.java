package gagame;

public class omicron {

	static int ten;
	static int five;
	static int minfive;
	static int minten;

	// int x = 0;

	public static void omicron_cnt(int x) {
		if (x == 0) {
			five = 5;
			minfive = -5;
			ten = 10;
			minten = -10;

		} else {
			ten = 8;
			five = 3;
			minfive = -7;
			minten = -12;

		}
	}
	public static void dae_u_hang(int x) {
		if(x==1) {
			ten -= 2;
			five -= 2;
			minfive -= 2;
			minten -=2 ;

			
		}
	}

	public static void goridugi(int x, int y) {
		if (x == 1) {
			ten -=(1*y);
			five-=(1*y);
			minfive-=(1*y);
			minten -=(1*y);
		}

	}

	public void setTen(int ten) {
		omicron.ten = ten;
	}

	public int getTen() {
		return ten;
	}

	public void setFive(int five) {
		omicron.five = five;
	}

	public int getFive() {
		return five;
	}

	public void setMinfive(int minfive) {
		omicron.minfive = minfive;
	}

	public int getMinfive() {
		return minfive;
	}

	public void setMinten(int minten) {
		omicron.minten = minten;
	}

	public int getMinten() {
		return minten;
	}

}