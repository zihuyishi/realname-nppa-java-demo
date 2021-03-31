package demo;

import com.google.gson.Gson;
import demo.model.CheckResponse;

public class Demo {
    static String AppId = "test-appId";
    static String BizId = "test-bizId";
    static String Key = "2836e95fcd10e04b0069bb1ee659955b";
    static String CheckUrl = "https://api.wlc.nppa.gov.cn/idcard/authentication/check";
    static String QueryUrl = "http://api2.wlc.nppa.gov.cn/idcard/authentication/query";
    public static void main(String[] args) {
        Nppa nppa = new Nppa(AppId, BizId, Key);
        Gson gson = new Gson();
        CheckResponse res = nppa.checkIdCard(CheckUrl, "100000000000000001", "某一一", "110000190101010001");
        System.out.println(gson.toJson(res));
        res = nppa.queryIdCardResult(QueryUrl, "100000000000000001");
        System.out.println(gson.toJson(res));
    }
}
