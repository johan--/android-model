// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_captcha.proto

package com.wanfang.personal;

public interface GetPhoneCaptchaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.GetPhoneCaptchaResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 结果状态:200:成功
   * </pre>
   *
   * <code>optional int32 status = 1;</code>
   */
  int getStatus();

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
