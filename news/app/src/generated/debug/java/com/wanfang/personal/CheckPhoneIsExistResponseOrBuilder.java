// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_captcha.proto

package com.wanfang.personal;

public interface CheckPhoneIsExistResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.CheckPhoneIsExistResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * true 存在 false 不存在
   * </pre>
   *
   * <code>optional bool is_exist = 1;</code>
   */
  boolean getIsExist();

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
