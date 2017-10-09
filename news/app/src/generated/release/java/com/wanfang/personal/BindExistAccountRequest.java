// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_login.proto

package com.wanfang.personal;

/**
 * <pre>
 * 第三方登录 绑定万方账号
 * </pre>
 *
 * Protobuf type {@code personal.BindExistAccountRequest}
 */
public  final class BindExistAccountRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.BindExistAccountRequest)
    BindExistAccountRequestOrBuilder {
  // Use BindExistAccountRequest.newBuilder() to construct.
  private BindExistAccountRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BindExistAccountRequest() {
    uid_ = "";
    userName_ = "";
    password_ = "";
    thirdPartyType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private BindExistAccountRequest(
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

            uid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            userName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            password_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            thirdPartyType_ = rawValue;
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
    return com.wanfang.personal.MsgLogin.internal_static_personal_BindExistAccountRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgLogin.internal_static_personal_BindExistAccountRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.BindExistAccountRequest.class, com.wanfang.personal.BindExistAccountRequest.Builder.class);
  }

  public static final int UID_FIELD_NUMBER = 1;
  private volatile java.lang.Object uid_;
  /**
   * <pre>
   * 第三方登录唯一码
   * </pre>
   *
   * <code>optional string uid = 1;</code>
   */
  public java.lang.String getUid() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 第三方登录唯一码
   * </pre>
   *
   * <code>optional string uid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUidBytes() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object userName_;
  /**
   * <pre>
   * 用户名
   * </pre>
   *
   * <code>optional string user_name = 2;</code>
   */
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 用户名
   * </pre>
   *
   * <code>optional string user_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSWORD_FIELD_NUMBER = 3;
  private volatile java.lang.Object password_;
  /**
   * <pre>
   * 密码
   * </pre>
   *
   * <code>optional string password = 3;</code>
   */
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 密码
   * </pre>
   *
   * <code>optional string password = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THIRD_PARTY_TYPE_FIELD_NUMBER = 4;
  private int thirdPartyType_;
  /**
   * <pre>
   * 第三方登录类型
   * </pre>
   *
   * <code>optional .personal.ThirdPartyType third_party_type = 4;</code>
   */
  public int getThirdPartyTypeValue() {
    return thirdPartyType_;
  }
  /**
   * <pre>
   * 第三方登录类型
   * </pre>
   *
   * <code>optional .personal.ThirdPartyType third_party_type = 4;</code>
   */
  public com.wanfang.personal.ThirdPartyType getThirdPartyType() {
    com.wanfang.personal.ThirdPartyType result = com.wanfang.personal.ThirdPartyType.valueOf(thirdPartyType_);
    return result == null ? com.wanfang.personal.ThirdPartyType.UNRECOGNIZED : result;
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
    if (!getUidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uid_);
    }
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userName_);
    }
    if (!getPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, password_);
    }
    if (thirdPartyType_ != com.wanfang.personal.ThirdPartyType.WECHAT.getNumber()) {
      output.writeEnum(4, thirdPartyType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uid_);
    }
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userName_);
    }
    if (!getPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, password_);
    }
    if (thirdPartyType_ != com.wanfang.personal.ThirdPartyType.WECHAT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, thirdPartyType_);
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
    if (!(obj instanceof com.wanfang.personal.BindExistAccountRequest)) {
      return super.equals(obj);
    }
    com.wanfang.personal.BindExistAccountRequest other = (com.wanfang.personal.BindExistAccountRequest) obj;

    boolean result = true;
    result = result && getUid()
        .equals(other.getUid());
    result = result && getUserName()
        .equals(other.getUserName());
    result = result && getPassword()
        .equals(other.getPassword());
    result = result && thirdPartyType_ == other.thirdPartyType_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + getUid().hashCode();
    hash = (37 * hash) + USER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (37 * hash) + THIRD_PARTY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + thirdPartyType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.BindExistAccountRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.BindExistAccountRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.BindExistAccountRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.BindExistAccountRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.BindExistAccountRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.BindExistAccountRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.BindExistAccountRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.BindExistAccountRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.BindExistAccountRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.BindExistAccountRequest parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.BindExistAccountRequest prototype) {
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
   * 第三方登录 绑定万方账号
   * </pre>
   *
   * Protobuf type {@code personal.BindExistAccountRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.BindExistAccountRequest)
      com.wanfang.personal.BindExistAccountRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgLogin.internal_static_personal_BindExistAccountRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgLogin.internal_static_personal_BindExistAccountRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.BindExistAccountRequest.class, com.wanfang.personal.BindExistAccountRequest.Builder.class);
    }

    // Construct using com.wanfang.personal.BindExistAccountRequest.newBuilder()
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
      uid_ = "";

      userName_ = "";

      password_ = "";

      thirdPartyType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgLogin.internal_static_personal_BindExistAccountRequest_descriptor;
    }

    public com.wanfang.personal.BindExistAccountRequest getDefaultInstanceForType() {
      return com.wanfang.personal.BindExistAccountRequest.getDefaultInstance();
    }

    public com.wanfang.personal.BindExistAccountRequest build() {
      com.wanfang.personal.BindExistAccountRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.BindExistAccountRequest buildPartial() {
      com.wanfang.personal.BindExistAccountRequest result = new com.wanfang.personal.BindExistAccountRequest(this);
      result.uid_ = uid_;
      result.userName_ = userName_;
      result.password_ = password_;
      result.thirdPartyType_ = thirdPartyType_;
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
      if (other instanceof com.wanfang.personal.BindExistAccountRequest) {
        return mergeFrom((com.wanfang.personal.BindExistAccountRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.BindExistAccountRequest other) {
      if (other == com.wanfang.personal.BindExistAccountRequest.getDefaultInstance()) return this;
      if (!other.getUid().isEmpty()) {
        uid_ = other.uid_;
        onChanged();
      }
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        onChanged();
      }
      if (other.thirdPartyType_ != 0) {
        setThirdPartyTypeValue(other.getThirdPartyTypeValue());
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
      com.wanfang.personal.BindExistAccountRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.BindExistAccountRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object uid_ = "";
    /**
     * <pre>
     * 第三方登录唯一码
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public java.lang.String getUid() {
      java.lang.Object ref = uid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 第三方登录唯一码
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 第三方登录唯一码
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public Builder setUid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 第三方登录唯一码
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public Builder clearUid() {
      
      uid_ = getDefaultInstance().getUid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 第三方登录唯一码
     * </pre>
     *
     * <code>optional string uid = 1;</code>
     */
    public Builder setUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <pre>
     * 用户名
     * </pre>
     *
     * <code>optional string user_name = 2;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 用户名
     * </pre>
     *
     * <code>optional string user_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 用户名
     * </pre>
     *
     * <code>optional string user_name = 2;</code>
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户名
     * </pre>
     *
     * <code>optional string user_name = 2;</code>
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 用户名
     * </pre>
     *
     * <code>optional string user_name = 2;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     * <pre>
     * 密码
     * </pre>
     *
     * <code>optional string password = 3;</code>
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 密码
     * </pre>
     *
     * <code>optional string password = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 密码
     * </pre>
     *
     * <code>optional string password = 3;</code>
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 密码
     * </pre>
     *
     * <code>optional string password = 3;</code>
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 密码
     * </pre>
     *
     * <code>optional string password = 3;</code>
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      password_ = value;
      onChanged();
      return this;
    }

    private int thirdPartyType_ = 0;
    /**
     * <pre>
     * 第三方登录类型
     * </pre>
     *
     * <code>optional .personal.ThirdPartyType third_party_type = 4;</code>
     */
    public int getThirdPartyTypeValue() {
      return thirdPartyType_;
    }
    /**
     * <pre>
     * 第三方登录类型
     * </pre>
     *
     * <code>optional .personal.ThirdPartyType third_party_type = 4;</code>
     */
    public Builder setThirdPartyTypeValue(int value) {
      thirdPartyType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 第三方登录类型
     * </pre>
     *
     * <code>optional .personal.ThirdPartyType third_party_type = 4;</code>
     */
    public com.wanfang.personal.ThirdPartyType getThirdPartyType() {
      com.wanfang.personal.ThirdPartyType result = com.wanfang.personal.ThirdPartyType.valueOf(thirdPartyType_);
      return result == null ? com.wanfang.personal.ThirdPartyType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 第三方登录类型
     * </pre>
     *
     * <code>optional .personal.ThirdPartyType third_party_type = 4;</code>
     */
    public Builder setThirdPartyType(com.wanfang.personal.ThirdPartyType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      thirdPartyType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 第三方登录类型
     * </pre>
     *
     * <code>optional .personal.ThirdPartyType third_party_type = 4;</code>
     */
    public Builder clearThirdPartyType() {
      
      thirdPartyType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:personal.BindExistAccountRequest)
  }

  // @@protoc_insertion_point(class_scope:personal.BindExistAccountRequest)
  private static final com.wanfang.personal.BindExistAccountRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.BindExistAccountRequest();
  }

  public static com.wanfang.personal.BindExistAccountRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BindExistAccountRequest>
      PARSER = new com.google.protobuf.AbstractParser<BindExistAccountRequest>() {
    public BindExistAccountRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new BindExistAccountRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BindExistAccountRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BindExistAccountRequest> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.BindExistAccountRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
