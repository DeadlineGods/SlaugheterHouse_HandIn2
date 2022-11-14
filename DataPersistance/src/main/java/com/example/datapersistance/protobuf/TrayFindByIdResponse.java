// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tray.proto

package com.example.datapersistance.protobuf;

/**
 * Protobuf type {@code TrayFindByIdResponse}
 */
public final class TrayFindByIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TrayFindByIdResponse)
    TrayFindByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrayFindByIdResponse.newBuilder() to construct.
  private TrayFindByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrayFindByIdResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrayFindByIdResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrayFindByIdResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.example.datapersistance.protobuf.TrayData.Builder subBuilder = null;
            if (tray_ != null) {
              subBuilder = tray_.toBuilder();
            }
            tray_ = input.readMessage(com.example.datapersistance.protobuf.TrayData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tray_);
              tray_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayFindByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayFindByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.datapersistance.protobuf.TrayFindByIdResponse.class, com.example.datapersistance.protobuf.TrayFindByIdResponse.Builder.class);
  }

  public static final int TRAY_FIELD_NUMBER = 1;
  private com.example.datapersistance.protobuf.TrayData tray_;
  /**
   * <code>.TrayData tray = 1;</code>
   * @return Whether the tray field is set.
   */
  @java.lang.Override
  public boolean hasTray() {
    return tray_ != null;
  }
  /**
   * <code>.TrayData tray = 1;</code>
   * @return The tray.
   */
  @java.lang.Override
  public com.example.datapersistance.protobuf.TrayData getTray() {
    return tray_ == null ? com.example.datapersistance.protobuf.TrayData.getDefaultInstance() : tray_;
  }
  /**
   * <code>.TrayData tray = 1;</code>
   */
  @java.lang.Override
  public com.example.datapersistance.protobuf.TrayDataOrBuilder getTrayOrBuilder() {
    return getTray();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (tray_ != null) {
      output.writeMessage(1, getTray());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tray_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTray());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.datapersistance.protobuf.TrayFindByIdResponse)) {
      return super.equals(obj);
    }
    com.example.datapersistance.protobuf.TrayFindByIdResponse other = (com.example.datapersistance.protobuf.TrayFindByIdResponse) obj;

    if (hasTray() != other.hasTray()) return false;
    if (hasTray()) {
      if (!getTray()
          .equals(other.getTray())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTray()) {
      hash = (37 * hash) + TRAY_FIELD_NUMBER;
      hash = (53 * hash) + getTray().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.TrayFindByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.datapersistance.protobuf.TrayFindByIdResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code TrayFindByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TrayFindByIdResponse)
      com.example.datapersistance.protobuf.TrayFindByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayFindByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayFindByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.datapersistance.protobuf.TrayFindByIdResponse.class, com.example.datapersistance.protobuf.TrayFindByIdResponse.Builder.class);
    }

    // Construct using com.example.datapersistance.protobuf.TrayFindByIdResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (trayBuilder_ == null) {
        tray_ = null;
      } else {
        tray_ = null;
        trayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayFindByIdResponse_descriptor;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.TrayFindByIdResponse getDefaultInstanceForType() {
      return com.example.datapersistance.protobuf.TrayFindByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.TrayFindByIdResponse build() {
      com.example.datapersistance.protobuf.TrayFindByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.TrayFindByIdResponse buildPartial() {
      com.example.datapersistance.protobuf.TrayFindByIdResponse result = new com.example.datapersistance.protobuf.TrayFindByIdResponse(this);
      if (trayBuilder_ == null) {
        result.tray_ = tray_;
      } else {
        result.tray_ = trayBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.datapersistance.protobuf.TrayFindByIdResponse) {
        return mergeFrom((com.example.datapersistance.protobuf.TrayFindByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.datapersistance.protobuf.TrayFindByIdResponse other) {
      if (other == com.example.datapersistance.protobuf.TrayFindByIdResponse.getDefaultInstance()) return this;
      if (other.hasTray()) {
        mergeTray(other.getTray());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.datapersistance.protobuf.TrayFindByIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.datapersistance.protobuf.TrayFindByIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.datapersistance.protobuf.TrayData tray_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.datapersistance.protobuf.TrayData, com.example.datapersistance.protobuf.TrayData.Builder, com.example.datapersistance.protobuf.TrayDataOrBuilder> trayBuilder_;
    /**
     * <code>.TrayData tray = 1;</code>
     * @return Whether the tray field is set.
     */
    public boolean hasTray() {
      return trayBuilder_ != null || tray_ != null;
    }
    /**
     * <code>.TrayData tray = 1;</code>
     * @return The tray.
     */
    public com.example.datapersistance.protobuf.TrayData getTray() {
      if (trayBuilder_ == null) {
        return tray_ == null ? com.example.datapersistance.protobuf.TrayData.getDefaultInstance() : tray_;
      } else {
        return trayBuilder_.getMessage();
      }
    }
    /**
     * <code>.TrayData tray = 1;</code>
     */
    public Builder setTray(com.example.datapersistance.protobuf.TrayData value) {
      if (trayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tray_ = value;
        onChanged();
      } else {
        trayBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.TrayData tray = 1;</code>
     */
    public Builder setTray(
        com.example.datapersistance.protobuf.TrayData.Builder builderForValue) {
      if (trayBuilder_ == null) {
        tray_ = builderForValue.build();
        onChanged();
      } else {
        trayBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.TrayData tray = 1;</code>
     */
    public Builder mergeTray(com.example.datapersistance.protobuf.TrayData value) {
      if (trayBuilder_ == null) {
        if (tray_ != null) {
          tray_ =
            com.example.datapersistance.protobuf.TrayData.newBuilder(tray_).mergeFrom(value).buildPartial();
        } else {
          tray_ = value;
        }
        onChanged();
      } else {
        trayBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.TrayData tray = 1;</code>
     */
    public Builder clearTray() {
      if (trayBuilder_ == null) {
        tray_ = null;
        onChanged();
      } else {
        tray_ = null;
        trayBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.TrayData tray = 1;</code>
     */
    public com.example.datapersistance.protobuf.TrayData.Builder getTrayBuilder() {
      
      onChanged();
      return getTrayFieldBuilder().getBuilder();
    }
    /**
     * <code>.TrayData tray = 1;</code>
     */
    public com.example.datapersistance.protobuf.TrayDataOrBuilder getTrayOrBuilder() {
      if (trayBuilder_ != null) {
        return trayBuilder_.getMessageOrBuilder();
      } else {
        return tray_ == null ?
            com.example.datapersistance.protobuf.TrayData.getDefaultInstance() : tray_;
      }
    }
    /**
     * <code>.TrayData tray = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.datapersistance.protobuf.TrayData, com.example.datapersistance.protobuf.TrayData.Builder, com.example.datapersistance.protobuf.TrayDataOrBuilder> 
        getTrayFieldBuilder() {
      if (trayBuilder_ == null) {
        trayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.datapersistance.protobuf.TrayData, com.example.datapersistance.protobuf.TrayData.Builder, com.example.datapersistance.protobuf.TrayDataOrBuilder>(
                getTray(),
                getParentForChildren(),
                isClean());
        tray_ = null;
      }
      return trayBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TrayFindByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:TrayFindByIdResponse)
  private static final com.example.datapersistance.protobuf.TrayFindByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.datapersistance.protobuf.TrayFindByIdResponse();
  }

  public static com.example.datapersistance.protobuf.TrayFindByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrayFindByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<TrayFindByIdResponse>() {
    @java.lang.Override
    public TrayFindByIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrayFindByIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrayFindByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrayFindByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.datapersistance.protobuf.TrayFindByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

