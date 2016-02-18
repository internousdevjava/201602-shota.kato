import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class KisoKadai3 {
	public static void main(String[] args) {

		// フォルダー、ファイル名の新規作成
		System.out.println("新規ファイルの保存先、新規ファイル名を入力して下さい。例：C:\\Users\\internous\\新規ファイル名.txt");
		File file = null;
		String folder = null;
		String edit = null;
		String overwrite = null;
		while(true){
			try {// ファイルの作成の存在の有無。
				folder = null;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				while (true) {
					folder = br.readLine();
					file = new File(folder);
					file.createNewFile();
				// 新規でファイルを作成したかどうか

					if (file.createNewFile()) {
						System.out.println("ファイルの作成に成功しました");
						break;
					}
					// ファイルの存在の有無
					else if (file.exists()) {
						System.out.println("新規での作成の完了。もしくはすでにファイルが存在しています。");
						break;

					} // ファイルの編集
					else {// ファイルの作成に戻る文章を記入。
						folder = null;
						br = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("ファイルの作成に失敗しました。\r\n再度新規ファイルの保存先、新規ファイル名を入力して下さい。例：C:\\Users\\internous\\新規ファイル名.txt");
						continue;
					}
				}
				break;
			} catch (Exception e) {
				System.out.println("ファイルの作成に失敗しました。\r\n再度新規ファイルの保存先、新規ファイル名を入力して下さい。例：C:\\Users\\internous\\新規ファイル名.txt");
				continue;
			}
		}

		try {// ファイルの追記のyes noの変数設定 ans
			System.out.println("ファイルの追記をしますか？Yes or No？");
			String ans = null;
			BufferedReader ansbr = new BufferedReader(new InputStreamReader(System.in));
			ans = ansbr.readLine();

			while (true) {// ファイル追記のyes no の無限ループ
				if (ans.equals("Yes") || ans.equals("yes")) {
					System.out.println("追記内容を記載してください。");
				while(true){
					try {// ファイルの追記の変数設定edit
						edit = null;
						BufferedReader editbr = new BufferedReader(new InputStreamReader(System.in));
						edit = editbr.readLine();
						FileWriter editfw = new FileWriter(file, true);
						editfw.write(edit);
						editfw.close();
						break;
					} catch (Exception e) {
						System.out.println("追記内容の入力が読み取れませんでした。\r\n再度入力をお願いいたします。");
						continue;
					}
				}


					break;
				} else if (ans.equals("No") || ans.equals("no")) {
					System.out.println("上書きをしますか？Yes or No ?");
					String owans = null;
					try {// 上書きをするためのyes no の変数owans。
						BufferedReader owansbr = new BufferedReader(new InputStreamReader(System.in));
						owans = owansbr.readLine();
						while (true) {// 入力が読み取れないときに戻る設定。
							if (owans.equals("Yes") || owans.equals("yes")) {// 上書きのyes
								// 上書きをするコマンドの入力。

							while (true){
								try {// ファイルの追記の変数設定edit
									System.out.println("上書き内容を入力して下さい。");
									overwrite = null;
									BufferedReader overwritebr = new BufferedReader(new InputStreamReader(System.in));
									overwrite = overwritebr.readLine();
									FileWriter overwritefw = new FileWriter(file, false);
									overwritefw.write(overwrite);
									overwritefw.close();
									break;
								}
								catch (Exception e) {
									System.out.println("上書き内容を確認できませんでした。");
									continue;
								}
							}

							}
							else if (owans.equals("No") || owans.equals("no")) {
								break;
							} else {
								System.out.println("入力が読み取れませんでした。\r\nYes or noで再度入力をお願いします。");
								owans = null;
								owansbr = new BufferedReader(new InputStreamReader(System.in));
								owans = owansbr.readLine();
								continue;
							}
						break;
						}
					} catch (Exception e) {
						System.out.println("エラーです。");
					}
				} else {// ファイルの追記のyes noの例外。
					System.out.println("入力が読み取れませんでした。\r\nYes or noで再度入力をお願いします。");
					// 読み取れないので再度入力を入れる。
					ans = null;
					ansbr = new BufferedReader(new InputStreamReader(System.in));
					ans = ansbr.readLine();
					continue;
				}
			break;
			}
		} catch (Exception e) {
			System.out.println("エラーです。");
		}
		System.out.println("ファイルの出力をしますか？Yes or No ?");
	while(true){
		try {
			String fileans = null ;
			BufferedReader fileansbr = new BufferedReader(new InputStreamReader(System.in));
			fileans = fileansbr.readLine();
			while ( true ) {//入力が読み取れないときに戻る設定。
				if (fileans.equals("Yes") || fileans.equals("yes")) {
					try {
						FileReader outputfr = new FileReader(file);
						BufferedReader outputfrbr = new BufferedReader(outputfr);
						System.out.println(outputfrbr.readLine());
						outputfr.close();

						break;
					}
					catch (Exception e) {
						System.out.println("エラーです。");
					}
				}
				else if (fileans.equals("No") || fileans.equals("no")){
						break;
				}
				else {
					System.out.println("入力が読み取れませんでした。\r\nYes or noで再度入力をお願いします。");
					continue;
				}

			}
		}catch (Exception e) {
		System.out.println("入力が読み取れませんでした。\r\nYes or noで再度入力をお願いします。");
		continue;
		}
	break;
	}

	while(true){
		try {// ファイルに上書きの終了。
			System.out.println("ファイルの追記、上書きを終了しますか？Yes or No?");
			String fin = null;
			BufferedReader finbr = new BufferedReader(new InputStreamReader(System.in));
			fin = finbr.readLine();
			if (fin.equals("Yes") || fin.equals("yes")) {
				System.out.println("bye");
			break;
			}
			else if (fin.equals("No") || fin.equals("no")) {
				// ファイルの追記;
				System.out.println("追記の場合は1、上書きは2、終了は3の入力をお願いします。?");
				while (true)
					try {
						String num = null;
						BufferedReader numbr = new BufferedReader(new InputStreamReader(System.in));
						num = numbr.readLine();
						int n = Integer.parseInt(num);
						if (n == 1) {
							//追記の入力
							System.out.println("追記内容を記載してください。");
							try {// ファイルの追記の変数設定edit
								edit = null;
								BufferedReader editbr = new BufferedReader(new InputStreamReader(System.in));
								edit = editbr.readLine();
								FileWriter editfw = new FileWriter(file, true);
								editfw.write(edit);
								editfw.close();
							}
							catch (Exception e) {
								System.out.println("エラーです。");
							}
						}
						else if (n == 2 ){

								//上書きの記入。
							try {// ファイルの追記の変数設定edit
								System.out.println("上書き内容を入力して下さい。");
								overwrite = null;
								BufferedReader overwritebr = new BufferedReader(new InputStreamReader(System.in));
								overwrite = overwritebr.readLine();
								FileWriter overwritefw = new FileWriter(file, false);
								overwritefw.write(overwrite);
								overwritefw.close();
							}
							catch (Exception e) {
								System.out.println("エラーです。");
							}


						}
						else if (n == 3 ){
							//終了。
							System.out.println("bye");
							break;
						}
						else{
							System.out.println("入力が読み取れませんでした。\r\n1～3で再度入力をお願いいたします。");

					}
					}

				}
				catch (Exception e) {
					System.out.println("エラーです。");
				}


				}
			else {// ファイルの追記の例外。
			}


		} catch (Exception e) {
			System.out.println("入力が読み取れませんでした。\r\nYes or Noでの返答をお願いいたします。");
			continue;
		}
	}
	}


}
