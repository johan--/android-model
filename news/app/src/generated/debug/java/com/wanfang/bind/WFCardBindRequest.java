// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bind/msg_wfcard_bind.proto

package com.wanfang.bind;

/**
 * Protobuf type {@code bind.WFCardBindRequest}
 */
public  final class WFCardBindRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bind.WFCardBindRequest)
    WFCardBindRequestOrBuilder {
  // Use WFCardBindRequest.newBuilder() to construct.
  private WFCardBindRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WFCardBindRequest() {
    userId_ = "";
    loginToken_ = "";
    cardNum_ = "";
    cardPwd_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private WFCardBindRequest(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            loginToken_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            cardNum_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            cardPwd_ = s;
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
    return com.wanfang.bind.MsgWfcardBind.internal_static_bind_WFCardBindRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.bind.MsgWfcardBind.internal_static_bind_WFCardBindRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.bind.WFCardBindRequest.class, com.wanfang.bind.WFCardBindRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object userId_;
  /**
   * <pre>
   * 必须
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
   * 必须
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

  public static final int LOGIN_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object loginToken_;
  /**
   * <pre>
   * 必须
   * </pre>
   *
   * <code>optional string login_token = 2;</code>
   */
  public java.lang.String getLoginToken() {
    java.lang.Object ref = loginToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      loginToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 必须
   * </pre>
   *
   * <code>optional string login_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLoginTokenBytes() {
    java.lang.Object ref = loginToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      loginToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CARD_NUM_FIELD_NUMBER = 3;
  private volatile java.lang.Object cardNum_;
  /**
   * <pre>
   * 必须
   * </pre>
   *
   * <code>optional string card_num = 3;</code>
   */
  public java.lang.String getCardNum() {
    java.lang.Object ref = cardNum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cardNum_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 必须
   * </pre>
   *
   * <code>optional string card_num = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCardNumBytes() {
    java.lang.Object ref = cardNum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cardNum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CARD_PWD_FIELD_NUMBER = 4;
  private volatile java.lang.Object cardPwd_;
  /**
   * <pre>
   * 必须
   * </pre>
   *
   * <code>optional string card_pwd = 4;</code>
   */
  public java.lang.String getCardPwd() {
    java.lang.Object ref = cardPwd_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cardPwd_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 必须
   * </pre>
   *
   * <code>optional string card_pwd = 4;</code>
   */
  public com.google.protobuf.ByteString
      getCardPwdBytes() {
    java.lang.Object ref = cardPwd_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cardPwd_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getLoginTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, loginToken_);
    }
    if (!getCardNumBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cardNum_);
    }
    if (!getCardPwdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, cardPwd_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userId_);
    }
    if (!getLoginTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, loginToken_);
    }
    if (!getCardNumBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cardNum_);
    }
    if (!getCardPwdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, cardPwd_);
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
    if (!(obj instanceof com.wanfang.bind.WFCardBindRequest)) {
      return super.equals(obj);
    }
    com.wanfang.bind.WFCardBindRequest other = (com.wanfang.bind.WFCardBindRequest) obj;

    boolean result = true;
    result = result && getUserId()
        .equals(other.getUserId());
    result = result && getLoginToken()
        .equals(other.getLoginToken());
    result = result && getCardNum()
        .equals(other.getCardNum());
    result = result && getCardPwd()
        .equals(other.getCardPwd());
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
    hash = (37 * hash) + LOGIN_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getLoginToken().hashCode();
    hash = (37 * hash) + CARD_NUM_FIELD_NUMBER;
    hash = (53 * hash) + getCardNum().hashCode();
    hash = (37 * hash) + CARD_PWD_FIELD_NUMBER;
    hash = (53 * hash) + getCardPwd().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.bind.WFCardBindRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.bind.WFCardBindRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.bind.WFCardBindRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.bind.WFCardBindRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.bind.WFCardBindRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.bind.WFCardBindRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.bind.WFCardBindRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.bind.WFCardBindRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.bind.WFCardBindRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.bind.WFCardBindRequest parseFrom(
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
  public static Builder newBuilder(com.wanfang.bind.WFCardBindRequest prototype) {
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
   * Protobuf type {@code bind.WFCardBindRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bind.WFCardBindRequest)
      com.wanfang.bind.WFCardBindRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.bind.MsgWfcardBind.internal_static_bind_WFCardBindRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.bind.MsgWfcardBind.internal_static_bind_WFCardBindRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.bind.WFCardBindRequest.class, com.wanfang.bind.WFCardBindRequest.Builder.class);
    }

    // Construct using com.wanfang.bind.WFCardBindRequest.newBuilder()
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

      loginToken_ = "";

      cardNum_ = "";

      cardPwd_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.bind.MsgWfcardBind.internal_static_bind_WFCardBindRequest_descriptor;
    }

    public com.wanfang.bind.WFCardBindRequest getDefaultInstanceForType() {
      return com.wanfang.bind.WFCardBindRequest.getDefaultInstance();
    }

    public com.wanfang.bind.WFCardBindRequest build() {
      com.wanfang.bind.WFCardBindRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.bind.WFCardBindRequest buildPartial() {
      com.wanfang.bind.WFCardBindRequest result = new com.wanfang.bind.WFCardBindRequest(this);
      result.userId_ = userId_;
      result.loginToken_ = loginToken_;
      result.cardNum_ = cardNum_;
      result.cardPwd_ = cardPwd_;
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
      if (other instanceof com.wanfang.bind.WFCardBindRequest) {
        return mergeFrom((com.wanfang.bind.WFCardBindRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.bind.WFCardBindRequest other) {
      if (other == com.wanfang.bind.WFCardBindRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getLoginToken().isEmpty()) {
        loginToken_ = other.loginToken_;
        onChanged();
      }
      if (!other.getCardNum().isEmpty()) {
        cardNum_ = other.cardNum_;
        onChanged();
      }
      if (!other.getCardPwd().isEmpty()) {
        cardPwd_ = other.cardPwd_;
        onChanged();
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
      com.wanfang.bind.WFCardBindRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.bind.WFCardBindRequest) e.getUnfinishedMessage();
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
     * 必须
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
     * 必须
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
     * 必须
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
     * 必须
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
     * 必须
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

    private java.lang.Object loginToken_ = "";
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string login_token = 2;</code>
     */
    public java.lang.String getLoginToken() {
      java.lang.Object ref = loginToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        loginToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string login_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLoginTokenBytes() {
      java.lang.Object ref = loginToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        loginToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string login_token = 2;</code>
     */
    public Builder setLoginToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      loginToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string login_token = 2;</code>
     */
    public Builder clearLoginToken() {
      
      loginToken_ = getDefaultInstance().getLoginToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string login_token = 2;</code>
     */
    public Builder setLoginTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      loginToken_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cardNum_ = "";
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_num = 3;</code>
     */
    public java.lang.String getCardNum() {
      java.lang.Object ref = cardNum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cardNum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_num = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCardNumBytes() {
      java.lang.Object ref = cardNum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cardNum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_num = 3;</code>
     */
    public Builder setCardNum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cardNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_num = 3;</code>
     */
    public Builder clearCardNum() {
      
      cardNum_ = getDefaultInstance().getCardNum();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_num = 3;</code>
     */
    public Builder setCardNumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cardNum_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cardPwd_ = "";
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_pwd = 4;</code>
     */
    public java.lang.String getCardPwd() {
      java.lang.Object ref = cardPwd_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cardPwd_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_pwd = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCardPwdBytes() {
      java.lang.Object ref = cardPwd_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cardPwd_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_pwd = 4;</code>
     */
    public Builder setCardPwd(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cardPwd_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_pwd = 4;</code>
     */
    public Builder clearCardPwd() {
      
      cardPwd_ = getDefaultInstance().getCardPwd();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 必须
     * </pre>
     *
     * <code>optional string card_pwd = 4;</code>
     */
    public Builder setCardPwdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cardPwd_ = value;
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


    // @@protoc_insertion_point(builder_scope:bind.WFCardBindRequest)
  }

  // @@protoc_insertion_point(class_scope:bind.WFCardBindRequest)
  private static final com.wanfang.bind.WFCardBindRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.bind.WFCardBindRequest();
  }

  public static com.wanfang.bind.WFCardBindRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WFCardBindRequest>
      PARSER = new com.google.protobuf.AbstractParser<WFCardBindRequest>() {
    public WFCardBindRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new WFCardBindRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WFCardBindRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WFCardBindRequest> getParserForType() {
    return PARSER;
  }

  public com.wanfang.bind.WFCardBindRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

