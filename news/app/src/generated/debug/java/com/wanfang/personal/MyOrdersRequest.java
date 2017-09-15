// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg_my_orders.proto

package com.wanfang.personal;

/**
 * <pre>
 * 获取我的订单数据
 * </pre>
 *
 * Protobuf type {@code personal.MyOrdersRequest}
 */
public  final class MyOrdersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.MyOrdersRequest)
    MyOrdersRequestOrBuilder {
  // Use MyOrdersRequest.newBuilder() to construct.
  private MyOrdersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MyOrdersRequest() {
    userId_ = "";
    pageNumber_ = 0;
    pageSize_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MyOrdersRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 16: {

            pageNumber_ = input.readInt32();
            break;
          }
          case 24: {

            pageSize_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanfang.personal.MsgMyOrders.internal_static_personal_MyOrdersRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgMyOrders.internal_static_personal_MyOrdersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.MyOrdersRequest.class, com.wanfang.personal.MyOrdersRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <pre>
   * 用户id
   * </pre>
   *
   * <code>optional string user_id = 1;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 用户id
   * </pre>
   *
   * <code>optional string user_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
  private int pageNumber_;
  /**
   * <code>optional int32 page_number = 2;</code>
   */
  public int getPageNumber() {
    return pageNumber_;
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 3;
  private int pageSize_;
  /**
   * <code>optional int32 page_size = 3;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userId_);
    }
    if (pageNumber_ != 0) {
      output.writeInt32(2, pageNumber_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(3, pageSize_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (pageNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageNumber_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, pageSize_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wanfang.personal.MyOrdersRequest)) {
      return super.equals(obj);
    }
    com.wanfang.personal.MyOrdersRequest other = (com.wanfang.personal.MyOrdersRequest) obj;

    boolean result = true;
    result = result && getUserId()
        .equals(other.getUserId());
    result = result && (getPageNumber()
        == other.getPageNumber());
    result = result && (getPageSize()
        == other.getPageSize());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPageNumber();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.MyOrdersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.MyOrdersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.MyOrdersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.MyOrdersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.MyOrdersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.MyOrdersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.MyOrdersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.MyOrdersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.MyOrdersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.MyOrdersRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wanfang.personal.MyOrdersRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 获取我的订单数据
   * </pre>
   *
   * Protobuf type {@code personal.MyOrdersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.MyOrdersRequest)
      com.wanfang.personal.MyOrdersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgMyOrders.internal_static_personal_MyOrdersRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgMyOrders.internal_static_personal_MyOrdersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.MyOrdersRequest.class, com.wanfang.personal.MyOrdersRequest.Builder.class);
    }

    // Construct using com.wanfang.personal.MyOrdersRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      userId_ = "";

      pageNumber_ = 0;

      pageSize_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgMyOrders.internal_static_personal_MyOrdersRequest_descriptor;
    }

    public com.wanfang.personal.MyOrdersRequest getDefaultInstanceForType() {
      return com.wanfang.personal.MyOrdersRequest.getDefaultInstance();
    }

    public com.wanfang.personal.MyOrdersRequest build() {
      com.wanfang.personal.MyOrdersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.MyOrdersRequest buildPartial() {
      com.wanfang.personal.MyOrdersRequest result = new com.wanfang.personal.MyOrdersRequest(this);
      result.userId_ = userId_;
      result.pageNumber_ = pageNumber_;
      result.pageSize_ = pageSize_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wanfang.personal.MyOrdersRequest) {
        return mergeFrom((com.wanfang.personal.MyOrdersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.MyOrdersRequest other) {
      if (other == com.wanfang.personal.MyOrdersRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (other.getPageNumber() != 0) {
        setPageNumber(other.getPageNumber());
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wanfang.personal.MyOrdersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.MyOrdersRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * 用户id
     * </pre>
     *
     * <code>optional string user_id = 1;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 用户id
     * </pre>
     *
     * <code>optional string user_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 用户id
     * </pre>
     *
     * <code>optional string user_id = 1;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户id
     * </pre>
     *
     * <code>optional string user_id = 1;</code>
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户id
     * </pre>
     *
     * <code>optional string user_id = 1;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private int pageNumber_ ;
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    public Builder setPageNumber(int value) {
      
      pageNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 page_number = 2;</code>
     */
    public Builder clearPageNumber() {
      
      pageNumber_ = 0;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <code>optional int32 page_size = 3;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <code>optional int32 page_size = 3;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 page_size = 3;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:personal.MyOrdersRequest)
  }

  // @@protoc_insertion_point(class_scope:personal.MyOrdersRequest)
  private static final com.wanfang.personal.MyOrdersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.MyOrdersRequest();
  }

  public static com.wanfang.personal.MyOrdersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MyOrdersRequest>
      PARSER = new com.google.protobuf.AbstractParser<MyOrdersRequest>() {
    public MyOrdersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MyOrdersRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MyOrdersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MyOrdersRequest> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.MyOrdersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

