// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: search/msg_search.proto

package com.wanfang.search;

public final class MsgSearch {
  private MsgSearch() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_HotThemesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_HotThemesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_HotThemesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_HotThemesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_SearchHistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_SearchHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_SearchHistoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_SearchHistoryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027search/msg_search.proto\022\006search\032\031googl" +
      "e/protobuf/any.proto\032\032grpcCommon/msg_err" +
      "or.proto\":\n\020HotThemesRequest\022\023\n\013page_num" +
      "ber\030\001 \001(\005\022\021\n\tpage_size\030\002 \001(\005\"O\n\021HotTheme" +
      "sResponse\022\024\n\014themes_title\030\001 \003(\t\022$\n\005error" +
      "\030\002 \001(\0132\025.grpcCommon.GrpcError\"O\n\024SearchH" +
      "istoryRequest\022\017\n\007user_id\030\001 \001(\t\022\023\n\013page_n" +
      "umber\030\002 \001(\005\022\021\n\tpage_size\030\003 \001(\005\"T\n\025Search" +
      "HistoryResponse\022\025\n\rhistory_title\030\001 \003(\t\022$" +
      "\n\005error\030\002 \001(\0132\025.grpcCommon.GrpcErrorB\035\n\022",
      "com.wanfang.searchP\001\242\002\004WFPRb\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
          com.wanfang.grpcCommon.MsgError.getDescriptor(),
        }, assigner);
    internal_static_search_HotThemesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_search_HotThemesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_HotThemesRequest_descriptor,
        new java.lang.String[] { "PageNumber", "PageSize", });
    internal_static_search_HotThemesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_search_HotThemesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_HotThemesResponse_descriptor,
        new java.lang.String[] { "ThemesTitle", "Error", });
    internal_static_search_SearchHistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_search_SearchHistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_SearchHistoryRequest_descriptor,
        new java.lang.String[] { "UserId", "PageNumber", "PageSize", });
    internal_static_search_SearchHistoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_search_SearchHistoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_SearchHistoryResponse_descriptor,
        new java.lang.String[] { "HistoryTitle", "Error", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
