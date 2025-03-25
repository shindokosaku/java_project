equals メソッドとは？
equals メソッドは、JavaのObjectクラスに定義されているメソッドで、
二つのオブジェクトが論理的に等しいかどうかを判定するために使うメソッドです。
（オーバライドを前提としているメソッド）

public boolean equals(Object obj)
このメソッドは、デフォルトでは参照（メモリのアドレス）が等しいかを比較するようになっていますが、
StringやWrapperクラス（Integer, Doubleなど）ではオーバーライドされていて、
値が等しいかどうかを比較するようになっています。

== と equals の違い
比較方法	         比較内容	                                    
==（等価演算子）	  参照（メモリのアドレス）を比較する	
equals メソッド	   値が等しいかを比較する（オーバーライドされていれば）	

例（==）:obj1 == obj2 は、obj1とobj2が同じオブジェクト（インスタンス）を指しているか判定;
例（equalsメソッド）:obj1.equals(obj2) は、obj1とobj2の内容（値）が等しいか判定

String str1 = new String("hello");
String str2 = new String("hello");

System.out.println(str1 == str2);      // false（参照が違う）
System.out.println(str1.equals(str2)); // true（値が同じ）

equals メソッドをオーバーライド
equals メソッドは、オブジェクトの内容を比較できるようにカスタマイズできます。

例: Person クラスの equals をオーバーライド

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 同じ参照ならtrue
        if (obj == null || getClass() != obj.getClass()) return false; // nullまたはクラスが違うならfalse

        Person person = (Person) obj;
        return this.age == person.age && this.name.equals(person.name); // フィールドの値を比較
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
    }
}

hashCode と equals をセットでオーバーライド
equals をオーバーライドするときは、hashCode も一緒にオーバーライドするのが基本です。
（特に HashMap や HashSet などで使う場合）

@Override
public int hashCode() {
    return Objects.hash(name, age);
}
理由
equals で 同じと判定されたオブジェクトは、hashCode も同じ値を返すべき というルールがある。
HashMap や HashSet は hashCode を使って検索するので、
オーバーライドしないと意図しない動作をする可能性がある。

equals を使う際の注意点
null と比較するときは ※NullPointerException に注意する;

※NullPointerException（ヌルポインター例外）とは？
NullPointerException（NPE） は、null参照を持つオブジェクトに対してメソッドを呼び出したり、
フィールドにアクセスしたりしたときに発生する実行時エラー です。
これは Java で最もよくある例外の一つで、適切な対策を取らないと
アプリケーションのクラッシュにつながります;

まとめ
== は参照（メモリアドレス）を比較
equals は論理的な等価性（値）を比較（Objectクラスでは == と同じ動作）
equals をオーバーライドすると、独自の比較ルールを作れる
equals をオーバーライドするときは、hashCode もオーバーライドするのが基本