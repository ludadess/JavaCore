package JavaPractice;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int b[][] = {{1,3,6},{5,8,7}};
		int colNum = 0;
		int minNum = b[0][0];
		for(int i=0;i<2;i++) {
			for(int y=0;y<3;y++) {
				if(b[i][y]<minNum) {
					minNum = b[i][y];
					colNum = y;
				}
			}
		}
		
		
		int maxNum = b[0][colNum];
		for(int i=0;i<2;i++) {
			if(b[i][colNum]>maxNum) {
				maxNum = b[i][colNum];
			}
		}
		System.out.println("minNum: " +minNum);
		System.out.println("maxNum: " +maxNum);
		
	}
		
		
		
		
		
	}

