// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_iap_verify.proto

package com.wanfang.trade;

public interface IAPVerifyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:trade.IAPVerifyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 验证成功
   * </pre>
   *
   * <code>optional bool verify_success = 1;</code>
   */
  boolean getVerifySuccess();

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
