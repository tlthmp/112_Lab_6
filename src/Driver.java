
public class Driver {

	public static void main(String[] args) {
		Recur(1);
		System.out.println();
		Recur2(5);

	}
	public static void Recur(int n){
		String w = "*";		
		if(n < 6){
			for(int i = 0; i < n; i++){
			System.out.print(w);
			}
			System.out.println();
			Recur(n+1);
		
		for(int i = 0; i < n; i++){
			System.out.print(w);
		}
		System.out.println();
		
	}
	}
	
	public static void Recur2(int j){
		String w = "*";
		for(int i = 0; i < j; i++){
			System.out.print(w);
		}
		System.out.println();
		if(j > 1 ){
			Recur2(j-1);
			for(int i = 0; i < j; i++){
				System.out.print(w);
			}
			System.out.println();
			
		
		}
	}
}
