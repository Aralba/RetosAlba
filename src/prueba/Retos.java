package prueba;

public class Retos {

	//RETO 17-10-2018 
		//En el método "calNumMenor", hacerlo con 7 variables
		public static int calNumMenor(int x, int y, int z, int w) {
			if (x < y)
				if (x < z)
					if (x < w)
						return x;
					else
						return w;
				else
					if (z < w)
						return z;
					else
						return w;
			else 
				if (y < z)
					if (y < w)
						return y;
					else
						return w;
				else
					return z;

		}

		public static void main(String[] args) {
		
			//
			int a = 7, b = 10, c = 5, d = 6;

			System.out.println("el menor es : " + calNumMenor(a, b, c, d));
}
}
