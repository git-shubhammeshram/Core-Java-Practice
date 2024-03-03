package ConditionStatements;

public class SwithCaseSecond {

	public static void main(String[] args) {
		int a=10, b=20;
		char operation = '*';
		switch(operation)
		{
		case '-' :
			System.out.println(a-b);
			break;
	    case '+' :
	    	System.out.println(a+b);
	    	break;
	    	default:
	    		System.out.println("wrong operation");
		}

	}

}
