// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_iap_order.proto

package com.wanfang.trade;

/**
 * Protobuf type {@code trade.IAPCreateOrderResponse}
 */
public  final class IAPCreateOrderResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:trade.IAPCreateOrderResponse)
    IAPCreateOrderResponseOrBuilder {
  // Use IAPCreateOrderResponse.newBuilder() to construct.
  private IAPCreateOrderResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IAPCreateOrderResponse() {
    iapOrderNumber_ = "";
    productId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IAPCreateOrderResponse(
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

            iapOrderNumber_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            productId_ = s;
            break;
          }
          case 26: {
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
    return com.wanfang.trade.MsgIapOrder.internal_static_trade_IAPCreateOrderResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.trade.MsgIapOrder.internal_static_trade_IAPCreateOrderResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.trade.IAPCreateOrderResponse.class, com.wanfang.trade.IAPCreateOrderResponse.Builder.class);
  }

  public static final int IAP_ORDER_NUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object iapOrderNumber_;
  /**
   * <pre>
   * 订单号
   * </pre>
   *
   * <code>optional string iap_order_number = 1;</code>
   */
  public java.lang.String getIapOrderNumber() {
    java.lang.Object ref = iapOrderNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      iapOrderNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 订单号
   * </pre>
   *
   * <code>optional string iap_order_number = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIapOrderNumberBytes() {
    java.lang.Object ref = iapOrderNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      iapOrderNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object productId_;
  /**
   * <pre>
   * 用于发起内购用的产品id
   * </pre>
   *
   * <code>optional string product_id = 2;</code>
   */
  public java.lang.String getProductId() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 用于发起内购用的产品id
   * </pre>
   *
   * <code>optional string product_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProductIdBytes() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  private com.wanfang.grpcCommon.MsgError.GrpcError error_;
  /**
   * <code>optional .grpcCommon.GrpcError error = 3;</code>
   */
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>optional .grpcCommon.GrpcError error = 3;</code>
   */
  public com.wanfang.grpcCommon.MsgError.GrpcError getError() {
    return error_ == null ? com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
  }
  /**
   * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
    if (!getIapOrderNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iapOrderNumber_);
    }
    if (!getProductIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, productId_);
    }
    if (error_ != null) {
      output.writeMessage(3, getError());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIapOrderNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iapOrderNumber_);
    }
    if (!getProductIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, productId_);
    }
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getError());
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
    if (!(obj instanceof com.wanfang.trade.IAPCreateOrderResponse)) {
      return super.equals(obj);
    }
    com.wanfang.trade.IAPCreateOrderResponse other = (com.wanfang.trade.IAPCreateOrderResponse) obj;

    boolean result = true;
    result = result && getIapOrderNumber()
        .equals(other.getIapOrderNumber());
    result = result && getProductId()
        .equals(other.getProductId());
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
    hash = (37 * hash) + IAP_ORDER_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getIapOrderNumber().hashCode();
    hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId().hashCode();
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.trade.IAPCreateOrderResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.trade.IAPCreateOrderResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.trade.IAPCreateOrderResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.trade.IAPCreateOrderResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.trade.IAPCreateOrderResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.trade.IAPCreateOrderResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.trade.IAPCreateOrderResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.trade.IAPCreateOrderResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.trade.IAPCreateOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.trade.IAPCreateOrderResponse parseFrom(
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
  public static Builder newBuilder(com.wanfang.trade.IAPCreateOrderResponse prototype) {
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
   * Protobuf type {@code trade.IAPCreateOrderResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:trade.IAPCreateOrderResponse)
      com.wanfang.trade.IAPCreateOrderResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.trade.MsgIapOrder.internal_static_trade_IAPCreateOrderResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.trade.MsgIapOrder.internal_static_trade_IAPCreateOrderResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.trade.IAPCreateOrderResponse.class, com.wanfang.trade.IAPCreateOrderResponse.Builder.class);
    }

    // Construct using com.wanfang.trade.IAPCreateOrderResponse.newBuilder()
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
      iapOrderNumber_ = "";

      productId_ = "";

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
      return com.wanfang.trade.MsgIapOrder.internal_static_trade_IAPCreateOrderResponse_descriptor;
    }

    public com.wanfang.trade.IAPCreateOrderResponse getDefaultInstanceForType() {
      return com.wanfang.trade.IAPCreateOrderResponse.getDefaultInstance();
    }

    public com.wanfang.trade.IAPCreateOrderResponse build() {
      com.wanfang.trade.IAPCreateOrderResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.trade.IAPCreateOrderResponse buildPartial() {
      com.wanfang.trade.IAPCreateOrderResponse result = new com.wanfang.trade.IAPCreateOrderResponse(this);
      result.iapOrderNumber_ = iapOrderNumber_;
      result.productId_ = productId_;
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
      if (other instanceof com.wanfang.trade.IAPCreateOrderResponse) {
        return mergeFrom((com.wanfang.trade.IAPCreateOrderResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.trade.IAPCreateOrderResponse other) {
      if (other == com.wanfang.trade.IAPCreateOrderResponse.getDefaultInstance()) return this;
      if (!other.getIapOrderNumber().isEmpty()) {
        iapOrderNumber_ = other.iapOrderNumber_;
        onChanged();
      }
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        onChanged();
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
      com.wanfang.trade.IAPCreateOrderResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.trade.IAPCreateOrderResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object iapOrderNumber_ = "";
    /**
     * <pre>
     * 订单号
     * </pre>
     *
     * <code>optional string iap_order_number = 1;</code>
     */
    public java.lang.String getIapOrderNumber() {
      java.lang.Object ref = iapOrderNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iapOrderNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 订单号
     * </pre>
     *
     * <code>optional string iap_order_number = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIapOrderNumberBytes() {
      java.lang.Object ref = iapOrderNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iapOrderNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 订单号
     * </pre>
     *
     * <code>optional string iap_order_number = 1;</code>
     */
    public Builder setIapOrderNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      iapOrderNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 订单号
     * </pre>
     *
     * <code>optional string iap_order_number = 1;</code>
     */
    public Builder clearIapOrderNumber() {
      
      iapOrderNumber_ = getDefaultInstance().getIapOrderNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 订单号
     * </pre>
     *
     * <code>optional string iap_order_number = 1;</code>
     */
    public Builder setIapOrderNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      iapOrderNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object productId_ = "";
    /**
     * <pre>
     * 用于发起内购用的产品id
     * </pre>
     *
     * <code>optional string product_id = 2;</code>
     */
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 用于发起内购用的产品id
     * </pre>
     *
     * <code>optional string product_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 用于发起内购用的产品id
     * </pre>
     *
     * <code>optional string product_id = 2;</code>
     */
    public Builder setProductId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用于发起内购用的产品id
     * </pre>
     *
     * <code>optional string product_id = 2;</code>
     */
    public Builder clearProductId() {
      
      productId_ = getDefaultInstance().getProductId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用于发起内购用的产品id
     * </pre>
     *
     * <code>optional string product_id = 2;</code>
     */
    public Builder setProductIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productId_ = value;
      onChanged();
      return this;
    }

    private com.wanfang.grpcCommon.MsgError.GrpcError error_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanfang.grpcCommon.MsgError.GrpcError, com.wanfang.grpcCommon.MsgError.GrpcError.Builder, com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder> errorBuilder_;
    /**
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcError getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcError.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:trade.IAPCreateOrderResponse)
  }

  // @@protoc_insertion_point(class_scope:trade.IAPCreateOrderResponse)
  private static final com.wanfang.trade.IAPCreateOrderResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.trade.IAPCreateOrderResponse();
  }

  public static com.wanfang.trade.IAPCreateOrderResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IAPCreateOrderResponse>
      PARSER = new com.google.protobuf.AbstractParser<IAPCreateOrderResponse>() {
    public IAPCreateOrderResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new IAPCreateOrderResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IAPCreateOrderResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IAPCreateOrderResponse> getParserForType() {
    return PARSER;
  }

  public com.wanfang.trade.IAPCreateOrderResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

