// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_iap_price_list.proto

package com.wanfang.trade;

public final class MsgIapPriceList {
  private MsgIapPriceList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_IAPPriceListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_IAPPriceListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_IAPPriceListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_IAPPriceListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_IAPPrice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_IAPPrice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036trade/msg_iap_price_list.proto\022\005trade\032" +
      "\032grpcCommon/msg_error.proto\"&\n\023IAPPriceL" +
      "istRequest\022\017\n\007user_id\030\001 \001(\t\":\n\024IAPPriceL" +
      "istResponse\022\"\n\tiap_price\030\001 \003(\0132\017.trade.I" +
      "APPrice\"D\n\010IAPPrice\022\r\n\005price\030\001 \001(\t\022\025\n\rvi" +
      "rtual_price\030\002 \001(\t\022\022\n\nproduct_id\030\003 \001(\tB\034\n" +
      "\021com.wanfang.tradeP\001\242\002\004WFPRb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wanfang.grpcCommon.MsgError.getDescriptor(),
        }, assigner);
    internal_static_trade_IAPPriceListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_trade_IAPPriceListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_IAPPriceListRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_trade_IAPPriceListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_trade_IAPPriceListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_IAPPriceListResponse_descriptor,
        new java.lang.String[] { "IapPrice", });
    internal_static_trade_IAPPrice_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_trade_IAPPrice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_IAPPrice_descriptor,
        new java.lang.String[] { "Price", "VirtualPrice", "ProductId", });
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
