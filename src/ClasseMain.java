import java.util.Arrays;
import java.util.Scanner;

public class ClasseMain {
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	char mode = ' ';
	int enter;

	mode = sc.nextLine().charAt(0);
	if (mode == 'C') {
		enter = sc.nextInt();
		System.out.println(" conversion C to F "+CtoF(enter));
		
	} else if (mode =='F') {
		enter=sc.nextInt();
		System.out.println(" conversion F to C "+FtoC(enter));
	}

	
	sc.close();
		
	}
	
	public static int FtoC(int C) {
		return 9/5 *C +32;
	}
	
	public static int CtoF(int F) {
		return (F-32)*5/9;
	}
}