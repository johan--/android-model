// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: home/msg_home.proto

package com.wanfang.home;

public final class MsgHome {
  private MsgHome() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_GetHomeListReqeust_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_GetHomeListReqeust_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_GetFoundListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_GetFoundListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_GetFoundListResponse_HomeListMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_GetFoundListResponse_HomeListMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_GetLastPerioRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_GetLastPerioRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_GetLastPerioResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_GetLastPerioResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_home_GetLastPerioResponse_LastPerioMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_home_GetLastPerioResponse_LastPerioMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023home/msg_home.proto\022\004home\032\032grpcCommon/" +
      "msg_error.proto\"h\n\022GetHomeListReqeust\022*\n" +
      "\016home_list_type\030\001 \001(\0162\022.home.HOMELISTTYP" +
      "E\022\023\n\013page_number\030\002 \001(\005\022\021\n\tpage_size\030\003 \001(" +
      "\005\"\357\001\n\024GetFoundListResponse\022E\n\021home_list_" +
      "message\030\001 \003(\0132*.home.GetFoundListRespons" +
      "e.HomeListMessage\022$\n\005error\030\002 \001(\0132\025.grpcC" +
      "ommon.GrpcError\022\020\n\010has_more\030\003 \001(\010\032X\n\017Hom" +
      "eListMessage\022\r\n\005title\030\001 \001(\t\022\017\n\007content\030\002" +
      " \001(\t\022\020\n\010link_url\030\003 \001(\t\022\023\n\013create_time\030\004 ",
      "\001(\t\"=\n\023GetLastPerioRequest\022\023\n\013page_numbe" +
      "r\030\001 \001(\005\022\021\n\tpage_size\030\002 \001(\005\"\237\002\n\024GetLastPe" +
      "rioResponse\022B\n\rperio_message\030\001 \003(\0132+.hom" +
      "e.GetLastPerioResponse.LastPerioMessage\022" +
      "$\n\005error\030\002 \001(\0132\025.grpcCommon.GrpcError\022\020\n" +
      "\010has_more\030\003 \001(\010\032\212\001\n\020LastPerioMessage\022\023\n\013" +
      "perio_album\030\001 \001(\t\022\023\n\013perio_title\030\002 \001(\t\022\020" +
      "\n\010end_year\030\003 \001(\t\022\021\n\tend_issue\030\004 \001(\t\022\025\n\rp" +
      "ublish_cycle\030\005 \001(\t\022\020\n\010perio_id\030\006 \001(\t*4\n\014" +
      "HOMELISTTYPE\022\017\n\013TYPE_FOUNDE\020\000\022\023\n\017TYPE_CO",
      "NFERENCE\020\001B\033\n\020com.wanfang.homeP\001\242\002\004WFPRb" +
      "\006proto3"
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
    internal_static_home_GetHomeListReqeust_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_home_GetHomeListReqeust_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_GetHomeListReqeust_descriptor,
        new java.lang.String[] { "HomeListType", "PageNumber", "PageSize", });
    internal_static_home_GetFoundListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_home_GetFoundListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_GetFoundListResponse_descriptor,
        new java.lang.String[] { "HomeListMessage", "Error", "HasMore", });
    internal_static_home_GetFoundListResponse_HomeListMessage_descriptor =
      internal_static_home_GetFoundListResponse_descriptor.getNestedTypes().get(0);
    internal_static_home_GetFoundListResponse_HomeListMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_GetFoundListResponse_HomeListMessage_descriptor,
        new java.lang.String[] { "Title", "Content", "LinkUrl", "CreateTime", });
    internal_static_home_GetLastPerioRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_home_GetLastPerioRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_GetLastPerioRequest_descriptor,
        new java.lang.String[] { "PageNumber", "PageSize", });
    internal_static_home_GetLastPerioResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_home_GetLastPerioResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_GetLastPerioResponse_descriptor,
        new java.lang.String[] { "PerioMessage", "Error", "HasMore", });
    internal_static_home_GetLastPerioResponse_LastPerioMessage_descriptor =
      internal_static_home_GetLastPerioResponse_descriptor.getNestedTypes().get(0);
    internal_static_home_GetLastPerioResponse_LastPerioMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_home_GetLastPerioResponse_LastPerioMessage_descriptor,
        new java.lang.String[] { "PerioAlbum", "PerioTitle", "EndYear", "EndIssue", "PublishCycle", "PerioId", });
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}