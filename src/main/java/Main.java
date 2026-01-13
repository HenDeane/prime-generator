public class Main {

	public int generatePrime() {
		int randomNum = (int)(Math.random() * 1001); // 0 to 1000
		int primeNum = 3;
		boolean isNotPrime = true;
		while (isNotPrime) {
			for (int i = 2; i < randomNum; i++) {
				if (randomNum % i == 0) {
					randomNum = (int)(Math.random() * 1001); // 0 to 1000
				else {
					primeNum = randomNum;
					isNotPrime = false;
				}
			}
		}
		return primeNum;
	}

	public static void main(String... args) {
		Main primeGenerator = new Main();
		System.out.println(primeGenerator.generatePrime());
	}

}