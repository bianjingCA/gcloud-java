// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_metrics.proto

package com.google.logging.v2;

/**
 * Protobuf type {@code google.logging.v2.DeleteLogMetricRequest}
 *
 * <pre>
 * The parameters to DeleteLogMetric.
 * </pre>
 */
public  final class DeleteLogMetricRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.DeleteLogMetricRequest)
    DeleteLogMetricRequestOrBuilder {
  // Use DeleteLogMetricRequest.newBuilder() to construct.
  private DeleteLogMetricRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DeleteLogMetricRequest() {
    metricName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DeleteLogMetricRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
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
            String s = input.readStringRequireUtf8();

            metricName_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.logging.v2.LoggingMetrics.internal_static_google_logging_v2_DeleteLogMetricRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingMetrics.internal_static_google_logging_v2_DeleteLogMetricRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.DeleteLogMetricRequest.class, com.google.logging.v2.DeleteLogMetricRequest.Builder.class);
  }

  public static final int METRIC_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object metricName_;
  /**
   * <code>optional string metric_name = 1;</code>
   *
   * <pre>
   * The resource name of the metric to delete.
   * Example: `"projects/my-project-id/metrics/my-metric-id"`.
   * </pre>
   */
  public java.lang.String getMetricName() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metricName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string metric_name = 1;</code>
   *
   * <pre>
   * The resource name of the metric to delete.
   * Example: `"projects/my-project-id/metrics/my-metric-id"`.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getMetricNameBytes() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metricName_ = b;
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
    if (!getMetricNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, metricName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMetricNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, metricName_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.logging.v2.DeleteLogMetricRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.DeleteLogMetricRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.DeleteLogMetricRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.DeleteLogMetricRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.DeleteLogMetricRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.logging.v2.DeleteLogMetricRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.logging.v2.DeleteLogMetricRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.logging.v2.DeleteLogMetricRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.logging.v2.DeleteLogMetricRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.logging.v2.DeleteLogMetricRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.logging.v2.DeleteLogMetricRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.logging.v2.DeleteLogMetricRequest}
   *
   * <pre>
   * The parameters to DeleteLogMetric.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.DeleteLogMetricRequest)
      com.google.logging.v2.DeleteLogMetricRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.logging.v2.LoggingMetrics.internal_static_google_logging_v2_DeleteLogMetricRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingMetrics.internal_static_google_logging_v2_DeleteLogMetricRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.DeleteLogMetricRequest.class, com.google.logging.v2.DeleteLogMetricRequest.Builder.class);
    }

    // Construct using com.google.logging.v2.DeleteLogMetricRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      metricName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.logging.v2.LoggingMetrics.internal_static_google_logging_v2_DeleteLogMetricRequest_descriptor;
    }

    public com.google.logging.v2.DeleteLogMetricRequest getDefaultInstanceForType() {
      return com.google.logging.v2.DeleteLogMetricRequest.getDefaultInstance();
    }

    public com.google.logging.v2.DeleteLogMetricRequest build() {
      com.google.logging.v2.DeleteLogMetricRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.logging.v2.DeleteLogMetricRequest buildPartial() {
      com.google.logging.v2.DeleteLogMetricRequest result = new com.google.logging.v2.DeleteLogMetricRequest(this);
      result.metricName_ = metricName_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.DeleteLogMetricRequest) {
        return mergeFrom((com.google.logging.v2.DeleteLogMetricRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.DeleteLogMetricRequest other) {
      if (other == com.google.logging.v2.DeleteLogMetricRequest.getDefaultInstance()) return this;
      if (!other.getMetricName().isEmpty()) {
        metricName_ = other.metricName_;
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
      com.google.logging.v2.DeleteLogMetricRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.DeleteLogMetricRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object metricName_ = "";
    /**
     * <code>optional string metric_name = 1;</code>
     *
     * <pre>
     * The resource name of the metric to delete.
     * Example: `"projects/my-project-id/metrics/my-metric-id"`.
     * </pre>
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metricName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string metric_name = 1;</code>
     *
     * <pre>
     * The resource name of the metric to delete.
     * Example: `"projects/my-project-id/metrics/my-metric-id"`.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string metric_name = 1;</code>
     *
     * <pre>
     * The resource name of the metric to delete.
     * Example: `"projects/my-project-id/metrics/my-metric-id"`.
     * </pre>
     */
    public Builder setMetricName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      metricName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string metric_name = 1;</code>
     *
     * <pre>
     * The resource name of the metric to delete.
     * Example: `"projects/my-project-id/metrics/my-metric-id"`.
     * </pre>
     */
    public Builder clearMetricName() {
      
      metricName_ = getDefaultInstance().getMetricName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string metric_name = 1;</code>
     *
     * <pre>
     * The resource name of the metric to delete.
     * Example: `"projects/my-project-id/metrics/my-metric-id"`.
     * </pre>
     */
    public Builder setMetricNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      metricName_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.logging.v2.DeleteLogMetricRequest)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.DeleteLogMetricRequest)
  private static final com.google.logging.v2.DeleteLogMetricRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.DeleteLogMetricRequest();
  }

  public static com.google.logging.v2.DeleteLogMetricRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteLogMetricRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteLogMetricRequest>() {
    public DeleteLogMetricRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new DeleteLogMetricRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<DeleteLogMetricRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteLogMetricRequest> getParserForType() {
    return PARSER;
  }

  public com.google.logging.v2.DeleteLogMetricRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
