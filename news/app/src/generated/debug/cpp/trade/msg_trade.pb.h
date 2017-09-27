// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_trade.proto

#ifndef PROTOBUF_trade_2fmsg_5ftrade_2eproto__INCLUDED
#define PROTOBUF_trade_2fmsg_5ftrade_2eproto__INCLUDED

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 3001000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 3001000 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/metadata.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/unknown_field_set.h>
#include "grpcCommon/msg_error.pb.h"
// @@protoc_insertion_point(includes)

namespace personal {

// Internal implementation detail -- do not call these.
void protobuf_AddDesc_trade_2fmsg_5ftrade_2eproto();
void protobuf_InitDefaults_trade_2fmsg_5ftrade_2eproto();
void protobuf_AssignDesc_trade_2fmsg_5ftrade_2eproto();
void protobuf_ShutdownFile_trade_2fmsg_5ftrade_2eproto();

class UnifiedorderRequest;
class UnifiedorderResponse;

// ===================================================================

class UnifiedorderRequest : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:personal.UnifiedorderRequest) */ {
 public:
  UnifiedorderRequest();
  virtual ~UnifiedorderRequest();

  UnifiedorderRequest(const UnifiedorderRequest& from);

  inline UnifiedorderRequest& operator=(const UnifiedorderRequest& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const UnifiedorderRequest& default_instance();

  static const UnifiedorderRequest* internal_default_instance();

  void Swap(UnifiedorderRequest* other);

  // implements Message ----------------------------------------------

  inline UnifiedorderRequest* New() const { return New(NULL); }

  UnifiedorderRequest* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const UnifiedorderRequest& from);
  void MergeFrom(const UnifiedorderRequest& from);
  void Clear();
  bool IsInitialized() const;

  size_t ByteSizeLong() const;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input);
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const;
  ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(
      bool deterministic, ::google::protobuf::uint8* output) const;
  ::google::protobuf::uint8* SerializeWithCachedSizesToArray(::google::protobuf::uint8* output) const {
    return InternalSerializeWithCachedSizesToArray(false, output);
  }
  int GetCachedSize() const { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const;
  void InternalSwap(UnifiedorderRequest* other);
  void UnsafeMergeFrom(const UnifiedorderRequest& from);
  private:
  inline ::google::protobuf::Arena* GetArenaNoVirtual() const {
    return _internal_metadata_.arena();
  }
  inline void* MaybeArenaPtr() const {
    return _internal_metadata_.raw_arena_ptr();
  }
  public:

  ::google::protobuf::Metadata GetMetadata() const;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional string user_id = 1;
  void clear_user_id();
  static const int kUserIdFieldNumber = 1;
  const ::std::string& user_id() const;
  void set_user_id(const ::std::string& value);
  void set_user_id(const char* value);
  void set_user_id(const char* value, size_t size);
  ::std::string* mutable_user_id();
  ::std::string* release_user_id();
  void set_allocated_user_id(::std::string* user_id);

  // optional string safe_transaction_string = 2;
  void clear_safe_transaction_string();
  static const int kSafeTransactionStringFieldNumber = 2;
  const ::std::string& safe_transaction_string() const;
  void set_safe_transaction_string(const ::std::string& value);
  void set_safe_transaction_string(const char* value);
  void set_safe_transaction_string(const char* value, size_t size);
  ::std::string* mutable_safe_transaction_string();
  ::std::string* release_safe_transaction_string();
  void set_allocated_safe_transaction_string(::std::string* safe_transaction_string);

  // @@protoc_insertion_point(class_scope:personal.UnifiedorderRequest)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr user_id_;
  ::google::protobuf::internal::ArenaStringPtr safe_transaction_string_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_trade_2fmsg_5ftrade_2eproto_impl();
  friend void  protobuf_AddDesc_trade_2fmsg_5ftrade_2eproto_impl();
  friend void protobuf_AssignDesc_trade_2fmsg_5ftrade_2eproto();
  friend void protobuf_ShutdownFile_trade_2fmsg_5ftrade_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<UnifiedorderRequest> UnifiedorderRequest_default_instance_;

// -------------------------------------------------------------------

class UnifiedorderResponse : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:personal.UnifiedorderResponse) */ {
 public:
  UnifiedorderResponse();
  virtual ~UnifiedorderResponse();

  UnifiedorderResponse(const UnifiedorderResponse& from);

  inline UnifiedorderResponse& operator=(const UnifiedorderResponse& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const UnifiedorderResponse& default_instance();

  static const UnifiedorderResponse* internal_default_instance();

  void Swap(UnifiedorderResponse* other);

  // implements Message ----------------------------------------------

  inline UnifiedorderResponse* New() const { return New(NULL); }

  UnifiedorderResponse* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const UnifiedorderResponse& from);
  void MergeFrom(const UnifiedorderResponse& from);
  void Clear();
  bool IsInitialized() const;

  size_t ByteSizeLong() const;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input);
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const;
  ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(
      bool deterministic, ::google::protobuf::uint8* output) const;
  ::google::protobuf::uint8* SerializeWithCachedSizesToArray(::google::protobuf::uint8* output) const {
    return InternalSerializeWithCachedSizesToArray(false, output);
  }
  int GetCachedSize() const { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const;
  void InternalSwap(UnifiedorderResponse* other);
  void UnsafeMergeFrom(const UnifiedorderResponse& from);
  private:
  inline ::google::protobuf::Arena* GetArenaNoVirtual() const {
    return _internal_metadata_.arena();
  }
  inline void* MaybeArenaPtr() const {
    return _internal_metadata_.raw_arena_ptr();
  }
  public:

  ::google::protobuf::Metadata GetMetadata() const;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional string app_id = 1;
  void clear_app_id();
  static const int kAppIdFieldNumber = 1;
  const ::std::string& app_id() const;
  void set_app_id(const ::std::string& value);
  void set_app_id(const char* value);
  void set_app_id(const char* value, size_t size);
  ::std::string* mutable_app_id();
  ::std::string* release_app_id();
  void set_allocated_app_id(::std::string* app_id);

  // optional string partner_id = 2;
  void clear_partner_id();
  static const int kPartnerIdFieldNumber = 2;
  const ::std::string& partner_id() const;
  void set_partner_id(const ::std::string& value);
  void set_partner_id(const char* value);
  void set_partner_id(const char* value, size_t size);
  ::std::string* mutable_partner_id();
  ::std::string* release_partner_id();
  void set_allocated_partner_id(::std::string* partner_id);

  // optional string prepay_id = 3;
  void clear_prepay_id();
  static const int kPrepayIdFieldNumber = 3;
  const ::std::string& prepay_id() const;
  void set_prepay_id(const ::std::string& value);
  void set_prepay_id(const char* value);
  void set_prepay_id(const char* value, size_t size);
  ::std::string* mutable_prepay_id();
  ::std::string* release_prepay_id();
  void set_allocated_prepay_id(::std::string* prepay_id);

  // optional string package = 4;
  void clear_package();
  static const int kPackageFieldNumber = 4;
  const ::std::string& package() const;
  void set_package(const ::std::string& value);
  void set_package(const char* value);
  void set_package(const char* value, size_t size);
  ::std::string* mutable_package();
  ::std::string* release_package();
  void set_allocated_package(::std::string* package);

  // optional string noncestr = 5;
  void clear_noncestr();
  static const int kNoncestrFieldNumber = 5;
  const ::std::string& noncestr() const;
  void set_noncestr(const ::std::string& value);
  void set_noncestr(const char* value);
  void set_noncestr(const char* value, size_t size);
  ::std::string* mutable_noncestr();
  ::std::string* release_noncestr();
  void set_allocated_noncestr(::std::string* noncestr);

  // optional string time_stamp = 6;
  void clear_time_stamp();
  static const int kTimeStampFieldNumber = 6;
  const ::std::string& time_stamp() const;
  void set_time_stamp(const ::std::string& value);
  void set_time_stamp(const char* value);
  void set_time_stamp(const char* value, size_t size);
  ::std::string* mutable_time_stamp();
  ::std::string* release_time_stamp();
  void set_allocated_time_stamp(::std::string* time_stamp);

  // optional string sign = 7;
  void clear_sign();
  static const int kSignFieldNumber = 7;
  const ::std::string& sign() const;
  void set_sign(const ::std::string& value);
  void set_sign(const char* value);
  void set_sign(const char* value, size_t size);
  ::std::string* mutable_sign();
  ::std::string* release_sign();
  void set_allocated_sign(::std::string* sign);

  // optional .grpcCommon.GrpcError error = 8;
  bool has_error() const;
  void clear_error();
  static const int kErrorFieldNumber = 8;
  const ::grpcCommon::GrpcError& error() const;
  ::grpcCommon::GrpcError* mutable_error();
  ::grpcCommon::GrpcError* release_error();
  void set_allocated_error(::grpcCommon::GrpcError* error);

  // @@protoc_insertion_point(class_scope:personal.UnifiedorderResponse)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr app_id_;
  ::google::protobuf::internal::ArenaStringPtr partner_id_;
  ::google::protobuf::internal::ArenaStringPtr prepay_id_;
  ::google::protobuf::internal::ArenaStringPtr package_;
  ::google::protobuf::internal::ArenaStringPtr noncestr_;
  ::google::protobuf::internal::ArenaStringPtr time_stamp_;
  ::google::protobuf::internal::ArenaStringPtr sign_;
  ::grpcCommon::GrpcError* error_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_trade_2fmsg_5ftrade_2eproto_impl();
  friend void  protobuf_AddDesc_trade_2fmsg_5ftrade_2eproto_impl();
  friend void protobuf_AssignDesc_trade_2fmsg_5ftrade_2eproto();
  friend void protobuf_ShutdownFile_trade_2fmsg_5ftrade_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<UnifiedorderResponse> UnifiedorderResponse_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// UnifiedorderRequest

// optional string user_id = 1;
inline void UnifiedorderRequest::clear_user_id() {
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UnifiedorderRequest::user_id() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderRequest.user_id)
  return user_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderRequest::set_user_id(const ::std::string& value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UnifiedorderRequest.user_id)
}
inline void UnifiedorderRequest::set_user_id(const char* value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UnifiedorderRequest.user_id)
}
inline void UnifiedorderRequest::set_user_id(const char* value, size_t size) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UnifiedorderRequest.user_id)
}
inline ::std::string* UnifiedorderRequest::mutable_user_id() {
  
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderRequest.user_id)
  return user_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UnifiedorderRequest::release_user_id() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderRequest.user_id)
  
  return user_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderRequest::set_allocated_user_id(::std::string* user_id) {
  if (user_id != NULL) {
    
  } else {
    
  }
  user_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), user_id);
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderRequest.user_id)
}

// optional string safe_transaction_string = 2;
inline void UnifiedorderRequest::clear_safe_transaction_string() {
  safe_transaction_string_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UnifiedorderRequest::safe_transaction_string() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderRequest.safe_transaction_string)
  return safe_transaction_string_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderRequest::set_safe_transaction_string(const ::std::string& value) {
  
  safe_transaction_string_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UnifiedorderRequest.safe_transaction_string)
}
inline void UnifiedorderRequest::set_safe_transaction_string(const char* value) {
  
  safe_transaction_string_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UnifiedorderRequest.safe_transaction_string)
}
inline void UnifiedorderRequest::set_safe_transaction_string(const char* value, size_t size) {
  
  safe_transaction_string_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UnifiedorderRequest.safe_transaction_string)
}
inline ::std::string* UnifiedorderRequest::mutable_safe_transaction_string() {
  
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderRequest.safe_transaction_string)
  return safe_transaction_string_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UnifiedorderRequest::release_safe_transaction_string() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderRequest.safe_transaction_string)
  
  return safe_transaction_string_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderRequest::set_allocated_safe_transaction_string(::std::string* safe_transaction_string) {
  if (safe_transaction_string != NULL) {
    
  } else {
    
  }
  safe_transaction_string_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), safe_transaction_string);
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderRequest.safe_transaction_string)
}

inline const UnifiedorderRequest* UnifiedorderRequest::internal_default_instance() {
  return &UnifiedorderRequest_default_instance_.get();
}
// -------------------------------------------------------------------

// UnifiedorderResponse

// optional string app_id = 1;
inline void UnifiedorderResponse::clear_app_id() {
  app_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UnifiedorderResponse::app_id() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderResponse.app_id)
  return app_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_app_id(const ::std::string& value) {
  
  app_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UnifiedorderResponse.app_id)
}
inline void UnifiedorderResponse::set_app_id(const char* value) {
  
  app_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UnifiedorderResponse.app_id)
}
inline void UnifiedorderResponse::set_app_id(const char* value, size_t size) {
  
  app_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UnifiedorderResponse.app_id)
}
inline ::std::string* UnifiedorderResponse::mutable_app_id() {
  
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderResponse.app_id)
  return app_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UnifiedorderResponse::release_app_id() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderResponse.app_id)
  
  return app_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_allocated_app_id(::std::string* app_id) {
  if (app_id != NULL) {
    
  } else {
    
  }
  app_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), app_id);
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderResponse.app_id)
}

// optional string partner_id = 2;
inline void UnifiedorderResponse::clear_partner_id() {
  partner_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UnifiedorderResponse::partner_id() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderResponse.partner_id)
  return partner_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_partner_id(const ::std::string& value) {
  
  partner_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UnifiedorderResponse.partner_id)
}
inline void UnifiedorderResponse::set_partner_id(const char* value) {
  
  partner_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UnifiedorderResponse.partner_id)
}
inline void UnifiedorderResponse::set_partner_id(const char* value, size_t size) {
  
  partner_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UnifiedorderResponse.partner_id)
}
inline ::std::string* UnifiedorderResponse::mutable_partner_id() {
  
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderResponse.partner_id)
  return partner_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UnifiedorderResponse::release_partner_id() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderResponse.partner_id)
  
  return partner_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_allocated_partner_id(::std::string* partner_id) {
  if (partner_id != NULL) {
    
  } else {
    
  }
  partner_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), partner_id);
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderResponse.partner_id)
}

// optional string prepay_id = 3;
inline void UnifiedorderResponse::clear_prepay_id() {
  prepay_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UnifiedorderResponse::prepay_id() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderResponse.prepay_id)
  return prepay_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_prepay_id(const ::std::string& value) {
  
  prepay_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UnifiedorderResponse.prepay_id)
}
inline void UnifiedorderResponse::set_prepay_id(const char* value) {
  
  prepay_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UnifiedorderResponse.prepay_id)
}
inline void UnifiedorderResponse::set_prepay_id(const char* value, size_t size) {
  
  prepay_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UnifiedorderResponse.prepay_id)
}
inline ::std::string* UnifiedorderResponse::mutable_prepay_id() {
  
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderResponse.prepay_id)
  return prepay_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UnifiedorderResponse::release_prepay_id() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderResponse.prepay_id)
  
  return prepay_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_allocated_prepay_id(::std::string* prepay_id) {
  if (prepay_id != NULL) {
    
  } else {
    
  }
  prepay_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), prepay_id);
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderResponse.prepay_id)
}

// optional string package = 4;
inline void UnifiedorderResponse::clear_package() {
  package_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UnifiedorderResponse::package() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderResponse.package)
  return package_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_package(const ::std::string& value) {
  
  package_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UnifiedorderResponse.package)
}
inline void UnifiedorderResponse::set_package(const char* value) {
  
  package_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UnifiedorderResponse.package)
}
inline void UnifiedorderResponse::set_package(const char* value, size_t size) {
  
  package_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UnifiedorderResponse.package)
}
inline ::std::string* UnifiedorderResponse::mutable_package() {
  
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderResponse.package)
  return package_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UnifiedorderResponse::release_package() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderResponse.package)
  
  return package_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_allocated_package(::std::string* package) {
  if (package != NULL) {
    
  } else {
    
  }
  package_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), package);
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderResponse.package)
}

// optional string noncestr = 5;
inline void UnifiedorderResponse::clear_noncestr() {
  noncestr_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UnifiedorderResponse::noncestr() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderResponse.noncestr)
  return noncestr_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_noncestr(const ::std::string& value) {
  
  noncestr_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UnifiedorderResponse.noncestr)
}
inline void UnifiedorderResponse::set_noncestr(const char* value) {
  
  noncestr_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UnifiedorderResponse.noncestr)
}
inline void UnifiedorderResponse::set_noncestr(const char* value, size_t size) {
  
  noncestr_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UnifiedorderResponse.noncestr)
}
inline ::std::string* UnifiedorderResponse::mutable_noncestr() {
  
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderResponse.noncestr)
  return noncestr_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UnifiedorderResponse::release_noncestr() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderResponse.noncestr)
  
  return noncestr_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_allocated_noncestr(::std::string* noncestr) {
  if (noncestr != NULL) {
    
  } else {
    
  }
  noncestr_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), noncestr);
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderResponse.noncestr)
}

// optional string time_stamp = 6;
inline void UnifiedorderResponse::clear_time_stamp() {
  time_stamp_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UnifiedorderResponse::time_stamp() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderResponse.time_stamp)
  return time_stamp_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_time_stamp(const ::std::string& value) {
  
  time_stamp_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UnifiedorderResponse.time_stamp)
}
inline void UnifiedorderResponse::set_time_stamp(const char* value) {
  
  time_stamp_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UnifiedorderResponse.time_stamp)
}
inline void UnifiedorderResponse::set_time_stamp(const char* value, size_t size) {
  
  time_stamp_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UnifiedorderResponse.time_stamp)
}
inline ::std::string* UnifiedorderResponse::mutable_time_stamp() {
  
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderResponse.time_stamp)
  return time_stamp_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UnifiedorderResponse::release_time_stamp() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderResponse.time_stamp)
  
  return time_stamp_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_allocated_time_stamp(::std::string* time_stamp) {
  if (time_stamp != NULL) {
    
  } else {
    
  }
  time_stamp_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), time_stamp);
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderResponse.time_stamp)
}

// optional string sign = 7;
inline void UnifiedorderResponse::clear_sign() {
  sign_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UnifiedorderResponse::sign() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderResponse.sign)
  return sign_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_sign(const ::std::string& value) {
  
  sign_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UnifiedorderResponse.sign)
}
inline void UnifiedorderResponse::set_sign(const char* value) {
  
  sign_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UnifiedorderResponse.sign)
}
inline void UnifiedorderResponse::set_sign(const char* value, size_t size) {
  
  sign_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UnifiedorderResponse.sign)
}
inline ::std::string* UnifiedorderResponse::mutable_sign() {
  
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderResponse.sign)
  return sign_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UnifiedorderResponse::release_sign() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderResponse.sign)
  
  return sign_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UnifiedorderResponse::set_allocated_sign(::std::string* sign) {
  if (sign != NULL) {
    
  } else {
    
  }
  sign_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), sign);
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderResponse.sign)
}

// optional .grpcCommon.GrpcError error = 8;
inline bool UnifiedorderResponse::has_error() const {
  return this != internal_default_instance() && error_ != NULL;
}
inline void UnifiedorderResponse::clear_error() {
  if (GetArenaNoVirtual() == NULL && error_ != NULL) delete error_;
  error_ = NULL;
}
inline const ::grpcCommon::GrpcError& UnifiedorderResponse::error() const {
  // @@protoc_insertion_point(field_get:personal.UnifiedorderResponse.error)
  return error_ != NULL ? *error_
                         : *::grpcCommon::GrpcError::internal_default_instance();
}
inline ::grpcCommon::GrpcError* UnifiedorderResponse::mutable_error() {
  
  if (error_ == NULL) {
    error_ = new ::grpcCommon::GrpcError;
  }
  // @@protoc_insertion_point(field_mutable:personal.UnifiedorderResponse.error)
  return error_;
}
inline ::grpcCommon::GrpcError* UnifiedorderResponse::release_error() {
  // @@protoc_insertion_point(field_release:personal.UnifiedorderResponse.error)
  
  ::grpcCommon::GrpcError* temp = error_;
  error_ = NULL;
  return temp;
}
inline void UnifiedorderResponse::set_allocated_error(::grpcCommon::GrpcError* error) {
  delete error_;
  error_ = error;
  if (error) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:personal.UnifiedorderResponse.error)
}

inline const UnifiedorderResponse* UnifiedorderResponse::internal_default_instance() {
  return &UnifiedorderResponse_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace personal

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_trade_2fmsg_5ftrade_2eproto__INCLUDED
