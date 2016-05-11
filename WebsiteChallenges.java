import java.util.Scanner;


	public class WebsiteChallenges {

		public static void firstchallenge(){

				Scanner input = new Scanner(System.in);

				System.out.println("What is you name: ");

				String output = input.nextLine();

				System.out.println("Greetings: " + output);

}

	public static void secondchallenge(){

		Scanner output = new Scanner(System.in);
		System.out.println("Choose a number");
		int border = output.nextInt();

		boolean mexican=false;

			int[] hello = {2,3,4};

			for(int c=0;c<hello.length;c++){
				if(border==hello[c]){

					 mexican = true;
					break;

				}//else{mexican=false;}

			}

				if(mexican==true){

					System.out.println("Your number is in the array");

				}else{System.out.println("Your number is not in the array");
		}

	}

public static void diff21(int n){
		int c = n-21;
		if (c<0){
			c = -c;
		}else if (c>0){
			c=c*2;
		}
System.out.println("The result is: " + c);
}


public static void main(String[] args) {

// TODO Auto-generated method stub

//WebsiteChallenges.firstchallenge();

//WebsiteChallenges.secondchallenge();
	diff21(21);
		}

	}




