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
