class Help2
{
	public static void main(String args[])
	throws java.io.IOException{
		char ch, ignore;
		
		do{
			System.out.println("Help on:");
			System.out.println("	1. if");
			System.out.println("	2. switch");
			System.out.println("	3. for");
			System.out.println("	4. while");
			System.out.println("	5. do-while\n");
			System.out.println("Choose one: ");
			
			ch = (char)System.in.read();
			do{
				ignore = (char)System.in.read();
			}while (ignore !='\n');
		}while(ch<'1' | ch>'5');
		
		System.out.println("\n");
		
		switch (ch)
		{
		case '1':
			System.out.println("The switch:\n");
			System.out.println("if (condition) statement;");
			System.out.println("else statement");
			break;
		case '2':
			System.out.println("The switch: \n");
			System.out.println("switch (expression) {");
			System.out.println(" case constant:");
			System.out.println("  statement sequence");
			System.out.println("	break;");
			System.out.println("  // ...");
			System.out.println("}");
			break;
		case '3':
			System.out.println("The for:\n");
			System.out.println("for(init; condition; iteration)");
			System.out.println("statement;");
			break;
		case '4':
			System.out.println("The while:\n");
			System.out.println("while(condition) statement;");
			break;
		case '5':
			System.out.println("The do-while:\n");
			System.out.println("do{");
			System.out.println("statement;");
			System.out.println("} while(condition);");
			break;
		}
	}
}