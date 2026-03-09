package aula;

public class MaiorQueDez {
	
	public static void main(String[] args) {
		
		int[] numero = {10,4,6,12,34,43,1};
		
		for(int i = 0; i<numero.length; i++) {
			
			if(numero[i]>10) {
				System.out.println(numero[i]);
			}
		}
		
	}
	
}