// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_common.proto

package com.wanfang.personal;

public final class MsgCommon {
  private MsgCommon() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_PhoneCaptchaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_PhoneCaptchaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_PhoneCaptchaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_PhoneCaptchaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_FileMetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_FileMetaData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_FileMetaData_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_FileMetaData_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_UploadFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_UploadFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_UploadFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_UploadFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_UploadFileResponse_UploadUrlsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_UploadFileResponse_UploadUrlsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037personalCenter/msg_common.proto\022\010perso" +
      "nal\032\032grpcCommon/msg_error.proto\"$\n\023Phone" +
      "CaptchaRequest\022\r\n\005phone\030\001 \001(\t\"b\n\024PhoneCa" +
      "ptchaResponse\022\025\n\rphone_captcha\030\001 \001(\t\022\r\n\005" +
      "token\030\002 \001(\t\022$\n\005error\030\003 \001(\0132\025.grpcCommon." +
      "GrpcError\"\243\001\n\014FileMetaData\0222\n\006labels\030\001 \003" +
      "(\0132\".personal.FileMetaData.LabelsEntry\022\014" +
      "\n\004type\030\002 \001(\t\022\r\n\005owner\030\003 \001(\t\022\023\n\013login_tok" +
      "en\030\004 \001(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001\"Q\n\021UploadFileRequest\022)\n\t",
      "meta_data\030\001 \001(\0132\026.personal.FileMetaData\022" +
      "\021\n\tfile_data\030\002 \001(\014\"\260\001\n\022UploadFileRespons" +
      "e\022A\n\013upload_urls\030\001 \003(\0132,.personal.Upload" +
      "FileResponse.UploadUrlsEntry\022$\n\005error\030\002 " +
      "\001(\0132\025.grpcCommon.GrpcError\0321\n\017UploadUrls" +
      "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\037\n" +
      "\024com.wanfang.personalP\001\242\002\004WFPRb\006proto3"
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
    internal_static_personal_PhoneCaptchaRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_personal_PhoneCaptchaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_PhoneCaptchaRequest_descriptor,
        new java.lang.String[] { "Phone", });
    internal_static_personal_PhoneCaptchaResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_personal_PhoneCaptchaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_PhoneCaptchaResponse_descriptor,
        new java.lang.String[] { "PhoneCaptcha", "Token", "Error", });
    internal_static_personal_FileMetaData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_personal_FileMetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_FileMetaData_descriptor,
        new java.lang.String[] { "Labels", "Type", "Owner", "LoginToken", });
    internal_static_personal_FileMetaData_LabelsEntry_descriptor =
      internal_static_personal_FileMetaData_descriptor.getNestedTypes().get(0);
    internal_static_personal_FileMetaData_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_FileMetaData_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_personal_UploadFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_personal_UploadFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_UploadFileRequest_descriptor,
        new java.lang.String[] { "MetaData", "FileData", });
    internal_static_personal_UploadFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_personal_UploadFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_UploadFileResponse_descriptor,
        new java.lang.String[] { "UploadUrls", "Error", });
    internal_static_personal_UploadFileResponse_UploadUrlsEntry_descriptor =
      internal_static_personal_UploadFileResponse_descriptor.getNestedTypes().get(0);
    internal_static_personal_UploadFileResponse_UploadUrlsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_UploadFileResponse_UploadUrlsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
