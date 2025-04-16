package Test.Company;


public class SalesEmployee {
    // 会社名
    private static final String COMPANY_NAME = "○○商事";
    // 標準売上金額
    private static final int DEFAULT_SALES_AMT = 150000;
    // 名前
    private String name;
    // 売上合計金額
    private int salesAmt;

    // ========== コンストラクタ ==============
    //　名前・売上合計金額の初期化
    public SalesEmployee(String name, int salesAmt) {
        this.name = name;
        this.salesAmt = salesAmt;
    }

    // 名前・売上合計金額は0で初期化
    public SalesEmployee(String name) {
        this(name, 0);
    }

    // ========== メソッド =================
    // 会社名の表示
    public static void displayCompany() {
        System.out.println("会社名:　" + COMPANY_NAME);
    }

    // 売上金額
    public int sell(int amt) {
        return salesAmt += amt;
    }

    public int sell() {
        return this.sell(DEFAULT_SALES_AMT);
    }

    // 返品を受け付ける
    public int refund(int amt) {
        return salesAmt -= amt;
    }

    // 情報表示
    public void displayInfo() {
        System.out.println("名前:　" + name);
        System.out.println("売上:　" + salesAmt + "円");
    }
}
