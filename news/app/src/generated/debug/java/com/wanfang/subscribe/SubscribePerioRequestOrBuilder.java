// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscribe/msg_subscribe_perio.proto

package com.wanfang.subscribe;

public interface SubscribePerioRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subscribe.SubscribePerioRequest)
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
   * 要订阅的期刊id
   * </pre>
   *
   * <code>optional string perio_id = 2;</code>
   */
  java.lang.String getPerioId();
  /**
   * <pre>
   * 要订阅的期刊id
   * </pre>
   *
   * <code>optional string perio_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getPerioIdBytes();
}
