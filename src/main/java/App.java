/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
	public boolean isPrime(long number){
		double max = Math.sqrt(number)+1;
		if(number ==2)
			return true;
		if(number % 2==0)
			return false;
		for(long i =3 ; i<max ; i +=2){
			if(number % i ==0){
				return false;
			}
		}
		return true;
	}
	public void printPrimeFactors(long number){
		int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
	}
	public void printPrimeFactors(long number,long n2){
		int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = n; i <= n2; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
	}
	

    public static void main(String[] args) {
		if (args.length <1 || args.length >1){
			System.out.println("plz input number");
			System.exit(0);
		}
		App appObj = new App();
		long input =Long.parseLong(args[0]);
        System.out.println(appObj.isPrime(input));
		if (args.length <1 || args.length >1){
			System.out.println("plz input number");
			System.exit(0);
		}
		input =Long.parseLong(args[0]);
		System.out.println(printPrimeFactors(input));
    }
}
