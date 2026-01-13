public class Main {

	public int generatePrime() {
		int randomNum = (int)(Math.random() * 998 + 3); // 2 to 1000
		boolean isNotPrime = true;
    
		while (isNotPrime) {
			isNotPrime = false;
			for (int i = 2; i <= Math.sqrt(randomNum); i++) {
				if (randomNum % i == 0) {
					randomNum = (int)(Math.random() * 998 + 3);
					isNotPrime = true;
					break; // Exit the for loop and restart checking the new number
				}
			}
		}
		return randomNum;
	}

	public static void main(String... args) {
		Main primeGenerator = new Main();
		System.out.println(primeGenerator.generatePrime());
	}

}