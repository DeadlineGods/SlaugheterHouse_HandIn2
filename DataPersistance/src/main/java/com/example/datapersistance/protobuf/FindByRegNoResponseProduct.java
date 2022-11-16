// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package com.example.datapersistance.protobuf;

/**
 * Protobuf type {@code FindByRegNoResponseProduct}
 */
public final class FindByRegNoResponseProduct extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FindByRegNoResponseProduct)
    FindByRegNoResponseProductOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindByRegNoResponseProduct.newBuilder() to construct.
  private FindByRegNoResponseProduct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindByRegNoResponseProduct() {
    partNo_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FindByRegNoResponseProduct();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindByRegNoResponseProduct(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              partNo_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            partNo_.addInt(input.readInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              partNo_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              partNo_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        partNo_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_FindByRegNoResponseProduct_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_FindByRegNoResponseProduct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.datapersistance.protobuf.FindByRegNoResponseProduct.class, com.example.datapersistance.protobuf.FindByRegNoResponseProduct.Builder.class);
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
  private com.google.protobuf.Internal.IntList partNo_;
  /**
   * <code>repeated int32 partNo = 3;</code>
   * @return A list containing the partNo.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getPartNoList() {
    return partNo_;
  }
  /**
   * <code>repeated int32 partNo = 3;</code>
   * @return The count of partNo.
   */
  public int getPartNoCount() {
    return partNo_.size();
  }
  /**
   * <code>repeated int32 partNo = 3;</code>
   * @param index The index of the element to return.
   * @return The partNo at the given index.
   */
  public int getPartNo(int index) {
    return partNo_.getInt(index);
  }
  private int partNoMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (registrationNo_ != 0L) {
      output.writeInt64(1, registrationNo_);
    }
    if (trayId_ != 0L) {
      output.writeInt64(2, trayId_);
    }
    if (getPartNoList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(partNoMemoizedSerializedSize);
    }
    for (int i = 0; i < partNo_.size(); i++) {
      output.writeInt32NoTag(partNo_.getInt(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < partNo_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(partNo_.getInt(i));
      }
      size += dataSize;
      if (!getPartNoList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      partNoMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.example.datapersistance.protobuf.FindByRegNoResponseProduct)) {
      return super.equals(obj);
    }
    com.example.datapersistance.protobuf.FindByRegNoResponseProduct other = (com.example.datapersistance.protobuf.FindByRegNoResponseProduct) obj;

    if (getRegistrationNo()
        != other.getRegistrationNo()) return false;
    if (getTrayId()
        != other.getTrayId()) return false;
    if (!getPartNoList()
        .equals(other.getPartNoList())) return false;
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
    if (getPartNoCount() > 0) {
      hash = (37 * hash) + PARTNO_FIELD_NUMBER;
      hash = (53 * hash) + getPartNoList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct parseFrom(
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
  public static Builder newBuilder(com.example.datapersistance.protobuf.FindByRegNoResponseProduct prototype) {
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
   * Protobuf type {@code FindByRegNoResponseProduct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FindByRegNoResponseProduct)
      com.example.datapersistance.protobuf.FindByRegNoResponseProductOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_FindByRegNoResponseProduct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_FindByRegNoResponseProduct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.datapersistance.protobuf.FindByRegNoResponseProduct.class, com.example.datapersistance.protobuf.FindByRegNoResponseProduct.Builder.class);
    }

    // Construct using com.example.datapersistance.protobuf.FindByRegNoResponseProduct.newBuilder()
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

      partNo_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.datapersistance.protobuf.ProductOuterClass.internal_static_FindByRegNoResponseProduct_descriptor;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.FindByRegNoResponseProduct getDefaultInstanceForType() {
      return com.example.datapersistance.protobuf.FindByRegNoResponseProduct.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.FindByRegNoResponseProduct build() {
      com.example.datapersistance.protobuf.FindByRegNoResponseProduct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.FindByRegNoResponseProduct buildPartial() {
      com.example.datapersistance.protobuf.FindByRegNoResponseProduct result = new com.example.datapersistance.protobuf.FindByRegNoResponseProduct(this);
      int from_bitField0_ = bitField0_;
      result.registrationNo_ = registrationNo_;
      result.trayId_ = trayId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        partNo_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
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
      if (other instanceof com.example.datapersistance.protobuf.FindByRegNoResponseProduct) {
        return mergeFrom((com.example.datapersistance.protobuf.FindByRegNoResponseProduct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.datapersistance.protobuf.FindByRegNoResponseProduct other) {
      if (other == com.example.datapersistance.protobuf.FindByRegNoResponseProduct.getDefaultInstance()) return this;
      if (other.getRegistrationNo() != 0L) {
        setRegistrationNo(other.getRegistrationNo());
      }
      if (other.getTrayId() != 0L) {
        setTrayId(other.getTrayId());
      }
      if (!other.partNo_.isEmpty()) {
        if (partNo_.isEmpty()) {
          partNo_ = other.partNo_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePartNoIsMutable();
          partNo_.addAll(other.partNo_);
        }
        onChanged();
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
      com.example.datapersistance.protobuf.FindByRegNoResponseProduct parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.datapersistance.protobuf.FindByRegNoResponseProduct) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private com.google.protobuf.Internal.IntList partNo_ = emptyIntList();
    private void ensurePartNoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        partNo_ = mutableCopy(partNo_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 partNo = 3;</code>
     * @return A list containing the partNo.
     */
    public java.util.List<java.lang.Integer>
        getPartNoList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(partNo_) : partNo_;
    }
    /**
     * <code>repeated int32 partNo = 3;</code>
     * @return The count of partNo.
     */
    public int getPartNoCount() {
      return partNo_.size();
    }
    /**
     * <code>repeated int32 partNo = 3;</code>
     * @param index The index of the element to return.
     * @return The partNo at the given index.
     */
    public int getPartNo(int index) {
      return partNo_.getInt(index);
    }
    /**
     * <code>repeated int32 partNo = 3;</code>
     * @param index The index to set the value at.
     * @param value The partNo to set.
     * @return This builder for chaining.
     */
    public Builder setPartNo(
        int index, int value) {
      ensurePartNoIsMutable();
      partNo_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 partNo = 3;</code>
     * @param value The partNo to add.
     * @return This builder for chaining.
     */
    public Builder addPartNo(int value) {
      ensurePartNoIsMutable();
      partNo_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 partNo = 3;</code>
     * @param values The partNo to add.
     * @return This builder for chaining.
     */
    public Builder addAllPartNo(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensurePartNoIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, partNo_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 partNo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPartNo() {
      partNo_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:FindByRegNoResponseProduct)
  }

  // @@protoc_insertion_point(class_scope:FindByRegNoResponseProduct)
  private static final com.example.datapersistance.protobuf.FindByRegNoResponseProduct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.datapersistance.protobuf.FindByRegNoResponseProduct();
  }

  public static com.example.datapersistance.protobuf.FindByRegNoResponseProduct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindByRegNoResponseProduct>
      PARSER = new com.google.protobuf.AbstractParser<FindByRegNoResponseProduct>() {
    @java.lang.Override
    public FindByRegNoResponseProduct parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindByRegNoResponseProduct(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindByRegNoResponseProduct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindByRegNoResponseProduct> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.datapersistance.protobuf.FindByRegNoResponseProduct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

