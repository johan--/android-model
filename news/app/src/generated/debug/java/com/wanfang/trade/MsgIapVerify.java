// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_iap_verify.proto

package com.wanfang.trade;

public final class MsgIapVerify {
  private MsgIapVerify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_IAPVerifyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_IAPVerifyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_IAPVerifyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_IAPVerifyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_CompleteIAPTradeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_CompleteIAPTradeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_CompleteIAPTradeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_CompleteIAPTradeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032trade/msg_iap_verify.proto\022\005trade\032\032grp" +
      "cCommon/msg_error.proto\"N\n\020IAPVerifyRequ" +
      "est\022\017\n\007user_id\030\001 \001(\t\022\017\n\007receipt\030\002 \001(\t\022\030\n" +
      "\020iap_order_number\030\003 \001(\t\"Q\n\021IAPVerifyResp" +
      "onse\022\026\n\016verify_success\030\001 \001(\010\022$\n\005error\030\002 " +
      "\001(\0132\025.grpcCommon.GrpcError\"o\n\027CompleteIA" +
      "PTradeRequest\022\024\n\014order_number\030\001 \001(\t\022\022\n\np" +
      "roduct_id\030\002 \001(\t\022\024\n\014iap_trade_id\030\003 \001(\t\022\024\n" +
      "\014account_type\030\004 \001(\t\"W\n\030CompleteIAPTradeR" +
      "esponse\022\025\n\rtrade_success\030\001 \001(\010\022$\n\005error\030",
      "\002 \001(\0132\025.grpcCommon.GrpcErrorB\034\n\021com.wanf" +
      "ang.tradeP\001\242\002\004WFPRb\006proto3"
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
    internal_static_trade_IAPVerifyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_trade_IAPVerifyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_IAPVerifyRequest_descriptor,
        new java.lang.String[] { "UserId", "Receipt", "IapOrderNumber", });
    internal_static_trade_IAPVerifyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_trade_IAPVerifyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_IAPVerifyResponse_descriptor,
        new java.lang.String[] { "VerifySuccess", "Error", });
    internal_static_trade_CompleteIAPTradeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_trade_CompleteIAPTradeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_CompleteIAPTradeRequest_descriptor,
        new java.lang.String[] { "OrderNumber", "ProductId", "IapTradeId", "AccountType", });
    internal_static_trade_CompleteIAPTradeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_trade_CompleteIAPTradeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_CompleteIAPTradeResponse_descriptor,
        new java.lang.String[] { "TradeSuccess", "Error", });
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
