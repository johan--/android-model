// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_password.proto

package com.wanfang.personal;

public interface PasswordEmailResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.PasswordEmailResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .grpcCommon.GrpcError error = 1;</code>
   */
  boolean hasError();
  /**
   * <code>optional .grpcCommon.GrpcError error = 1;</code>
   */
  com.wanfang.grpcCommon.MsgError.GrpcError getError();
  /**
   * <code>optional .grpcCommon.GrpcError error = 1;</code>
   */
  com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder getErrorOrBuilder();
}
