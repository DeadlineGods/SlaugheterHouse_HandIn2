// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package com.example.datapersistance.protobuf;

public interface ProductMessageAnimalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ProductMessageAnimal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 registrationNo = 1;</code>
   * @return The registrationNo.
   */
  long getRegistrationNo();

  /**
   * <code>int64 trayId = 2;</code>
   * @return The trayId.
   */
  long getTrayId();

  /**
   * <code>repeated int32 partNo = 3;</code>
   * @return A list containing the partNo.
   */
  java.util.List<java.lang.Integer> getPartNoList();
  /**
   * <code>repeated int32 partNo = 3;</code>
   * @return The count of partNo.
   */
  int getPartNoCount();
  /**
   * <code>repeated int32 partNo = 3;</code>
   * @param index The index of the element to return.
   * @return The partNo at the given index.
   */
  int getPartNo(int index);
}
