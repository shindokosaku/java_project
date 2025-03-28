オブジェクト指向に触れてみよう;
（例）
Person person1 = new Person ("鈴木", 24); （一人目のオブジェクトを作る;）
person1.hello();（一人目が自己紹介をする;）

Person person2 = new Person("神田", 18); （二人目のオブジェクトを作る;）
person2.hello(); （二人目が自己紹介をする;）


現実世界の「もの」は情報と振る舞いを持っています。例えば人間であれば、「名前」や「年齢」といった情報と、
「あいさつをする」「歩く」といった振る舞いを持っています。
プログラムの中のオブジェクトは、現実世界の「もの」を真似たものです。
よって、同じように情報と振る舞いを持つように作ります。

Personオブジェクト
情報: name:鈴木  age:24
振る舞い: hello:挨拶をする  walk:歩く

オブジェクト指向で大事なのはクラスとインスタンスです。なお、インスタンスというのはオブジェクトの別名です。
そしてクラスはインスタンスの設計図に当たります。
インスタンス（オブジェクト）は、クラスという設計図をもとに作られるのです。
（Personクラスに設計図を書き、Mainクラスでインスタンスを生成する;）

※インスタンス=実体

クラスからインスタンスを生成するには「new クラス名()」とします。
下図では空のクラスを元にインスタンスを生成しているので、インスタンスはまだ情報も振る舞いも持っていません。

「Main.java」
class Main {
  public static void main(String[] args){
    new Person(); ※Personクラスのインスタンスを生成
  }
}

「Person.java」
class Person {

}

インスタンスは変数に代入して用います。
変数にインスタンスを代入するには「クラス型 変数名 = new クラス名()」とします。
これまでは変数名の前にデータ型を指定してきましたが、
インスタンスの代入ではクラス型を指定します。クラス名がそのままクラス型になります。

「Main.java」
class Main {
  public static void main(String[] args) {
    Person person = new Person();  ※変数にインスタンスを代入;
  //クラス名　変数名　 
  }
}

「Person.java」
class Person { 

}

インスタンスは、1つのクラスから何個でも生成できます。設計図を元に同じようなオブジェクトを簡単に大量に作ることができるのです。
そして同じクラスから作られたインスタンスは、すべて同じ種類の情報（中の値はインスタンスごとに変わり得ます）と振る舞いを持ちます。

「Main.java」
class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person();
    Person Person3 = new Person();
  }
}

インスタンスは情報と振る舞いを持つことは学びました。
インスタンスの情報にあたるものを「インスタンスフィールド」、
振る舞いにあたるものを「インスタンスメソッド」と呼びます。

インスタンスフィールド（情報）
name:鈴木

インスタンスメソッド (振る舞い)
hello
インスタンスメソッドは「public 戻り値の型 メソッド名()」と定義します。

「Person.java」
class Person { 
  public void hello() {
    //戻り値の型 メソッド名
    System.out.println("こんにちは");
  }
}

インスタンスメソッドは、インスタンスのメソッドです。クラスに定義しても、
実際は各インスタンスに属するというイメージを持っておきましょう。
それゆえ、インスタンスメソッドはインスタンス（を代入した変数）に対して呼び出します。
JavaⅢで学んだメソッド同様、ドット（.）を使って呼び出しますが、「インスタンス名.メソッド名()」とします。

「Main.java」
Person person1 = new Person();
Person person2 = new Person();
person1.hello();
person2.hello();
// インスタンスに対して呼び出す  この場合のインスタンスはperson1,person2がそれに該当する;

インスタンスフィールドは、情報を格納しておく変数にすぎません。
その変数はクラスの一番上に定義します。
注意点として、「public データ型 変数名」というように、変数定義の前にpublicを付けてあげましょう。

「Person.java」
class Person {
  public String name;
      // 名前を入れる変数を定義
}

インスタンスフィールドも各インスタンスに属します。
インスタンスを生成するときに、各インスタンスにフィールドがコピーされる。
インスタンスフィールドには、「インスタンス名.フィールド名」というように、インスタンスに対してドット（.）を用いてアクセスします。
ドットを用いること以外、変数と扱いはあまり変わりません。下図のように、値の取得とセット（代入）が可能です。

「Main.java」
Person person1 = new Person();
person1.name = "Suzuki";  ※nameに値をセット

System.out.println(person1.name);
// 結果: Suzuki

クラスの中でインスタンスを扱う;

メソッド内でインスタンスフィールドにアクセスするためには「this」という特殊な変数を用います。
thisはクラス内のメソッドの定義の中でのみ使用できます。
thisはメソッドが呼ばれた時に、そのメソッドを呼び出しているインスタンスに置き換えられます。

「Main.java」
Person person = new Person();
person.name = "Suzuki";
person.hello();
// 結果: こんにちは、私はSuzukiです


「Person.java」
class Person {
  public String name;
  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です"); ※thisが「person.hello」の「person」を代入している;
  }
}