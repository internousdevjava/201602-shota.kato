import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.gjt.mm.mysql.Driver;

public class JissenKadai1_2 {

	public static void main(String[] args) {
		String msg = "";
        try {
            // ドライバロード
            Driver driver = new Driver();

            // MySQLに接続
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "mysql");

            // ステートメント生成
            Statement stmt = con.createStatement();

            // SQLを実行
            String sqlStr = "SELECT * FROM test_table";
            ResultSet rs = stmt.executeQuery(sqlStr);

            // 結果行をループ
            while(rs.next()){
                // レコードの値
                int id = rs.getInt("user_id");
                String name = rs.getString("user_name");

                //表示
                System.out.println(id + "：" + name);
            }

            // 接続を閉じる
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e){
            msg = "ドライバのロードに失敗しました";
            System.out.println(msg);
        }
    }
}