// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: search/ser_search.proto

package com.wanfang.search;

public final class SerSearch {
  private SerSearch() {}
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
      "\n\027search/ser_search.proto\022\006search\032\027searc" +
      "h/msg_search.proto2\237\001\n\rSearchService\022@\n\t" +
      "HotThemes\022\030.search.HotThemesRequest\032\031.se" +
      "arch.HotThemesResponse\022L\n\rSearchHistory\022" +
      "\034.search.SearchHistoryRequest\032\035.search.S" +
      "earchHistoryResponseB\035\n\022com.wanfang.sear" +
      "chP\001\242\002\004WFPRb\006proto3"
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
          com.wanfang.search.MsgSearch.getDescriptor(),
        }, assigner);
    com.wanfang.search.MsgSearch.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
