public class MySweetProgram {

	public static void main(String[] args){  	
		int[][] data = {
				{4, 6, 3, 10},
				{4, 2, 40, 1, 5, 3, 2, 30},
				{5, 34, 1, 43}
		};
		
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}