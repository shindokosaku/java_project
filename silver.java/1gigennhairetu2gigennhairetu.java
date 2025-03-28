🌟 1次元配列 (int[]) と 2次元配列 (int[][]) の違い
種類	    宣言例	                            説明
1次元配列	int[] array = {1, 2, 3};	          単一の要素が連続して格納されるリスト
2次元配列	int[][] array = {{1, 2}, {3, 4}};	  配列の中に配列が格納される、いわゆる「表」

💡 1次元配列 (int[])
int[] array = {10, 20, 30};
for (int num : array) {
    System.out.println(num);
}
✅ 出力結果
10
20
30
配列の型は int[] であり、「1次元のリスト」を表す。
各要素は単純な整数であり、num という変数を使って値を1つずつ取り出している。

💡 2次元配列 (int[][])
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
for (int[] row : matrix) {
    for (int num : row) {
        System.out.print(num + " ");
    }
    System.out.println();
}
✅ 出力結果
1 2 3 
4 5 6 
配列の型は int[][] であり、「2次元の表」を表す。
matrix の各要素は 1次元配列 (int[]) であり、その中に整数が格納されている。

Q.String[][] array = { { "A", "B", "C" } };
for (         ) {
    System.out.pritnln(obj);
}

このforの()の中を埋める問題で
String str : arrayだとコンパイルエラーになり、
正解がObject obj : arrayになる理由を知りたい;

まず、array は2次元配列であり、その型は String[][] です。
したがって、"1次元目の要素" は**"1次元配列（String[]）"になります。
※[][]→[]この流れを覚える！

なぜ Object で受け取れるのか？
これはJavaの配列が持つ特性に関係しています。
Javaでは、すべての配列型は Object 型のサブクラスです。
そのため、次のように書いても問題なく動作します。

for (Object obj : array) {
    System.out.println(obj);
}
✅ 出力結果
[A, B, C]

💡 String ではダメな理由
String[][] の1次元目の要素は String[] 型です。
したがって、String 型で直接受け取ろうとすると型不一致が発生します。

❌ 誤った書き方
for (String str : array) {
    System.out.println(str);
}

