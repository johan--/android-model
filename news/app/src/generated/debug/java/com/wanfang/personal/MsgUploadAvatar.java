// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_upload_avatar.proto

package com.wanfang.personal;

public final class MsgUploadAvatar {
  private MsgUploadAvatar() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_UploadAvatarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_UploadAvatarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_UploadAvatarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_UploadAvatarResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&personalCenter/msg_upload_avatar.proto" +
      "\022\010personal\032\032grpcCommon/msg_error.proto\":" +
      "\n\023UploadAvatarRequest\022\017\n\007user_id\030\001 \001(\t\022\022" +
      "\n\navatar_url\030\002 \001(\t\"<\n\024UploadAvatarRespon" +
      "se\022$\n\005error\030\001 \001(\0132\025.grpcCommon.GrpcError" +
      "B\037\n\024com.wanfang.personalP\001\242\002\004WFPRb\006proto" +
      "3"
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
    internal_static_personal_UploadAvatarRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_personal_UploadAvatarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_UploadAvatarRequest_descriptor,
        new java.lang.String[] { "UserId", "AvatarUrl", });
    internal_static_personal_UploadAvatarResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_personal_UploadAvatarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_UploadAvatarResponse_descriptor,
        new java.lang.String[] { "Error", });
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}