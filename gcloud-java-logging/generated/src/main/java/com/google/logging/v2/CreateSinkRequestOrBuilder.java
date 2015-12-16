// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface CreateSinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.CreateSinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string project_name = 1;</code>
   *
   * <pre>
   * The resource name of the project in which to create the sink.
   * Example: `"projects/my-project-id"`.
   * The new sink must be provided in the request.
   * </pre>
   */
  java.lang.String getProjectName();
  /**
   * <code>optional string project_name = 1;</code>
   *
   * <pre>
   * The resource name of the project in which to create the sink.
   * Example: `"projects/my-project-id"`.
   * The new sink must be provided in the request.
   * </pre>
   */
  com.google.protobuf.ByteString
      getProjectNameBytes();

  /**
   * <code>optional .google.logging.v2.LogSink sink = 2;</code>
   *
   * <pre>
   * The new sink, which must not have an identifier that already
   * exists.
   * </pre>
   */
  boolean hasSink();
  /**
   * <code>optional .google.logging.v2.LogSink sink = 2;</code>
   *
   * <pre>
   * The new sink, which must not have an identifier that already
   * exists.
   * </pre>
   */
  com.google.logging.v2.LogSink getSink();
  /**
   * <code>optional .google.logging.v2.LogSink sink = 2;</code>
   *
   * <pre>
   * The new sink, which must not have an identifier that already
   * exists.
   * </pre>
   */
  com.google.logging.v2.LogSinkOrBuilder getSinkOrBuilder();
}