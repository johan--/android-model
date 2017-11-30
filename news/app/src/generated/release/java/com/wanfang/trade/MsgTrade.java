// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_trade.proto

package com.wanfang.trade;

public final class MsgTrade {
  private MsgTrade() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_UnifiedorderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_UnifiedorderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_AccountId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_AccountId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_UnifiedorderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_UnifiedorderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_MyOrdersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_MyOrdersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_MyOrdersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_MyOrdersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_MyOrdersResponse_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_MyOrdersResponse_Result_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025trade/msg_trade.proto\022\005trade\032\032grpcComm" +
      "on/msg_error.proto\"o\n\023UnifiedorderReques" +
      "t\022\017\n\007user_id\030\001 \001(\t\022&\n\014transfer_out\030\002 \001(\013" +
      "2\020.trade.AccountId\022\037\n\027safe_transaction_s" +
      "tring\030\003 \001(\t\"&\n\tAccountId\022\014\n\004Type\030\001 \001(\t\022\013" +
      "\n\003Key\030\002 \001(\t\"\310\001\n\024UnifiedorderResponse\022\016\n\006" +
      "app_id\030\001 \001(\t\022\022\n\npartner_id\030\002 \001(\t\022\021\n\tprep" +
      "ay_id\030\003 \001(\t\022\017\n\007package\030\004 \001(\t\022\020\n\010noncestr" +
      "\030\005 \001(\t\022\022\n\ntime_stamp\030\006 \001(\t\022\014\n\004sign\030\007 \001(\t" +
      "\022\016\n\006status\030\010 \001(\t\022$\n\005error\030\t \001(\0132\025.grpcCo",
      "mmon.GrpcError\"J\n\017MyOrdersRequest\022\017\n\007use" +
      "r_id\030\001 \001(\t\022\023\n\013page_number\030\002 \001(\005\022\021\n\tpage_" +
      "size\030\003 \001(\005\"\305\002\n\020MyOrdersResponse\022/\n\007resul" +
      "ts\030\001 \003(\0132\036.trade.MyOrdersResponse.Result" +
      "\022\023\n\013total_count\030\002 \001(\005\022\020\n\010has_more\030\003 \001(\010\022" +
      "$\n\005error\030\004 \001(\0132\025.grpcCommon.GrpcError\032\262\001" +
      "\n\006Result\022\020\n\010order_id\030\001 \001(\t\022\023\n\013create_tim" +
      "e\030\002 \001(\t\022\023\n\013order_money\030\003 \001(\t\022\032\n\022order_pr" +
      "oduct_type\030\005 \001(\t\022\023\n\013order_state\030\006 \001(\005\022\023\n" +
      "\013order_title\030\007 \001(\t\022\017\n\007pay_way\030\010 \001(\t\022\025\n\rp",
      "roductDetail\030\t \001(\tB\034\n\021com.wanfang.tradeP" +
      "\001\242\002\004WFPRb\006proto3"
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
    internal_static_trade_UnifiedorderRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_trade_UnifiedorderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_UnifiedorderRequest_descriptor,
        new java.lang.String[] { "UserId", "TransferOut", "SafeTransactionString", });
    internal_static_trade_AccountId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_trade_AccountId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_AccountId_descriptor,
        new java.lang.String[] { "Type", "Key", });
    internal_static_trade_UnifiedorderResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_trade_UnifiedorderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_UnifiedorderResponse_descriptor,
        new java.lang.String[] { "AppId", "PartnerId", "PrepayId", "Package", "Noncestr", "TimeStamp", "Sign", "Status", "Error", });
    internal_static_trade_MyOrdersRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_trade_MyOrdersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_MyOrdersRequest_descriptor,
        new java.lang.String[] { "UserId", "PageNumber", "PageSize", });
    internal_static_trade_MyOrdersResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_trade_MyOrdersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_MyOrdersResponse_descriptor,
        new java.lang.String[] { "Results", "TotalCount", "HasMore", "Error", });
    internal_static_trade_MyOrdersResponse_Result_descriptor =
      internal_static_trade_MyOrdersResponse_descriptor.getNestedTypes().get(0);
    internal_static_trade_MyOrdersResponse_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_MyOrdersResponse_Result_descriptor,
        new java.lang.String[] { "OrderId", "CreateTime", "OrderMoney", "OrderProductType", "OrderState", "OrderTitle", "PayWay", "ProductDetail", });
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
