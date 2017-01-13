import java.io.File; // ファイルやディレクトリの抽象表現
import java.io.FileNotFoundException; // 例外
import java.util.Scanner; // 標準入力読み込みの際に利用したクラス

/** デバッグ練習用のコード。スタックフレームの確認、ブレークポイント、条件付きブレークポイント
 * Created by tnal on 2017/01/13.
 */
public class ReadCSVFile {
    public static void lineProcess(String line, int count){
        String[] items = line.split(",");
        String str = items[0];
        int value = Integer.parseInt(items[1]);
        System.out.printf("line[%d]: str = %s, value = %d\n",count,str,value);
    }
    public static void main(String[] args){
        String filename = "./data/daily_access.csv";
        //readfile(filename);
        int count = 0;
        Scanner scanner;

        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineProcess(line, count);
                count++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1); //終了ステータス。ここでは取り敢えず0(=正常)以外にした。
        }
    }
}
