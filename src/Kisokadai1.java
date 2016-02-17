import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai1 {
	public static void main(String[] args) {
		System.out.println("九九表");
		System.out.println("縦の最大値を入力して下さい");
		String str = null;
		try {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		str = br.readLine();
		}
			catch ( Exception e ) {
			e.printStackTrace();
			}
		int x = Integer.parseInt(str);

			System.out.println("横の最大値を入力して下さい");
			String Beside = null ;
				try{
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					Beside = br.readLine();
				}
					catch( Exception e ){
					e.printStackTrace();
					}
						int y = Integer.parseInt(Beside);
							for (int a = 1 ; a <= x  ; a ++){
								for (int b = 1 ; b < y + 1 ; b ++){
									System.out.print( a * b + " " );
								}
								System.out.println();
							}
	}
}

