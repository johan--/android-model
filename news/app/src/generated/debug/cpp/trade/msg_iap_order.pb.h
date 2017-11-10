// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade/msg_iap_order.proto

#ifndef PROTOBUF_trade_2fmsg_5fiap_5forder_2eproto__INCLUDED
#define PROTOBUF_trade_2fmsg_5fiap_5forder_2eproto__INCLUDED

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
void protobuf_AddDesc_trade_2fmsg_5fiap_5forder_2eproto();
void protobuf_InitDefaults_trade_2fmsg_5fiap_5forder_2eproto();
void protobuf_AssignDesc_trade_2fmsg_5fiap_5forder_2eproto();
void protobuf_ShutdownFile_trade_2fmsg_5fiap_5forder_2eproto();

class IAPCreateOrderRequest;
class IAPCreateOrderResponse;

// ===================================================================

class IAPCreateOrderRequest : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:trade.IAPCreateOrderRequest) */ {
 public:
  IAPCreateOrderRequest();
  virtual ~IAPCreateOrderRequest();

  IAPCreateOrderRequest(const IAPCreateOrderRequest& from);

  inline IAPCreateOrderRequest& operator=(const IAPCreateOrderRequest& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const IAPCreateOrderRequest& default_instance();

  static const IAPCreateOrderRequest* internal_default_instance();

  void Swap(IAPCreateOrderRequest* other);

  // implements Message ----------------------------------------------

  inline IAPCreateOrderRequest* New() const { return New(NULL); }

  IAPCreateOrderRequest* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const IAPCreateOrderRequest& from);
  void MergeFrom(const IAPCreateOrderRequest& from);
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
  void InternalSwap(IAPCreateOrderRequest* other);
  void UnsafeMergeFrom(const IAPCreateOrderRequest& from);
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

  // optional string product_price = 2;
  void clear_product_price();
  static const int kProductPriceFieldNumber = 2;
  const ::std::string& product_price() const;
  void set_product_price(const ::std::string& value);
  void set_product_price(const char* value);
  void set_product_price(const char* value, size_t size);
  ::std::string* mutable_product_price();
  ::std::string* release_product_price();
  void set_allocated_product_price(::std::string* product_price);

  // optional string login_token = 3;
  void clear_login_token();
  static const int kLoginTokenFieldNumber = 3;
  const ::std::string& login_token() const;
  void set_login_token(const ::std::string& value);
  void set_login_token(const char* value);
  void set_login_token(const char* value, size_t size);
  ::std::string* mutable_login_token();
  ::std::string* release_login_token();
  void set_allocated_login_token(::std::string* login_token);

  // @@protoc_insertion_point(class_scope:trade.IAPCreateOrderRequest)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr user_id_;
  ::google::protobuf::internal::ArenaStringPtr product_price_;
  ::google::protobuf::internal::ArenaStringPtr login_token_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_trade_2fmsg_5fiap_5forder_2eproto_impl();
  friend void  protobuf_AddDesc_trade_2fmsg_5fiap_5forder_2eproto_impl();
  friend void protobuf_AssignDesc_trade_2fmsg_5fiap_5forder_2eproto();
  friend void protobuf_ShutdownFile_trade_2fmsg_5fiap_5forder_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<IAPCreateOrderRequest> IAPCreateOrderRequest_default_instance_;

// -------------------------------------------------------------------

class IAPCreateOrderResponse : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:trade.IAPCreateOrderResponse) */ {
 public:
  IAPCreateOrderResponse();
  virtual ~IAPCreateOrderResponse();

  IAPCreateOrderResponse(const IAPCreateOrderResponse& from);

  inline IAPCreateOrderResponse& operator=(const IAPCreateOrderResponse& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const IAPCreateOrderResponse& default_instance();

  static const IAPCreateOrderResponse* internal_default_instance();

  void Swap(IAPCreateOrderResponse* other);

  // implements Message ----------------------------------------------

  inline IAPCreateOrderResponse* New() const { return New(NULL); }

  IAPCreateOrderResponse* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const IAPCreateOrderResponse& from);
  void MergeFrom(const IAPCreateOrderResponse& from);
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
  void InternalSwap(IAPCreateOrderResponse* other);
  void UnsafeMergeFrom(const IAPCreateOrderResponse& from);
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

  // optional string iap_order_number = 1;
  void clear_iap_order_number();
  static const int kIapOrderNumberFieldNumber = 1;
  const ::std::string& iap_order_number() const;
  void set_iap_order_number(const ::std::string& value);
  void set_iap_order_number(const char* value);
  void set_iap_order_number(const char* value, size_t size);
  ::std::string* mutable_iap_order_number();
  ::std::string* release_iap_order_number();
  void set_allocated_iap_order_number(::std::string* iap_order_number);

  // optional string product_id = 2;
  void clear_product_id();
  static const int kProductIdFieldNumber = 2;
  const ::std::string& product_id() const;
  void set_product_id(const ::std::string& value);
  void set_product_id(const char* value);
  void set_product_id(const char* value, size_t size);
  ::std::string* mutable_product_id();
  ::std::string* release_product_id();
  void set_allocated_product_id(::std::string* product_id);

  // optional .grpcCommon.GrpcError error = 3;
  bool has_error() const;
  void clear_error();
  static const int kErrorFieldNumber = 3;
  const ::grpcCommon::GrpcError& error() const;
  ::grpcCommon::GrpcError* mutable_error();
  ::grpcCommon::GrpcError* release_error();
  void set_allocated_error(::grpcCommon::GrpcError* error);

  // @@protoc_insertion_point(class_scope:trade.IAPCreateOrderResponse)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr iap_order_number_;
  ::google::protobuf::internal::ArenaStringPtr product_id_;
  ::grpcCommon::GrpcError* error_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_trade_2fmsg_5fiap_5forder_2eproto_impl();
  friend void  protobuf_AddDesc_trade_2fmsg_5fiap_5forder_2eproto_impl();
  friend void protobuf_AssignDesc_trade_2fmsg_5fiap_5forder_2eproto();
  friend void protobuf_ShutdownFile_trade_2fmsg_5fiap_5forder_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<IAPCreateOrderResponse> IAPCreateOrderResponse_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// IAPCreateOrderRequest

// optional string user_id = 1;
inline void IAPCreateOrderRequest::clear_user_id() {
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& IAPCreateOrderRequest::user_id() const {
  // @@protoc_insertion_point(field_get:trade.IAPCreateOrderRequest.user_id)
  return user_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderRequest::set_user_id(const ::std::string& value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:trade.IAPCreateOrderRequest.user_id)
}
inline void IAPCreateOrderRequest::set_user_id(const char* value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:trade.IAPCreateOrderRequest.user_id)
}
inline void IAPCreateOrderRequest::set_user_id(const char* value, size_t size) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:trade.IAPCreateOrderRequest.user_id)
}
inline ::std::string* IAPCreateOrderRequest::mutable_user_id() {
  
  // @@protoc_insertion_point(field_mutable:trade.IAPCreateOrderRequest.user_id)
  return user_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* IAPCreateOrderRequest::release_user_id() {
  // @@protoc_insertion_point(field_release:trade.IAPCreateOrderRequest.user_id)
  
  return user_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderRequest::set_allocated_user_id(::std::string* user_id) {
  if (user_id != NULL) {
    
  } else {
    
  }
  user_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), user_id);
  // @@protoc_insertion_point(field_set_allocated:trade.IAPCreateOrderRequest.user_id)
}

// optional string product_price = 2;
inline void IAPCreateOrderRequest::clear_product_price() {
  product_price_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& IAPCreateOrderRequest::product_price() const {
  // @@protoc_insertion_point(field_get:trade.IAPCreateOrderRequest.product_price)
  return product_price_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderRequest::set_product_price(const ::std::string& value) {
  
  product_price_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:trade.IAPCreateOrderRequest.product_price)
}
inline void IAPCreateOrderRequest::set_product_price(const char* value) {
  
  product_price_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:trade.IAPCreateOrderRequest.product_price)
}
inline void IAPCreateOrderRequest::set_product_price(const char* value, size_t size) {
  
  product_price_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:trade.IAPCreateOrderRequest.product_price)
}
inline ::std::string* IAPCreateOrderRequest::mutable_product_price() {
  
  // @@protoc_insertion_point(field_mutable:trade.IAPCreateOrderRequest.product_price)
  return product_price_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* IAPCreateOrderRequest::release_product_price() {
  // @@protoc_insertion_point(field_release:trade.IAPCreateOrderRequest.product_price)
  
  return product_price_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderRequest::set_allocated_product_price(::std::string* product_price) {
  if (product_price != NULL) {
    
  } else {
    
  }
  product_price_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), product_price);
  // @@protoc_insertion_point(field_set_allocated:trade.IAPCreateOrderRequest.product_price)
}

// optional string login_token = 3;
inline void IAPCreateOrderRequest::clear_login_token() {
  login_token_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& IAPCreateOrderRequest::login_token() const {
  // @@protoc_insertion_point(field_get:trade.IAPCreateOrderRequest.login_token)
  return login_token_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderRequest::set_login_token(const ::std::string& value) {
  
  login_token_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:trade.IAPCreateOrderRequest.login_token)
}
inline void IAPCreateOrderRequest::set_login_token(const char* value) {
  
  login_token_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:trade.IAPCreateOrderRequest.login_token)
}
inline void IAPCreateOrderRequest::set_login_token(const char* value, size_t size) {
  
  login_token_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:trade.IAPCreateOrderRequest.login_token)
}
inline ::std::string* IAPCreateOrderRequest::mutable_login_token() {
  
  // @@protoc_insertion_point(field_mutable:trade.IAPCreateOrderRequest.login_token)
  return login_token_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* IAPCreateOrderRequest::release_login_token() {
  // @@protoc_insertion_point(field_release:trade.IAPCreateOrderRequest.login_token)
  
  return login_token_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderRequest::set_allocated_login_token(::std::string* login_token) {
  if (login_token != NULL) {
    
  } else {
    
  }
  login_token_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), login_token);
  // @@protoc_insertion_point(field_set_allocated:trade.IAPCreateOrderRequest.login_token)
}

inline const IAPCreateOrderRequest* IAPCreateOrderRequest::internal_default_instance() {
  return &IAPCreateOrderRequest_default_instance_.get();
}
// -------------------------------------------------------------------

// IAPCreateOrderResponse

// optional string iap_order_number = 1;
inline void IAPCreateOrderResponse::clear_iap_order_number() {
  iap_order_number_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& IAPCreateOrderResponse::iap_order_number() const {
  // @@protoc_insertion_point(field_get:trade.IAPCreateOrderResponse.iap_order_number)
  return iap_order_number_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderResponse::set_iap_order_number(const ::std::string& value) {
  
  iap_order_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:trade.IAPCreateOrderResponse.iap_order_number)
}
inline void IAPCreateOrderResponse::set_iap_order_number(const char* value) {
  
  iap_order_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:trade.IAPCreateOrderResponse.iap_order_number)
}
inline void IAPCreateOrderResponse::set_iap_order_number(const char* value, size_t size) {
  
  iap_order_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:trade.IAPCreateOrderResponse.iap_order_number)
}
inline ::std::string* IAPCreateOrderResponse::mutable_iap_order_number() {
  
  // @@protoc_insertion_point(field_mutable:trade.IAPCreateOrderResponse.iap_order_number)
  return iap_order_number_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* IAPCreateOrderResponse::release_iap_order_number() {
  // @@protoc_insertion_point(field_release:trade.IAPCreateOrderResponse.iap_order_number)
  
  return iap_order_number_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderResponse::set_allocated_iap_order_number(::std::string* iap_order_number) {
  if (iap_order_number != NULL) {
    
  } else {
    
  }
  iap_order_number_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), iap_order_number);
  // @@protoc_insertion_point(field_set_allocated:trade.IAPCreateOrderResponse.iap_order_number)
}

// optional string product_id = 2;
inline void IAPCreateOrderResponse::clear_product_id() {
  product_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& IAPCreateOrderResponse::product_id() const {
  // @@protoc_insertion_point(field_get:trade.IAPCreateOrderResponse.product_id)
  return product_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderResponse::set_product_id(const ::std::string& value) {
  
  product_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:trade.IAPCreateOrderResponse.product_id)
}
inline void IAPCreateOrderResponse::set_product_id(const char* value) {
  
  product_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:trade.IAPCreateOrderResponse.product_id)
}
inline void IAPCreateOrderResponse::set_product_id(const char* value, size_t size) {
  
  product_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:trade.IAPCreateOrderResponse.product_id)
}
inline ::std::string* IAPCreateOrderResponse::mutable_product_id() {
  
  // @@protoc_insertion_point(field_mutable:trade.IAPCreateOrderResponse.product_id)
  return product_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* IAPCreateOrderResponse::release_product_id() {
  // @@protoc_insertion_point(field_release:trade.IAPCreateOrderResponse.product_id)
  
  return product_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void IAPCreateOrderResponse::set_allocated_product_id(::std::string* product_id) {
  if (product_id != NULL) {
    
  } else {
    
  }
  product_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), product_id);
  // @@protoc_insertion_point(field_set_allocated:trade.IAPCreateOrderResponse.product_id)
}

// optional .grpcCommon.GrpcError error = 3;
inline bool IAPCreateOrderResponse::has_error() const {
  return this != internal_default_instance() && error_ != NULL;
}
inline void IAPCreateOrderResponse::clear_error() {
  if (GetArenaNoVirtual() == NULL && error_ != NULL) delete error_;
  error_ = NULL;
}
inline const ::grpcCommon::GrpcError& IAPCreateOrderResponse::error() const {
  // @@protoc_insertion_point(field_get:trade.IAPCreateOrderResponse.error)
  return error_ != NULL ? *error_
                         : *::grpcCommon::GrpcError::internal_default_instance();
}
inline ::grpcCommon::GrpcError* IAPCreateOrderResponse::mutable_error() {
  
  if (error_ == NULL) {
    error_ = new ::grpcCommon::GrpcError;
  }
  // @@protoc_insertion_point(field_mutable:trade.IAPCreateOrderResponse.error)
  return error_;
}
inline ::grpcCommon::GrpcError* IAPCreateOrderResponse::release_error() {
  // @@protoc_insertion_point(field_release:trade.IAPCreateOrderResponse.error)
  
  ::grpcCommon::GrpcError* temp = error_;
  error_ = NULL;
  return temp;
}
inline void IAPCreateOrderResponse::set_allocated_error(::grpcCommon::GrpcError* error) {
  delete error_;
  error_ = error;
  if (error) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:trade.IAPCreateOrderResponse.error)
}

inline const IAPCreateOrderResponse* IAPCreateOrderResponse::internal_default_instance() {
  return &IAPCreateOrderResponse_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace trade

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_trade_2fmsg_5fiap_5forder_2eproto__INCLUDED
