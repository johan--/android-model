// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mainPage/ser_main_content.proto

package com.wanfang.main;

public final class SerMainContent {
  private SerMainContent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ContentResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ContentResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    java.util.List<com.wanfang.main.Content.ContentDetail> 
        getContentsList();
    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    com.wanfang.main.Content.ContentDetail getContents(int index);
    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    int getContentsCount();
    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    java.util.List<? extends com.wanfang.main.Content.ContentDetailOrBuilder> 
        getContentsOrBuilderList();
    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    com.wanfang.main.Content.ContentDetailOrBuilder getContentsOrBuilder(
        int index);

    /**
     * <pre>
     *是否有下一页
     * </pre>
     *
     * <code>optional bool no_more = 2;</code>
     */
    boolean getNoMore();
  }
  /**
   * Protobuf type {@code ContentResponse}
   */
  public  static final class ContentResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ContentResponse)
      ContentResponseOrBuilder {
    // Use ContentResponse.newBuilder() to construct.
    private ContentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ContentResponse() {
      contents_ = java.util.Collections.emptyList();
      noMore_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ContentResponse(
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
                contents_ = new java.util.ArrayList<com.wanfang.main.Content.ContentDetail>();
                mutable_bitField0_ |= 0x00000001;
              }
              contents_.add(
                  input.readMessage(com.wanfang.main.Content.ContentDetail.parser(), extensionRegistry));
              break;
            }
            case 16: {

              noMore_ = input.readBool();
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          contents_ = java.util.Collections.unmodifiableList(contents_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.main.SerMainContent.internal_static_ContentResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.main.SerMainContent.internal_static_ContentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.main.SerMainContent.ContentResponse.class, com.wanfang.main.SerMainContent.ContentResponse.Builder.class);
    }

    private int bitField0_;
    public static final int CONTENTS_FIELD_NUMBER = 1;
    private java.util.List<com.wanfang.main.Content.ContentDetail> contents_;
    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    public java.util.List<com.wanfang.main.Content.ContentDetail> getContentsList() {
      return contents_;
    }
    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    public java.util.List<? extends com.wanfang.main.Content.ContentDetailOrBuilder> 
        getContentsOrBuilderList() {
      return contents_;
    }
    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    public int getContentsCount() {
      return contents_.size();
    }
    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    public com.wanfang.main.Content.ContentDetail getContents(int index) {
      return contents_.get(index);
    }
    /**
     * <code>repeated .ContentDetail contents = 1;</code>
     */
    public com.wanfang.main.Content.ContentDetailOrBuilder getContentsOrBuilder(
        int index) {
      return contents_.get(index);
    }

    public static final int NO_MORE_FIELD_NUMBER = 2;
    private boolean noMore_;
    /**
     * <pre>
     *是否有下一页
     * </pre>
     *
     * <code>optional bool no_more = 2;</code>
     */
    public boolean getNoMore() {
      return noMore_;
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
      for (int i = 0; i < contents_.size(); i++) {
        output.writeMessage(1, contents_.get(i));
      }
      if (noMore_ != false) {
        output.writeBool(2, noMore_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < contents_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, contents_.get(i));
      }
      if (noMore_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, noMore_);
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
      if (!(obj instanceof com.wanfang.main.SerMainContent.ContentResponse)) {
        return super.equals(obj);
      }
      com.wanfang.main.SerMainContent.ContentResponse other = (com.wanfang.main.SerMainContent.ContentResponse) obj;

      boolean result = true;
      result = result && getContentsList()
          .equals(other.getContentsList());
      result = result && (getNoMore()
          == other.getNoMore());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (getContentsCount() > 0) {
        hash = (37 * hash) + CONTENTS_FIELD_NUMBER;
        hash = (53 * hash) + getContentsList().hashCode();
      }
      hash = (37 * hash) + NO_MORE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getNoMore());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.wanfang.main.SerMainContent.ContentResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wanfang.main.SerMainContent.ContentResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wanfang.main.SerMainContent.ContentResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wanfang.main.SerMainContent.ContentResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wanfang.main.SerMainContent.ContentResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wanfang.main.SerMainContent.ContentResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wanfang.main.SerMainContent.ContentResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.wanfang.main.SerMainContent.ContentResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.wanfang.main.SerMainContent.ContentResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.wanfang.main.SerMainContent.ContentResponse parseFrom(
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
    public static Builder newBuilder(com.wanfang.main.SerMainContent.ContentResponse prototype) {
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
     * Protobuf type {@code ContentResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ContentResponse)
        com.wanfang.main.SerMainContent.ContentResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.wanfang.main.SerMainContent.internal_static_ContentResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.wanfang.main.SerMainContent.internal_static_ContentResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.wanfang.main.SerMainContent.ContentResponse.class, com.wanfang.main.SerMainContent.ContentResponse.Builder.class);
      }

      // Construct using com.wanfang.main.SerMainContent.ContentResponse.newBuilder()
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
          getContentsFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (contentsBuilder_ == null) {
          contents_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          contentsBuilder_.clear();
        }
        noMore_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.wanfang.main.SerMainContent.internal_static_ContentResponse_descriptor;
      }

      public com.wanfang.main.SerMainContent.ContentResponse getDefaultInstanceForType() {
        return com.wanfang.main.SerMainContent.ContentResponse.getDefaultInstance();
      }

      public com.wanfang.main.SerMainContent.ContentResponse build() {
        com.wanfang.main.SerMainContent.ContentResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.wanfang.main.SerMainContent.ContentResponse buildPartial() {
        com.wanfang.main.SerMainContent.ContentResponse result = new com.wanfang.main.SerMainContent.ContentResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (contentsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            contents_ = java.util.Collections.unmodifiableList(contents_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.contents_ = contents_;
        } else {
          result.contents_ = contentsBuilder_.build();
        }
        result.noMore_ = noMore_;
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
        if (other instanceof com.wanfang.main.SerMainContent.ContentResponse) {
          return mergeFrom((com.wanfang.main.SerMainContent.ContentResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.wanfang.main.SerMainContent.ContentResponse other) {
        if (other == com.wanfang.main.SerMainContent.ContentResponse.getDefaultInstance()) return this;
        if (contentsBuilder_ == null) {
          if (!other.contents_.isEmpty()) {
            if (contents_.isEmpty()) {
              contents_ = other.contents_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureContentsIsMutable();
              contents_.addAll(other.contents_);
            }
            onChanged();
          }
        } else {
          if (!other.contents_.isEmpty()) {
            if (contentsBuilder_.isEmpty()) {
              contentsBuilder_.dispose();
              contentsBuilder_ = null;
              contents_ = other.contents_;
              bitField0_ = (bitField0_ & ~0x00000001);
              contentsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getContentsFieldBuilder() : null;
            } else {
              contentsBuilder_.addAllMessages(other.contents_);
            }
          }
        }
        if (other.getNoMore() != false) {
          setNoMore(other.getNoMore());
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
        com.wanfang.main.SerMainContent.ContentResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.wanfang.main.SerMainContent.ContentResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.wanfang.main.Content.ContentDetail> contents_ =
        java.util.Collections.emptyList();
      private void ensureContentsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          contents_ = new java.util.ArrayList<com.wanfang.main.Content.ContentDetail>(contents_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.wanfang.main.Content.ContentDetail, com.wanfang.main.Content.ContentDetail.Builder, com.wanfang.main.Content.ContentDetailOrBuilder> contentsBuilder_;

      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public java.util.List<com.wanfang.main.Content.ContentDetail> getContentsList() {
        if (contentsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(contents_);
        } else {
          return contentsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public int getContentsCount() {
        if (contentsBuilder_ == null) {
          return contents_.size();
        } else {
          return contentsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public com.wanfang.main.Content.ContentDetail getContents(int index) {
        if (contentsBuilder_ == null) {
          return contents_.get(index);
        } else {
          return contentsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public Builder setContents(
          int index, com.wanfang.main.Content.ContentDetail value) {
        if (contentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureContentsIsMutable();
          contents_.set(index, value);
          onChanged();
        } else {
          contentsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public Builder setContents(
          int index, com.wanfang.main.Content.ContentDetail.Builder builderForValue) {
        if (contentsBuilder_ == null) {
          ensureContentsIsMutable();
          contents_.set(index, builderForValue.build());
          onChanged();
        } else {
          contentsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public Builder addContents(com.wanfang.main.Content.ContentDetail value) {
        if (contentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureContentsIsMutable();
          contents_.add(value);
          onChanged();
        } else {
          contentsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public Builder addContents(
          int index, com.wanfang.main.Content.ContentDetail value) {
        if (contentsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureContentsIsMutable();
          contents_.add(index, value);
          onChanged();
        } else {
          contentsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public Builder addContents(
          com.wanfang.main.Content.ContentDetail.Builder builderForValue) {
        if (contentsBuilder_ == null) {
          ensureContentsIsMutable();
          contents_.add(builderForValue.build());
          onChanged();
        } else {
          contentsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public Builder addContents(
          int index, com.wanfang.main.Content.ContentDetail.Builder builderForValue) {
        if (contentsBuilder_ == null) {
          ensureContentsIsMutable();
          contents_.add(index, builderForValue.build());
          onChanged();
        } else {
          contentsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public Builder addAllContents(
          java.lang.Iterable<? extends com.wanfang.main.Content.ContentDetail> values) {
        if (contentsBuilder_ == null) {
          ensureContentsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, contents_);
          onChanged();
        } else {
          contentsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public Builder clearContents() {
        if (contentsBuilder_ == null) {
          contents_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          contentsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public Builder removeContents(int index) {
        if (contentsBuilder_ == null) {
          ensureContentsIsMutable();
          contents_.remove(index);
          onChanged();
        } else {
          contentsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public com.wanfang.main.Content.ContentDetail.Builder getContentsBuilder(
          int index) {
        return getContentsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public com.wanfang.main.Content.ContentDetailOrBuilder getContentsOrBuilder(
          int index) {
        if (contentsBuilder_ == null) {
          return contents_.get(index);  } else {
          return contentsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public java.util.List<? extends com.wanfang.main.Content.ContentDetailOrBuilder> 
           getContentsOrBuilderList() {
        if (contentsBuilder_ != null) {
          return contentsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(contents_);
        }
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public com.wanfang.main.Content.ContentDetail.Builder addContentsBuilder() {
        return getContentsFieldBuilder().addBuilder(
            com.wanfang.main.Content.ContentDetail.getDefaultInstance());
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public com.wanfang.main.Content.ContentDetail.Builder addContentsBuilder(
          int index) {
        return getContentsFieldBuilder().addBuilder(
            index, com.wanfang.main.Content.ContentDetail.getDefaultInstance());
      }
      /**
       * <code>repeated .ContentDetail contents = 1;</code>
       */
      public java.util.List<com.wanfang.main.Content.ContentDetail.Builder> 
           getContentsBuilderList() {
        return getContentsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.wanfang.main.Content.ContentDetail, com.wanfang.main.Content.ContentDetail.Builder, com.wanfang.main.Content.ContentDetailOrBuilder> 
          getContentsFieldBuilder() {
        if (contentsBuilder_ == null) {
          contentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.wanfang.main.Content.ContentDetail, com.wanfang.main.Content.ContentDetail.Builder, com.wanfang.main.Content.ContentDetailOrBuilder>(
                  contents_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          contents_ = null;
        }
        return contentsBuilder_;
      }

      private boolean noMore_ ;
      /**
       * <pre>
       *是否有下一页
       * </pre>
       *
       * <code>optional bool no_more = 2;</code>
       */
      public boolean getNoMore() {
        return noMore_;
      }
      /**
       * <pre>
       *是否有下一页
       * </pre>
       *
       * <code>optional bool no_more = 2;</code>
       */
      public Builder setNoMore(boolean value) {
        
        noMore_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *是否有下一页
       * </pre>
       *
       * <code>optional bool no_more = 2;</code>
       */
      public Builder clearNoMore() {
        
        noMore_ = false;
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


      // @@protoc_insertion_point(builder_scope:ContentResponse)
    }

    // @@protoc_insertion_point(class_scope:ContentResponse)
    private static final com.wanfang.main.SerMainContent.ContentResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.wanfang.main.SerMainContent.ContentResponse();
    }

    public static com.wanfang.main.SerMainContent.ContentResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ContentResponse>
        PARSER = new com.google.protobuf.AbstractParser<ContentResponse>() {
      public ContentResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ContentResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ContentResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ContentResponse> getParserForType() {
      return PARSER;
    }

    public com.wanfang.main.SerMainContent.ContentResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ContentResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ContentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037mainPage/ser_main_content.proto\032\026mainP" +
      "age/content.proto\"D\n\017ContentResponse\022 \n\010" +
      "contents\030\001 \003(\0132\016.ContentDetail\022\017\n\007no_mor" +
      "e\030\002 \001(\0102D\n\016ContentService\0222\n\rSearchConte" +
      "nt\022\017.ContentRequest\032\020.ContentResponseB\031\n" +
      "\020com.wanfang.main\242\002\004WFPRb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wanfang.main.Content.getDescriptor(),
        }, assigner);
    internal_static_ContentResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ContentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ContentResponse_descriptor,
        new java.lang.String[] { "Contents", "NoMore", });
    com.wanfang.main.Content.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
