package problem1and2;

import java.io.File;
import java.util.Scanner;

public class Security{
	File users = new File("users.txt");
	User[] stuff = new User[100];
	
	public void loadArray() throws Exception {
		Scanner scanner = new Scanner(users);
		String line = scanner.nextLine();
		String name = "";
		String email = "";
		int index;
		int place = 0;
	
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			int placeHolder = 0;
			String temp = "";
			
			for (index = 0; index<line.length();index++) {
				if (line.charAt(index) != ',' ) {
					temp += line.charAt(index);
				}
				else {
					if (placeHolder == 0) {
						name = temp;
						temp = "";
					}
					else if (placeHolder == 1) {
						email = temp;
						temp = "";
					}
					
					
					placeHolder++;
				}
			}
			stuff[place] = new User(name, email, temp);
			place++;
		}
		scanner.close();	
	}
	 
	public void showUsers() {
		int index;
		System.out.printf("%-15s %-15s %5s\n", "Username", "Password", "EMail");
		System.out.println("---------     -----------   ----");
		for (index = 0; index <stuff.length; index++) {
			if (stuff[index] != null) {
				System.out.printf("%-15s %-15s %15s\n", stuff[index].getUserName(), stuff[index].getPassword(), stuff[index].getEmail());
			}
		}
	}
}