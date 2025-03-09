真偽値;
boolean型;
true or false;
変数定義（例）;
boolean bool = true;

比較演算子;
x == y （等しい時true,等しくない時false）;
x != y （等しくない時true,等しい時false）;

真偽値の出力;
System.out.println(true);
System.out.println(false);
System.out.println(6 + 2 == 5);  false;
System.out.println(6 + 2 != 5);  true;

大小比較;
x < y; yのほうが大きい時true;
x <= y; yのほうが大きいまたは等しい時true;
4 + 2 > 6...false;
4 + 2 >= 6... true;

&& かつ;
|| または;
※ ~でない;
!(x >= 30)はxが30以上でない（つまり30より小さい）時にtrueになり、xが30以上の時、
falseになる;

if文;
int x = 10;
if (x == 10){
  System.out.println("xは10です");
}※}の後は;不要;
→条件式がtrueのため、「xは10です」が実行される;
※条件式がfalseの場合は何も表示されない;

if文の{}の中はブロックと呼ぶ;

else...ifと一緒に使う;
もし〜なら〇〇、そうでなければ△△;

int x = 20;
if (x < 30){
  System.out.println("xは30より小さい");
}else{
  System.out.println("xは30以上");
}

else if...ifとelseの間に使用
（複数回使用できるが、その中で最初に条件に該当したものが実行され、
その後のものは実行されない）;
※elseは最後の余り物なので条件式はいらない;

switch文...条件の値がcaseの値と一致するとき、処理が実行される;
switch(条件の値){
  case 値1:
    処理;
    break;
  case 値2:
    処理;
    break;
  case 値3:
    処理;
    break;
}
int n = 1;
switch(n){
  case 1:
    System.out.println("大吉です");
    break;
}
→1が一致しているため、大吉ですが出力される;

※break...switch文を修了する命令;
caseとセットで必要!;

default...switch文でどのcaseとも一致しなかった際に実行する処理を指定できる;
if文のelseに似ている;

...{
...
  default:
    System.out.println("凶です");
    break;
}

繰り返し処理;
while (条件){
  繰り返す処理;
}
（例）;
int i = 1;
while(i <= 5){
  System.out.println(i);
  i++;  ←※この文がないと無限ループが起こるので要注意!!;
}
※条件式がtrueである限り、処理は実行されるのでiが1の時,
2の時、3の時...となり、iが6の時にfalseとなり実行されなくなる;
※System.out.println()の()の中に変数を入れるときは""をつけない!!;

for文;
for(変数の初期化;条件式;変数の公式){
  System.out.println(変数);
}
（例）
for(int i = 1 ; i <= 5; i++){
  System.out.println(i + "回ジャンプしました");
}

繰り返し処理を終了するためには、条件をfalseにする以外に、breakを使い、
強制的に終了させる方法がある;
（例）
for(int i = 1; i <= 10; i++){
  if(i > 5){
    break;
  }
}
※変数iの値が6になった段階でfor文を終了;

continue:その周の処理だけをスキップして、次の周を実行できる;
continueもif文と組み合わせて利用するのが一般的;
（例）
for(int i = 1; i <= 10; i++){
  if(i % 3 == 0){
    continue;
  }
  System.out.println(i);
}
※変数iの値が3の倍数の時、その周のループを終了し、次のループを実行;
出力結果;
1,2,4,5,7,8,10;

配列;
変数のセットのようなもの;
（複数の値をまとめて保存）
変数定義;
int[]・・・
String[]・・・
[]の間にスペースを空けない;
（例）
int[] numbers = {5, 13, 29};
String[] names = {"John", "Kate", "Bob"};
※配列の要素の番号は0,1,2と0からカウントしていく;
上記のやつを例にすると;

System.out.println = {"私の名前は" + names[0] + "です"};
出力結果;
→私の名前はJohnです;

配列の要素を上書きする;
String[] names = {"John", "Kate", "Bob"};
System.out.println(names[0]);
names[0] = "William"; ←0番目の要素を上書き;
System.out.Println(names[0]);

配列とfor文（配列とfor文）
String[] names = {"John", "Kate", "Bob"};
for(int i = 0; i<3; i++){
  System.out.println("Hello"+ names[i]); （iが0~2の間繰り返される;）
}

length:要素の数を数える機能、「.」で繋いで使用する;
（例）
String[] names = {"John", "Kate", "Bob"};
for(int i = 0; i<names.length; i++){
  System.out.println("Hello" + names[i]);
}
※lengthを用いることで、わざわざ条件式を書く必要がなくなる;

拡張for文（入れ町の特別なfor文）;
for(データ型 変数名 : 配列名){
  繰り返す処理;
}
（例）
String[] names = {"John", "Kate", "Bob"};
for(String name: names){
  System.out.println(name);
}
※拡張for文では配列の要素の値を順に代入する変数を用意する;
変数nameに配列namesの要素が代入されていく;
また自動的に要素の数だけ繰返しが行われる;
（通常のfor文）
String[] names = {"John", "Kate", "Bob"};
for(int i = 0; i < names.length; i++){
  System.out.println(names[i]);
}



総合問題;
奇数の要素と偶数の要素の和をそれぞれ求め、出力しよう;
int[] numbers = {1,4,6,9,13,16};


答え;
class Main {
  public static void main(String[] args){
    // 変数numbersに、与えられた数字の配列を代入;
    int[] numbers = {1, 4, 6, 9, 13, 16};

    int oddSum = 0;
    int evenSum = 0;

    for(int number: numbers){
      if(number % 2 == 0){
        evenSum += number;
      }else{
        oddSum += number;
      }
    }
    System.out.println("奇数の和は" + "oddSum" + "です");
    System.out.println("偶数の和は" + "evenSum" + "です");
  }
}

Q.isHealthyメソッドを定義する中で、bmiが
18.5 以上、かつ25.0になるようにしなさい;

A.
public static boolean isHealthy(double bmi){
  return 18.5 <= bmi && bmi < 25.0;
}

複数のクラスを使う;クラスは、メソッドという小さな部品をまとめる、より大きな部品;
これまで→mainメソッドと同じクラス（Mainクラス）
他のクラスのメソッドを利用することも可能;
（例）
class Main {
  public static void main(String[] args){
    Person.hello();         （※Personクラスのhelloメソッドを呼び出す「.」が必要！）
    （クラス名）（メソッド名）
  }
}
class Person{
  public static void hello(){
    System.out.println("Hello World");
  }
}
※クラスが変わるということはファイルが変わるということを念頭におく;
（クラス名は大文字にする＋ファイル名は「クラス名.java」という形にする）

Personクラスのメソッドを呼び出す;

class Main{
  public static void main(String[] args){
    String name = Person.fullName("Kate", "Jones");  ※PersonクラスのfullNameメソッドを呼び出し;
    System.out.println(name);
  }
}

class Person{
  ・・・
  public static String fullName(String firstName, String lastName){
    return furstName + "" + lastName;
  }
  ・・・
}
出力結果;
Kate Jones

クラスについての補足;
Javaはファイルではなく、クラスを実行する。また実行時にmainメソッドが呼ばれるが、
mainメソッドを持つクラスしか実行できない。（mainメソッドのないクラスは他クラスから呼び出して使う。）
またクラス名に関係なく、実行時にはmainメソッドが呼ばれる;

Mainクラス{                    Mainクラスを実行すると...
  mainメソッド{                         ↓
                              mainメソッドが自動で実行される;
  }
}

Personクラス{                  Personクラスを実行すると...
  （mainメソッドなし）                    ↓
}                             mainメソッドがないため、エラー発生（他のクラスから呼び出して使う）

練習問題;
 // printDataメソッドとfullNameメソッドの呼び出しを書き換えてください
    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
                          ↓            ↓
    Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
    Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
    ※それぞれにPersonを付随する;
    
外部ライブラリ;
Javaでは、他人が作ったクラスを利用することもできる;
世界中のエンジニアが作った便利なメソッドを利用することで、
開発の幅は一気に広がる;

Mainクラスのmainメソッドから外部ライブラリに指示を出す;
外部ライブラリを自分のプログラムに読み込むには、
import を用いる;
（例:Mathというクラスを読み込む時）
import java.lang.Math;     ※java.langの部分はMathクラスの場所を示している
class Main{
  public static void main(String[] args){
    ・・・
  }
}

（例:maxメソッドを使ってみる
    maxメソッドは因数に渡した二つの数値の大きい方を返してくれる）
  import java.lang.Math;
  class Main{
    public static void main(String[] atgs){
      int max = Math.max(3,8);
                （外部から読み込んだMathクラス）
    System.out.println("最大値は" + max + "です");
    }
  }
  出力結果:最大値は8です

  ※演習では引数の小数点以下を四捨五入して返すroundメソッドを使います;
  これはdouble型の引数を渡し、Math.round（引数）のように使う;

  // Mathクラスのroundメソッドを用いて、BMIを四捨五入して出力するようにしてください
  System.out.println("BMIは" + Math.round(bmi) + "です");

  ※「java.lang.Math」はよく利用されるため、importがなくても自動で読み込まれるようになっている;
Mathクラス以外にも「java.lang.クラス名」となる外部ライブラリは全て自動で読み込まれる;

Scanner: 初期化したものを代入した変数を使ってメソッドを呼び出す;
scanner.next()とすると(Scanner.next()ではない)、コンソールに入力された文字列を
受け取ることができる;
（例）
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
                      （scannerの初期化）
    System.out.print("あなたの名前");
    String name = scanner.next();
      ↓（一旦処理を中断し、文字列の入力を受け取る、受け取ったら次の処理に進む）
    System.out.println("あなたの名前は" + name + "です");
  }
}
※「system.out.print」は改行せずに値を出力する命令;

「数値の入力を受け取る」
Scannerを用いて、整数と小数を受け取る方法;
整数→「nextInt」メソッド;
小数→「nextDouble」メソッド;

public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  System.out.print("年齢:");
  int age = scanner.nextInt();
  System.out.print("体重:");
  double weight = scanner. nextDouble();
  System.out.println("あなたの年齢は" + age + "です");
  System.out.println("あなたの体重は" + weight + "です");
}
※scanner.nextのみだと文字列でそこにIntやDoubleを加えることで整数や少数を受け取ることが可能に!;
