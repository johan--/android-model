// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscribe/msg_subscribe_keyword.proto

package com.wanfang.subscribe;

public interface SubscribeKeywordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subscribe.SubscribeKeywordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool subscribe_success = 1;</code>
   */
  boolean getSubscribeSuccess();

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
