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

