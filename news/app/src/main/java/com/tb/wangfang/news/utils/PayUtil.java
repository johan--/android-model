package com.tb.wangfang.news.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import com.alipay.sdk.app.PayTask;
import com.tb.wangfang.news.app.Constants;
import com.tb.wangfang.news.model.bean.MapMessage;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2016/8/8.
 */
public class PayUtil {
    private static String TAG = "PayUtil";
    // 以下内容是微信支付的
    public static final String APP_ID = Constants.APP_ID;

    // 商户号
    public static final String MCH_ID = "1491926672";

    // API密钥，在商户平台设置
    public static final String API_KEY = "d7ccf9c04373499480938ed3946ecb25";


    // //////////////////////////// 微信支付//////////////////////////////
    private static IWXAPI api;

    static IWXAPI msgApi = null;

    /**
     * 传入prepay_id调起支付
     *
     * @param context
     * @param prepay_id
     */
    public static void payWeiXin(Context context, String prepay_id) {
        if (msgApi == null) {
            msgApi = WXAPIFactory.createWXAPI(context, null);
            Log.d(TAG, "payWeiXin:msgApi == null createWXAPI");
        }
        Log.d(TAG, "payWeiXin: createWXAPI");
        msgApi.registerApp(APP_ID);
        Log.d(TAG, "payWeiXin: registerApp(APP_ID)");
        api = WXAPIFactory.createWXAPI(context, APP_ID);
        Log.d(TAG, "payWeiXin: createWXAPI");
        genPayReq(prepay_id);
        Log.d(TAG, "payWeiXin: genPayReq");
        sendPayReq(context);
        Log.d(TAG, "payWeiXin: sendPayReq");
    }

    /**
     * 传入prepay_id调起支付
     *
     * @param context
     * @param prepay_id
     */
    public static void payWeiXin(Context context, String prepay_id, ProgressDialog pd) {
        if (msgApi == null) {
            msgApi = WXAPIFactory.createWXAPI(context, null);
            Log.d(TAG, "payWeiXin:msgApi == null createWXAPI");
        }
        Log.d(TAG, "payWeiXin: createWXAPI");
        msgApi.registerApp(APP_ID);
        Log.d(TAG, "payWeiXin: registerApp(APP_ID)");
        api = WXAPIFactory.createWXAPI(context, APP_ID);
        Log.d(TAG, "payWeiXin: createWXAPI");
        genPayReq(prepay_id);
        Log.d(TAG, "payWeiXin: genPayReq");
        sendPayReq(context, pd);
        Log.d(TAG, "payWeiXin: sendPayReq");
    }

    private static PayReq req;

    private static void genPayReq(String prepay_id) {
        req = new PayReq();
        req.appId = APP_ID;
        req.partnerId = MCH_ID;
        req.prepayId = prepay_id;
        req.packageValue = "Sign=WXPay";
        req.nonceStr = genNonceStr();
        req.timeStamp = String.valueOf(genTimeStamp());

        List<MapMessage> signParams = new LinkedList<MapMessage>();
        signParams.add(new MapMessage("appid", req.appId));
        signParams.add(new MapMessage("noncestr", req.nonceStr));
        signParams.add(new MapMessage("package", req.packageValue));
        signParams.add(new MapMessage("partnerid", req.partnerId));
        signParams.add(new MapMessage("prepayid", req.prepayId));
        signParams.add(new MapMessage("timestamp", req.timeStamp));
        req.sign = genAppSign(signParams);
        Log.e("8", signParams.toString());
        Log.e("9", req.sign.toString());
    }

    private static void genPayReq(Map<String, String> resultunifiedorder) {
        String prepay_id = resultunifiedorder.get("prepay_id");
        genPayReq(prepay_id);
    }

    /**
     * @return 获得随机字符串
     */
    private static String genNonceStr() {
        Random random = new Random();
        return MD5.getMessageDigest(String.valueOf(random.nextInt(10000)).getBytes());
    }

    /**
     * @return 获得时间
     */
    private static long genTimeStamp() {
        return System.currentTimeMillis() / 1000;
    }

    private static String genAppSign(List<MapMessage> params) {
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < params.size(); i++) {
            sb2.append(params.get(i).getKey());
            sb2.append('=');
            sb2.append(params.get(i).getValue());
            sb2.append('&');
        }
        sb2.append("key=");
        sb2.append(API_KEY);
        Log.e(TAG, "genAppSign:sb2 " + sb2);
        String appSign = MD5.getMessageDigest(sb2.toString().getBytes()).toUpperCase();
        Log.e("2", appSign);
        return appSign;
    }

    private static void sendPayReq(Context context, ProgressDialog pd) {
        api.registerApp(APP_ID);
        boolean ifSuccess = api.sendReq(req);
        if (ifSuccess == false) {
            Toast.makeText(context, "支付失败，请检查您的微信", Toast.LENGTH_SHORT).show();
        }
    }

    private static void sendPayReq(Context context) {
        api.registerApp(APP_ID);
        boolean ifSuccess = api.sendReq(req);

        if (ifSuccess == false) {
            Toast.makeText(context, "支付失败，请检查您的微信", Toast.LENGTH_SHORT).show();
        }
    }
    // ////////////////////////////微信支付//////////////////////////////

    // ////////////////////////////支付宝支付//////////////////////////////
    public static final int SDK_PAY_FLAG = 13168;


//    private Handler mHandler = new Handler() {
//        @SuppressWarnings("unused")
//        public void handleMessage(Message msg) {
//            switch (msg.what) {
//                case SDK_PAY_FLAG: {
//                    PayResult payResult = new PayResult((String) msg.obj);
//                    /**
//                     * 同步返回的结果必须放置到服务端进行验证（验证的规则请看https://doc.open.alipay.com/doc2/
//                     * detail.htm?spm=0.0.0.0.xdvAU6&treeId=59&articleId=103665&
//                     * docType=1) 建议商户依赖异步通知
//                     */
//                    String resultInfo = payResult.getResult();// 同步返回需要验证的信息
//
//                    String resultStatus = payResult.getResultStatus();
//                    // 判断resultStatus 为“9000”则代表支付成功，具体状态码代表含义可参考接口文档
//                    if (TextUtils.equals(resultStatus, "9000")) {
//                        Toast.makeText(PayDemoActivity.this, "支付成功", Toast.LENGTH_SHORT).show();
//                    } else {
//                        // 判断resultStatus 为非"9000"则代表可能支付失败
//                        // "8000"代表支付结果因为支付渠道原因或者系统原因还在等待支付结果确认，最终交易是否成功以服务端异步通知为准（小概率状态）
//                        if (TextUtils.equals(resultStatus, "8000")) {
//                            Toast.makeText(PayDemoActivity.this, "支付结果确认中", Toast.LENGTH_SHORT).show();
//
//                        } else {
//                            // 其他值就可以判断为支付失败，包括用户主动取消支付，或者系统返回的错误
//                            Toast.makeText(PayDemoActivity.this, "支付失败", Toast.LENGTH_SHORT).show();
//
//                        }
//                    }
//                    break;
//                }
//                default:
//                    break;
//            }
//        }
//    };

    /**
     * @param act
     * @param orderInfo 订单详细字符串——由服务端返回
     * @param sign      订单详细字符串的签名——由服务端返回
     * @param mHandler  handler回调 {@link #SDK_PAY_FLAG}，具体使用请参考{@link PayUtil}中注释的handler
     */
    public static void payByAli(final Activity act, String orderInfo, String sign, final Handler mHandler) {
        /**
         * 完整的符合支付宝参数规范的订单信息
         */
        final String payInfo = orderInfo + "&sign=\"" + sign + "\"&" + getSignType();

        Runnable payRunnable = new Runnable() {

            @Override
            public void run() {
                // 构造PayTask 对象
                PayTask alipay = new PayTask(act);
                // 调用支付接口，获取支付结果
                String result = alipay.pay(payInfo, true);

                Message msg = new Message();
                msg.what = SDK_PAY_FLAG;
                msg.obj = result;
                mHandler.sendMessage(msg);
            }
        };

        // 必须异步调用
        Thread payThread = new Thread(payRunnable);
        payThread.start();
    }

    /**
     * get the sign type we use. 获取签名方式
     */
    private static String getSignType() {
        return "sign_type=\"RSA\"";
    }
    // ////////////////////////////支付宝支付//////////////////////////////
}
