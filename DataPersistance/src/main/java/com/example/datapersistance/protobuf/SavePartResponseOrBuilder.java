// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Part.proto

package com.example.datapersistance.protobuf;

public interface SavePartResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SavePartResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 partno = 1;</code>
   * @return The partno.
   */
  long getPartno();

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
}
