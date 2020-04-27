public class Cycle{
	public static void main(String[] args) {
		System.out.println("For:");

		for(int i = 0;i<=20;i++) {
			System.out.print(i + " ");
		}

		System.out.println("");
		System.out.println("While:");

		int i = 6;
		while(i >= -6) {
			System.out.print(i + " ");
			i = i - 2;
		}

		System.out.println("");
		System.out.println("Do while:");

		int j = 10;
		int result = 0;
		do {
			if (j%2 != 0){
				result = result + j;
			}
			j++;
		} while(j<=20);

		System.out.println(result);


	}
}