// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package com.example;

public interface FindByIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FindByIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .AnimalMessage animal = 1;</code>
   */
  java.util.List<com.example.AnimalMessage> 
      getAnimalList();
  /**
   * <code>repeated .AnimalMessage animal = 1;</code>
   */
  com.example.AnimalMessage getAnimal(int index);
  /**
   * <code>repeated .AnimalMessage animal = 1;</code>
   */
  int getAnimalCount();
  /**
   * <code>repeated .AnimalMessage animal = 1;</code>
   */
  java.util.List<? extends com.example.AnimalMessageOrBuilder> 
      getAnimalOrBuilderList();
  /**
   * <code>repeated .AnimalMessage animal = 1;</code>
   */
  com.example.AnimalMessageOrBuilder getAnimalOrBuilder(
      int index);
}
