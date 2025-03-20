import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前:");
    String firstName = scanner.next();

    System.out.print("名字:");
    String lastName = scanner.next();

    String name = firstName + " " + lastName;

    System.out.print("年齢:");
    int age = scanner.nextInt();

    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    if (age >= 20) {
      System.out.println("成年者です");
    } else {
      System.out.println("未成年者です");
    }
  }
}


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      
    System.out.print("名前：");
    String firstName = scanner.next();
    
    System.out.print("名字：");
    String lastName = scanner.next();
    
    System.out.print("年齢：");
    int age = scanner.nextInt();
    
    System.out.print("身長(m)：");
    double height = scanner.nextDouble();
    
    System.out.print("体重(kg)：");
    double weight = scanner.nextDouble();
    
    printData(firstName, lastName, age, height, weight);
  }

  public static void printData(String firstName, String lastName, int age, double height, double weight) {
    System.out.println("名前は" + fullName(firstName, lastName) + "です");
    System.out.println("年齢は" + age + "歳です");
    if (age >= 20){
      System.out.println("成年者です");
    } else {
      System.out.println("未成年者です");
    }
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
  }
  
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
}

MainクラスとPersonクラス
static があるのとない場合の比較

Personクラス
public class Person {
  // インスタンスメソッド（staticなし）
  public void printData(String firstName, String lastName, int age) {
    System.out.println("名前:" + firstName + " " + lastName);
    System.out.println("年齢:" + age + "歳");
  }
}

Mainクラス
public class Main {
  public static void main(String[] args){
    // インスタンスの生成が必要
    Person person = new Person();
    person.printData("光朔", "新藤", 24);//インスタンス経由で呼び出し
  }
}
実行結果;
名前:光朔 新藤
年齢:24歳

staticありのメソッド(クラスメソッド)の例
Personクラス
public class Person{
  // クラスメソッド(staticあり)
  public static void printData(String firstName, String lastName, int age){
    System.out.println("名前" + firstName + " " + lastName);
    System.out.println("年齢" + age + "歳");
  }
}
Mainクラス
public class Main {
  public static void main(String[] args) {
    // インスタンス生成が不要
    Person.printData("光朔", "新藤", 24); //クラス名経由で呼び出し
  }
}
実行結果;
名前:光朔 新藤
年齢:24歳

※staticの有無による違い
特徴                staticなし                      staticあり(クラスメソッド)
呼び出し方法         インスタンス名.メソッド名()         クラス名.メソッド名()
インスタンスの生成    必要                             不要
データの関連性       インスタンスごとに異なるデータを扱う   前インスタンスで共通のデータを扱う
用途                個別のデータに関する処理             汎用的な処理

for実践文
System.out.print("何人分の情報を入力しますか？:");
int n = scanner.nextInt();

for (int i = 0; i < n; i++){
  ...
}

※最高年齢を管理するための変数を用意し、
繰り返し文に対応させる方法

①初期値を0にし、繰り返し分の前の段階で定義する;
int maxAge = 0;
②複数人計測する都合のため、比較する必要がある;
また初期値含め、現在の最高年齢より高い場合とそうでないケースがあるため、if文用いる;
※下記の文は年齢のことなので年齢が書かれているところにまとめて書く;
if (age > maxAge){
  maxAge = age;
}
③上記の通り、最後にprintlnする;
※この文はmainクラスで行うが、繰り返さないのでfor文の外で記載する;
System.out.println("最高年齢は" + maxAge + "歳です");

平均年齢を求めよう;
①最高年齢を求める時と同じて初期値として0を設定する;
int totalAge = 0;
※totalAgeとしている理由として、トータル年齢/人数にすることで平均を求められるため;
②年齢を多そう！;
totalAge += age;
※復習※
+=は省略形で→totalAge = totalAge + age から省略されている;
③最後に割り算の計算も記載;
System.out.pritnln("平均年齢は" + total / n + "歳です");
※int型では小数点までは計算することができないため、小数点まで求めたい場合は、
System.out.println("平均年齢は" + (double)totalAge / n + "歳です");
にすることでdouble型として計算でき、求めることができる;


※System.out.println()の中に計算式を入れる場合と入れない場合について;
📋 【判断の3つの基準】
✅ 1. 式の「複雑さ」
→ 簡潔な計算なら、System.out.println()内に直接入れるのが良い
→ 複雑な計算や再利用する値なら、変数として事前に定義するのが効果的

✅ 2. 可読性・メンテナンス性
→ 一目で内容がわかるシンプルな式は、直接入れるのが適切
→ 長く複雑な式は、変数に格納することでコードが整理され、読みやすくなる

✅ 3. 値の再利用の有無
→ 1回しか使わない値なら、直接入れてOK
→ 複数回使用する値なら、変数に格納するのが効率的
