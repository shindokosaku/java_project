コンパイルエラーと実行時例外（ランタイム例外）の違い;

エラーの種類	                いつ発生する？	                    発生原因	
コンパイルエラー	            プログラムを実行する前（コンパイル時）	文法ミスや型の不一致	
実行時例外（ランタイム例外）	  プログラム実行中（コンパイルは通る）	  実行時の予期しない状況	

例（コンパイルエラー）: のつけ忘れ、データ型の不一致、未定義の変数の使用
例（実行時例外）:NullPointerException、ArrayIndexOutOfBoundsException

🔷 コンパイルエラー（Compile Error）
プログラムを実行する前 に コンパイラ が検出するエラー。
プログラムが間違っている ため、コンパイルが成功しない。
修正しないと、そもそも実行できない。
🔹 コンパイルエラーの例 ①：文法ミス
public class Example {
    public static void main(String[] args) {
        System.out.println("Hello World") // ← `;` がないのでコンパイルエラー
    }
}
🔹 コンパイルエラーの例 ②：型の不一致
public class Example {
    public static void main(String[] args) {
        int number = "100"; // 🔴 `int` に `String` を代入 → コンパイルエラー
    }
}

🔷 実行時例外（Runtime Exception / 実行時エラー）
プログラムの文法は正しく、コンパイルは成功する ので、実行できる。
しかし 実行中に問題が発生 すると 例外（Exception）がスローされる。
コンパイル時には検出できない ので、事前に対策が必要。

🔹 実行時例外の例 ①：NullPointerException
public class Example {
    public static void main(String[] args) {
        String text = null;
        System.out.println(text.length()); // 🔴 nullの変数に `length()` を呼び出すとエラー
    }
}
🔹 実行時例外の例 ②：ArrayIndexOutOfBoundsException
public class Example {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]); // 🔴 配列の範囲外を指定
    }
}

🔹 どんなときに注意すべき？
✅ コンパイルエラー は、エディタやIDE（Eclipse, IntelliJ）を使えば すぐに指摘してくれる。
✅ 実行時例外 は、コンパイルが通るので 実際に実行しないとわからない → テストが重要！
✅ 実行時例外が発生しないように、null チェックや配列の範囲チェックをする ことが大切。

