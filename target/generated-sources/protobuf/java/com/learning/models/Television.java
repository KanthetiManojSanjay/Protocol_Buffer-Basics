// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: television.proto

package com.learning.models;

/**
 * <pre>
 * v4
 * </pre>
 *
 * Protobuf type {@code Television}
 */
public  final class Television extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Television)
    TelevisionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Television.newBuilder() to construct.
  private Television(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Television() {
    brand_ = "";
    price_ = 0;
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Television(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            brand_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 32: {

            price_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.learning.models.TelevisionOuterClass.internal_static_Television_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.learning.models.TelevisionOuterClass.internal_static_Television_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.learning.models.Television.class, com.learning.models.Television.Builder.class);
  }

  public static final int BRAND_FIELD_NUMBER = 1;
  private volatile java.lang.Object brand_;
  /**
   * <code>string brand = 1;</code>
   */
  public java.lang.String getBrand() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      brand_ = s;
      return s;
    }
  }
  /**
   * <code>string brand = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBrandBytes() {
    java.lang.Object ref = brand_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      brand_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRICE_FIELD_NUMBER = 4;
  private int price_;
  /**
   * <code>int32 price = 4;</code>
   */
  public int getPrice() {
    return price_;
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <code>.Type type = 3;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.Type type = 3;</code>
   */
  public com.learning.models.Type getType() {
    @SuppressWarnings("deprecation")
    com.learning.models.Type result = com.learning.models.Type.valueOf(type_);
    return result == null ? com.learning.models.Type.UNRECOGNIZED : result;
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
    if (!getBrandBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, brand_);
    }
    if (type_ != com.learning.models.Type.HD.getNumber()) {
      output.writeEnum(3, type_);
    }
    if (price_ != 0) {
      output.writeInt32(4, price_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBrandBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, brand_);
    }
    if (type_ != com.learning.models.Type.HD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
    }
    if (price_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, price_);
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
    if (!(obj instanceof com.learning.models.Television)) {
      return super.equals(obj);
    }
    com.learning.models.Television other = (com.learning.models.Television) obj;

    boolean result = true;
    result = result && getBrand()
        .equals(other.getBrand());
    result = result && (getPrice()
        == other.getPrice());
    result = result && type_ == other.type_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BRAND_FIELD_NUMBER;
    hash = (53 * hash) + getBrand().hashCode();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.learning.models.Television parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learning.models.Television parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learning.models.Television parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learning.models.Television parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learning.models.Television parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.learning.models.Television parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.learning.models.Television parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.learning.models.Television parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.learning.models.Television parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.learning.models.Television parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.learning.models.Television parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.learning.models.Television parseFrom(
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
  public static Builder newBuilder(com.learning.models.Television prototype) {
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
   * <pre>
   * v4
   * </pre>
   *
   * Protobuf type {@code Television}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Television)
      com.learning.models.TelevisionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.learning.models.TelevisionOuterClass.internal_static_Television_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.learning.models.TelevisionOuterClass.internal_static_Television_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.learning.models.Television.class, com.learning.models.Television.Builder.class);
    }

    // Construct using com.learning.models.Television.newBuilder()
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
      brand_ = "";

      price_ = 0;

      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.learning.models.TelevisionOuterClass.internal_static_Television_descriptor;
    }

    @java.lang.Override
    public com.learning.models.Television getDefaultInstanceForType() {
      return com.learning.models.Television.getDefaultInstance();
    }

    @java.lang.Override
    public com.learning.models.Television build() {
      com.learning.models.Television result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.learning.models.Television buildPartial() {
      com.learning.models.Television result = new com.learning.models.Television(this);
      result.brand_ = brand_;
      result.price_ = price_;
      result.type_ = type_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.learning.models.Television) {
        return mergeFrom((com.learning.models.Television)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.learning.models.Television other) {
      if (other == com.learning.models.Television.getDefaultInstance()) return this;
      if (!other.getBrand().isEmpty()) {
        brand_ = other.brand_;
        onChanged();
      }
      if (other.getPrice() != 0) {
        setPrice(other.getPrice());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      com.learning.models.Television parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.learning.models.Television) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object brand_ = "";
    /**
     * <code>string brand = 1;</code>
     */
    public java.lang.String getBrand() {
      java.lang.Object ref = brand_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        brand_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string brand = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBrandBytes() {
      java.lang.Object ref = brand_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brand_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string brand = 1;</code>
     */
    public Builder setBrand(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      brand_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 1;</code>
     */
    public Builder clearBrand() {
      
      brand_ = getDefaultInstance().getBrand();
      onChanged();
      return this;
    }
    /**
     * <code>string brand = 1;</code>
     */
    public Builder setBrandBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      brand_ = value;
      onChanged();
      return this;
    }

    private int price_ ;
    /**
     * <code>int32 price = 4;</code>
     */
    public int getPrice() {
      return price_;
    }
    /**
     * <code>int32 price = 4;</code>
     */
    public Builder setPrice(int value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 price = 4;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.Type type = 3;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.Type type = 3;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Type type = 3;</code>
     */
    public com.learning.models.Type getType() {
      @SuppressWarnings("deprecation")
      com.learning.models.Type result = com.learning.models.Type.valueOf(type_);
      return result == null ? com.learning.models.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.Type type = 3;</code>
     */
    public Builder setType(com.learning.models.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Type type = 3;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Television)
  }

  // @@protoc_insertion_point(class_scope:Television)
  private static final com.learning.models.Television DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.learning.models.Television();
  }

  public static com.learning.models.Television getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Television>
      PARSER = new com.google.protobuf.AbstractParser<Television>() {
    @java.lang.Override
    public Television parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Television(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Television> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Television> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.learning.models.Television getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

