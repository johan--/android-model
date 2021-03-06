// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_common.proto

package com.wanfang.personal;

/**
 * <pre>
 * 上传文件
 * </pre>
 *
 * Protobuf type {@code personal.FileMetaData}
 */
public  final class FileMetaData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.FileMetaData)
    FileMetaDataOrBuilder {
  // Use FileMetaData.newBuilder() to construct.
  private FileMetaData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileMetaData() {
    type_ = "";
    owner_ = "";
    loginToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FileMetaData(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              labels_ = com.google.protobuf.MapField.newMapField(
                  LabelsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            labels__ = input.readMessage(
                LabelsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            labels_.getMutableMap().put(
                labels__.getKey(), labels__.getValue());
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            owner_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            loginToken_ = s;
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
    return com.wanfang.personal.MsgCommon.internal_static_personal_FileMetaData_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetLabels();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgCommon.internal_static_personal_FileMetaData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.FileMetaData.class, com.wanfang.personal.FileMetaData.Builder.class);
  }

  private int bitField0_;
  public static final int LABELS_FIELD_NUMBER = 1;
  private static final class LabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.wanfang.personal.MsgCommon.internal_static_personal_FileMetaData_LabelsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> labels_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetLabels() {
    if (labels_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          LabelsDefaultEntryHolder.defaultEntry);
    }
    return labels_;
  }

  public int getLabelsCount() {
    return internalGetLabels().getMap().size();
  }
  /**
   * <pre>
   * 文件类型(头像、封面、PDF等)
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */

  public boolean containsLabels(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetLabels().getMap().containsKey(key);
  }
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }
  /**
   * <pre>
   * 文件类型(头像、封面、PDF等)
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return internalGetLabels().getMap();
  }
  /**
   * <pre>
   * 文件类型(头像、封面、PDF等)
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */

  public java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * 文件类型(头像、封面、PDF等)
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */

  public java.lang.String getLabelsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetLabels().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * Mime Type
   * </pre>
   *
   * <code>optional string type = 2;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Mime Type
   * </pre>
   *
   * <code>optional string type = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OWNER_FIELD_NUMBER = 3;
  private volatile java.lang.Object owner_;
  /**
   * <pre>
   * 文件上传者
   * </pre>
   *
   * <code>optional string owner = 3;</code>
   */
  public java.lang.String getOwner() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      owner_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 文件上传者
   * </pre>
   *
   * <code>optional string owner = 3;</code>
   */
  public com.google.protobuf.ByteString
      getOwnerBytes() {
    java.lang.Object ref = owner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      owner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOGIN_TOKEN_FIELD_NUMBER = 4;
  private volatile java.lang.Object loginToken_;
  /**
   * <code>optional string login_token = 4;</code>
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
   * <code>optional string login_token = 4;</code>
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetLabels(),
        LabelsDefaultEntryHolder.defaultEntry,
        1);
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (!getOwnerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, owner_);
    }
    if (!getLoginTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, loginToken_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetLabels().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      labels__ = LabelsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, labels__);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (!getOwnerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, owner_);
    }
    if (!getLoginTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, loginToken_);
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
    if (!(obj instanceof com.wanfang.personal.FileMetaData)) {
      return super.equals(obj);
    }
    com.wanfang.personal.FileMetaData other = (com.wanfang.personal.FileMetaData) obj;

    boolean result = true;
    result = result && internalGetLabels().equals(
        other.internalGetLabels());
    result = result && getType()
        .equals(other.getType());
    result = result && getOwner()
        .equals(other.getOwner());
    result = result && getLoginToken()
        .equals(other.getLoginToken());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (!internalGetLabels().getMap().isEmpty()) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabels().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + OWNER_FIELD_NUMBER;
    hash = (53 * hash) + getOwner().hashCode();
    hash = (37 * hash) + LOGIN_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getLoginToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.FileMetaData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.FileMetaData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.FileMetaData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.FileMetaData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.FileMetaData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.FileMetaData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.FileMetaData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.FileMetaData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.FileMetaData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.FileMetaData parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.FileMetaData prototype) {
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
   * 上传文件
   * </pre>
   *
   * Protobuf type {@code personal.FileMetaData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.FileMetaData)
      com.wanfang.personal.FileMetaDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgCommon.internal_static_personal_FileMetaData_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetLabels();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableLabels();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgCommon.internal_static_personal_FileMetaData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.FileMetaData.class, com.wanfang.personal.FileMetaData.Builder.class);
    }

    // Construct using com.wanfang.personal.FileMetaData.newBuilder()
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
      internalGetMutableLabels().clear();
      type_ = "";

      owner_ = "";

      loginToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgCommon.internal_static_personal_FileMetaData_descriptor;
    }

    public com.wanfang.personal.FileMetaData getDefaultInstanceForType() {
      return com.wanfang.personal.FileMetaData.getDefaultInstance();
    }

    public com.wanfang.personal.FileMetaData build() {
      com.wanfang.personal.FileMetaData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.FileMetaData buildPartial() {
      com.wanfang.personal.FileMetaData result = new com.wanfang.personal.FileMetaData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.labels_ = internalGetLabels();
      result.labels_.makeImmutable();
      result.type_ = type_;
      result.owner_ = owner_;
      result.loginToken_ = loginToken_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.wanfang.personal.FileMetaData) {
        return mergeFrom((com.wanfang.personal.FileMetaData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.FileMetaData other) {
      if (other == com.wanfang.personal.FileMetaData.getDefaultInstance()) return this;
      internalGetMutableLabels().mergeFrom(
          other.internalGetLabels());
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getOwner().isEmpty()) {
        owner_ = other.owner_;
        onChanged();
      }
      if (!other.getLoginToken().isEmpty()) {
        loginToken_ = other.loginToken_;
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
      com.wanfang.personal.FileMetaData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.FileMetaData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> labels_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetLabels() {
      if (labels_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            LabelsDefaultEntryHolder.defaultEntry);
      }
      return labels_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableLabels() {
      onChanged();;
      if (labels_ == null) {
        labels_ = com.google.protobuf.MapField.newMapField(
            LabelsDefaultEntryHolder.defaultEntry);
      }
      if (!labels_.isMutable()) {
        labels_ = labels_.copy();
      }
      return labels_;
    }

    public int getLabelsCount() {
      return internalGetLabels().getMap().size();
    }
    /**
     * <pre>
     * 文件类型(头像、封面、PDF等)
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */

    public boolean containsLabels(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetLabels().getMap().containsKey(key);
    }
    /**
     * Use {@link #getLabelsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }
    /**
     * <pre>
     * 文件类型(头像、封面、PDF等)
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return internalGetLabels().getMap();
    }
    /**
     * <pre>
     * 文件类型(头像、封面、PDF等)
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */

    public java.lang.String getLabelsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * 文件类型(头像、封面、PDF等)
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */

    public java.lang.String getLabelsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLabels() {
      getMutableLabels().clear();
      return this;
    }
    /**
     * <pre>
     * 文件类型(头像、封面、PDF等)
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */

    public Builder removeLabels(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableLabels().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableLabels() {
      return internalGetMutableLabels().getMutableMap();
    }
    /**
     * <pre>
     * 文件类型(头像、封面、PDF等)
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */
    public Builder putLabels(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableLabels().put(key, value);
      return this;
    }
    /**
     * <pre>
     * 文件类型(头像、封面、PDF等)
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 1;</code>
     */

    public Builder putAllLabels(
        java.util.Map<java.lang.String, java.lang.String> values) {
      getMutableLabels().putAll(values);
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * Mime Type
     * </pre>
     *
     * <code>optional string type = 2;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Mime Type
     * </pre>
     *
     * <code>optional string type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Mime Type
     * </pre>
     *
     * <code>optional string type = 2;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mime Type
     * </pre>
     *
     * <code>optional string type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Mime Type
     * </pre>
     *
     * <code>optional string type = 2;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object owner_ = "";
    /**
     * <pre>
     * 文件上传者
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        owner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 文件上传者
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 文件上传者
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public Builder setOwner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      owner_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 文件上传者
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public Builder clearOwner() {
      
      owner_ = getDefaultInstance().getOwner();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 文件上传者
     * </pre>
     *
     * <code>optional string owner = 3;</code>
     */
    public Builder setOwnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      owner_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object loginToken_ = "";
    /**
     * <code>optional string login_token = 4;</code>
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
     * <code>optional string login_token = 4;</code>
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
     * <code>optional string login_token = 4;</code>
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
     * <code>optional string login_token = 4;</code>
     */
    public Builder clearLoginToken() {
      
      loginToken_ = getDefaultInstance().getLoginToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string login_token = 4;</code>
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:personal.FileMetaData)
  }

  // @@protoc_insertion_point(class_scope:personal.FileMetaData)
  private static final com.wanfang.personal.FileMetaData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.FileMetaData();
  }

  public static com.wanfang.personal.FileMetaData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileMetaData>
      PARSER = new com.google.protobuf.AbstractParser<FileMetaData>() {
    public FileMetaData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new FileMetaData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FileMetaData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileMetaData> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.FileMetaData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

