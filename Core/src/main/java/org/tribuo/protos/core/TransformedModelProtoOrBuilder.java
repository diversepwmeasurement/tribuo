// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tribuo-core-impl.proto

package org.tribuo.protos.core;

public interface TransformedModelProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tribuo.core.TransformedModelProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   * @return The metadata.
   */
  org.tribuo.protos.core.ModelDataProto getMetadata();
  /**
   * <code>.tribuo.core.ModelDataProto metadata = 1;</code>
   */
  org.tribuo.protos.core.ModelDataProtoOrBuilder getMetadataOrBuilder();

  /**
   * <code>.tribuo.core.ModelProto model = 2;</code>
   * @return Whether the model field is set.
   */
  boolean hasModel();
  /**
   * <code>.tribuo.core.ModelProto model = 2;</code>
   * @return The model.
   */
  org.tribuo.protos.core.ModelProto getModel();
  /**
   * <code>.tribuo.core.ModelProto model = 2;</code>
   */
  org.tribuo.protos.core.ModelProtoOrBuilder getModelOrBuilder();

  /**
   * <code>.tribuo.core.TransformerMapProto transformer_map = 3;</code>
   * @return Whether the transformerMap field is set.
   */
  boolean hasTransformerMap();
  /**
   * <code>.tribuo.core.TransformerMapProto transformer_map = 3;</code>
   * @return The transformerMap.
   */
  org.tribuo.protos.core.TransformerMapProto getTransformerMap();
  /**
   * <code>.tribuo.core.TransformerMapProto transformer_map = 3;</code>
   */
  org.tribuo.protos.core.TransformerMapProtoOrBuilder getTransformerMapOrBuilder();

  /**
   * <code>bool densify = 4;</code>
   * @return The densify.
   */
  boolean getDensify();

  /**
   * <code>repeated string feature_names = 5;</code>
   * @return A list containing the featureNames.
   */
  java.util.List<java.lang.String>
      getFeatureNamesList();
  /**
   * <code>repeated string feature_names = 5;</code>
   * @return The count of featureNames.
   */
  int getFeatureNamesCount();
  /**
   * <code>repeated string feature_names = 5;</code>
   * @param index The index of the element to return.
   * @return The featureNames at the given index.
   */
  java.lang.String getFeatureNames(int index);
  /**
   * <code>repeated string feature_names = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the featureNames at the given index.
   */
  com.google.protobuf.ByteString
      getFeatureNamesBytes(int index);
}