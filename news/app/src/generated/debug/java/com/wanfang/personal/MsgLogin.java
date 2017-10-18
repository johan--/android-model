// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_login.proto

package com.wanfang.personal;

public final class MsgLogin {
  private MsgLogin() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_LoginOutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_LoginOutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_LoginOutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_LoginOutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_LoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_LoginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_QuickLoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_QuickLoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_BindExistAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_BindExistAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_BindNewRegistRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_BindNewRegistRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036personalCenter/msg_login.proto\022\010person" +
      "al\032\032grpcCommon/msg_error.proto\"7\n\017LoginO" +
      "utRequest\022\017\n\007user_id\030\001 \001(\t\022\023\n\013login_toke" +
      "n\030\002 \001(\t\"8\n\020LoginOutResponse\022$\n\005error\030\002 \001" +
      "(\0132\025.grpcCommon.GrpcError\"v\n\014LoginReques" +
      "t\022\020\n\010password\030\001 \001(\t\022\021\n\tuser_name\030\002 \001(\t\022\021" +
      "\n\tdevice_id\030\003 \001(\t\022.\n\013device_type\030\004 \001(\0162\031" +
      ".personal.LoginDeviceType\"\207\001\n\rLoginRespo" +
      "nse\022\017\n\007user_id\030\001 \001(\t\022\021\n\tuser_name\030\002 \001(\t\022" +
      "\027\n\017user_avatar_url\030\003 \001(\t\022\023\n\013login_token\030",
      "\004 \001(\t\022$\n\005error\030\005 \001(\0132\025.grpcCommon.GrpcEr" +
      "ror\"\205\001\n\021QuickLoginRequest\022\r\n\005phone\030\001 \001(\t" +
      "\022\r\n\005token\030\002 \001(\t\022\017\n\007captcha\030\003 \001(\t\022\021\n\tdevi" +
      "ce_id\030\004 \001(\t\022.\n\013device_type\030\005 \001(\0162\031.perso" +
      "nal.LoginDeviceType\"\302\001\n\027BindExistAccount" +
      "Request\022\013\n\003uid\030\001 \001(\t\022\021\n\tuser_name\030\002 \001(\t\022" +
      "\020\n\010password\030\003 \001(\t\022\021\n\tdevice_id\030\004 \001(\t\022.\n\013" +
      "device_type\030\005 \001(\0162\031.personal.LoginDevice" +
      "Type\0222\n\020third_party_type\030\006 \001(\0162\030.persona" +
      "l.ThirdPartyType\"~\n\024BindNewRegistRequest",
      "\022\021\n\tuser_name\030\001 \001(\t\022\r\n\005email\030\002 \001(\t\022\020\n\010pa" +
      "ssword\030\003 \001(\t\0222\n\020third_party_type\030\004 \001(\0162\030" +
      ".personal.ThirdPartyType*.\n\016ThirdPartyTy" +
      "pe\022\n\n\006WECHAT\020\000\022\006\n\002QQ\020\001\022\010\n\004SINA\020\003*\'\n\017Logi" +
      "nDeviceType\022\013\n\007ANDROID\020\000\022\007\n\003IOS\020\001B\037\n\024com" +
      ".wanfang.personalP\001\242\002\004WFPRb\006proto3"
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
    internal_static_personal_LoginOutRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_personal_LoginOutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_LoginOutRequest_descriptor,
        new java.lang.String[] { "UserId", "LoginToken", });
    internal_static_personal_LoginOutResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_personal_LoginOutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_LoginOutResponse_descriptor,
        new java.lang.String[] { "Error", });
    internal_static_personal_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_personal_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_LoginRequest_descriptor,
        new java.lang.String[] { "Password", "UserName", "DeviceId", "DeviceType", });
    internal_static_personal_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_personal_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_LoginResponse_descriptor,
        new java.lang.String[] { "UserId", "UserName", "UserAvatarUrl", "LoginToken", "Error", });
    internal_static_personal_QuickLoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_personal_QuickLoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_QuickLoginRequest_descriptor,
        new java.lang.String[] { "Phone", "Token", "Captcha", "DeviceId", "DeviceType", });
    internal_static_personal_BindExistAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_personal_BindExistAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_BindExistAccountRequest_descriptor,
        new java.lang.String[] { "Uid", "UserName", "Password", "DeviceId", "DeviceType", "ThirdPartyType", });
    internal_static_personal_BindNewRegistRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_personal_BindNewRegistRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_BindNewRegistRequest_descriptor,
        new java.lang.String[] { "UserName", "Email", "Password", "ThirdPartyType", });
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
