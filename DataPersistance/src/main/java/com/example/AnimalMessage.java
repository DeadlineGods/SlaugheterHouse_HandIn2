// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package com.example;

/**
 * Protobuf type {@code AnimalMessage}
 */
public final class AnimalMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AnimalMessage)
    AnimalMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnimalMessage.newBuilder() to construct.
  private AnimalMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnimalMessage() {
    origin_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnimalMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnimalMessage(
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

            year_ = input.readInt32();
            break;
          }
          case 16: {

            month_ = input.readInt32();
            break;
          }
          case 24: {

            day_ = input.readInt32();
            break;
          }
          case 33: {

            weight_ = input.readDouble();
            break;
          }
          case 40: {

            animalNo_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            origin_ = s;
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
    return com.example.AnimalOuterClass.internal_static_AnimalMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.AnimalOuterClass.internal_static_AnimalMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.AnimalMessage.class, com.example.AnimalMessage.Builder.class);
  }

  public static final int YEAR_FIELD_NUMBER = 1;
  private int year_;
  /**
   * <code>int32 year = 1;</code>
   * @return The year.
   */
  @java.lang.Override
  public int getYear() {
    return year_;
  }

  public static final int MONTH_FIELD_NUMBER = 2;
  private int month_;
  /**
   * <code>int32 month = 2;</code>
   * @return The month.
   */
  @java.lang.Override
  public int getMonth() {
    return month_;
  }

  public static final int DAY_FIELD_NUMBER = 3;
  private int day_;
  /**
   * <code>int32 day = 3;</code>
   * @return The day.
   */
  @java.lang.Override
  public int getDay() {
    return day_;
  }

  public static final int WEIGHT_FIELD_NUMBER = 4;
  private double weight_;
  /**
   * <code>double weight = 4;</code>
   * @return The weight.
   */
  @java.lang.Override
  public double getWeight() {
    return weight_;
  }

  public static final int ANIMALNO_FIELD_NUMBER = 5;
  private long animalNo_;
  /**
   * <code>int64 animalNo = 5;</code>
   * @return The animalNo.
   */
  @java.lang.Override
  public long getAnimalNo() {
    return animalNo_;
  }

  public static final int ORIGIN_FIELD_NUMBER = 6;
  private volatile java.lang.Object origin_;
  /**
   * <code>string origin = 6;</code>
   * @return The origin.
   */
  @java.lang.Override
  public java.lang.String getOrigin() {
    java.lang.Object ref = origin_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      origin_ = s;
      return s;
    }
  }
  /**
   * <code>string origin = 6;</code>
   * @return The bytes for origin.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOriginBytes() {
    java.lang.Object ref = origin_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      origin_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (year_ != 0) {
      output.writeInt32(1, year_);
    }
    if (month_ != 0) {
      output.writeInt32(2, month_);
    }
    if (day_ != 0) {
      output.writeInt32(3, day_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      output.writeDouble(4, weight_);
    }
    if (animalNo_ != 0L) {
      output.writeInt64(5, animalNo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(origin_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, origin_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (year_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, year_);
    }
    if (month_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, month_);
    }
    if (day_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, day_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, weight_);
    }
    if (animalNo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, animalNo_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(origin_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, origin_);
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
    if (!(obj instanceof com.example.AnimalMessage)) {
      return super.equals(obj);
    }
    com.example.AnimalMessage other = (com.example.AnimalMessage) obj;

    if (getYear()
        != other.getYear()) return false;
    if (getMonth()
        != other.getMonth()) return false;
    if (getDay()
        != other.getDay()) return false;
    if (java.lang.Double.doubleToLongBits(getWeight())
        != java.lang.Double.doubleToLongBits(
            other.getWeight())) return false;
    if (getAnimalNo()
        != other.getAnimalNo()) return false;
    if (!getOrigin()
        .equals(other.getOrigin())) return false;
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
    hash = (37 * hash) + YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getYear();
    hash = (37 * hash) + MONTH_FIELD_NUMBER;
    hash = (53 * hash) + getMonth();
    hash = (37 * hash) + DAY_FIELD_NUMBER;
    hash = (53 * hash) + getDay();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight()));
    hash = (37 * hash) + ANIMALNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAnimalNo());
    hash = (37 * hash) + ORIGIN_FIELD_NUMBER;
    hash = (53 * hash) + getOrigin().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.AnimalMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.AnimalMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.AnimalMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.AnimalMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.AnimalMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.AnimalMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.AnimalMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.AnimalMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.AnimalMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.AnimalMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.AnimalMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.AnimalMessage parseFrom(
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
  public static Builder newBuilder(com.example.AnimalMessage prototype) {
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
   * Protobuf type {@code AnimalMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AnimalMessage)
      com.example.AnimalMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.AnimalOuterClass.internal_static_AnimalMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.AnimalOuterClass.internal_static_AnimalMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.AnimalMessage.class, com.example.AnimalMessage.Builder.class);
    }

    // Construct using com.example.AnimalMessage.newBuilder()
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
      year_ = 0;

      month_ = 0;

      day_ = 0;

      weight_ = 0D;

      animalNo_ = 0L;

      origin_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.AnimalOuterClass.internal_static_AnimalMessage_descriptor;
    }

    @java.lang.Override
    public com.example.AnimalMessage getDefaultInstanceForType() {
      return com.example.AnimalMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.AnimalMessage build() {
      com.example.AnimalMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.AnimalMessage buildPartial() {
      com.example.AnimalMessage result = new com.example.AnimalMessage(this);
      result.year_ = year_;
      result.month_ = month_;
      result.day_ = day_;
      result.weight_ = weight_;
      result.animalNo_ = animalNo_;
      result.origin_ = origin_;
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
      if (other instanceof com.example.AnimalMessage) {
        return mergeFrom((com.example.AnimalMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.AnimalMessage other) {
      if (other == com.example.AnimalMessage.getDefaultInstance()) return this;
      if (other.getYear() != 0) {
        setYear(other.getYear());
      }
      if (other.getMonth() != 0) {
        setMonth(other.getMonth());
      }
      if (other.getDay() != 0) {
        setDay(other.getDay());
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
      }
      if (other.getAnimalNo() != 0L) {
        setAnimalNo(other.getAnimalNo());
      }
      if (!other.getOrigin().isEmpty()) {
        origin_ = other.origin_;
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
      com.example.AnimalMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.AnimalMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int year_ ;
    /**
     * <code>int32 year = 1;</code>
     * @return The year.
     */
    @java.lang.Override
    public int getYear() {
      return year_;
    }
    /**
     * <code>int32 year = 1;</code>
     * @param value The year to set.
     * @return This builder for chaining.
     */
    public Builder setYear(int value) {
      
      year_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 year = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearYear() {
      
      year_ = 0;
      onChanged();
      return this;
    }

    private int month_ ;
    /**
     * <code>int32 month = 2;</code>
     * @return The month.
     */
    @java.lang.Override
    public int getMonth() {
      return month_;
    }
    /**
     * <code>int32 month = 2;</code>
     * @param value The month to set.
     * @return This builder for chaining.
     */
    public Builder setMonth(int value) {
      
      month_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 month = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMonth() {
      
      month_ = 0;
      onChanged();
      return this;
    }

    private int day_ ;
    /**
     * <code>int32 day = 3;</code>
     * @return The day.
     */
    @java.lang.Override
    public int getDay() {
      return day_;
    }
    /**
     * <code>int32 day = 3;</code>
     * @param value The day to set.
     * @return This builder for chaining.
     */
    public Builder setDay(int value) {
      
      day_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 day = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDay() {
      
      day_ = 0;
      onChanged();
      return this;
    }

    private double weight_ ;
    /**
     * <code>double weight = 4;</code>
     * @return The weight.
     */
    @java.lang.Override
    public double getWeight() {
      return weight_;
    }
    /**
     * <code>double weight = 4;</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(double value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      
      weight_ = 0D;
      onChanged();
      return this;
    }

    private long animalNo_ ;
    /**
     * <code>int64 animalNo = 5;</code>
     * @return The animalNo.
     */
    @java.lang.Override
    public long getAnimalNo() {
      return animalNo_;
    }
    /**
     * <code>int64 animalNo = 5;</code>
     * @param value The animalNo to set.
     * @return This builder for chaining.
     */
    public Builder setAnimalNo(long value) {
      
      animalNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 animalNo = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimalNo() {
      
      animalNo_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object origin_ = "";
    /**
     * <code>string origin = 6;</code>
     * @return The origin.
     */
    public java.lang.String getOrigin() {
      java.lang.Object ref = origin_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        origin_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string origin = 6;</code>
     * @return The bytes for origin.
     */
    public com.google.protobuf.ByteString
        getOriginBytes() {
      java.lang.Object ref = origin_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        origin_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string origin = 6;</code>
     * @param value The origin to set.
     * @return This builder for chaining.
     */
    public Builder setOrigin(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      origin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string origin = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrigin() {
      
      origin_ = getDefaultInstance().getOrigin();
      onChanged();
      return this;
    }
    /**
     * <code>string origin = 6;</code>
     * @param value The bytes for origin to set.
     * @return This builder for chaining.
     */
    public Builder setOriginBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      origin_ = value;
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


    // @@protoc_insertion_point(builder_scope:AnimalMessage)
  }

  // @@protoc_insertion_point(class_scope:AnimalMessage)
  private static final com.example.AnimalMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.AnimalMessage();
  }

  public static com.example.AnimalMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnimalMessage>
      PARSER = new com.google.protobuf.AbstractParser<AnimalMessage>() {
    @java.lang.Override
    public AnimalMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnimalMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnimalMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnimalMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.AnimalMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

