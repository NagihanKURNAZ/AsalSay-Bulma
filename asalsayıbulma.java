
public class asalsayıbulma {

	public static void main(String[] args) {

				int number = 25;
				int remainder = number % 2;
				System.out.println(remainder);
				boolean IsPrime = true;

				if (number == 1) {
					System.out.println("sayı asal değildir");
					return;
				}

				if (number < 1) {
					System.out.println("geçersiz sayı");
				}

				for (int i = 2; i < number; i++)
					if (number % i == 0) {
						IsPrime = false;

					}

				if (IsPrime == true) {
					System.out.println("sayı asaldır");
				} else {
					System.out.println("sayı asal değildir");
				}
			}

		
		
	}

