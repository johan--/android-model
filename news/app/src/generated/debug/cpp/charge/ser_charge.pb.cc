// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: charge/ser_charge.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "charge/ser_charge.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/port.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)

namespace charge {

namespace {


}  // namespace


void protobuf_AssignDesc_charge_2fser_5fcharge_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AssignDesc_charge_2fser_5fcharge_2eproto() {
  protobuf_AddDesc_charge_2fser_5fcharge_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "charge/ser_charge.proto");
  GOOGLE_CHECK(file != NULL);
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_charge_2fser_5fcharge_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
}

}  // namespace

void protobuf_ShutdownFile_charge_2fser_5fcharge_2eproto() {
}

void protobuf_InitDefaults_charge_2fser_5fcharge_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::charge::protobuf_InitDefaults_charge_2fmsg_5fcharge_2eproto();
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_InitDefaults_charge_2fser_5fcharge_2eproto_once_);
void protobuf_InitDefaults_charge_2fser_5fcharge_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_InitDefaults_charge_2fser_5fcharge_2eproto_once_,
                 &protobuf_InitDefaults_charge_2fser_5fcharge_2eproto_impl);
}
void protobuf_AddDesc_charge_2fser_5fcharge_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  protobuf_InitDefaults_charge_2fser_5fcharge_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\027charge/ser_charge.proto\022\006charge\032\027charg"
    "e/msg_charge.proto2H\n\rChargeService\0227\n\006C"
    "harge\022\025.charge.ChargeRequest\032\026.charge.Ch"
    "argeResponseB\035\n\022com.wanfang.chargeP\001\242\002\004W"
    "FPRb\006proto3", 171);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "charge/ser_charge.proto", &protobuf_RegisterTypes);
  ::charge::protobuf_AddDesc_charge_2fmsg_5fcharge_2eproto();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_charge_2fser_5fcharge_2eproto);
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AddDesc_charge_2fser_5fcharge_2eproto_once_);
void protobuf_AddDesc_charge_2fser_5fcharge_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AddDesc_charge_2fser_5fcharge_2eproto_once_,
                 &protobuf_AddDesc_charge_2fser_5fcharge_2eproto_impl);
}
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_charge_2fser_5fcharge_2eproto {
  StaticDescriptorInitializer_charge_2fser_5fcharge_2eproto() {
    protobuf_AddDesc_charge_2fser_5fcharge_2eproto();
  }
} static_descriptor_initializer_charge_2fser_5fcharge_2eproto_;

// @@protoc_insertion_point(namespace_scope)

}  // namespace charge

// @@protoc_insertion_point(global_scope)