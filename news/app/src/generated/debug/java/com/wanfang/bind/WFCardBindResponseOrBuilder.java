// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bind/msg_wfcard_bind.proto

package com.wanfang.bind;

public interface WFCardBindResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bind.WFCardBindResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string status = 1;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>optional string status = 1;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

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
