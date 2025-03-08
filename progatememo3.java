メソッド:処理をまとめた部品;
（例）
class Main{
 public static void main(String[] args){
  hello();
 }
 public static void hello(){
  System.out.println("Hello World");
 }
}
上記の図でMain.javaを実行すると;
1.mainメソッドが呼ばれる;
2.mainメソッドの中で、helloメソッドが呼ばれる;
3.helloメソッドの中で、System.out.println("Hello World")が実行される;

public static void メソッド名(){
  実行する処理;
}
※メソッド名は好きにつけることができるが、処理の内容が
想像できるものにすること;
※メソッドは上記の図のようにクラスの中に定義しないとエラーになる！;
（上記の図だとMainクラスのブロックに入っている;）

メソッドの呼び出し;
メソッドの呼び出しは「メソッド名()」()を忘れないようにする;
（例）
class Main{
  public static void main(String[] args){
    hello();
    hello(); 
  }
  public static void hello() {
    System.out.println("Hello World");
  }
}
出力結果;
Hello World
Hello World

引数:メソッドに与える追加情報;
メソッドを引き出すときに、一緒に引数を渡すと、メソッドの中でその値を利用することができる;
メソッド名()の()の部分に引数を入れる;
public static void メソッド名（データ型 変数名）{
  実行する処理;
}

（例）
class Main{
  public static void main(String[] args){
    hello("Bob");
  }  ※Bobという引数を String name といったものに置き換える;
  public static void hello(String name){
    System.out.println(name + "さんこんにちは");
  }
}
出力結果:Bobさんこんにちは;

※引数は複数渡すこともできる、左から第1引数、第2引数と呼ぶ;
それぞれの間には「,」で区切って定義する;
（例）
public static void メソッド名(データ名 変数名1, データ型 変数名){
  実行する処理;
}
（例）※実際に複数の引数を渡す;
class Main{
  public static void main(String[] args){
    printPrice("ピザ",3000);
    printPrice("コーラ",150);
  }
  public static void printPrice(String item, int price){
    System.out.println(item + "は" + price + "円です");
  }
}
出力結果;
ピザは3000円です;
コーラは150円です;

戻り値;
メソッドの中でreturnを使うと、returnの値をメソッドの呼び出し元に返す;
戻り値があるメソッドは、戻り値のデータ型を指定する;
（例）
public static int add(int a, int b){
              （※戻り値のデータ型）
  return a + b;
  （呼び出し元に値を返す）
}
※addメソッドは、戻り値が整数なので、「public static int...」となる;
※voidは定型; ※戻り値（return）がないという意味でもある;
（具体例）
戻り値がある場合、メソッドの呼び出し部分がそのまま値に変わる;
public static void main(String[] args){
  int total = add(7,5);  ※12
  System.out.println(total);
}
public static int add(int a, int b){
  return a + b;
         (7+5の結果が戻り値となる)
}
出力結果;
12


戻り値練習問題;
class Main{
  public static void main(String[] args){
    // fullメソッドの結果を変数nameに代入してください;
    String name = fullName("Kate", "Jones"); ※代入とくれば=という頭を持つ;

    // printDataの引数を書き換えろ;
    printData(name, 27); ※変数nameにfullNameを代入したのでここでnameを定義するのはfullNameという意味合いになる;
    // 書き換えないver;
    printData("John Smith", 65);
  }
   public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }
  // fullNameメソッドを定義してください;
  public static String fullName(String firstName, String lastName) {
    return firstName+ " " + lastName;
  }
}
出力結果;
私の名前はKate Jonesです
年齢は27歳です
私の名前はJohn Smithです
年齢は65歳です

※原則として同名のメソッドは定義できない;
※ただし、引数の方や個数が違う場合は同名のメソッドを定義できる;
同名のメソッドでも、因数が違えば、どれを呼べばいいかをコンピュータが判断できるため。
このように同名のメソッドを定義することを「オーバーロード」という;
（例）
public static void main(String[] args){
  hello();      ←引数がないhelloメソッド;
  hello("Bob"); ←String型の引数を持つhelloメソッド;
}

public static void hello(){
  System.out.println("こんにちは世界");
}
public static void hello(String name){
  System.out.println("こんにちは" + name + "さん");
}
// 出力結果;
こんにちは世界
こんにちはBobさん

メソッドから他のメソッドを呼ぶ;
（イメージ図）
mainメソッド→1.OOしてください「メソッド1」→2.++してください 「メソッド2」
           ←4. （戻り値）             ←3. （戻り値）
（例）
public static void main(String[] args){
  System.out.println(average(3,8));
}

public static double average(int a, int b){
  int total = add(a, b);                 ※「add(a, b)が」
  return (double)total/2;                ↓
}                                        ↓
public static int add(int a, int b){     ←ここのメソッドになっている;
  return a + b;
}

Q.変数bmiに、bmiメソッドを用いてBMIを代入してください;
A.double bmi = bmi(height, weight);

（中間文）
System.out.println("BMIは" bmi + "です");

※メソッドを定義してくださいとくれば;
public static double bmi(double height, double weight){
  return weight / height / height;  ※ここでの戻り値が中間文のbmiに代入される;
}

真偽値を返す;
真偽値のデータ型「boolean」;
「isEven」メソッドは引数の値が偶数がどうかを調べ、偶数であれば、true,奇数であれば,false,を返す;
（例）
public static boolean isEven(int a) {
  return a % 2 == 0;
}        ※2で割った余が0であれば、true;
（例）
public static void main(String[] args){
  int number = 9;
  if(isEven(number)){
    System.out.println(number + "は偶数です");
  }else{
    System.out.println(number + "は奇数です");
  }
}
public static boolean isEven(int a){
  return a % 2 == 0;
}

出力結果:9は奇数です