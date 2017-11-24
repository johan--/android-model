// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collect/msg_collect.proto

package com.wanfang.collect;

/**
 * <pre>
 * degree学位信息
 * </pre>
 *
 * Protobuf type {@code collect.MyCollectDegreeMessage}
 */
public  final class MyCollectDegreeMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:collect.MyCollectDegreeMessage)
    MyCollectDegreeMessageOrBuilder {
  // Use MyCollectDegreeMessage.newBuilder() to construct.
  private MyCollectDegreeMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MyCollectDegreeMessage() {
    deunitName_ = "";
    degreeLevel_ = "";
    majorName_ = "";
    tutorName_ = "";
    publishYear_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MyCollectDegreeMessage(
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

            deunitName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            degreeLevel_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            majorName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            tutorName_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            publishYear_ = s;
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
    return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectDegreeMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectDegreeMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.collect.MyCollectDegreeMessage.class, com.wanfang.collect.MyCollectDegreeMessage.Builder.class);
  }

  public static final int DEUNIT_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object deunitName_;
  /**
   * <pre>
   * 学位授予单位
   * </pre>
   *
   * <code>optional string deunit_name = 1;</code>
   */
  public java.lang.String getDeunitName() {
    java.lang.Object ref = deunitName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deunitName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 学位授予单位
   * </pre>
   *
   * <code>optional string deunit_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDeunitNameBytes() {
    java.lang.Object ref = deunitName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deunitName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEGREE_LEVEL_FIELD_NUMBER = 2;
  private volatile java.lang.Object degreeLevel_;
  /**
   * <pre>
   * 授予学位
   * </pre>
   *
   * <code>optional string degree_level = 2;</code>
   */
  public java.lang.String getDegreeLevel() {
    java.lang.Object ref = degreeLevel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      degreeLevel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 授予学位
   * </pre>
   *
   * <code>optional string degree_level = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDegreeLevelBytes() {
    java.lang.Object ref = degreeLevel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      degreeLevel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAJOR_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object majorName_;
  /**
   * <pre>
   * 学科专业
   * </pre>
   *
   * <code>optional string major_name = 3;</code>
   */
  public java.lang.String getMajorName() {
    java.lang.Object ref = majorName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      majorName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 学科专业
   * </pre>
   *
   * <code>optional string major_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMajorNameBytes() {
    java.lang.Object ref = majorName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      majorName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TUTOR_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object tutorName_;
  /**
   * <pre>
   * 导师姓名
   * </pre>
   *
   * <code>optional string tutor_name = 4;</code>
   */
  public java.lang.String getTutorName() {
    java.lang.Object ref = tutorName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tutorName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 导师姓名
   * </pre>
   *
   * <code>optional string tutor_name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getTutorNameBytes() {
    java.lang.Object ref = tutorName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tutorName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLISH_YEAR_FIELD_NUMBER = 5;
  private volatile java.lang.Object publishYear_;
  /**
   * <pre>
   * 学位年度
   * </pre>
   *
   * <code>optional string publish_year = 5;</code>
   */
  public java.lang.String getPublishYear() {
    java.lang.Object ref = publishYear_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publishYear_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 学位年度
   * </pre>
   *
   * <code>optional string publish_year = 5;</code>
   */
  public com.google.protobuf.ByteString
      getPublishYearBytes() {
    java.lang.Object ref = publishYear_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publishYear_ = b;
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
    if (!getDeunitNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deunitName_);
    }
    if (!getDegreeLevelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, degreeLevel_);
    }
    if (!getMajorNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, majorName_);
    }
    if (!getTutorNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, tutorName_);
    }
    if (!getPublishYearBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, publishYear_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDeunitNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deunitName_);
    }
    if (!getDegreeLevelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, degreeLevel_);
    }
    if (!getMajorNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, majorName_);
    }
    if (!getTutorNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, tutorName_);
    }
    if (!getPublishYearBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, publishYear_);
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
    if (!(obj instanceof com.wanfang.collect.MyCollectDegreeMessage)) {
      return super.equals(obj);
    }
    com.wanfang.collect.MyCollectDegreeMessage other = (com.wanfang.collect.MyCollectDegreeMessage) obj;

    boolean result = true;
    result = result && getDeunitName()
        .equals(other.getDeunitName());
    result = result && getDegreeLevel()
        .equals(other.getDegreeLevel());
    result = result && getMajorName()
        .equals(other.getMajorName());
    result = result && getTutorName()
        .equals(other.getTutorName());
    result = result && getPublishYear()
        .equals(other.getPublishYear());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + DEUNIT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDeunitName().hashCode();
    hash = (37 * hash) + DEGREE_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getDegreeLevel().hashCode();
    hash = (37 * hash) + MAJOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMajorName().hashCode();
    hash = (37 * hash) + TUTOR_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTutorName().hashCode();
    hash = (37 * hash) + PUBLISH_YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getPublishYear().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.collect.MyCollectDegreeMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.collect.MyCollectDegreeMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.collect.MyCollectDegreeMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.collect.MyCollectDegreeMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.collect.MyCollectDegreeMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.collect.MyCollectDegreeMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.collect.MyCollectDegreeMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.collect.MyCollectDegreeMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.collect.MyCollectDegreeMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.collect.MyCollectDegreeMessage parseFrom(
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
  public static Builder newBuilder(com.wanfang.collect.MyCollectDegreeMessage prototype) {
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
   * degree学位信息
   * </pre>
   *
   * Protobuf type {@code collect.MyCollectDegreeMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:collect.MyCollectDegreeMessage)
      com.wanfang.collect.MyCollectDegreeMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectDegreeMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectDegreeMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.collect.MyCollectDegreeMessage.class, com.wanfang.collect.MyCollectDegreeMessage.Builder.class);
    }

    // Construct using com.wanfang.collect.MyCollectDegreeMessage.newBuilder()
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
      deunitName_ = "";

      degreeLevel_ = "";

      majorName_ = "";

      tutorName_ = "";

      publishYear_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectDegreeMessage_descriptor;
    }

    public com.wanfang.collect.MyCollectDegreeMessage getDefaultInstanceForType() {
      return com.wanfang.collect.MyCollectDegreeMessage.getDefaultInstance();
    }

    public com.wanfang.collect.MyCollectDegreeMessage build() {
      com.wanfang.collect.MyCollectDegreeMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.collect.MyCollectDegreeMessage buildPartial() {
      com.wanfang.collect.MyCollectDegreeMessage result = new com.wanfang.collect.MyCollectDegreeMessage(this);
      result.deunitName_ = deunitName_;
      result.degreeLevel_ = degreeLevel_;
      result.majorName_ = majorName_;
      result.tutorName_ = tutorName_;
      result.publishYear_ = publishYear_;
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
      if (other instanceof com.wanfang.collect.MyCollectDegreeMessage) {
        return mergeFrom((com.wanfang.collect.MyCollectDegreeMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.collect.MyCollectDegreeMessage other) {
      if (other == com.wanfang.collect.MyCollectDegreeMessage.getDefaultInstance()) return this;
      if (!other.getDeunitName().isEmpty()) {
        deunitName_ = other.deunitName_;
        onChanged();
      }
      if (!other.getDegreeLevel().isEmpty()) {
        degreeLevel_ = other.degreeLevel_;
        onChanged();
      }
      if (!other.getMajorName().isEmpty()) {
        majorName_ = other.majorName_;
        onChanged();
      }
      if (!other.getTutorName().isEmpty()) {
        tutorName_ = other.tutorName_;
        onChanged();
      }
      if (!other.getPublishYear().isEmpty()) {
        publishYear_ = other.publishYear_;
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
      com.wanfang.collect.MyCollectDegreeMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.collect.MyCollectDegreeMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object deunitName_ = "";
    /**
     * <pre>
     * 学位授予单位
     * </pre>
     *
     * <code>optional string deunit_name = 1;</code>
     */
    public java.lang.String getDeunitName() {
      java.lang.Object ref = deunitName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deunitName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 学位授予单位
     * </pre>
     *
     * <code>optional string deunit_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDeunitNameBytes() {
      java.lang.Object ref = deunitName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deunitName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 学位授予单位
     * </pre>
     *
     * <code>optional string deunit_name = 1;</code>
     */
    public Builder setDeunitName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deunitName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 学位授予单位
     * </pre>
     *
     * <code>optional string deunit_name = 1;</code>
     */
    public Builder clearDeunitName() {
      
      deunitName_ = getDefaultInstance().getDeunitName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 学位授予单位
     * </pre>
     *
     * <code>optional string deunit_name = 1;</code>
     */
    public Builder setDeunitNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deunitName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object degreeLevel_ = "";
    /**
     * <pre>
     * 授予学位
     * </pre>
     *
     * <code>optional string degree_level = 2;</code>
     */
    public java.lang.String getDegreeLevel() {
      java.lang.Object ref = degreeLevel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        degreeLevel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 授予学位
     * </pre>
     *
     * <code>optional string degree_level = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDegreeLevelBytes() {
      java.lang.Object ref = degreeLevel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        degreeLevel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 授予学位
     * </pre>
     *
     * <code>optional string degree_level = 2;</code>
     */
    public Builder setDegreeLevel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      degreeLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 授予学位
     * </pre>
     *
     * <code>optional string degree_level = 2;</code>
     */
    public Builder clearDegreeLevel() {
      
      degreeLevel_ = getDefaultInstance().getDegreeLevel();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 授予学位
     * </pre>
     *
     * <code>optional string degree_level = 2;</code>
     */
    public Builder setDegreeLevelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      degreeLevel_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object majorName_ = "";
    /**
     * <pre>
     * 学科专业
     * </pre>
     *
     * <code>optional string major_name = 3;</code>
     */
    public java.lang.String getMajorName() {
      java.lang.Object ref = majorName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        majorName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 学科专业
     * </pre>
     *
     * <code>optional string major_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMajorNameBytes() {
      java.lang.Object ref = majorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        majorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 学科专业
     * </pre>
     *
     * <code>optional string major_name = 3;</code>
     */
    public Builder setMajorName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      majorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 学科专业
     * </pre>
     *
     * <code>optional string major_name = 3;</code>
     */
    public Builder clearMajorName() {
      
      majorName_ = getDefaultInstance().getMajorName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 学科专业
     * </pre>
     *
     * <code>optional string major_name = 3;</code>
     */
    public Builder setMajorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      majorName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tutorName_ = "";
    /**
     * <pre>
     * 导师姓名
     * </pre>
     *
     * <code>optional string tutor_name = 4;</code>
     */
    public java.lang.String getTutorName() {
      java.lang.Object ref = tutorName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tutorName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 导师姓名
     * </pre>
     *
     * <code>optional string tutor_name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTutorNameBytes() {
      java.lang.Object ref = tutorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tutorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 导师姓名
     * </pre>
     *
     * <code>optional string tutor_name = 4;</code>
     */
    public Builder setTutorName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tutorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 导师姓名
     * </pre>
     *
     * <code>optional string tutor_name = 4;</code>
     */
    public Builder clearTutorName() {
      
      tutorName_ = getDefaultInstance().getTutorName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 导师姓名
     * </pre>
     *
     * <code>optional string tutor_name = 4;</code>
     */
    public Builder setTutorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tutorName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object publishYear_ = "";
    /**
     * <pre>
     * 学位年度
     * </pre>
     *
     * <code>optional string publish_year = 5;</code>
     */
    public java.lang.String getPublishYear() {
      java.lang.Object ref = publishYear_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publishYear_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 学位年度
     * </pre>
     *
     * <code>optional string publish_year = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPublishYearBytes() {
      java.lang.Object ref = publishYear_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publishYear_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 学位年度
     * </pre>
     *
     * <code>optional string publish_year = 5;</code>
     */
    public Builder setPublishYear(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      publishYear_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 学位年度
     * </pre>
     *
     * <code>optional string publish_year = 5;</code>
     */
    public Builder clearPublishYear() {
      
      publishYear_ = getDefaultInstance().getPublishYear();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 学位年度
     * </pre>
     *
     * <code>optional string publish_year = 5;</code>
     */
    public Builder setPublishYearBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      publishYear_ = value;
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


    // @@protoc_insertion_point(builder_scope:collect.MyCollectDegreeMessage)
  }

  // @@protoc_insertion_point(class_scope:collect.MyCollectDegreeMessage)
  private static final com.wanfang.collect.MyCollectDegreeMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.collect.MyCollectDegreeMessage();
  }

  public static com.wanfang.collect.MyCollectDegreeMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MyCollectDegreeMessage>
      PARSER = new com.google.protobuf.AbstractParser<MyCollectDegreeMessage>() {
    public MyCollectDegreeMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MyCollectDegreeMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MyCollectDegreeMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MyCollectDegreeMessage> getParserForType() {
    return PARSER;
  }

  public com.wanfang.collect.MyCollectDegreeMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
