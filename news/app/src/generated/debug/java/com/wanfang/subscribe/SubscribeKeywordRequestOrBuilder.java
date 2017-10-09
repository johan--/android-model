// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscribe/msg_subscribe_keyword.proto

package com.wanfang.subscribe;

public interface SubscribeKeywordRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subscribe.SubscribeKeywordRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string user_id = 1;</code>
   */
  java.lang.String getUserId();
  /**
   * <code>optional string user_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * 要订阅的关键词
   * </pre>
   *
   * <code>optional string keyword = 2;</code>
   */
  java.lang.String getKeyword();
  /**
   * <pre>
   * 要订阅的关键词
   * </pre>
   *
   * <code>optional string keyword = 2;</code>
   */
  com.google.protobuf.ByteString
      getKeywordBytes();

  /**
   * <pre>
   * 订阅关键词选取的文献类型
   * </pre>
   *
   * <code>repeated .subscribe.DocType doc_type = 3;</code>
   */
  java.util.List<com.wanfang.subscribe.DocType> 
      getDocTypeList();
  /**
   * <pre>
   * 订阅关键词选取的文献类型
   * </pre>
   *
   * <code>repeated .subscribe.DocType doc_type = 3;</code>
   */
  com.wanfang.subscribe.DocType getDocType(int index);
  /**
   * <pre>
   * 订阅关键词选取的文献类型
   * </pre>
   *
   * <code>repeated .subscribe.DocType doc_type = 3;</code>
   */
  int getDocTypeCount();
  /**
   * <pre>
   * 订阅关键词选取的文献类型
   * </pre>
   *
   * <code>repeated .subscribe.DocType doc_type = 3;</code>
   */
  java.util.List<? extends com.wanfang.subscribe.DocTypeOrBuilder> 
      getDocTypeOrBuilderList();
  /**
   * <pre>
   * 订阅关键词选取的文献类型
   * </pre>
   *
   * <code>repeated .subscribe.DocType doc_type = 3;</code>
   */
  com.wanfang.subscribe.DocTypeOrBuilder getDocTypeOrBuilder(
      int index);

  /**
   * <pre>
   * 订阅关键词选取的来源类别
   * </pre>
   *
   * <code>repeated .subscribe.SourceType source_type = 4;</code>
   */
  java.util.List<com.wanfang.subscribe.SourceType> 
      getSourceTypeList();
  /**
   * <pre>
   * 订阅关键词选取的来源类别
   * </pre>
   *
   * <code>repeated .subscribe.SourceType source_type = 4;</code>
   */
  com.wanfang.subscribe.SourceType getSourceType(int index);
  /**
   * <pre>
   * 订阅关键词选取的来源类别
   * </pre>
   *
   * <code>repeated .subscribe.SourceType source_type = 4;</code>
   */
  int getSourceTypeCount();
  /**
   * <pre>
   * 订阅关键词选取的来源类别
   * </pre>
   *
   * <code>repeated .subscribe.SourceType source_type = 4;</code>
   */
  java.util.List<? extends com.wanfang.subscribe.SourceTypeOrBuilder> 
      getSourceTypeOrBuilderList();
  /**
   * <pre>
   * 订阅关键词选取的来源类别
   * </pre>
   *
   * <code>repeated .subscribe.SourceType source_type = 4;</code>
   */
  com.wanfang.subscribe.SourceTypeOrBuilder getSourceTypeOrBuilder(
      int index);

  /**
   * <pre>
   * 邮箱地址 nullable
   * </pre>
   *
   * <code>optional string email = 5;</code>
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * 邮箱地址 nullable
   * </pre>
   *
   * <code>optional string email = 5;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>optional bool should_update_email = 6;</code>
   */
  boolean getShouldUpdateEmail();
}