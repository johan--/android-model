// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collect/msg_collect.proto

package com.wanfang.collect;

public interface CollectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:collect.CollectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool collect_success = 1;</code>
   */
  boolean getCollectSuccess();

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
