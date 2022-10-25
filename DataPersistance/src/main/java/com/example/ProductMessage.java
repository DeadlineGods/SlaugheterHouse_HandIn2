// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package com.example;

/**
 * Protobuf type {@code product.ProductMessage}
 */
public final class ProductMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:product.ProductMessage)
    ProductMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductMessage.newBuilder() to construct.
  private ProductMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductMessage(
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
          case 8: {

            registrationNo_ = input.readInt64();
            break;
          }
          case 16: {

            trayId_ = input.readInt64();
            break;
          }
          case 24: {

            partNo_ = input.readInt32();
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
    return com.example.ProductOuterClass.internal_static_product_ProductMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.ProductOuterClass.internal_static_product_ProductMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.ProductMessage.class, com.example.ProductMessage.Builder.class);
  }

  public static final int REGISTRATIONNO_FIELD_NUMBER = 1;
  private long registrationNo_;
  /**
   * <code>int64 registrationNo = 1;</code>
   * @return The registrationNo.
   */
  @java.lang.Override
  public long getRegistrationNo() {
    return registrationNo_;
  }

  public static final int TRAYID_FIELD_NUMBER = 2;
  private long trayId_;
  /**
   * <code>int64 trayId = 2;</code>
   * @return The trayId.
   */
  @java.lang.Override
  public long getTrayId() {
    return trayId_;
  }

  public static final int PARTNO_FIELD_NUMBER = 3;
  private int partNo_;
  /**
   * <code>int32 partNo = 3;</code>
   * @return The partNo.
   */
  @java.lang.Override
  public int getPartNo() {
    return partNo_;
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
    if (registrationNo_ != 0L) {
      output.writeInt64(1, registrationNo_);
    }
    if (trayId_ != 0L) {
      output.writeInt64(2, trayId_);
    }
    if (partNo_ != 0) {
      output.writeInt32(3, partNo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (registrationNo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, registrationNo_);
    }
    if (trayId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, trayId_);
    }
    if (partNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, partNo_);
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
    if (!(obj instanceof com.example.ProductMessage)) {
      return super.equals(obj);
    }
    com.example.ProductMessage other = (com.example.ProductMessage) obj;

    if (getRegistrationNo()
        != other.getRegistrationNo()) return false;
    if (getTrayId()
        != other.getTrayId()) return false;
    if (getPartNo()
        != other.getPartNo()) return false;
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
    hash = (37 * hash) + REGISTRATIONNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRegistrationNo());
    hash = (37 * hash) + TRAYID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTrayId());
    hash = (37 * hash) + PARTNO_FIELD_NUMBER;
    hash = (53 * hash) + getPartNo();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.ProductMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.ProductMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.ProductMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.ProductMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.ProductMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.ProductMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.ProductMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.ProductMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.ProductMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.ProductMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.ProductMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.ProductMessage parseFrom(
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
  public static Builder newBuilder(com.example.ProductMessage prototype) {
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
   * Protobuf type {@code product.ProductMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:product.ProductMessage)
      com.example.ProductMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.ProductOuterClass.internal_static_product_ProductMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.ProductOuterClass.internal_static_product_ProductMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.ProductMessage.class, com.example.ProductMessage.Builder.class);
    }

    // Construct using com.example.ProductMessage.newBuilder()
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
      registrationNo_ = 0L;

      trayId_ = 0L;

      partNo_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.ProductOuterClass.internal_static_product_ProductMessage_descriptor;
    }

    @java.lang.Override
    public com.example.ProductMessage getDefaultInstanceForType() {
      return com.example.ProductMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.ProductMessage build() {
      com.example.ProductMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.ProductMessage buildPartial() {
      com.example.ProductMessage result = new com.example.ProductMessage(this);
      result.registrationNo_ = registrationNo_;
      result.trayId_ = trayId_;
      result.partNo_ = partNo_;
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
      if (other instanceof com.example.ProductMessage) {
        return mergeFrom((com.example.ProductMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.ProductMessage other) {
      if (other == com.example.ProductMessage.getDefaultInstance()) return this;
      if (other.getRegistrationNo() != 0L) {
        setRegistrationNo(other.getRegistrationNo());
      }
      if (other.getTrayId() != 0L) {
        setTrayId(other.getTrayId());
      }
      if (other.getPartNo() != 0) {
        setPartNo(other.getPartNo());
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
      com.example.ProductMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.ProductMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long registrationNo_ ;
    /**
     * <code>int64 registrationNo = 1;</code>
     * @return The registrationNo.
     */
    @java.lang.Override
    public long getRegistrationNo() {
      return registrationNo_;
    }
    /**
     * <code>int64 registrationNo = 1;</code>
     * @param value The registrationNo to set.
     * @return This builder for chaining.
     */
    public Builder setRegistrationNo(long value) {
      
      registrationNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 registrationNo = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegistrationNo() {
      
      registrationNo_ = 0L;
      onChanged();
      return this;
    }

    private long trayId_ ;
    /**
     * <code>int64 trayId = 2;</code>
     * @return The trayId.
     */
    @java.lang.Override
    public long getTrayId() {
      return trayId_;
    }
    /**
     * <code>int64 trayId = 2;</code>
     * @param value The trayId to set.
     * @return This builder for chaining.
     */
    public Builder setTrayId(long value) {
      
      trayId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 trayId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrayId() {
      
      trayId_ = 0L;
      onChanged();
      return this;
    }

    private int partNo_ ;
    /**
     * <code>int32 partNo = 3;</code>
     * @return The partNo.
     */
    @java.lang.Override
    public int getPartNo() {
      return partNo_;
    }
    /**
     * <code>int32 partNo = 3;</code>
     * @param value The partNo to set.
     * @return This builder for chaining.
     */
    public Builder setPartNo(int value) {
      
      partNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 partNo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartNo() {
      
      partNo_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:product.ProductMessage)
  }

  // @@protoc_insertion_point(class_scope:product.ProductMessage)
  private static final com.example.ProductMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.ProductMessage();
  }

  public static com.example.ProductMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductMessage>
      PARSER = new com.google.protobuf.AbstractParser<ProductMessage>() {
    @java.lang.Override
    public ProductMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.ProductMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

