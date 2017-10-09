// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_iap_verify.proto

#ifndef PROTOBUF_trade_2fmsg_5fiap_5fverify_2eproto__INCLUDED
#define PROTOBUF_trade_2fmsg_5fiap_5fverify_2eproto__INCLUDED

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

namespace trade {

// Internal implementation detail -- do not call these.
void protobuf_AddDesc_trade_2fmsg_5fiap_5fverify_2eproto();
void protobuf_InitDefaults_trade_2fmsg_5fiap_5fverify_2eproto();
void protobuf_AssignDesc_trade_2fmsg_5fiap_5fverify_2eproto();
void protobuf_ShutdownFile_trade_2fmsg_5fiap_5fverify_2eproto();

class IAPVerifyRequest;
class IAPVerifyResponse;

// ===================================================================

class IAPVerifyRequest : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:trade.IAPVerifyRequest) */ {
 public:
  IAPVerifyRequest();
  virtual ~IAPVerifyRequest();

  IAPVerifyRequest(const IAPVerifyRequest& from);

  inline IAPVerifyRequest& operator=(const IAPVerifyRequest& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const IAPVerifyRequest& default_instance();

  static const IAPVerifyRequest* internal_default_instance();

  void Swap(IAPVerifyRequest* other);

  // implements Message ----------------------------------------------

  inline IAPVerifyRequest* New() const { return New(NULL); }

  IAPVerifyRequest* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const IAPVerifyRequest& from);
  void MergeFrom(const IAPVerifyRequest& from);
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
  void InternalSwap(IAPVerifyRequest* other);
  void UnsafeMergeFrom(const IAPVerifyRequest& from);
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

  // optional string receipt = 2;
  void clear_receipt();
  static const int kReceiptFieldNumber = 2;
  const ::std::string& receipt() const;
  void set_receipt(const ::std::string& value);
  void set_receipt(const char* value);
  void set_receipt(const char* value, size_t size);
  ::std::string* mutable_receipt();
  ::std::string* release_receipt();
  void set_allocated_receipt(::std::string* receipt);

  // optional string iap_order_number = 3;
  void clear_iap_order_number();
  static const int kIapOrderNumberFieldNumber = 3;
  const ::std::string& iap_order_number() const;
  void set_iap_order_number(const ::std::string& value);
  void set_iap_order_number(const char* value);
  void set_iap_order_number(const char* value, size_t size);
  ::std::string* mutable_iap_order_number();
  ::std::string* release_iap_order_number();
  void set_allocated_iap_order_number(::std::string* iap_order_number);

  // @@protoc_insertion_point(class_scope:trade.IAPVerifyRequest)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr user_id_;
  ::google::protobuf::internal::ArenaStringPtr receipt_;
  ::google::protobuf::internal::ArenaStringPtr iap_order_number_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_trade_2fmsg_5fiap_5fverify_2eproto_impl();
  friend void  protobuf_AddDesc_trade_2fmsg_5fiap_5fverify_2eproto_impl();
  friend void protobuf_AssignDesc_trade_2fmsg_5fiap_5fverify_2eproto();
  friend void protobuf_ShutdownFile_trade_2fmsg_5fiap_5fverify_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<IAPVerifyRequest> IAPVerifyRequest_default_instance_;

// -------------------------------------------------------------------

class IAPVerifyResponse : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:trade.IAPVerifyResponse) */ {
 public:
  IAPVerifyResponse();
  virtual ~IAPVerifyResponse();

  IAPVerifyResponse(const IAPVerifyResponse& from);

  inline IAPVerifyResponse& operator=(const IAPVerifyResponse& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const IAPVerifyResponse& default_instance();

  static const IAPVerifyResponse* internal_default_instance();

  void Swap(IAPVerifyResponse* other);

  // implements Message ----------------------------------------------

  inline IAPVerifyResponse* New() const { return New(NULL); }

  IAPVerifyResponse* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const IAPVerifyResponse& from);
  void MergeFrom(const IAPVerifyResponse& from);
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
  void InternalSwap(IAPVerifyResponse* other);
  void UnsafeMergeFrom(const IAPVerifyResponse& from);
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

  // optional bool verify_success = 1;
  void clear_verify_success();
  static const int kVerifySuccessFieldNumber = 1;
  bool verify_success() const;
  void set_verify_success(bool value);

  // optional .grpcCommon.GrpcError error = 2;
  bool has_error() const;
  void clear_error();
  static const int kErrorFieldNumber = 2;
  const ::grpcCommon::GrpcError& error() const;
  ::grpcCommon::GrpcError* mutable_error();
  ::grpcCommon::GrpcError* release_error();
  void set_allocated_error(::grpcCommon::GrpcError* error);

  // @@protoc_insertion_point(class_scope:trade.IAPVerifyResponse)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::grpcCommon::GrpcError* error_;
  bool verify_success_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_trade_2fmsg_5fiap_5fverify_2eproto_impl();
  friend void  protobuf_AddDesc_trade_2fmsg_5fiap_5fverify_2eproto_impl();
  friend void protobuf_AssignDesc_trade_2fmsg_5fiap_5fverify_2eproto();
  friend void protobuf_ShutdownFile_trade_2fmsg_5fiap_5fverify_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<IAPVerifyResponse> IAPVerifyResponse_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// IAPVerifyRequest

// optional string user_id = 1;
inline void IAPVerifyRequest::clear_user_id() {
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& IAPVerifyRequest::user_id() const {
  // @@protoc_insertion_point(field_get:trade.IAPVerifyRequest.user_id)
  return user_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPVerifyRequest::set_user_id(const ::std::string& value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:trade.IAPVerifyRequest.user_id)
}
inline void IAPVerifyRequest::set_user_id(const char* value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:trade.IAPVerifyRequest.user_id)
}
inline void IAPVerifyRequest::set_user_id(const char* value, size_t size) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:trade.IAPVerifyRequest.user_id)
}
inline ::std::string* IAPVerifyRequest::mutable_user_id() {
  
  // @@protoc_insertion_point(field_mutable:trade.IAPVerifyRequest.user_id)
  return user_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* IAPVerifyRequest::release_user_id() {
  // @@protoc_insertion_point(field_release:trade.IAPVerifyRequest.user_id)
  
  return user_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPVerifyRequest::set_allocated_user_id(::std::string* user_id) {
  if (user_id != NULL) {
    
  } else {
    
  }
  user_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), user_id);
  // @@protoc_insertion_point(field_set_allocated:trade.IAPVerifyRequest.user_id)
}

// optional string receipt = 2;
inline void IAPVerifyRequest::clear_receipt() {
  receipt_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& IAPVerifyRequest::receipt() const {
  // @@protoc_insertion_point(field_get:trade.IAPVerifyRequest.receipt)
  return receipt_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPVerifyRequest::set_receipt(const ::std::string& value) {
  
  receipt_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:trade.IAPVerifyRequest.receipt)
}
inline void IAPVerifyRequest::set_receipt(const char* value) {
  
  receipt_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:trade.IAPVerifyRequest.receipt)
}
inline void IAPVerifyRequest::set_receipt(const char* value, size_t size) {
  
  receipt_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:trade.IAPVerifyRequest.receipt)
}
inline ::std::string* IAPVerifyRequest::mutable_receipt() {
  
  // @@protoc_insertion_point(field_mutable:trade.IAPVerifyRequest.receipt)
  return receipt_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* IAPVerifyRequest::release_receipt() {
  // @@protoc_insertion_point(field_release:trade.IAPVerifyRequest.receipt)
  
  return receipt_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPVerifyRequest::set_allocated_receipt(::std::string* receipt) {
  if (receipt != NULL) {
    
  } else {
    
  }
  receipt_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), receipt);
  // @@protoc_insertion_point(field_set_allocated:trade.IAPVerifyRequest.receipt)
}

// optional string iap_order_number = 3;
inline void IAPVerifyRequest::clear_iap_order_number() {
  iap_order_number_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& IAPVerifyRequest::iap_order_number() const {
  // @@protoc_insertion_point(field_get:trade.IAPVerifyRequest.iap_order_number)
  return iap_order_number_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPVerifyRequest::set_iap_order_number(const ::std::string& value) {
  
  iap_order_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:trade.IAPVerifyRequest.iap_order_number)
}
inline void IAPVerifyRequest::set_iap_order_number(const char* value) {
  
  iap_order_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:trade.IAPVerifyRequest.iap_order_number)
}
inline void IAPVerifyRequest::set_iap_order_number(const char* value, size_t size) {
  
  iap_order_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:trade.IAPVerifyRequest.iap_order_number)
}
inline ::std::string* IAPVerifyRequest::mutable_iap_order_number() {
  
  // @@protoc_insertion_point(field_mutable:trade.IAPVerifyRequest.iap_order_number)
  return iap_order_number_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* IAPVerifyRequest::release_iap_order_number() {
  // @@protoc_insertion_point(field_release:trade.IAPVerifyRequest.iap_order_number)
  
  return iap_order_number_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPVerifyRequest::set_allocated_iap_order_number(::std::string* iap_order_number) {
  if (iap_order_number != NULL) {
    
  } else {
    
  }
  iap_order_number_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), iap_order_number);
  // @@protoc_insertion_point(field_set_allocated:trade.IAPVerifyRequest.iap_order_number)
}

inline const IAPVerifyRequest* IAPVerifyRequest::internal_default_instance() {
  return &IAPVerifyRequest_default_instance_.get();
}
// -------------------------------------------------------------------

// IAPVerifyResponse

// optional bool verify_success = 1;
inline void IAPVerifyResponse::clear_verify_success() {
  verify_success_ = false;
}
inline bool IAPVerifyResponse::verify_success() const {
  // @@protoc_insertion_point(field_get:trade.IAPVerifyResponse.verify_success)
  return verify_success_;
}
inline void IAPVerifyResponse::set_verify_success(bool value) {
  
  verify_success_ = value;
  // @@protoc_insertion_point(field_set:trade.IAPVerifyResponse.verify_success)
}

// optional .grpcCommon.GrpcError error = 2;
inline bool IAPVerifyResponse::has_error() const {
  return this != internal_default_instance() && error_ != NULL;
}
inline void IAPVerifyResponse::clear_error() {
  if (GetArenaNoVirtual() == NULL && error_ != NULL) delete error_;
  error_ = NULL;
}
inline const ::grpcCommon::GrpcError& IAPVerifyResponse::error() const {
  // @@protoc_insertion_point(field_get:trade.IAPVerifyResponse.error)
  return error_ != NULL ? *error_
                         : *::grpcCommon::GrpcError::internal_default_instance();
}
inline ::grpcCommon::GrpcError* IAPVerifyResponse::mutable_error() {
  
  if (error_ == NULL) {
    error_ = new ::grpcCommon::GrpcError;
  }
  // @@protoc_insertion_point(field_mutable:trade.IAPVerifyResponse.error)
  return error_;
}
inline ::grpcCommon::GrpcError* IAPVerifyResponse::release_error() {
  // @@protoc_insertion_point(field_release:trade.IAPVerifyResponse.error)
  
  ::grpcCommon::GrpcError* temp = error_;
  error_ = NULL;
  return temp;
}
inline void IAPVerifyResponse::set_allocated_error(::grpcCommon::GrpcError* error) {
  delete error_;
  error_ = error;
  if (error) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:trade.IAPVerifyResponse.error)
}

inline const IAPVerifyResponse* IAPVerifyResponse::internal_default_instance() {
  return &IAPVerifyResponse_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace trade

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_trade_2fmsg_5fiap_5fverify_2eproto__INCLUDED