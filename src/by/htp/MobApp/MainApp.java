package by.htp.MobApp;

public class MainApp {

	public static void main(String[] args) {

		int s = (int) (Math.random() * 10);
		Fortuneteller ft = new Fortuneteller(s);
		System.out.println("The futureteller has " + s + " petals.");

		Client client1 = new Client("James", "Love");
		Client client2 = new Client("Peter", "Career");
		Client client3 = new Client("Sandra", "Lover");
		Client client4 = new Client("Jack", "Luxurious life");
		Client client5 = new Client("Pat", "Lottery prize");

		ft.futuretelling(client5);
		ft.futuretelling(client4);
		ft.futuretelling(client3);
		ft.futuretelling(client4);

	}

}
