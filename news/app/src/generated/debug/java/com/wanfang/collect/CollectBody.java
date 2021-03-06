// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collect/msg_collect.proto

package com.wanfang.collect;

/**
 * Protobuf type {@code collect.CollectBody}
 */
public  final class CollectBody extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:collect.CollectBody)
    CollectBodyOrBuilder {
  // Use CollectBody.newBuilder() to construct.
  private CollectBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CollectBody() {
    docuId_ = "";
    docuTitle_ = "";
    addTime_ = "";
    starLevel_ = 0;
    docuType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CollectBody(
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

            docuId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            docuTitle_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            addTime_ = s;
            break;
          }
          case 32: {

            starLevel_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            docuType_ = s;
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
    return com.wanfang.collect.MsgCollect.internal_static_collect_CollectBody_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.collect.MsgCollect.internal_static_collect_CollectBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.collect.CollectBody.class, com.wanfang.collect.CollectBody.Builder.class);
  }

  public static final int DOCU_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object docuId_;
  /**
   * <code>optional string docu_id = 1;</code>
   */
  public java.lang.String getDocuId() {
    java.lang.Object ref = docuId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      docuId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string docu_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDocuIdBytes() {
    java.lang.Object ref = docuId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      docuId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOCU_TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object docuTitle_;
  /**
   * <code>optional string docu_title = 2;</code>
   */
  public java.lang.String getDocuTitle() {
    java.lang.Object ref = docuTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      docuTitle_ = s;
      return s;
    }
  }
  /**
   * <code>optional string docu_title = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDocuTitleBytes() {
    java.lang.Object ref = docuTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      docuTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADD_TIME_FIELD_NUMBER = 3;
  private volatile java.lang.Object addTime_;
  /**
   * <code>optional string add_time = 3;</code>
   */
  public java.lang.String getAddTime() {
    java.lang.Object ref = addTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addTime_ = s;
      return s;
    }
  }
  /**
   * <code>optional string add_time = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAddTimeBytes() {
    java.lang.Object ref = addTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STAR_LEVEL_FIELD_NUMBER = 4;
  private int starLevel_;
  /**
   * <code>optional int32 star_level = 4;</code>
   */
  public int getStarLevel() {
    return starLevel_;
  }

  public static final int DOCU_TYPE_FIELD_NUMBER = 5;
  private volatile java.lang.Object docuType_;
  /**
   * <code>optional string docu_type = 5;</code>
   */
  public java.lang.String getDocuType() {
    java.lang.Object ref = docuType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      docuType_ = s;
      return s;
    }
  }
  /**
   * <code>optional string docu_type = 5;</code>
   */
  public com.google.protobuf.ByteString
      getDocuTypeBytes() {
    java.lang.Object ref = docuType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      docuType_ = b;
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
    if (!getDocuIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, docuId_);
    }
    if (!getDocuTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, docuTitle_);
    }
    if (!getAddTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, addTime_);
    }
    if (starLevel_ != 0) {
      output.writeInt32(4, starLevel_);
    }
    if (!getDocuTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, docuType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDocuIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, docuId_);
    }
    if (!getDocuTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, docuTitle_);
    }
    if (!getAddTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, addTime_);
    }
    if (starLevel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, starLevel_);
    }
    if (!getDocuTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, docuType_);
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
    if (!(obj instanceof com.wanfang.collect.CollectBody)) {
      return super.equals(obj);
    }
    com.wanfang.collect.CollectBody other = (com.wanfang.collect.CollectBody) obj;

    boolean result = true;
    result = result && getDocuId()
        .equals(other.getDocuId());
    result = result && getDocuTitle()
        .equals(other.getDocuTitle());
    result = result && getAddTime()
        .equals(other.getAddTime());
    result = result && (getStarLevel()
        == other.getStarLevel());
    result = result && getDocuType()
        .equals(other.getDocuType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + DOCU_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDocuId().hashCode();
    hash = (37 * hash) + DOCU_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getDocuTitle().hashCode();
    hash = (37 * hash) + ADD_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getAddTime().hashCode();
    hash = (37 * hash) + STAR_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getStarLevel();
    hash = (37 * hash) + DOCU_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDocuType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.collect.CollectBody parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.collect.CollectBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.collect.CollectBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.collect.CollectBody parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.collect.CollectBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.collect.CollectBody parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.collect.CollectBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.collect.CollectBody parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.collect.CollectBody parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.collect.CollectBody parseFrom(
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
  public static Builder newBuilder(com.wanfang.collect.CollectBody prototype) {
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
   * Protobuf type {@code collect.CollectBody}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:collect.CollectBody)
      com.wanfang.collect.CollectBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.collect.MsgCollect.internal_static_collect_CollectBody_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.collect.MsgCollect.internal_static_collect_CollectBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.collect.CollectBody.class, com.wanfang.collect.CollectBody.Builder.class);
    }

    // Construct using com.wanfang.collect.CollectBody.newBuilder()
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
      docuId_ = "";

      docuTitle_ = "";

      addTime_ = "";

      starLevel_ = 0;

      docuType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.collect.MsgCollect.internal_static_collect_CollectBody_descriptor;
    }

    public com.wanfang.collect.CollectBody getDefaultInstanceForType() {
      return com.wanfang.collect.CollectBody.getDefaultInstance();
    }

    public com.wanfang.collect.CollectBody build() {
      com.wanfang.collect.CollectBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.collect.CollectBody buildPartial() {
      com.wanfang.collect.CollectBody result = new com.wanfang.collect.CollectBody(this);
      result.docuId_ = docuId_;
      result.docuTitle_ = docuTitle_;
      result.addTime_ = addTime_;
      result.starLevel_ = starLevel_;
      result.docuType_ = docuType_;
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
      if (other instanceof com.wanfang.collect.CollectBody) {
        return mergeFrom((com.wanfang.collect.CollectBody)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.collect.CollectBody other) {
      if (other == com.wanfang.collect.CollectBody.getDefaultInstance()) return this;
      if (!other.getDocuId().isEmpty()) {
        docuId_ = other.docuId_;
        onChanged();
      }
      if (!other.getDocuTitle().isEmpty()) {
        docuTitle_ = other.docuTitle_;
        onChanged();
      }
      if (!other.getAddTime().isEmpty()) {
        addTime_ = other.addTime_;
        onChanged();
      }
      if (other.getStarLevel() != 0) {
        setStarLevel(other.getStarLevel());
      }
      if (!other.getDocuType().isEmpty()) {
        docuType_ = other.docuType_;
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
      com.wanfang.collect.CollectBody parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.collect.CollectBody) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object docuId_ = "";
    /**
     * <code>optional string docu_id = 1;</code>
     */
    public java.lang.String getDocuId() {
      java.lang.Object ref = docuId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        docuId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string docu_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDocuIdBytes() {
      java.lang.Object ref = docuId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        docuId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string docu_id = 1;</code>
     */
    public Builder setDocuId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      docuId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string docu_id = 1;</code>
     */
    public Builder clearDocuId() {
      
      docuId_ = getDefaultInstance().getDocuId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string docu_id = 1;</code>
     */
    public Builder setDocuIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      docuId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object docuTitle_ = "";
    /**
     * <code>optional string docu_title = 2;</code>
     */
    public java.lang.String getDocuTitle() {
      java.lang.Object ref = docuTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        docuTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string docu_title = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDocuTitleBytes() {
      java.lang.Object ref = docuTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        docuTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string docu_title = 2;</code>
     */
    public Builder setDocuTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      docuTitle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string docu_title = 2;</code>
     */
    public Builder clearDocuTitle() {
      
      docuTitle_ = getDefaultInstance().getDocuTitle();
      onChanged();
      return this;
    }
    /**
     * <code>optional string docu_title = 2;</code>
     */
    public Builder setDocuTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      docuTitle_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object addTime_ = "";
    /**
     * <code>optional string add_time = 3;</code>
     */
    public java.lang.String getAddTime() {
      java.lang.Object ref = addTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string add_time = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAddTimeBytes() {
      java.lang.Object ref = addTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string add_time = 3;</code>
     */
    public Builder setAddTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      addTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string add_time = 3;</code>
     */
    public Builder clearAddTime() {
      
      addTime_ = getDefaultInstance().getAddTime();
      onChanged();
      return this;
    }
    /**
     * <code>optional string add_time = 3;</code>
     */
    public Builder setAddTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      addTime_ = value;
      onChanged();
      return this;
    }

    private int starLevel_ ;
    /**
     * <code>optional int32 star_level = 4;</code>
     */
    public int getStarLevel() {
      return starLevel_;
    }
    /**
     * <code>optional int32 star_level = 4;</code>
     */
    public Builder setStarLevel(int value) {
      
      starLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 star_level = 4;</code>
     */
    public Builder clearStarLevel() {
      
      starLevel_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object docuType_ = "";
    /**
     * <code>optional string docu_type = 5;</code>
     */
    public java.lang.String getDocuType() {
      java.lang.Object ref = docuType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        docuType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string docu_type = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDocuTypeBytes() {
      java.lang.Object ref = docuType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        docuType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string docu_type = 5;</code>
     */
    public Builder setDocuType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      docuType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string docu_type = 5;</code>
     */
    public Builder clearDocuType() {
      
      docuType_ = getDefaultInstance().getDocuType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string docu_type = 5;</code>
     */
    public Builder setDocuTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      docuType_ = value;
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


    // @@protoc_insertion_point(builder_scope:collect.CollectBody)
  }

  // @@protoc_insertion_point(class_scope:collect.CollectBody)
  private static final com.wanfang.collect.CollectBody DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.collect.CollectBody();
  }

  public static com.wanfang.collect.CollectBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CollectBody>
      PARSER = new com.google.protobuf.AbstractParser<CollectBody>() {
    public CollectBody parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CollectBody(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CollectBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CollectBody> getParserForType() {
    return PARSER;
  }

  public com.wanfang.collect.CollectBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

