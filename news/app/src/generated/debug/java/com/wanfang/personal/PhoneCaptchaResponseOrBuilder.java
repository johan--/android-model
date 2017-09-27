// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_common.proto

package com.wanfang.personal;

public interface PhoneCaptchaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.PhoneCaptchaResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 手机验证码
   * </pre>
   *
   * <code>optional string phone_captcha = 1;</code>
   */
  java.lang.String getPhoneCaptcha();
  /**
   * <pre>
   * 手机验证码
   * </pre>
   *
   * <code>optional string phone_captcha = 1;</code>
   */
  com.google.protobuf.ByteString
      getPhoneCaptchaBytes();

  /**
   * <pre>
   * 获取验证码操作的token
   * </pre>
   *
   * <code>optional string token = 2;</code>
   */
  java.lang.String getToken();
  /**
   * <pre>
   * 获取验证码操作的token
   * </pre>
   *
   * <code>optional string token = 2;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <code>optional .grpcCommon.GrpcError error = 3;</code>
   */
  boolean hasError();
  /**
   * <code>optional .grpcCommon.GrpcError error = 3;</code>
   */
  com.wanfang.grpcCommon.MsgError.GrpcError getError();
  /**
   * <code>optional .grpcCommon.GrpcError error = 3;</code>
   */
  com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder getErrorOrBuilder();
}