public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");
	}

	public class MelonType{

		MelonType musk = new MelonType(
				"musk",
				"Muskmelon",
				1998,
				"green",
				True,
				True
		);
		MelonType casaba = new MelonType(
				"cas",
				"Casaba",
				2003,
				"orange",
				False,
				False
		);
		MelonType crenshaw = new MelonType(
				"cren",
				"Crenshaw",
				1996,
				"green",
				False,
				False
		);
		MelonType yellowWatermelon = new MelonType(
				"yw",
				"Yellow Watermelon",
				2013,
				"yellow",
				False,
				True
		);

		MelonType[] melonTypes = new MelonType[musk,casaba,crenshaw,yellowWatermelon];
		for (int i =0;i < melonTypes.length; i++)
		{
			System.out.println(melonTypes[i]);
		}

	}

}
