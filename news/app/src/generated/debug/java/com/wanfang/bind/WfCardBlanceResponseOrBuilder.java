// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bind/msg_wfcard_bind.proto

package com.wanfang.bind;

public interface WfCardBlanceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bind.WfCardBlanceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string blance = 1;</code>
   */
  java.lang.String getBlance();
  /**
   * <code>optional string blance = 1;</code>
   */
  com.google.protobuf.ByteString
      getBlanceBytes();

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
