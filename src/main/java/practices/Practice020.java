package practices;

/**
 * 入力された文字列が郵便番号、電話番号、メールアドレス、それ以外のいずれかを判定する関数
 * isPostNumber
 * isPhoneNumber
 * isMailAddress
 * をそれぞれ作成しなさい
 *
 * isPostNumber
 * 入力：文字列
 * 出力：true/false
 * 判定条件：7桁の連続した数値の文字列, 3桁-4桁の数値とハイフンで構成された文字列
 * 例：1234567=true, 123-4567=true, ...
 *
 * isPhoneNumber
 * 入力：文字列
 * 出力：true/false
 * 判定条件：11桁の連続した数値の文字列, 数値とハイフン2つで構成された文字列
 * 例：09012345678=true, 090-1234-5678=true, 03-1234-5678=true, ...
 *
 * isMailAddress
 * 入力：文字列
 * 出力：true/false
 * 判定条件：@を必ず含む, 末尾が ".com", ".co.jp", ".ne.jp" で終わる
 * 例：hoge@fuga.com=true, anonymous123@hoge.co.jp=true, ...
 *
 */

public class Practice020 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        String postNumber = "1234567";
        String phoneNumber = "031234-5678";
        String mailAddress = "hogo@hogo.com";
        System.out.println(isPostNumber(postNumber));
        System.out.println(isPhoneNumber(phoneNumber));
        System.out.println(isMailAddress(mailAddress));
    }
    public static boolean isPostNumber(String s) {
        return s.matches("^[0-9]{3}-?[0-9]{4}$");
    }
    public static boolean isPhoneNumber(String s) {
        //return s.matches("[0-9]{11}|[0-9]{3}-[0-9]{4}-?[0-9]{4}|[0-9]{2}-?[0-9]{4}-[0-9]{4}");
        return s.matches("[0-9]{3}-?[0-9]{4}-?[0-9]{4}|[0-9]{2}-?[0-9]{4}-?[0-9]{4}");
    }
    public static boolean isMailAddress(String s) {
        return s.matches("^..*@.*(\\.com|\\.co\\.jp|\\.ne\\.jp)$");

/*正規表現しなくても答えられた
        if(!(s.contains("@"))) return false;
        if(s.substring(0,1).equals("@")) return false;
        if(s.endsWith(".ne.jp") || s.endsWith(".co.jp") || s.endsWith(".com") ) return true;
        return false;
 */

    }
}
