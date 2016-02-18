import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai2 {
	public static void main(String[] args) {

		// 乱数の作成
		int i = new java.util.Random().nextInt(100);

		// 下記から表示
		System.out.println("数字当てゲーム");
		System.out.println("1～100の間で数字を入力して下さい。");
		String str = null;


		while (true) {

			try {
				str = null;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				// xの数字を定義
				int x = Integer.parseInt(str);

				x = Integer.parseInt(str);
				// 入力した数値の範囲を指定
				if (i > x) {
					System.out.println("答えはより大きい数字です。");
				} else if (i < x) {
					System.out.println("答えはより小さい数字です。");
				} else {
					System.out.println("正解です。\r\nおめでとうございます。");
					break;
				}
				System.out.println("数字を入力して下さい。");

				x = Integer.parseInt(str);
			} catch (Exception e) {
				System.out.println("入力が読みこめませんでした。\r\n再度、1～100の数字で入力して下さい。");
				continue;
			}

		}
	}

}
