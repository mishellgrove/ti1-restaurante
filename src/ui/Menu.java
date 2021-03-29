package ui;

import java.util.Scanner;

//@autor: Valeria España

public class Menu {
	private Scanner sc;
	private final static int EXIT_OPTION = 3;
	
	public Menu() {
		sc = new Scanner (System.in);
	}
	
	public void startMenu() {
		
		String menu = getMenuText();
		int option;
		do {
			System.out.println(menu);
			option = readOption();
			excuteOperation(option);
		}while(option!=EXIT_OPTION);	
	}
	
	private void excuteOperation(int option) {
		switch(option) {
		case 1:
			restaurant();
		break;
		case 2:
			product();
		break;
		case 3:
			client();
		break;
		case 4:
			order();
		break;
		default:
		break;
		
		}
	}
	
	private void order() {
		
	}

	private void client() {
		
	}

	private void product() {
		
	}

	private void restaurant() {
		
	}

	private int readOption() {
		int op;
		op = Integer.parseInt(sc.next());
		
		return 0;
	}

	private String getMenuText() {
		String menu;
		menu = "--------------------------------------\n";
		menu += "   RESTAURANT´S SYSTEM\n";
		menu += "-------------------------------------\n";
		menu += "1. Restaurant\n";
		menu += "2. Product\n";
		menu += "3. Client\n";
		menu += "4. Order\n";
		menu += "5. Exit\n";
		return menu;
						
	}
}