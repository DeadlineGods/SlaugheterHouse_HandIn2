// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tray.proto

package com.example.datapersistance.protobuf;

/**
 * Protobuf type {@code TrayData}
 */
public final class TrayData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TrayData)
    TrayDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrayData.newBuilder() to construct.
  private TrayData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrayData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrayData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrayData(
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
          case 9: {

            maxWeightCapacity_ = input.readDouble();
            break;
          }
          case 16: {

            trayId_ = input.readInt64();
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
    return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.datapersistance.protobuf.TrayData.class, com.example.datapersistance.protobuf.TrayData.Builder.class);
  }

  public static final int MAXWEIGHTCAPACITY_FIELD_NUMBER = 1;
  private double maxWeightCapacity_;
  /**
   * <code>double maxWeightCapacity = 1;</code>
   * @return The maxWeightCapacity.
   */
  @java.lang.Override
  public double getMaxWeightCapacity() {
    return maxWeightCapacity_;
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
    if (java.lang.Double.doubleToRawLongBits(maxWeightCapacity_) != 0) {
      output.writeDouble(1, maxWeightCapacity_);
    }
    if (trayId_ != 0L) {
      output.writeInt64(2, trayId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(maxWeightCapacity_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, maxWeightCapacity_);
    }
    if (trayId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, trayId_);
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
    if (!(obj instanceof com.example.datapersistance.protobuf.TrayData)) {
      return super.equals(obj);
    }
    com.example.datapersistance.protobuf.TrayData other = (com.example.datapersistance.protobuf.TrayData) obj;

    if (java.lang.Double.doubleToLongBits(getMaxWeightCapacity())
        != java.lang.Double.doubleToLongBits(
            other.getMaxWeightCapacity())) return false;
    if (getTrayId()
        != other.getTrayId()) return false;
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
    hash = (37 * hash) + MAXWEIGHTCAPACITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMaxWeightCapacity()));
    hash = (37 * hash) + TRAYID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTrayId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.datapersistance.protobuf.TrayData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.TrayData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.TrayData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.datapersistance.protobuf.TrayData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.TrayData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.TrayData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.datapersistance.protobuf.TrayData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.datapersistance.protobuf.TrayData parseFrom(
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
  public static Builder newBuilder(com.example.datapersistance.protobuf.TrayData prototype) {
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
   * Protobuf type {@code TrayData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TrayData)
      com.example.datapersistance.protobuf.TrayDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.datapersistance.protobuf.TrayData.class, com.example.datapersistance.protobuf.TrayData.Builder.class);
    }

    // Construct using com.example.datapersistance.protobuf.TrayData.newBuilder()
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
      maxWeightCapacity_ = 0D;

      trayId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.datapersistance.protobuf.TrayOuterClass.internal_static_TrayData_descriptor;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.TrayData getDefaultInstanceForType() {
      return com.example.datapersistance.protobuf.TrayData.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.TrayData build() {
      com.example.datapersistance.protobuf.TrayData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.datapersistance.protobuf.TrayData buildPartial() {
      com.example.datapersistance.protobuf.TrayData result = new com.example.datapersistance.protobuf.TrayData(this);
      result.maxWeightCapacity_ = maxWeightCapacity_;
      result.trayId_ = trayId_;
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
      if (other instanceof com.example.datapersistance.protobuf.TrayData) {
        return mergeFrom((com.example.datapersistance.protobuf.TrayData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.datapersistance.protobuf.TrayData other) {
      if (other == com.example.datapersistance.protobuf.TrayData.getDefaultInstance()) return this;
      if (other.getMaxWeightCapacity() != 0D) {
        setMaxWeightCapacity(other.getMaxWeightCapacity());
      }
      if (other.getTrayId() != 0L) {
        setTrayId(other.getTrayId());
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
      com.example.datapersistance.protobuf.TrayData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.datapersistance.protobuf.TrayData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double maxWeightCapacity_ ;
    /**
     * <code>double maxWeightCapacity = 1;</code>
     * @return The maxWeightCapacity.
     */
    @java.lang.Override
    public double getMaxWeightCapacity() {
      return maxWeightCapacity_;
    }
    /**
     * <code>double maxWeightCapacity = 1;</code>
     * @param value The maxWeightCapacity to set.
     * @return This builder for chaining.
     */
    public Builder setMaxWeightCapacity(double value) {
      
      maxWeightCapacity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double maxWeightCapacity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxWeightCapacity() {
      
      maxWeightCapacity_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:TrayData)
  }

  // @@protoc_insertion_point(class_scope:TrayData)
  private static final com.example.datapersistance.protobuf.TrayData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.datapersistance.protobuf.TrayData();
  }

  public static com.example.datapersistance.protobuf.TrayData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrayData>
      PARSER = new com.google.protobuf.AbstractParser<TrayData>() {
    @java.lang.Override
    public TrayData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrayData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrayData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrayData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.datapersistance.protobuf.TrayData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

