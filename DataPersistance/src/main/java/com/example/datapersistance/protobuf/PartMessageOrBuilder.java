// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Part.proto

package com.example.datapersistance.protobuf;

public interface PartMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PartMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 partno = 1;</code>
   * @return The partno.
   */
  int getPartno();

  /**
   * <code>double weight = 2;</code>
   * @return The weight.
   */
  double getWeight();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int64 animalNo = 4;</code>
   * @return The animalNo.
   */
  long getAnimalNo();

  /**
   * <code>int64 trayId = 5;</code>
   * @return The trayId.
   */
  long getTrayId();
}
