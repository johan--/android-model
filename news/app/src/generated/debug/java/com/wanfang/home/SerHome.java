// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: home/ser_home.proto

package com.wanfang.home;

public final class SerHome {
  private SerHome() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023home/ser_home.proto\022\004home\032\023home/msg_ho" +
      "me.proto2\231\001\n\013HomeService\022C\n\013GetHomeList\022" +
      "\030.home.GetHomeListReqeust\032\032.home.GetFoun" +
      "dListResponse\022E\n\014GetLastPerio\022\031.home.Get" +
      "LastPerioRequest\032\032.home.GetLastPerioResp" +
      "onseB\033\n\020com.wanfang.homeP\001\242\002\004WFPRb\006proto" +
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
          com.wanfang.home.MsgHome.getDescriptor(),
        }, assigner);
    com.wanfang.home.MsgHome.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}