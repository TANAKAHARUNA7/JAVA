package oopLab;
import java.io.BufferedReader; // バッファリング機能を持つリーダー で、
                               // ファイルやストリームから 行単位でデータを読み取る ことができる
import java.io.FileReader; //
import java.io.IOException; //

class FileLoader{
    private String filePath; // ファイルのパス (sample.txt) を保存。
    private String fileContent = ""; //  ファイルの内容を格納する

    // コンストラクタを通してファイルの経路を受け取って初期化
    FileLoader(String filePath){
        this.filePath = filePath;
        loadFile(); // ファイルロードメソッド実行
    }

    private void loadFile(){
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                fileContent += line + "\n";
            }
            System.out.println("ファイルロード成功");
        }catch (IOException e) { // ファイルが存在しない場合などの エラー (IOException) をキャッチ し、エラーメッセージを出力
            System.out.println("ファイルロード失敗: " + e.getMessage());
        }
        }

    //ファイル内容出力
    void printFileContent(){
        System.out.println("ファイル内容:\n" + fileContent);
    }
    }

public class Lab1 {
    public static void main(String[] args) {
        FileLoader loader = new FileLoader("sample.txt");
        loader.printFileContent();
    }
}
