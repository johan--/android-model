// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_personInfo.proto

package com.wanfang.personal;

public interface UserGetBalenceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.UserGetBalenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string user_id = 1;</code>
   */
  java.lang.String getUserId();
  /**
   * <code>optional string user_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>optional .personal.BALENCETYPE balence_type = 2;</code>
   */
  int getBalenceTypeValue();
  /**
   * <code>optional .personal.BALENCETYPE balence_type = 2;</code>
   */
  com.wanfang.personal.BALENCETYPE getBalenceType();
}
