// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg_my_collect.proto

package com.wanfang.personal;

public interface MyCollectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.MyCollectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .personal.Any results = 1;</code>
   */
  java.util.List<com.wanfang.personal.Any> 
      getResultsList();
  /**
   * <code>repeated .personal.Any results = 1;</code>
   */
  com.wanfang.personal.Any getResults(int index);
  /**
   * <code>repeated .personal.Any results = 1;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .personal.Any results = 1;</code>
   */
  java.util.List<? extends com.wanfang.personal.AnyOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .personal.Any results = 1;</code>
   */
  com.wanfang.personal.AnyOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <code>optional bool has_more = 2;</code>
   */
  boolean getHasMore();

  /**
   * <pre>
   * 命中数
   * </pre>
   *
   * <code>optional int32 total_count = 3;</code>
   */
  int getTotalCount();
}
