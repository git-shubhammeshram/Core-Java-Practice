package LoopsStatement;

public class DoWhileLoop {
	
//	do-while Loop: If the number of iteration is not fixed and you must have to execute the
//	loop at least once, it is recommended to use do-while loop. It is post test loop

	public static void main(String[] args) {

		int i=10;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i>=20);
	}

}
