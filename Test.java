import java.util.Scanner;

public class Test {
    public static void main1(String[] args) {
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 = Integer.valueOf(59);
        // 返回一个 Integer 指定的 int 值的 Integer 实例
        Integer i04 = new Integer(59);

        System.out.println(i03 == i04); // false
        System.out.println(i01 == i03); // true
        System.out.println(i01 == i02); // true
        System.out.println(i02 == i04); // true
    }
}

class SendValue {
    public String str = "6";

    public static void main2(String[] args) {
        SendValue sv = new SendValue();
        sv.change(sv.str);
        System.out.println(sv.str); // 6
    }

    private void change(String str) {
        str = "10";
    }
}

class Main {
    public static void main1(String[] args) {
        // 一个百万富翁遇到一个陌生人，陌生人找他谈了一个换钱的计划。
        // 该计划如下：我每天给你 10 万元，你第一天给我 1 分钱，第二天 2 分钱，第三天 4 分钱 ……
        // 这样交换 30 天后，百万富翁交出了多少钱？陌生人交出了多少钱？（注意一个是万元，一个是分）

        //输入描述:
        //该题没有输入

        //输出描述:
        //输出两个整数，分别代表百万富翁交出的钱和陌生人交出的钱，富翁交出的钱以万元作单位，陌生人交出的钱以分作单位。

        int richMan = 10;
        int strangeMan = 0;
        int count = 30;
        richMan = 10 * 30;
        int money = 1;
        for (int i = 0; i < count; i++) {
            strangeMan += money;
            money *= 2;
        }
        System.out.print(richMan + " ");
        System.out.print(strangeMan);
    }

    public static void main(String[] args) {
        // 一个 DNA 序列由 A / C / G / T 四个字母的排列组合组成。
        // G 和 C 的比例（定义为 GC-Ratio）是序列中 G 和 C 两个字母的总的出现次数除以总的字母数目（也就是序列长度）。
        // 在基因工程中，这个比例非常重要。因为高的 GC-Ratio 可能是基因的起始点。
        // 给定一个很长的 DNA 序列，以及要求的最小子序列长度，研究人员经常会需要在其中找出 GC-Ratio 最高的子序列。

        // 输入一个 string 型基因序列，和 int 型子串的长度
        // 找出 GC 比例最高的子串, 如果有多个输出第一个的子串

        // 示例:
        // 输入
        // AACTGTGCACGACCTGA
        // 5
        // 输出
        // GCACG

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String strs = sc.next();
            int n = sc.nextInt();
            int max = 0;
            int s = 0;
            for (int i = 0; i < strs.length(); i++) {
                if (strs.length() - i < n) {
                    break;
                }
                int count = 0;
                for (int j = i; j < (n + i); j++) {
                    if (strs.charAt(j) == 'G' || strs.charAt(j) == 'C') {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                    s = i;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(strs.charAt(s));
                s++;
            }
        }
        sc.close();
    }
}