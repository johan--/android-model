// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscribe/msg_subscribe.proto

package com.wanfang.subscribe;

public interface CancelSubscribeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subscribe.CancelSubscribeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool cancel_subscribe_success = 1;</code>
   */
  boolean getCancelSubscribeSuccess();

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
