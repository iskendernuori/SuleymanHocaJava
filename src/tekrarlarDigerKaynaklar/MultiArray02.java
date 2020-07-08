package tekrarlarDigerKaynaklar;

public class MultiArray02 {

	public static void main(String[] args) {
		
		
		char [][] tablo = new char[8][14];
		
		for(int i= 0 ; i<tablo.length; i++) {  // 1. array . dış array
			
			for(int j=0 ; j<tablo[i].length; j++) {// 2. array iç array
				
				if(i==0) {
					tablo[i][j] = '*';
				}else if(j==0) {
					tablo[i][j] = '*';
				}
				else {
					tablo[i][j] = '-';
				}
				
				
				
			}
		}
for(int i= 0 ; i<tablo.length; i++) {  // 1. array . dış array
			
			for(int j=0 ; j<tablo[i].length; j++) {// 2. array iç array
				
				System.out.print(tablo[i][j] + " ");
				
			}
		System.out.println();
		
		

	}
	}
}
