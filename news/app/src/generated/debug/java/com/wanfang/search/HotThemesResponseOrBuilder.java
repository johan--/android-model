// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: search/msg_search.proto

package com.wanfang.search;

public interface HotThemesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:search.HotThemesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string themes_title = 1;</code>
   */
  java.util.List<java.lang.String>
      getThemesTitleList();
  /**
   * <code>repeated string themes_title = 1;</code>
   */
  int getThemesTitleCount();
  /**
   * <code>repeated string themes_title = 1;</code>
   */
  java.lang.String getThemesTitle(int index);
  /**
   * <code>repeated string themes_title = 1;</code>
   */
  com.google.protobuf.ByteString
      getThemesTitleBytes(int index);

  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  boolean hasError();
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  com.wanfang.grpcCommon.MsgError.GrpcError getError();
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder getErrorOrBuilder();
}
