// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sendTextMessage.proto

package com.wanfangdata.grpcservice.message.jmessage;

public interface SendTextMessageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SendTextMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id(id不为null,则表明消息发送成功，否则失败)
   * </pre>
   *
   * <code>optional string message_id = 1;</code>
   */
  java.lang.String getMessageId();
  /**
   * <pre>
   *消息id(id不为null,则表明消息发送成功，否则失败)
   * </pre>
   *
   * <code>optional string message_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageIdBytes();

  /**
   * <pre>
   *0:成功
   * </pre>
   *
   * <code>optional int64 code = 2;</code>
   */
  long getCode();

  /**
   * <pre>
   *结果信息
   * </pre>
   *
   * <code>optional string msg = 3;</code>
   */
  java.lang.String getMsg();
  /**
   * <pre>
   *结果信息
   * </pre>
   *
   * <code>optional string msg = 3;</code>
   */
  com.google.protobuf.ByteString
      getMsgBytes();
}
