// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bind/msg_wfcard_bind.proto

package com.wanfang.bind;

public final class MsgWfcardBind {
  private MsgWfcardBind() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bind_WFCardBindRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bind_WFCardBindRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bind_WFCardBindResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bind_WFCardBindResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bind_WFCardBlanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bind_WFCardBlanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bind_WfCardBlanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bind_WfCardBlanceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032bind/msg_wfcard_bind.proto\022\004bind\032\032grpc" +
      "Common/msg_error.proto\"]\n\021WFCardBindRequ" +
      "est\022\017\n\007user_id\030\001 \001(\t\022\023\n\013login_token\030\002 \001(" +
      "\t\022\020\n\010card_num\030\003 \001(\t\022\020\n\010card_pwd\030\004 \001(\t\"J\n" +
      "\022WFCardBindResponse\022\016\n\006status\030\001 \001(\t\022$\n\005e" +
      "rror\030\002 \001(\0132\025.grpcCommon.GrpcError\"&\n\023WFC" +
      "ardBlanceRequest\022\017\n\007user_id\030\001 \001(\t\"L\n\024WfC" +
      "ardBlanceResponse\022\016\n\006blance\030\001 \001(\t\022$\n\005err" +
      "or\030\002 \001(\0132\025.grpcCommon.GrpcErrorB\033\n\020com.w" +
      "anfang.bindP\001\242\002\004WFPRb\006proto3"
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
    internal_static_bind_WFCardBindRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bind_WFCardBindRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bind_WFCardBindRequest_descriptor,
        new java.lang.String[] { "UserId", "LoginToken", "CardNum", "CardPwd", });
    internal_static_bind_WFCardBindResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bind_WFCardBindResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bind_WFCardBindResponse_descriptor,
        new java.lang.String[] { "Status", "Error", });
    internal_static_bind_WFCardBlanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bind_WFCardBlanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bind_WFCardBlanceRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_bind_WfCardBlanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bind_WfCardBlanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bind_WfCardBlanceResponse_descriptor,
        new java.lang.String[] { "Blance", "Error", });
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
