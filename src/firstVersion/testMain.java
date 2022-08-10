package firstVersion;



public class testMain {

	public static void main(String[] args) {

		int[] order = { 100, 200, 150, 200 };
		int total_weight = 0;
		int total_volume = 0;

		for (int i = 0; i < order.length; i++) {
			if (i == 0) {

				total_weight += (order[i] * 6500);
				total_volume += (order[i] * 60 * 50 * 50);
			}

			else if (i == 1) {
				total_weight += (order[i] * 200);
				total_volume += (order[i] * 30 * 30 * 20);
			}

			else if (i == 2) {
				total_weight += (order[i] * 20000);
				total_volume += (order[i] * 100 * 150 * 50);
			}

			else if (i == 3) {
				total_weight += (order[i] * 2600);
				total_volume += (order[i] * 120 * 140 * 80);
			}

		}
		System.out.println("Total weight: " + total_weight + " grams");
		System.out.println("Total volume: " + total_volume + " cm3");

		double big_container_volume = 2.59 * 2.43 * 12.01;
		double small_container_volume = 2.59 * 2.43 * 6.06;

		if (total_volume <= big_container_volume) {
			System.out.println("Number of big containers required: 1");
		}

		else {
			if (total_volume <= (big_container_volume + small_container_volume)) {
				System.out.println("Number of big containers required: 1");
				System.out.println("Number of small containers required: 1");
			}

			else {
				int num_big_containers = (int) Math.ceil((double) total_volume / big_container_volume);
				System.out.println("Number of big containers required: " + num_big_containers); 
				

			}

			if (total_weight <= 500000) {
				System.out.println("Shipping cost: 1000 Euros");

			} else {
				System.out.println("Shipping cost: 1200 Euros");

			}

		}

	}

}