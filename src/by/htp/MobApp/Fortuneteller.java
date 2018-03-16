package by.htp.MobApp;

import java.util.HashMap;
import java.util.Map;

public class Fortuneteller extends Flower {

	public Fortuneteller(int petal) {
		super(petal);

	}

	Map<String, String> hashMap = new HashMap<>();

	public void futuretelling(Client client) {
		if (petal > 0) {
			if (hashMap.containsKey(client.name)) {
				System.out.println("Fortuneteller has already worked for you today!");
				{
				}
			} else {
				hashMap.put(client.name, client.type_futuretelling);
				System.out.println(
						"Telling the future to client " + client.name + " for the " + client.type_futuretelling);
				petal = petal - 1;
				System.out.println("Now the future teller has " + petal + " petals");
			}
		} else {
			System.out.println("The future teller has no more petals! You'd better go away!");

		}
	}

}
