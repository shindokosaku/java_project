🌟 do~while文 と while文 の違い
特徴	                    do~while文	                   while文
条件の評価タイミング	      ループの最後に条件を評価する	      ループの最初に条件を評価する
最低実行回数	             必ず1回は実行される	             条件がfalseの場合、1回も実行されない
書き方	                 do { ... } while (条件);	        while (条件) { ... }

🔁 do~while文の例
int i = 0;

do {
    System.out.println("実行回数: " + i);
    i++;
} while (i < 3);

✅ 出力結果
実行回数: 0
実行回数: 1
実行回数: 2

🔁 while文の例
int i = 0;

while (i < 3) {
    System.out.println("実行回数: " + i);
    i++;
}
✅ 出力結果
実行回数: 0
実行回数: 1
実行回数: 2
