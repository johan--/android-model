// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscribe/msg_subscribe.proto

package com.wanfang.subscribe;

public interface UpdateSubscribePushEmailResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subscribe.UpdateSubscribePushEmailResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool update_success = 1;</code>
   */
  boolean getUpdateSuccess();

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