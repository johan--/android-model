// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscribe/msg_subscribe_keyword.proto

package com.wanfang.subscribe;

/**
 * Protobuf type {@code subscribe.SubscribeKeywordResponse}
 */
public  final class SubscribeKeywordResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:subscribe.SubscribeKeywordResponse)
    SubscribeKeywordResponseOrBuilder {
  // Use SubscribeKeywordResponse.newBuilder() to construct.
  private SubscribeKeywordResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscribeKeywordResponse() {
    subscribeSuccess_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SubscribeKeywordResponse(
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
          case 8: {

            subscribeSuccess_ = input.readBool();
            break;
          }
          case 18: {
            com.wanfang.grpcCommon.MsgError.GrpcError.Builder subBuilder = null;
            if (error_ != null) {
              subBuilder = error_.toBuilder();
            }
            error_ = input.readMessage(com.wanfang.grpcCommon.MsgError.GrpcError.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(error_);
              error_ = subBuilder.buildPartial();
            }

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
    return com.wanfang.subscribe.MsgSubscribeKeyword.internal_static_subscribe_SubscribeKeywordResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.subscribe.MsgSubscribeKeyword.internal_static_subscribe_SubscribeKeywordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.subscribe.SubscribeKeywordResponse.class, com.wanfang.subscribe.SubscribeKeywordResponse.Builder.class);
  }

  public static final int SUBSCRIBE_SUCCESS_FIELD_NUMBER = 1;
  private boolean subscribeSuccess_;
  /**
   * <code>optional bool subscribe_success = 1;</code>
   */
  public boolean getSubscribeSuccess() {
    return subscribeSuccess_;
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private com.wanfang.grpcCommon.MsgError.GrpcError error_;
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  public com.wanfang.grpcCommon.MsgError.GrpcError getError() {
    return error_ == null ? com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
  }
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  public com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder getErrorOrBuilder() {
    return getError();
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
    if (subscribeSuccess_ != false) {
      output.writeBool(1, subscribeSuccess_);
    }
    if (error_ != null) {
      output.writeMessage(2, getError());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subscribeSuccess_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, subscribeSuccess_);
    }
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getError());
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
    if (!(obj instanceof com.wanfang.subscribe.SubscribeKeywordResponse)) {
      return super.equals(obj);
    }
    com.wanfang.subscribe.SubscribeKeywordResponse other = (com.wanfang.subscribe.SubscribeKeywordResponse) obj;

    boolean result = true;
    result = result && (getSubscribeSuccess()
        == other.getSubscribeSuccess());
    result = result && (hasError() == other.hasError());
    if (hasError()) {
      result = result && getError()
          .equals(other.getError());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SUBSCRIBE_SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSubscribeSuccess());
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.subscribe.SubscribeKeywordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.subscribe.SubscribeKeywordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.subscribe.SubscribeKeywordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.subscribe.SubscribeKeywordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.subscribe.SubscribeKeywordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.subscribe.SubscribeKeywordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.subscribe.SubscribeKeywordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.subscribe.SubscribeKeywordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.subscribe.SubscribeKeywordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.subscribe.SubscribeKeywordResponse parseFrom(
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
  public static Builder newBuilder(com.wanfang.subscribe.SubscribeKeywordResponse prototype) {
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
   * Protobuf type {@code subscribe.SubscribeKeywordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:subscribe.SubscribeKeywordResponse)
      com.wanfang.subscribe.SubscribeKeywordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.subscribe.MsgSubscribeKeyword.internal_static_subscribe_SubscribeKeywordResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.subscribe.MsgSubscribeKeyword.internal_static_subscribe_SubscribeKeywordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.subscribe.SubscribeKeywordResponse.class, com.wanfang.subscribe.SubscribeKeywordResponse.Builder.class);
    }

    // Construct using com.wanfang.subscribe.SubscribeKeywordResponse.newBuilder()
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
      subscribeSuccess_ = false;

      if (errorBuilder_ == null) {
        error_ = null;
      } else {
        error_ = null;
        errorBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.subscribe.MsgSubscribeKeyword.internal_static_subscribe_SubscribeKeywordResponse_descriptor;
    }

    public com.wanfang.subscribe.SubscribeKeywordResponse getDefaultInstanceForType() {
      return com.wanfang.subscribe.SubscribeKeywordResponse.getDefaultInstance();
    }

    public com.wanfang.subscribe.SubscribeKeywordResponse build() {
      com.wanfang.subscribe.SubscribeKeywordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.subscribe.SubscribeKeywordResponse buildPartial() {
      com.wanfang.subscribe.SubscribeKeywordResponse result = new com.wanfang.subscribe.SubscribeKeywordResponse(this);
      result.subscribeSuccess_ = subscribeSuccess_;
      if (errorBuilder_ == null) {
        result.error_ = error_;
      } else {
        result.error_ = errorBuilder_.build();
      }
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
      if (other instanceof com.wanfang.subscribe.SubscribeKeywordResponse) {
        return mergeFrom((com.wanfang.subscribe.SubscribeKeywordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.subscribe.SubscribeKeywordResponse other) {
      if (other == com.wanfang.subscribe.SubscribeKeywordResponse.getDefaultInstance()) return this;
      if (other.getSubscribeSuccess() != false) {
        setSubscribeSuccess(other.getSubscribeSuccess());
      }
      if (other.hasError()) {
        mergeError(other.getError());
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
      com.wanfang.subscribe.SubscribeKeywordResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.subscribe.SubscribeKeywordResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean subscribeSuccess_ ;
    /**
     * <code>optional bool subscribe_success = 1;</code>
     */
    public boolean getSubscribeSuccess() {
      return subscribeSuccess_;
    }
    /**
     * <code>optional bool subscribe_success = 1;</code>
     */
    public Builder setSubscribeSuccess(boolean value) {
      
      subscribeSuccess_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool subscribe_success = 1;</code>
     */
    public Builder clearSubscribeSuccess() {
      
      subscribeSuccess_ = false;
      onChanged();
      return this;
    }

    private com.wanfang.grpcCommon.MsgError.GrpcError error_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanfang.grpcCommon.MsgError.GrpcError, com.wanfang.grpcCommon.MsgError.GrpcError.Builder, com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder> errorBuilder_;
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcError getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public Builder setError(com.wanfang.grpcCommon.MsgError.GrpcError value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public Builder setError(
        com.wanfang.grpcCommon.MsgError.GrpcError.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public Builder mergeError(com.wanfang.grpcCommon.MsgError.GrpcError value) {
      if (errorBuilder_ == null) {
        if (error_ != null) {
          error_ =
            com.wanfang.grpcCommon.MsgError.GrpcError.newBuilder(error_).mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        errorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        error_ = null;
        onChanged();
      } else {
        error_ = null;
        errorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcError.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
      }
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanfang.grpcCommon.MsgError.GrpcError, com.wanfang.grpcCommon.MsgError.GrpcError.Builder, com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.wanfang.grpcCommon.MsgError.GrpcError, com.wanfang.grpcCommon.MsgError.GrpcError.Builder, com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:subscribe.SubscribeKeywordResponse)
  }

  // @@protoc_insertion_point(class_scope:subscribe.SubscribeKeywordResponse)
  private static final com.wanfang.subscribe.SubscribeKeywordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.subscribe.SubscribeKeywordResponse();
  }

  public static com.wanfang.subscribe.SubscribeKeywordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscribeKeywordResponse>
      PARSER = new com.google.protobuf.AbstractParser<SubscribeKeywordResponse>() {
    public SubscribeKeywordResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubscribeKeywordResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubscribeKeywordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscribeKeywordResponse> getParserForType() {
    return PARSER;
  }

  public com.wanfang.subscribe.SubscribeKeywordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

