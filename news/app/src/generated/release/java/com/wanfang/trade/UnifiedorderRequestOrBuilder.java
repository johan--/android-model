// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_trade.proto

package com.wanfang.trade;

public interface UnifiedorderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trade.UnifiedorderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string user_id = 1;</code>
   */
  java.lang.String getUserId();
  /**
   * <code>optional string user_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   *支出账号，不可为空，Weixin.Android, Weixin.IOS, Alipay.Android, Alipay.IOS,ApplePay ,WFChargeCard.xxx(xxx为userid)
   * </pre>
   *
   * <code>optional .trade.AccountId transfer_out = 2;</code>
   */
  boolean hasTransferOut();
  /**
   * <pre>
   *支出账号，不可为空，Weixin.Android, Weixin.IOS, Alipay.Android, Alipay.IOS,ApplePay ,WFChargeCard.xxx(xxx为userid)
   * </pre>
   *
   * <code>optional .trade.AccountId transfer_out = 2;</code>
   */
  com.wanfang.trade.AccountId getTransferOut();
  /**
   * <pre>
   *支出账号，不可为空，Weixin.Android, Weixin.IOS, Alipay.Android, Alipay.IOS,ApplePay ,WFChargeCard.xxx(xxx为userid)
   * </pre>
   *
   * <code>optional .trade.AccountId transfer_out = 2;</code>
   */
  com.wanfang.trade.AccountIdOrBuilder getTransferOutOrBuilder();

  /**
   * <pre>
   * 统一下单需要的参数，TransactionRequest Json
   * </pre>
   *
   * <code>optional string safe_transaction_string = 3;</code>
   */
  java.lang.String getSafeTransactionString();
  /**
   * <pre>
   * 统一下单需要的参数，TransactionRequest Json
   * </pre>
   *
   * <code>optional string safe_transaction_string = 3;</code>
   */
  com.google.protobuf.ByteString
      getSafeTransactionStringBytes();
}
