package Projects.com.pagelogin;

public class PrimeNumber {

	public static void main(String args[]) {

		int i, s = 0, flag = 0;
		int t = 3;
		s = t / 2;
		if (t == 0 || t == 1) {
			System.out.println(t + " is not prime number");
		} else {
			for (i = 2; i <= s; i++) {
				if (t % i == 0) {
					System.out.println(t + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(t + " is prime number");
			}
		}
	}
}
