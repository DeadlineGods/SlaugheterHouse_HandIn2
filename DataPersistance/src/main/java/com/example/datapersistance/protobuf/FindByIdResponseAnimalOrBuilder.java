// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package com.example.datapersistance.protobuf;

public interface FindByIdResponseAnimalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FindByIdResponseAnimal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 year = 1;</code>
   * @return The year.
   */
  int getYear();

  /**
   * <code>int32 month = 2;</code>
   * @return The month.
   */
  int getMonth();

  /**
   * <code>int32 day = 3;</code>
   * @return The day.
   */
  int getDay();

  /**
   * <code>double weight = 4;</code>
   * @return The weight.
   */
  double getWeight();

  /**
   * <code>int64 animalNo = 5;</code>
   * @return The animalNo.
   */
  long getAnimalNo();

  /**
   * <code>string origin = 6;</code>
   * @return The origin.
   */
  java.lang.String getOrigin();
  /**
   * <code>string origin = 6;</code>
   * @return The bytes for origin.
   */
  com.google.protobuf.ByteString
      getOriginBytes();
}
