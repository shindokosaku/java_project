オーバーロード（Overloading）とオーバーライド（Overriding）の違いを1から解説;
Javaでは、「オーバーロード（Overloading）」と「オーバーライド（Overriding）」 という2つの概念が
あります。どちらも 「メソッドの再利用」 に関わるものですが、それぞれ 目的やルールが異なります。

① オーバーロード（Overloading）
🔹 オーバーロードとは？
「同じクラスの中」で、同じ名前のメソッドを
「引数の数や型を変えて」 定義できる機能。

📌 ポイント ✅ メソッド名は同じでOK
✅ 引数の型や数が違えばOK
✅ 戻り値の型が違うだけではNG

オーバーロードの例;

class OverloadExample {
    // 引数が1つのメソッド
    void show(int num) {
        System.out.println("整数: " + num);
    }

    // 引数が2つのメソッド（オーバーロード）
    void show(int num, String text) {
        System.out.println("整数: " + num + ", 文字列: " + text);
    }

    // 引数の型が異なるメソッド（オーバーロード）
    void show(double num) {
        System.out.println("小数: " + num);
    }
}

public class Main {
    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        
        obj.show(10);         // show(int) が呼ばれる
        obj.show(10, "Hello"); // show(int, String) が呼ばれる
        obj.show(10.5);       // show(double) が呼ばれる
    }
}

② オーバーライド（Overriding）
🔹 オーバーライドとは？
「親クラス（スーパークラス）」のメソッドを、子クラス（サブクラス）で
「同じメソッド名・引数・戻り値」で上書き（再定義）すること。

📌 ポイント ✅ 「継承（extends...親クラスの特性を新しいクラスに引き継ぐこと）」
を使うときに発生する;
✅ メソッド名・引数・戻り値が完全に同じ！
✅ @Override アノテーションを使うと分かりやすい！
✅ アクセス修飾子（public, protected など）は、親クラスより広くできる！

🔹 オーバーライドの例

// 親クラス（スーパークラス）
class Animal {
    void makeSound() {
        System.out.println("動物の鳴き声");
    }
}

// 子クラス（サブクラス）
class Dog extends Animal {
    @Override
    void makeSound() { // オーバーライド
        System.out.println("ワンワン！");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // 親クラスの型で子クラスを参照
        myDog.makeSound(); // Dogクラスの makeSound() が呼ばれる！
    }
}

出力;
ワンワン!

✅ 親クラス Animal の makeSound() を、子クラス Dog がオーバーライドして「ワンワン！」と変更！

💡 ポイント
オーバーロード → 「引数の違いでメソッドを使い分ける」
オーバーライド → 「親クラスのメソッドを上書きする」