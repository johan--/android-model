// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_iap_price_list.proto

package com.wanfang.trade;

public interface IAPPriceListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trade.IAPPriceListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .trade.IAPPrice iap_price = 1;</code>
   */
  java.util.List<com.wanfang.trade.IAPPrice> 
      getIapPriceList();
  /**
   * <code>repeated .trade.IAPPrice iap_price = 1;</code>
   */
  com.wanfang.trade.IAPPrice getIapPrice(int index);
  /**
   * <code>repeated .trade.IAPPrice iap_price = 1;</code>
   */
  int getIapPriceCount();
  /**
   * <code>repeated .trade.IAPPrice iap_price = 1;</code>
   */
  java.util.List<? extends com.wanfang.trade.IAPPriceOrBuilder> 
      getIapPriceOrBuilderList();
  /**
   * <code>repeated .trade.IAPPrice iap_price = 1;</code>
   */
  com.wanfang.trade.IAPPriceOrBuilder getIapPriceOrBuilder(
      int index);
}
