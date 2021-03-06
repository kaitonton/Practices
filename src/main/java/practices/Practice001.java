package practices;

/**
 * int 型の変数 x、y にそれぞれ数値を入力し
 *
 * - 和
 * - 差（x－y）
 * - 積
 * - 商
 * - 余り(x÷y)
 *
 * を求める関数をそれぞれ作成しなさい
 */

public class Practice001 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        int x = 20 ; int y = 0;
        System.out.println("和＝"+ wa(x,y));
        System.out.println("差＝"+ sa(x,y));
        System.out.println("積＝"+ seki(x,y));
        System.out.println("商＝"+ sho(x,y));
        System.out.println("余り＝"+ amari(x,y));
    }

    // 和
    public static int wa(int x, int y) {
        return x + y;
    }
    // 差
    public static int sa(int x, int y) {
        return x - y ;
    }
    // 積
    public static int seki(int x, int y) {
        return x * y;
    }
    // 商
    //三項演算子によりIF分省略
    public static int sho(int x, int y) {
        return y == 0 ? 0 : x / y;
    }
    // 余り
//三項演算子によりIF分省略
    public static int amari(int x, int y) {
        return y == 0 ?  0 : x % y;
        //if(y == 0){
        //    return 0;
        //}else{
        //    return x % y;
        //}
    }
}