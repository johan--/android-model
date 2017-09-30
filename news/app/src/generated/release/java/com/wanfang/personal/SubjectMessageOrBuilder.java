// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_personInfo.proto

package com.wanfang.personal;

public interface SubjectMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.SubjectMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 学科标题
   * </pre>
   *
   * <code>optional string subject_title = 1;</code>
   */
  java.lang.String getSubjectTitle();
  /**
   * <pre>
   * 学科标题
   * </pre>
   *
   * <code>optional string subject_title = 1;</code>
   */
  com.google.protobuf.ByteString
      getSubjectTitleBytes();

  /**
   * <pre>
   * 子学科
   * </pre>
   *
   * <code>repeated .personal.SubjectMessage sub_subject = 2;</code>
   */
  java.util.List<com.wanfang.personal.SubjectMessage> 
      getSubSubjectList();
  /**
   * <pre>
   * 子学科
   * </pre>
   *
   * <code>repeated .personal.SubjectMessage sub_subject = 2;</code>
   */
  com.wanfang.personal.SubjectMessage getSubSubject(int index);
  /**
   * <pre>
   * 子学科
   * </pre>
   *
   * <code>repeated .personal.SubjectMessage sub_subject = 2;</code>
   */
  int getSubSubjectCount();
  /**
   * <pre>
   * 子学科
   * </pre>
   *
   * <code>repeated .personal.SubjectMessage sub_subject = 2;</code>
   */
  java.util.List<? extends com.wanfang.personal.SubjectMessageOrBuilder> 
      getSubSubjectOrBuilderList();
  /**
   * <pre>
   * 子学科
   * </pre>
   *
   * <code>repeated .personal.SubjectMessage sub_subject = 2;</code>
   */
  com.wanfang.personal.SubjectMessageOrBuilder getSubSubjectOrBuilder(
      int index);

  /**
   * <code>optional bool has_sub_subject = 3;</code>
   */
  boolean getHasSubSubject();
}
