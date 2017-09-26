// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_common.proto

package com.wanfang.personal;

/**
 * Protobuf type {@code personal.UploadFileResponse}
 */
public  final class UploadFileResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.UploadFileResponse)
    UploadFileResponseOrBuilder {
  // Use UploadFileResponse.newBuilder() to construct.
  private UploadFileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UploadFileResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UploadFileResponse(
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
              uploadUrls_ = com.google.protobuf.MapField.newMapField(
                  UploadUrlsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            uploadUrls__ = input.readMessage(
                UploadUrlsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            uploadUrls_.getMutableMap().put(
                uploadUrls__.getKey(), uploadUrls__.getValue());
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
    return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetUploadUrls();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.UploadFileResponse.class, com.wanfang.personal.UploadFileResponse.Builder.class);
  }

  public static final int UPLOAD_URLS_FIELD_NUMBER = 1;
  private static final class UploadUrlsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileResponse_UploadUrlsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> uploadUrls_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetUploadUrls() {
    if (uploadUrls_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          UploadUrlsDefaultEntryHolder.defaultEntry);
    }
    return uploadUrls_;
  }

  public int getUploadUrlsCount() {
    return internalGetUploadUrls().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; upload_urls = 1;</code>
   */

  public boolean containsUploadUrls(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetUploadUrls().getMap().containsKey(key);
  }
  /**
   * Use {@link #getUploadUrlsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getUploadUrls() {
    return getUploadUrlsMap();
  }
  /**
   * <code>map&lt;string, string&gt; upload_urls = 1;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getUploadUrlsMap() {
    return internalGetUploadUrls().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; upload_urls = 1;</code>
   */

  public java.lang.String getUploadUrlsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetUploadUrls().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; upload_urls = 1;</code>
   */

  public java.lang.String getUploadUrlsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetUploadUrls().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
        internalGetUploadUrls(),
        UploadUrlsDefaultEntryHolder.defaultEntry,
        1);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetUploadUrls().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      uploadUrls__ = UploadUrlsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, uploadUrls__);
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
    if (!(obj instanceof com.wanfang.personal.UploadFileResponse)) {
      return super.equals(obj);
    }
    com.wanfang.personal.UploadFileResponse other = (com.wanfang.personal.UploadFileResponse) obj;

    boolean result = true;
    result = result && internalGetUploadUrls().equals(
        other.internalGetUploadUrls());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (!internalGetUploadUrls().getMap().isEmpty()) {
      hash = (37 * hash) + UPLOAD_URLS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetUploadUrls().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.UploadFileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.UploadFileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.UploadFileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.UploadFileResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.UploadFileResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.UploadFileResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.UploadFileResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.UploadFileResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.UploadFileResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.UploadFileResponse parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.UploadFileResponse prototype) {
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
   * Protobuf type {@code personal.UploadFileResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.UploadFileResponse)
      com.wanfang.personal.UploadFileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetUploadUrls();
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
          return internalGetMutableUploadUrls();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.UploadFileResponse.class, com.wanfang.personal.UploadFileResponse.Builder.class);
    }

    // Construct using com.wanfang.personal.UploadFileResponse.newBuilder()
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
      internalGetMutableUploadUrls().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileResponse_descriptor;
    }

    public com.wanfang.personal.UploadFileResponse getDefaultInstanceForType() {
      return com.wanfang.personal.UploadFileResponse.getDefaultInstance();
    }

    public com.wanfang.personal.UploadFileResponse build() {
      com.wanfang.personal.UploadFileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.UploadFileResponse buildPartial() {
      com.wanfang.personal.UploadFileResponse result = new com.wanfang.personal.UploadFileResponse(this);
      int from_bitField0_ = bitField0_;
      result.uploadUrls_ = internalGetUploadUrls();
      result.uploadUrls_.makeImmutable();
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
      if (other instanceof com.wanfang.personal.UploadFileResponse) {
        return mergeFrom((com.wanfang.personal.UploadFileResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.UploadFileResponse other) {
      if (other == com.wanfang.personal.UploadFileResponse.getDefaultInstance()) return this;
      internalGetMutableUploadUrls().mergeFrom(
          other.internalGetUploadUrls());
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
      com.wanfang.personal.UploadFileResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.UploadFileResponse) e.getUnfinishedMessage();
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
        java.lang.String, java.lang.String> uploadUrls_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetUploadUrls() {
      if (uploadUrls_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            UploadUrlsDefaultEntryHolder.defaultEntry);
      }
      return uploadUrls_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableUploadUrls() {
      onChanged();;
      if (uploadUrls_ == null) {
        uploadUrls_ = com.google.protobuf.MapField.newMapField(
            UploadUrlsDefaultEntryHolder.defaultEntry);
      }
      if (!uploadUrls_.isMutable()) {
        uploadUrls_ = uploadUrls_.copy();
      }
      return uploadUrls_;
    }

    public int getUploadUrlsCount() {
      return internalGetUploadUrls().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; upload_urls = 1;</code>
     */

    public boolean containsUploadUrls(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetUploadUrls().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUploadUrlsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getUploadUrls() {
      return getUploadUrlsMap();
    }
    /**
     * <code>map&lt;string, string&gt; upload_urls = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getUploadUrlsMap() {
      return internalGetUploadUrls().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; upload_urls = 1;</code>
     */

    public java.lang.String getUploadUrlsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetUploadUrls().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; upload_urls = 1;</code>
     */

    public java.lang.String getUploadUrlsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetUploadUrls().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearUploadUrls() {
      getMutableUploadUrls().clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; upload_urls = 1;</code>
     */

    public Builder removeUploadUrls(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableUploadUrls().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableUploadUrls() {
      return internalGetMutableUploadUrls().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; upload_urls = 1;</code>
     */
    public Builder putUploadUrls(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableUploadUrls().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; upload_urls = 1;</code>
     */

    public Builder putAllUploadUrls(
        java.util.Map<java.lang.String, java.lang.String> values) {
      getMutableUploadUrls().putAll(values);
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


    // @@protoc_insertion_point(builder_scope:personal.UploadFileResponse)
  }

  // @@protoc_insertion_point(class_scope:personal.UploadFileResponse)
  private static final com.wanfang.personal.UploadFileResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.UploadFileResponse();
  }

  public static com.wanfang.personal.UploadFileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadFileResponse>
      PARSER = new com.google.protobuf.AbstractParser<UploadFileResponse>() {
    public UploadFileResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UploadFileResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UploadFileResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadFileResponse> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.UploadFileResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

