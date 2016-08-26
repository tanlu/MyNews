package gjl.com.mynews.https.https;

import gjl.com.mynews.app.App;

/**
 * Created by ${郭金林} on ${2016.5.16}.
 */
public class Url {
    /**
     * 	错误码	说明	旧版本（resultcode）
     10001	错误的请求KEY	101
     10002	该KEY无请求权限	102
     10003	KEY过期	103
     10004	错误的OPENID	104
     10005	应用未审核超时，请提交认证	105
     10007	未知的请求源	107
     10008	被禁止的IP	108
     10009	被禁止的KEY	109
     10011	当前IP请求超过限制	111
     10012	请求超过次数限制	112
     10013	测试KEY超过请求限制	113
     10014	系统内部异常(调用充值类业务时，请务必联系客服或通过订单查询接口检测订单，避免造成损失)	114
     10020	接口维护	120
     10021	接口停用


     请求方式：get/post
     请求示例：http://v.juhe.cn/toutiao/index?type=top&key=2f41498b35e69877fc56dc96776e5d1f



     名称	类型	必填	说明
     key	string	是	应用APPKEY
     type	string	否	类型,,top(头条，默认),shehui(社会),guonei(国内),guoji(国际)
            ,yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)
     */
    /**
     * 返回实例
     * {
     "reason": "成功的返回",
     "result": {
     "stat": "1",
     "data": [
     {
     "title": "巫山云雨枉断肠：女摄影师Erika Lust记录的性爱",/*标题*/
//    "date": "2016-06-13 10:31",/*时间*/
//            "author_name": "POCO摄影",/*作者*/
//            "thumbnail_pic_s": "http://09.imgmini.eastday.com/mobile/20160613/20160613103108_7b015493398e7fd13dda3a5c
//    e315b1c8_1_mwpm_03200403.jpeg",/*图片1*/
//            "thumbnail_pic_s02": "http://09.imgmini.eastday.com/mobile/20160613/20160613103108_7b015493398e7fd13dda3a5ce315
//    b1c8_1_mwpl_05500201.jpeg",/*图片2*/
//            "thumbnail_pic_s03": "http://09.imgmini.eastday.com/mobile/20160613/20160613103108_7b015493398e7fd13dda3a5ce315
//    b1c8_1_mwpl_05500201.jpeg",/*图片3*/
//            "url": "http://mini.eastday.com/mobile/160613103108379.html?qid=juheshuju",/*新闻链接*/
//            "uniquekey": "160613103108379",/*唯一标识*/
//            "type": "头条",/*类型一*/
//            "realtype": "娱乐"/*类型二*/
//},
//        ...]}}
//     */
//    public static String

    //主地址
    public static String BASE_URL="http://v.juhe.cn/toutiao/index";
    //问好分隔符
    public static String URL_Q="?";
    //请求地址
    //头条
    public static String TOP_NEWS_URL=BASE_URL+URL_Q+"type=top&key="+ App.APP_KEY;
    //社会
    public static String SHEHUI_NEWS_URL=BASE_URL+URL_Q+"type=shehui&key="+ App.APP_KEY;
    //国内
    public static String GUONEI_NEWS_URL=BASE_URL+URL_Q+"type=guonei&key="+ App.APP_KEY;
    //国际
    public static String GUOJI_NEWS_URL=BASE_URL+URL_Q+"type=guoji&key="+ App.APP_KEY;
    //娱乐
    public static String YULE_NEWS_URL=BASE_URL+URL_Q+"type=yule&key="+ App.APP_KEY;
    //体育
    public static String TIYU_NEWS_URL=BASE_URL+URL_Q+"type=tiyu&key="+ App.APP_KEY;
    //军事
    public static String JUNSHI_NEWS_URL=BASE_URL+URL_Q+"type=junshi&key="+ App.APP_KEY;
    //科技
    public static String KEJI_NEWS_URL=BASE_URL+URL_Q+"type=keji&key="+ App.APP_KEY;
    //财经
    public static String CAIJING_NEWS_URL=BASE_URL+URL_Q+"type=caijing&key="+ App.APP_KEY;
    //时尚
    public static String SHISHANG_NEWS_URL=BASE_URL+URL_Q+"type=shishang&key="+ App.APP_KEY;
}
