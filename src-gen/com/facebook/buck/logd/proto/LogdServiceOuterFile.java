// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/facebook/buck/logd/proto/logdservice.proto

package com.facebook.buck.logd.proto;

@javax.annotation.Generated(value="protoc", comments="annotations:LogdServiceOuterFile.java.pb.meta")
public final class LogdServiceOuterFile {
  private LogdServiceOuterFile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logd_v1_CreateLogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logd_v1_CreateLogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logd_v1_CreateLogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logd_v1_CreateLogResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logd_v1_LogMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logd_v1_LogMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_logd_v1_ShutdownRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_logd_v1_ShutdownRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2src/com/facebook/buck/logd/proto/logds" +
      "ervice.proto\022\007logd.v1\0324third-party/java/" +
      "remote-apis/google/rpc/status.proto\"J\n\020C" +
      "reateLogRequest\022\023\n\013logFilePath\030\001 \001(\t\022!\n\007" +
      "logType\030\002 \001(\0162\020.logd.v1.LogType\"\"\n\021Creat" +
      "eLogResponse\022\r\n\005logId\030\001 \001(\005\"/\n\nLogMessag" +
      "e\022\r\n\005logId\030\001 \001(\005\022\022\n\nlogMessage\030\002 \001(\t\"\021\n\017" +
      "ShutdownRequest*\204\001\n\007LogType\022\014\n\010BUCK_LOG\020" +
      "\000\022\024\n\020BUCK_MACHINE_LOG\020\001\022\024\n\020CHROME_TRACE_" +
      "LOG\020\002\022\026\n\022SIMPLE_CONSOLE_LOG\020\003\022\025\n\021CRITICA" +
      "L_PATH_LOG\020\004\022\020\n\014RULE_KEY_LOG\020\0052\321\001\n\013LogdS" +
      "ervice\022H\n\rCreateLogFile\022\031.logd.v1.Create" +
      "LogRequest\032\032.logd.v1.CreateLogResponse\"\000" +
      "\0226\n\007OpenLog\022\023.logd.v1.LogMessage\032\022.googl" +
      "e.rpc.Status\"\000(\001\022@\n\016ShutdownServer\022\030.log" +
      "d.v1.ShutdownRequest\032\022.google.rpc.Status" +
      "\"\000B6\n\034com.facebook.buck.logd.protoB\024Logd" +
      "ServiceOuterFileP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_logd_v1_CreateLogRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_logd_v1_CreateLogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logd_v1_CreateLogRequest_descriptor,
        new java.lang.String[] { "LogFilePath", "LogType", });
    internal_static_logd_v1_CreateLogResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_logd_v1_CreateLogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logd_v1_CreateLogResponse_descriptor,
        new java.lang.String[] { "LogId", });
    internal_static_logd_v1_LogMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_logd_v1_LogMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logd_v1_LogMessage_descriptor,
        new java.lang.String[] { "LogId", "LogMessage", });
    internal_static_logd_v1_ShutdownRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_logd_v1_ShutdownRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_logd_v1_ShutdownRequest_descriptor,
        new java.lang.String[] { });
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}