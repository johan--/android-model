// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: charge/msg_charge.proto

package com.wanfang.charge;

public final class MsgCharge {
  private MsgCharge() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_charge_ChargeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_charge_ChargeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_charge_TransferIn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_charge_TransferIn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_charge_ChargeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_charge_ChargeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027charge/msg_charge.proto\022\006charge\032\032grpcC" +
      "ommon/msg_error.proto\"\261\001\n\rChargeRequest\022" +
      "\017\n\007user_id\030\001 \001(\t\022\023\n\013login_token\030\002 \001(\t\022\'\n" +
      "\013transfer_in\030\003 \001(\0132\022.charge.TransferIn\022\020" +
      "\n\010pay_type\030\004 \001(\t\022\020\n\010turnover\030\005 \001(\t\022\026\n\016pr" +
      "oduct_detail\030\006 \001(\t\022\025\n\rproduct_title\030\007 \001(" +
      "\t\"\'\n\nTransferIn\022\014\n\004Type\030\001 \001(\t\022\013\n\003Key\030\002 \001" +
      "(\t\"\262\001\n\016ChargeResponse\022\016\n\006app_id\030\001 \001(\t\022\022\n" +
      "\npartner_id\030\002 \001(\t\022\021\n\tprepay_id\030\003 \001(\t\022\017\n\007" +
      "package\030\004 \001(\t\022\020\n\010noncestr\030\005 \001(\t\022\022\n\ntime_",
      "stamp\030\006 \001(\t\022\014\n\004sign\030\007 \001(\t\022$\n\005error\030\010 \001(\013" +
      "2\025.grpcCommon.GrpcErrorB\035\n\022com.wanfang.c" +
      "hargeP\001\242\002\004WFPRb\006proto3"
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
    internal_static_charge_ChargeRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_charge_ChargeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_charge_ChargeRequest_descriptor,
        new java.lang.String[] { "UserId", "LoginToken", "TransferIn", "PayType", "Turnover", "ProductDetail", "ProductTitle", });
    internal_static_charge_TransferIn_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_charge_TransferIn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_charge_TransferIn_descriptor,
        new java.lang.String[] { "Type", "Key", });
    internal_static_charge_ChargeResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_charge_ChargeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_charge_ChargeResponse_descriptor,
        new java.lang.String[] { "AppId", "PartnerId", "PrepayId", "Package", "Noncestr", "TimeStamp", "Sign", "Error", });
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}