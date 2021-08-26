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

		//adding harvest
		//field data type, shape rating,color rating, harvest field #, harvested by..
		public class Melon{


			Melon melon1 = new Melon(melonTypes[3], 8, 7, 2, 'Sheila');

			Melon melon2 = new Melon(melonTypes[3], 3, 4, 2, 'Sheila');

			Melon melon3 = new Melon(melonTypes[1], 10, 6, 35, 'Sheila');

			Melon melon4 = new Melon(melonTypes[2], 8, 9, 35, 'Michael');

			Melon melon5 = new Melon(melonTypes[2], 8, 2, 35, 'Michael');

			Melon melon6 = new Melon(melonTypes[0], 6, 7, 4, 'Michael');

			Melon melon7 = new Melon(melonTypes[3], 7, 10, 3, 'Sheila');

			//melon behaviors -sellable/not sellable
			//if both index 1 and 2 are greater than 5 && index 3 is != 3
			public boolean isSellable(){
				this.Melon = Melon
				for (int i =0;i < melonTypes.length; i++){
					if (Melon[1,2] >5 && Melon[3] !=3){
						return true
					}else{
						return false
					}
				}

			}

		}//end of Melon class


	}//end of MelonType class

}//end of Main
