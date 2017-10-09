// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/ser_iap.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "trade/ser_iap.pb.h"

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

namespace trade {

namespace {


}  // namespace


void protobuf_AssignDesc_trade_2fser_5fiap_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AssignDesc_trade_2fser_5fiap_2eproto() {
  protobuf_AddDesc_trade_2fser_5fiap_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "trade/ser_iap.proto");
  GOOGLE_CHECK(file != NULL);
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_trade_2fser_5fiap_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
}

}  // namespace

void protobuf_ShutdownFile_trade_2fser_5fiap_2eproto() {
}

void protobuf_InitDefaults_trade_2fser_5fiap_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::trade::protobuf_InitDefaults_trade_2fmsg_5fiap_5fverify_2eproto();
  ::trade::protobuf_InitDefaults_trade_2fmsg_5fiap_5fprice_5flist_2eproto();
  ::trade::protobuf_InitDefaults_trade_2fmsg_5fiap_5forder_2eproto();
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_InitDefaults_trade_2fser_5fiap_2eproto_once_);
void protobuf_InitDefaults_trade_2fser_5fiap_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_InitDefaults_trade_2fser_5fiap_2eproto_once_,
                 &protobuf_InitDefaults_trade_2fser_5fiap_2eproto_impl);
}
void protobuf_AddDesc_trade_2fser_5fiap_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  protobuf_InitDefaults_trade_2fser_5fiap_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\023trade/ser_iap.proto\022\005trade\032\032trade/msg_"
    "iap_verify.proto\032\036trade/msg_iap_price_li"
    "st.proto\032\031trade/msg_iap_order.proto2\344\001\n\n"
    "IAPService\022>\n\tIAPVerify\022\027.trade.IAPVerif"
    "yRequest\032\030.trade.IAPVerifyResponse\022G\n\014IA"
    "PPriceList\022\032.trade.IAPPriceListRequest\032\033"
    ".trade.IAPPriceListResponse\022M\n\016IAPCreate"
    "Order\022\034.trade.IAPCreateOrderRequest\032\035.tr"
    "ade.IAPCreateOrderResponseB\034\n\021com.wanfan"
    "g.tradeP\001\242\002\004WFPRb\006proto3", 384);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "trade/ser_iap.proto", &protobuf_RegisterTypes);
  ::trade::protobuf_AddDesc_trade_2fmsg_5fiap_5fverify_2eproto();
  ::trade::protobuf_AddDesc_trade_2fmsg_5fiap_5fprice_5flist_2eproto();
  ::trade::protobuf_AddDesc_trade_2fmsg_5fiap_5forder_2eproto();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_trade_2fser_5fiap_2eproto);
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AddDesc_trade_2fser_5fiap_2eproto_once_);
void protobuf_AddDesc_trade_2fser_5fiap_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AddDesc_trade_2fser_5fiap_2eproto_once_,
                 &protobuf_AddDesc_trade_2fser_5fiap_2eproto_impl);
}
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_trade_2fser_5fiap_2eproto {
  StaticDescriptorInitializer_trade_2fser_5fiap_2eproto() {
    protobuf_AddDesc_trade_2fser_5fiap_2eproto();
  }
} static_descriptor_initializer_trade_2fser_5fiap_2eproto_;

// @@protoc_insertion_point(namespace_scope)

}  // namespace trade

// @@protoc_insertion_point(global_scope)