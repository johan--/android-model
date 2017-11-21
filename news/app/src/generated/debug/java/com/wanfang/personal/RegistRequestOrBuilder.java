// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_regist.proto

package com.wanfang.personal;

public interface RegistRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.RegistRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 用户名
   * </pre>
   *
   * <code>optional string user_name = 1;</code>
   */
  java.lang.String getUserName();
  /**
   * <pre>
   * 用户名
   * </pre>
   *
   * <code>optional string user_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <pre>
   * 密码
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * 密码
   * </pre>
   *
   * <code>optional string password = 2;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * 手机号
   * </pre>
   *
   * <code>optional string phone = 3;</code>
   */
  java.lang.String getPhone();
  /**
   * <pre>
   * 手机号
   * </pre>
   *
   * <code>optional string phone = 3;</code>
   */
  com.google.protobuf.ByteString
      getPhoneBytes();

  /**
   * <pre>
   * 手机号验证码(发送给服务端做双向验证)
   * </pre>
   *
   * <code>optional string phone_captcha = 4;</code>
   */
  java.lang.String getPhoneCaptcha();
  /**
   * <pre>
   * 手机号验证码(发送给服务端做双向验证)
   * </pre>
   *
   * <code>optional string phone_captcha = 4;</code>
   */
  com.google.protobuf.ByteString
      getPhoneCaptchaBytes();

  /**
   * <pre>
   * 国际区号 如：中国：0086；
   * </pre>
   *
   * <code>optional string nation = 5;</code>
   */
  java.lang.String getNation();
  /**
   * <pre>
   * 国际区号 如：中国：0086；
   * </pre>
   *
   * <code>optional string nation = 5;</code>
   */
  com.google.protobuf.ByteString
      getNationBytes();

  /**
   * <pre>
   * 消息类型 目前仅支持“bind”
   * </pre>
   *
   * <code>optional string message_type = 6;</code>
   */
  java.lang.String getMessageType();
  /**
   * <pre>
   * 消息类型 目前仅支持“bind”
   * </pre>
   *
   * <code>optional string message_type = 6;</code>
   */
  com.google.protobuf.ByteString
      getMessageTypeBytes();
}
