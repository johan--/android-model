// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg_password.proto

package com.wanfang.personal;

public interface PasswordByPhoneRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.PasswordByPhoneRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * </pre>
   *
   * <code>optional string phone = 1;</code>
   */
  java.lang.String getPhone();
  /**
   * <pre>
   * </pre>
   *
   * <code>optional string phone = 1;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <pre>
   * 短信验证码
   * </pre>
   *
   * <code>optional string phone_captcha = 2;</code>
   */
  java.lang.String getPhoneCaptcha();
  /**
   * <pre>
   * 短信验证码
   * </pre>
   *
   * <code>optional string phone_captcha = 2;</code>
   */
  com.google.protobuf.ByteString
      getPhoneCaptchaBytes();

  /**
   * <code>optional string token = 3;</code>
   */
  java.lang.String getToken();
  /**
   * <code>optional string token = 3;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
