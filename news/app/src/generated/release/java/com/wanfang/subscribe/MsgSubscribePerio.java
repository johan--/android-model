// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscribe/msg_subscribe_perio.proto

package com.wanfang.subscribe;

public final class MsgSubscribePerio {
  private MsgSubscribePerio() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_SubscribePerioRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_SubscribePerioRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_SubscribePerioResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_SubscribePerioResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_CheckPerioISSubscribedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_CheckPerioISSubscribedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_CheckPerioISSubscribeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_CheckPerioISSubscribeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_SubscribePerioListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_SubscribePerioListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_SubscribePerioListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_SubscribePerioListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_SubscribePerioListResponse_SubscribePerioMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_SubscribePerioListResponse_SubscribePerioMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_AddSubscribePerioTreeListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_AddSubscribePerioTreeListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_AddSubscribePerioTreeListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_AddSubscribePerioTreeListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_AddSubscribePerioTreeListResponse_AddSubscribeTreeItemMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_AddSubscribePerioTreeListResponse_AddSubscribeTreeItemMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_SubscribePerioListSearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_SubscribePerioListSearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_SubscribePerioListSearchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_SubscribePerioListSearchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscribe_SubscribePerioListSearchResponse_PerioListSearchMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_subscribe_SubscribePerioListSearchResponse_PerioListSearchMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#subscribe/msg_subscribe_perio.proto\022\ts" +
      "ubscribe\032\031google/protobuf/any.proto\032\032grp" +
      "cCommon/msg_error.proto\":\n\025SubscribePeri" +
      "oRequest\022\017\n\007user_id\030\001 \001(\t\022\020\n\010perio_id\030\002 " +
      "\001(\t\"Y\n\026SubscribePerioResponse\022\031\n\021subscri" +
      "be_success\030\001 \001(\010\022$\n\005error\030\002 \001(\0132\025.grpcCo" +
      "mmon.GrpcError\"B\n\035CheckPerioISSubscribed" +
      "Request\022\017\n\007user_id\030\001 \001(\t\022\020\n\010perio_id\030\002 \001" +
      "(\t\"\\\n\035CheckPerioISSubscribeResponse\022\025\n\ri" +
      "s_subscribed\030\001 \001(\010\022$\n\005error\030\002 \001(\0132\025.grpc",
      "Common.GrpcError\"T\n\031SubscribePerioListRe" +
      "quest\022\017\n\007user_id\030\001 \001(\t\022\023\n\013page_number\030\002 " +
      "\001(\005\022\021\n\tpage_size\030\003 \001(\005\"\276\002\n\032SubscribePeri" +
      "oListResponse\022T\n\017subscribe_perio\030\001 \003(\0132;" +
      ".subscribe.SubscribePerioListResponse.Su" +
      "bscribePerioMessage\022$\n\005error\030\002 \001(\0132\025.grp" +
      "cCommon.GrpcError\022\020\n\010has_more\030\003 \001(\010\032\221\001\n\025" +
      "SubscribePerioMessage\022\020\n\010perio_id\030\001 \001(\t\022" +
      "\022\n\nperio_name\030\002 \001(\t\022\023\n\013perio_cover\030\003 \001(\t" +
      "\022\025\n\rperio_society\030\004 \001(\t\022\020\n\010add_time\030\005 \001(",
      "\t\022\024\n\014subscribe_id\030\006 \001(\t\"\240\001\n AddSubscribe" +
      "PerioTreeListRequest\022\021\n\tpre_title\030\001 \001(\t\022" +
      "\022\n\ncore_perio\030\002 \001(\t\022\021\n\tsource_db\030\003 \001(\t\022\026" +
      "\n\016host_unit_area\030\004 \001(\t\022\025\n\rpublish_cycle\030" +
      "\005 \001(\t\022\023\n\013search_word\030\006 \003(\t\"\344\001\n!AddSubscr" +
      "ibePerioTreeListResponse\022[\n\ttree_item\030\001 " +
      "\003(\0132H.subscribe.AddSubscribePerioTreeLis" +
      "tResponse.AddSubscribeTreeItemMessage\032b\n" +
      "\033AddSubscribeTreeItemMessage\022\n\n\002id\030\001 \001(\t" +
      "\022\014\n\004name\030\002 \001(\t\022\013\n\003pid\030\003 \001(\t\022\r\n\005count\030\004 \001",
      "(\005\022\r\n\005value\030\005 \001(\t\"\376\001\n\037SubscribePerioList" +
      "SearchRequest\022\023\n\013page_number\030\001 \001(\005\022\021\n\tpa" +
      "ge_size\030\002 \001(\005\022\024\n\014select_title\030\003 \003(\t\022\024\n\014s" +
      "elect_order\030\004 \001(\t\022\021\n\tpre_title\030\006 \001(\t\022\022\n\n" +
      "core_perio\030\007 \001(\t\022\021\n\tsource_db\030\010 \001(\t\022\026\n\016h" +
      "ost_unit_area\030\t \001(\t\022\025\n\rpublish_cycle\030\n \001" +
      "(\t\022\r\n\005value\030\013 \001(\t\022\017\n\007user_id\030\014 \001(\t\"\364\002\n S" +
      "ubscribePerioListSearchResponse\022$\n\005error" +
      "\030\001 \001(\0132\025.grpcCommon.GrpcError\022\020\n\010has_mor" +
      "e\030\002 \001(\010\022Y\n\rsearch_perios\030\003 \003(\0132B.subscri",
      "be.SubscribePerioListSearchResponse.Peri" +
      "oListSearchMessage\032\274\001\n\026PerioListSearchMe" +
      "ssage\022\023\n\013perio_title\030\001 \001(\t\022\020\n\010perio_id\030\002" +
      " \001(\t\022\021\n\tend_issue\030\003 \001(\t\022\020\n\010end_year\030\004 \001(" +
      "\t\022\022\n\ncore_perio\030\005 \001(\t\022\025\n\rpublish_cycle\030\006" +
      " \001(\t\022\024\n\014subscribe_id\030\007 \001(\t\022\025\n\ris_subscri" +
      "bed\030\010 \001(\010B \n\025com.wanfang.subscribeP\001\242\002\004W" +
      "FPRb\006proto3"
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
    internal_static_subscribe_SubscribePerioRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_subscribe_SubscribePerioRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_SubscribePerioRequest_descriptor,
        new java.lang.String[] { "UserId", "PerioId", });
    internal_static_subscribe_SubscribePerioResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_subscribe_SubscribePerioResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_SubscribePerioResponse_descriptor,
        new java.lang.String[] { "SubscribeSuccess", "Error", });
    internal_static_subscribe_CheckPerioISSubscribedRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_subscribe_CheckPerioISSubscribedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_CheckPerioISSubscribedRequest_descriptor,
        new java.lang.String[] { "UserId", "PerioId", });
    internal_static_subscribe_CheckPerioISSubscribeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_subscribe_CheckPerioISSubscribeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_CheckPerioISSubscribeResponse_descriptor,
        new java.lang.String[] { "IsSubscribed", "Error", });
    internal_static_subscribe_SubscribePerioListRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_subscribe_SubscribePerioListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_SubscribePerioListRequest_descriptor,
        new java.lang.String[] { "UserId", "PageNumber", "PageSize", });
    internal_static_subscribe_SubscribePerioListResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_subscribe_SubscribePerioListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_SubscribePerioListResponse_descriptor,
        new java.lang.String[] { "SubscribePerio", "Error", "HasMore", });
    internal_static_subscribe_SubscribePerioListResponse_SubscribePerioMessage_descriptor =
      internal_static_subscribe_SubscribePerioListResponse_descriptor.getNestedTypes().get(0);
    internal_static_subscribe_SubscribePerioListResponse_SubscribePerioMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_SubscribePerioListResponse_SubscribePerioMessage_descriptor,
        new java.lang.String[] { "PerioId", "PerioName", "PerioCover", "PerioSociety", "AddTime", "SubscribeId", });
    internal_static_subscribe_AddSubscribePerioTreeListRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_subscribe_AddSubscribePerioTreeListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_AddSubscribePerioTreeListRequest_descriptor,
        new java.lang.String[] { "PreTitle", "CorePerio", "SourceDb", "HostUnitArea", "PublishCycle", "SearchWord", });
    internal_static_subscribe_AddSubscribePerioTreeListResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_subscribe_AddSubscribePerioTreeListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_AddSubscribePerioTreeListResponse_descriptor,
        new java.lang.String[] { "TreeItem", });
    internal_static_subscribe_AddSubscribePerioTreeListResponse_AddSubscribeTreeItemMessage_descriptor =
      internal_static_subscribe_AddSubscribePerioTreeListResponse_descriptor.getNestedTypes().get(0);
    internal_static_subscribe_AddSubscribePerioTreeListResponse_AddSubscribeTreeItemMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_AddSubscribePerioTreeListResponse_AddSubscribeTreeItemMessage_descriptor,
        new java.lang.String[] { "Id", "Name", "Pid", "Count", "Value", });
    internal_static_subscribe_SubscribePerioListSearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_subscribe_SubscribePerioListSearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_SubscribePerioListSearchRequest_descriptor,
        new java.lang.String[] { "PageNumber", "PageSize", "SelectTitle", "SelectOrder", "PreTitle", "CorePerio", "SourceDb", "HostUnitArea", "PublishCycle", "Value", "UserId", });
    internal_static_subscribe_SubscribePerioListSearchResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_subscribe_SubscribePerioListSearchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_SubscribePerioListSearchResponse_descriptor,
        new java.lang.String[] { "Error", "HasMore", "SearchPerios", });
    internal_static_subscribe_SubscribePerioListSearchResponse_PerioListSearchMessage_descriptor =
      internal_static_subscribe_SubscribePerioListSearchResponse_descriptor.getNestedTypes().get(0);
    internal_static_subscribe_SubscribePerioListSearchResponse_PerioListSearchMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_subscribe_SubscribePerioListSearchResponse_PerioListSearchMessage_descriptor,
        new java.lang.String[] { "PerioTitle", "PerioId", "EndIssue", "EndYear", "CorePerio", "PublishCycle", "SubscribeId", "IsSubscribed", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.wanfang.grpcCommon.MsgError.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
