// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: read/msg_read.proto

package com.wanfang.read;

public interface GetResourceFileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:read.GetResourceFileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 文件名称
   * </pre>
   *
   * <code>optional string file_name = 1;</code>
   */
  java.lang.String getFileName();
  /**
   * <pre>
   * 文件名称
   * </pre>
   *
   * <code>optional string file_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <pre>
   * 文件类型
   * </pre>
   *
   * <code>optional string content_type = 2;</code>
   */
  java.lang.String getContentType();
  /**
   * <pre>
   * 文件类型
   * </pre>
   *
   * <code>optional string content_type = 2;</code>
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();

  /**
   * <pre>
   * 总的字节数（若为0，则获取全文失败）
   * </pre>
   *
   * <code>optional int64 total_byte_length = 3;</code>
   */
  long getTotalByteLength();

  /**
   * <pre>
   * 加载的字节数
   * </pre>
   *
   * <code>optional int64 loading_byte_length = 4;</code>
   */
  long getLoadingByteLength();

  /**
   * <pre>
   * 文件字节
   * </pre>
   *
   * <code>optional bytes file_byte = 5;</code>
   */
  com.google.protobuf.ByteString getFileByte();
}
