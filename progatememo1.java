
// int型の変数定義;
// int number;

// String型の変数定義;
// String name;

変数の初期化（変数定義+同時に値導入）
int number = 3;
String text = "Hello World";

int型の変数の計算
int number1 = 10;
System.out.println(number1 + 3);

int number2 = 5;
System.out.println(number1 + number2);

String型変数の連結
String greeting = "こんにちは";
System.out.println(greeting + "佐藤さん");

String name = "鈴木さん";
System.out.println(greeting + name);

変数の更新
String name = "Sato";
System.out.println(name);
！変数の中身を上書き！
name = "Suzuki";
System.out.println(name);
※
int number = 3;
int number = 5;
上記のような変更は不可！
上書きする時は「変数名=」の形にする！

自己代入も可能
（例）
int x = 3;
x = x +2;
System.out.println(x);
この場合、一つ目のxは3であり、3+2により、二つ目のxは5になる;

自己代入の省略形！;
基本形                         省略形
x = x + 10;               x += 10;          （-,*,/,%も同様、先に計算したいものが来てその後に=）;
※xの表記は最初の一回だけで良くなる!;

さらに1を足す,1を引く際は省略可能!
x += 1;     >>>       x++;
x -= 1;     >>>       x--; 

変数の注意点;（原則:英単語）
userName...二語以上の場合は大文字で区切る（キャメルケース）;
（悪い例）
1name...数字開始;
first_name...アンダーバー（スネークケース）;
名前...日本語;

double型（小数）;
double number = 5.28;
System.out.println(number);

型変換について;
※ +などの計算は同じデータ型である必要あり!;
その中で、String型とint型を足すとint型が自動でString型に変換され、文字列の結合が行われる;
System.out.println("佐藤さんは" + 23 + "歳です");
23がString型に変換される;（文字列の結合が行われる）;
「"佐藤さんは" + "23" + "歳です"」と変換される;

int型とdouble型の計算結果違い;
System,out.println(5 / 2);      >>>2;
System.out.println(5.0 /2.0);   >>>2.5;
※int型とdouble型の計算が混ざったときはdouble型に変換され計算を行う;

強制型変換キャスト; 強制的に型変換を行うことを「キャストという」;
int number1 = 13;
int number2 = 4;
System.out.println((double)number1 / number2);
※（double）がないとint型同士の割り算となり、出力結果は3になってしまう;
※double（小数以降も計算可能）によりデータ型が変わり、正確な値がわかるようになる;
（出力結果:3.25）;