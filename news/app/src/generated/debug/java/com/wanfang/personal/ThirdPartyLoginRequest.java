// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_login.proto

package com.wanfang.personal;

/**
 * <pre>
 *第三方登录-请求
 * </pre>
 *
 * Protobuf type {@code personal.ThirdPartyLoginRequest}
 */
public  final class ThirdPartyLoginRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.ThirdPartyLoginRequest)
    ThirdPartyLoginRequestOrBuilder {
  // Use ThirdPartyLoginRequest.newBuilder() to construct.
  private ThirdPartyLoginRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThirdPartyLoginRequest() {
    uid_ = "";
    thirdPartyCode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ThirdPartyLoginRequest(
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
          case 16: {

            thirdPartyCode_ = input.readInt32();
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
    return com.wanfang.personal.MsgLogin.internal_static_personal_ThirdPartyLoginRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgLogin.internal_static_personal_ThirdPartyLoginRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.ThirdPartyLoginRequest.class, com.wanfang.personal.ThirdPartyLoginRequest.Builder.class);
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

  public static final int THIRD_PARTY_CODE_FIELD_NUMBER = 2;
  private int thirdPartyCode_;
  /**
   * <pre>
   * 第三方类型code(0：QQ，1：微博，2：微信)
   * </pre>
   *
   * <code>optional int32 third_party_code = 2;</code>
   */
  public int getThirdPartyCode() {
    return thirdPartyCode_;
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
    if (thirdPartyCode_ != 0) {
      output.writeInt32(2, thirdPartyCode_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uid_);
    }
    if (thirdPartyCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, thirdPartyCode_);
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
    if (!(obj instanceof com.wanfang.personal.ThirdPartyLoginRequest)) {
      return super.equals(obj);
    }
    com.wanfang.personal.ThirdPartyLoginRequest other = (com.wanfang.personal.ThirdPartyLoginRequest) obj;

    boolean result = true;
    result = result && getUid()
        .equals(other.getUid());
    result = result && (getThirdPartyCode()
        == other.getThirdPartyCode());
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
    hash = (37 * hash) + THIRD_PARTY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getThirdPartyCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.ThirdPartyLoginRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.ThirdPartyLoginRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.ThirdPartyLoginRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.ThirdPartyLoginRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.ThirdPartyLoginRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.ThirdPartyLoginRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.ThirdPartyLoginRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.ThirdPartyLoginRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.ThirdPartyLoginRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.ThirdPartyLoginRequest parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.ThirdPartyLoginRequest prototype) {
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
   *第三方登录-请求
   * </pre>
   *
   * Protobuf type {@code personal.ThirdPartyLoginRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.ThirdPartyLoginRequest)
      com.wanfang.personal.ThirdPartyLoginRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgLogin.internal_static_personal_ThirdPartyLoginRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgLogin.internal_static_personal_ThirdPartyLoginRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.ThirdPartyLoginRequest.class, com.wanfang.personal.ThirdPartyLoginRequest.Builder.class);
    }

    // Construct using com.wanfang.personal.ThirdPartyLoginRequest.newBuilder()
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

      thirdPartyCode_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgLogin.internal_static_personal_ThirdPartyLoginRequest_descriptor;
    }

    public com.wanfang.personal.ThirdPartyLoginRequest getDefaultInstanceForType() {
      return com.wanfang.personal.ThirdPartyLoginRequest.getDefaultInstance();
    }

    public com.wanfang.personal.ThirdPartyLoginRequest build() {
      com.wanfang.personal.ThirdPartyLoginRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.ThirdPartyLoginRequest buildPartial() {
      com.wanfang.personal.ThirdPartyLoginRequest result = new com.wanfang.personal.ThirdPartyLoginRequest(this);
      result.uid_ = uid_;
      result.thirdPartyCode_ = thirdPartyCode_;
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
      if (other instanceof com.wanfang.personal.ThirdPartyLoginRequest) {
        return mergeFrom((com.wanfang.personal.ThirdPartyLoginRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.ThirdPartyLoginRequest other) {
      if (other == com.wanfang.personal.ThirdPartyLoginRequest.getDefaultInstance()) return this;
      if (!other.getUid().isEmpty()) {
        uid_ = other.uid_;
        onChanged();
      }
      if (other.getThirdPartyCode() != 0) {
        setThirdPartyCode(other.getThirdPartyCode());
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
      com.wanfang.personal.ThirdPartyLoginRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.ThirdPartyLoginRequest) e.getUnfinishedMessage();
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

    private int thirdPartyCode_ ;
    /**
     * <pre>
     * 第三方类型code(0：QQ，1：微博，2：微信)
     * </pre>
     *
     * <code>optional int32 third_party_code = 2;</code>
     */
    public int getThirdPartyCode() {
      return thirdPartyCode_;
    }
    /**
     * <pre>
     * 第三方类型code(0：QQ，1：微博，2：微信)
     * </pre>
     *
     * <code>optional int32 third_party_code = 2;</code>
     */
    public Builder setThirdPartyCode(int value) {
      
      thirdPartyCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 第三方类型code(0：QQ，1：微博，2：微信)
     * </pre>
     *
     * <code>optional int32 third_party_code = 2;</code>
     */
    public Builder clearThirdPartyCode() {
      
      thirdPartyCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:personal.ThirdPartyLoginRequest)
  }

  // @@protoc_insertion_point(class_scope:personal.ThirdPartyLoginRequest)
  private static final com.wanfang.personal.ThirdPartyLoginRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.ThirdPartyLoginRequest();
  }

  public static com.wanfang.personal.ThirdPartyLoginRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThirdPartyLoginRequest>
      PARSER = new com.google.protobuf.AbstractParser<ThirdPartyLoginRequest>() {
    public ThirdPartyLoginRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ThirdPartyLoginRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ThirdPartyLoginRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThirdPartyLoginRequest> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.ThirdPartyLoginRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

