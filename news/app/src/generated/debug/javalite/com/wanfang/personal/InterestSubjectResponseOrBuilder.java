// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg_interest_word.proto

package com.wanfang.personal;

public interface InterestSubjectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.InterestSubjectResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  java.util.List<String>
      getSubjectList();
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  int getSubjectCount();
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  java.lang.String getSubject(int index);
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  com.google.protobuf.ByteString
      getSubjectBytes(int index);

  /**
   * <pre>
   * 命中数
   * </pre>
   *
   * <code>optional int32 total_count = 2;</code>
   */
  int getTotalCount();
}
