
public class Main{

	public static void main(String[] args){

		
		int a = 1;
		float b = 2.0f;
		double c = 3.0f;
		String d = "Ola";
		boolean e = true;

		System.out.println("hello world");
		
		//na programação orientada a objetos, um objeto é uma representaçãode uma entidade do mundo real


		if(a ==1){
			System.out.println("a e igual a 1");
		} else{
			System.out.println("a e diferente de 1");
		}

		//laços de repetição 

		for(int i= 0; i< 10; i++){

			System.out.println(i);
			}


		while(a < 10){
			System.out.println(a);
			a++;
			}

		//ARRAYS
		

		int[] meuArray = new int[10];
			
		meuArray[0] = 999;

		System.out.println(meuArray[0]);




	}
}
