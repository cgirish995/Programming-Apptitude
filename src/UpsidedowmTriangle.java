
public class UpsidedowmTriangle {

	public static void main(String[] args) {
		
		int num=5;
		
		for(int i=0 ;i<=num;i++){
			for(int j=0;j<=num;j++){
				if((j>=i && i+j<=num) || (i+j>=num && j<=i))
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
	}

	}

}
