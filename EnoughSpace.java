/******************************************************************************
 * 
 * The Story: Bob is working as a bus driver. However, he has become extremely
 * popular amongst the city's residents. With so many passengers wanting to get
 * aboard his bus, he sometimes has to face the problem of not enough space left
 * on the bus! He wants you to write a simple program telling him if he will be
 * able to fit all the passengers.
 * 
 * Task Overview: You have to write a function that accepts three parameters:
 * 
 * cap is the amount of people the bus can hold excluding the driver. on is the
 * number of people on the bus. wait is the number of people waiting to get on
 * to the bus. If there is enough space, return 0, and if there isn't, return
 * the number of passengers he can't take.
 * 
 * enough(10, 5, 5) 0 -- He can fit all 5 passengers enough(100, 60, 50) 10 --
 * He can't fit 10 of the 50 waiting
 *******************************************************************************/

public class EnoughSpace {

	public static void main(String[] args) {
		
		int check = enough(10, 5, 5);
		System.out.println(check); // 0

		check = enough2(10, 5, 5);
		System.out.println(check); // 0

		check = enough3(10, 5, 5);
		System.out.println(check); // 0
	}

	public static int enough(int cap, int on, int wait) {

		if (cap > (on + wait)) {
			return (on + wait) - cap;
		}
		if (cap < (on + wait)) {
			return (on + wait) - cap;
		}
		if (cap == (on + wait)) {
			return 0;
		}
		return -1;
	}

	public static int enough2(int cap, int on, int wait) {

		return (cap - on + wait <= 0) ? 0 : (on + wait - cap);

	}

	public static int enough3(int cap, int on, int wait) {

		return Math.max(0, on + wait - cap);

	}

}