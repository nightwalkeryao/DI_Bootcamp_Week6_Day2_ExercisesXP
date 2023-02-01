
public class Exercise2 {

	public static void main(String[] args) {
		int n = 7;
		String line = "";
		for (int i = 1; i <= n; i++) {
			line = "";
			for (int j = 1; j <= i; j++) {
				line += i;
			}
			System.out.println(line);
		}
	}
}
