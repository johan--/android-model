// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_trade.proto

package com.wanfang.trade;

public interface AccountIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trade.AccountId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *Weixin,AliPay,WFChargeCard,ApplePay，不可为空
   * </pre>
   *
   * <code>optional string Type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   *Weixin,AliPay,WFChargeCard,ApplePay，不可为空
   * </pre>
   *
   * <code>optional string Type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   *Android,IOS,xxx(xxx为userid之类),可为空
   * </pre>
   *
   * <code>optional string Key = 2;</code>
   */
  java.lang.String getKey();
  /**
   * <pre>
   *Android,IOS,xxx(xxx为userid之类),可为空
   * </pre>
   *
   * <code>optional string Key = 2;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();
}
