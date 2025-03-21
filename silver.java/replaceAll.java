①replaceAllメソッド・・・replaceAll() メソッドは、正規表現（regex）を使って文字列を
置換するためのメソッド;

replaceAll() の基本構文
String replacedString = originalString.replaceAll(String regex, String replacement);

regex → 置き換え対象を表す正規表現
replacement → 置き換え後の文字列

replaceAll() は元の String を変更しないのか？
元の String は変更されません！
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        String newStr = str.replaceAll("World", "Java");

        System.out.println("元の文字列: " + str);
        System.out.println("置換後の文字列: " + newStr);
    }
}
出力;
元の文字列: Hello World
置換後の文字列: Hello Java

✅ ポイント
replaceAll() は 元の str を変更せず に、新しい String インスタンス newStr を返す。
str の値は "Hello World" のまま変わらない。

