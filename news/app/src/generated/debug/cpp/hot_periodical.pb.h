// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hot_periodical.proto

#ifndef PROTOBUF_hot_5fperiodical_2eproto__INCLUDED
#define PROTOBUF_hot_5fperiodical_2eproto__INCLUDED

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
// @@protoc_insertion_point(includes)

namespace main {

// Internal implementation detail -- do not call these.
void protobuf_AddDesc_hot_5fperiodical_2eproto();
void protobuf_InitDefaults_hot_5fperiodical_2eproto();
void protobuf_AssignDesc_hot_5fperiodical_2eproto();
void protobuf_ShutdownFile_hot_5fperiodical_2eproto();

class Periodical;
class PeriodicalReply;
class PeriodicalRequest;

// ===================================================================

class PeriodicalRequest : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.PeriodicalRequest) */ {
 public:
  PeriodicalRequest();
  virtual ~PeriodicalRequest();

  PeriodicalRequest(const PeriodicalRequest& from);

  inline PeriodicalRequest& operator=(const PeriodicalRequest& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const PeriodicalRequest& default_instance();

  static const PeriodicalRequest* internal_default_instance();

  void Swap(PeriodicalRequest* other);

  // implements Message ----------------------------------------------

  inline PeriodicalRequest* New() const { return New(NULL); }

  PeriodicalRequest* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const PeriodicalRequest& from);
  void MergeFrom(const PeriodicalRequest& from);
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
  void InternalSwap(PeriodicalRequest* other);
  void UnsafeMergeFrom(const PeriodicalRequest& from);
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

  // optional string page_number = 1;
  void clear_page_number();
  static const int kPageNumberFieldNumber = 1;
  const ::std::string& page_number() const;
  void set_page_number(const ::std::string& value);
  void set_page_number(const char* value);
  void set_page_number(const char* value, size_t size);
  ::std::string* mutable_page_number();
  ::std::string* release_page_number();
  void set_allocated_page_number(::std::string* page_number);

  // optional string page_size = 2;
  void clear_page_size();
  static const int kPageSizeFieldNumber = 2;
  const ::std::string& page_size() const;
  void set_page_size(const ::std::string& value);
  void set_page_size(const char* value);
  void set_page_size(const char* value, size_t size);
  ::std::string* mutable_page_size();
  ::std::string* release_page_size();
  void set_allocated_page_size(::std::string* page_size);

  // @@protoc_insertion_point(class_scope:main.PeriodicalRequest)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr page_number_;
  ::google::protobuf::internal::ArenaStringPtr page_size_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_hot_5fperiodical_2eproto_impl();
  friend void  protobuf_AddDesc_hot_5fperiodical_2eproto_impl();
  friend void protobuf_AssignDesc_hot_5fperiodical_2eproto();
  friend void protobuf_ShutdownFile_hot_5fperiodical_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<PeriodicalRequest> PeriodicalRequest_default_instance_;

// -------------------------------------------------------------------

class PeriodicalReply : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.PeriodicalReply) */ {
 public:
  PeriodicalReply();
  virtual ~PeriodicalReply();

  PeriodicalReply(const PeriodicalReply& from);

  inline PeriodicalReply& operator=(const PeriodicalReply& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const PeriodicalReply& default_instance();

  static const PeriodicalReply* internal_default_instance();

  void Swap(PeriodicalReply* other);

  // implements Message ----------------------------------------------

  inline PeriodicalReply* New() const { return New(NULL); }

  PeriodicalReply* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const PeriodicalReply& from);
  void MergeFrom(const PeriodicalReply& from);
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
  void InternalSwap(PeriodicalReply* other);
  void UnsafeMergeFrom(const PeriodicalReply& from);
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

  // repeated .main.Periodical periodical = 1;
  int periodical_size() const;
  void clear_periodical();
  static const int kPeriodicalFieldNumber = 1;
  const ::main::Periodical& periodical(int index) const;
  ::main::Periodical* mutable_periodical(int index);
  ::main::Periodical* add_periodical();
  ::google::protobuf::RepeatedPtrField< ::main::Periodical >*
      mutable_periodical();
  const ::google::protobuf::RepeatedPtrField< ::main::Periodical >&
      periodical() const;

  // @@protoc_insertion_point(class_scope:main.PeriodicalReply)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::RepeatedPtrField< ::main::Periodical > periodical_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_hot_5fperiodical_2eproto_impl();
  friend void  protobuf_AddDesc_hot_5fperiodical_2eproto_impl();
  friend void protobuf_AssignDesc_hot_5fperiodical_2eproto();
  friend void protobuf_ShutdownFile_hot_5fperiodical_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<PeriodicalReply> PeriodicalReply_default_instance_;

// -------------------------------------------------------------------

class Periodical : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.Periodical) */ {
 public:
  Periodical();
  virtual ~Periodical();

  Periodical(const Periodical& from);

  inline Periodical& operator=(const Periodical& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const Periodical& default_instance();

  static const Periodical* internal_default_instance();

  void Swap(Periodical* other);

  // implements Message ----------------------------------------------

  inline Periodical* New() const { return New(NULL); }

  Periodical* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const Periodical& from);
  void MergeFrom(const Periodical& from);
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
  void InternalSwap(Periodical* other);
  void UnsafeMergeFrom(const Periodical& from);
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

  // optional string periodical_cover = 1;
  void clear_periodical_cover();
  static const int kPeriodicalCoverFieldNumber = 1;
  const ::std::string& periodical_cover() const;
  void set_periodical_cover(const ::std::string& value);
  void set_periodical_cover(const char* value);
  void set_periodical_cover(const char* value, size_t size);
  ::std::string* mutable_periodical_cover();
  ::std::string* release_periodical_cover();
  void set_allocated_periodical_cover(::std::string* periodical_cover);

  // optional string periodical_id = 2;
  void clear_periodical_id();
  static const int kPeriodicalIdFieldNumber = 2;
  const ::std::string& periodical_id() const;
  void set_periodical_id(const ::std::string& value);
  void set_periodical_id(const char* value);
  void set_periodical_id(const char* value, size_t size);
  ::std::string* mutable_periodical_id();
  ::std::string* release_periodical_id();
  void set_allocated_periodical_id(::std::string* periodical_id);

  // optional string periodical_title = 3;
  void clear_periodical_title();
  static const int kPeriodicalTitleFieldNumber = 3;
  const ::std::string& periodical_title() const;
  void set_periodical_title(const ::std::string& value);
  void set_periodical_title(const char* value);
  void set_periodical_title(const char* value, size_t size);
  ::std::string* mutable_periodical_title();
  ::std::string* release_periodical_title();
  void set_allocated_periodical_title(::std::string* periodical_title);

  // @@protoc_insertion_point(class_scope:main.Periodical)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr periodical_cover_;
  ::google::protobuf::internal::ArenaStringPtr periodical_id_;
  ::google::protobuf::internal::ArenaStringPtr periodical_title_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_hot_5fperiodical_2eproto_impl();
  friend void  protobuf_AddDesc_hot_5fperiodical_2eproto_impl();
  friend void protobuf_AssignDesc_hot_5fperiodical_2eproto();
  friend void protobuf_ShutdownFile_hot_5fperiodical_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<Periodical> Periodical_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// PeriodicalRequest

// optional string page_number = 1;
inline void PeriodicalRequest::clear_page_number() {
  page_number_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& PeriodicalRequest::page_number() const {
  // @@protoc_insertion_point(field_get:main.PeriodicalRequest.page_number)
  return page_number_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void PeriodicalRequest::set_page_number(const ::std::string& value) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.PeriodicalRequest.page_number)
}
inline void PeriodicalRequest::set_page_number(const char* value) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.PeriodicalRequest.page_number)
}
inline void PeriodicalRequest::set_page_number(const char* value, size_t size) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.PeriodicalRequest.page_number)
}
inline ::std::string* PeriodicalRequest::mutable_page_number() {
  
  // @@protoc_insertion_point(field_mutable:main.PeriodicalRequest.page_number)
  return page_number_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* PeriodicalRequest::release_page_number() {
  // @@protoc_insertion_point(field_release:main.PeriodicalRequest.page_number)
  
  return page_number_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void PeriodicalRequest::set_allocated_page_number(::std::string* page_number) {
  if (page_number != NULL) {
    
  } else {
    
  }
  page_number_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), page_number);
  // @@protoc_insertion_point(field_set_allocated:main.PeriodicalRequest.page_number)
}

// optional string page_size = 2;
inline void PeriodicalRequest::clear_page_size() {
  page_size_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& PeriodicalRequest::page_size() const {
  // @@protoc_insertion_point(field_get:main.PeriodicalRequest.page_size)
  return page_size_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void PeriodicalRequest::set_page_size(const ::std::string& value) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.PeriodicalRequest.page_size)
}
inline void PeriodicalRequest::set_page_size(const char* value) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.PeriodicalRequest.page_size)
}
inline void PeriodicalRequest::set_page_size(const char* value, size_t size) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.PeriodicalRequest.page_size)
}
inline ::std::string* PeriodicalRequest::mutable_page_size() {
  
  // @@protoc_insertion_point(field_mutable:main.PeriodicalRequest.page_size)
  return page_size_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* PeriodicalRequest::release_page_size() {
  // @@protoc_insertion_point(field_release:main.PeriodicalRequest.page_size)
  
  return page_size_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void PeriodicalRequest::set_allocated_page_size(::std::string* page_size) {
  if (page_size != NULL) {
    
  } else {
    
  }
  page_size_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), page_size);
  // @@protoc_insertion_point(field_set_allocated:main.PeriodicalRequest.page_size)
}

inline const PeriodicalRequest* PeriodicalRequest::internal_default_instance() {
  return &PeriodicalRequest_default_instance_.get();
}
// -------------------------------------------------------------------

// PeriodicalReply

// repeated .main.Periodical periodical = 1;
inline int PeriodicalReply::periodical_size() const {
  return periodical_.size();
}
inline void PeriodicalReply::clear_periodical() {
  periodical_.Clear();
}
inline const ::main::Periodical& PeriodicalReply::periodical(int index) const {
  // @@protoc_insertion_point(field_get:main.PeriodicalReply.periodical)
  return periodical_.Get(index);
}
inline ::main::Periodical* PeriodicalReply::mutable_periodical(int index) {
  // @@protoc_insertion_point(field_mutable:main.PeriodicalReply.periodical)
  return periodical_.Mutable(index);
}
inline ::main::Periodical* PeriodicalReply::add_periodical() {
  // @@protoc_insertion_point(field_add:main.PeriodicalReply.periodical)
  return periodical_.Add();
}
inline ::google::protobuf::RepeatedPtrField< ::main::Periodical >*
PeriodicalReply::mutable_periodical() {
  // @@protoc_insertion_point(field_mutable_list:main.PeriodicalReply.periodical)
  return &periodical_;
}
inline const ::google::protobuf::RepeatedPtrField< ::main::Periodical >&
PeriodicalReply::periodical() const {
  // @@protoc_insertion_point(field_list:main.PeriodicalReply.periodical)
  return periodical_;
}

inline const PeriodicalReply* PeriodicalReply::internal_default_instance() {
  return &PeriodicalReply_default_instance_.get();
}
// -------------------------------------------------------------------

// Periodical

// optional string periodical_cover = 1;
inline void Periodical::clear_periodical_cover() {
  periodical_cover_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Periodical::periodical_cover() const {
  // @@protoc_insertion_point(field_get:main.Periodical.periodical_cover)
  return periodical_cover_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Periodical::set_periodical_cover(const ::std::string& value) {
  
  periodical_cover_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Periodical.periodical_cover)
}
inline void Periodical::set_periodical_cover(const char* value) {
  
  periodical_cover_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Periodical.periodical_cover)
}
inline void Periodical::set_periodical_cover(const char* value, size_t size) {
  
  periodical_cover_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Periodical.periodical_cover)
}
inline ::std::string* Periodical::mutable_periodical_cover() {
  
  // @@protoc_insertion_point(field_mutable:main.Periodical.periodical_cover)
  return periodical_cover_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Periodical::release_periodical_cover() {
  // @@protoc_insertion_point(field_release:main.Periodical.periodical_cover)
  
  return periodical_cover_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Periodical::set_allocated_periodical_cover(::std::string* periodical_cover) {
  if (periodical_cover != NULL) {
    
  } else {
    
  }
  periodical_cover_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), periodical_cover);
  // @@protoc_insertion_point(field_set_allocated:main.Periodical.periodical_cover)
}

// optional string periodical_id = 2;
inline void Periodical::clear_periodical_id() {
  periodical_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Periodical::periodical_id() const {
  // @@protoc_insertion_point(field_get:main.Periodical.periodical_id)
  return periodical_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Periodical::set_periodical_id(const ::std::string& value) {
  
  periodical_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Periodical.periodical_id)
}
inline void Periodical::set_periodical_id(const char* value) {
  
  periodical_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Periodical.periodical_id)
}
inline void Periodical::set_periodical_id(const char* value, size_t size) {
  
  periodical_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Periodical.periodical_id)
}
inline ::std::string* Periodical::mutable_periodical_id() {
  
  // @@protoc_insertion_point(field_mutable:main.Periodical.periodical_id)
  return periodical_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Periodical::release_periodical_id() {
  // @@protoc_insertion_point(field_release:main.Periodical.periodical_id)
  
  return periodical_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Periodical::set_allocated_periodical_id(::std::string* periodical_id) {
  if (periodical_id != NULL) {
    
  } else {
    
  }
  periodical_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), periodical_id);
  // @@protoc_insertion_point(field_set_allocated:main.Periodical.periodical_id)
}

// optional string periodical_title = 3;
inline void Periodical::clear_periodical_title() {
  periodical_title_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Periodical::periodical_title() const {
  // @@protoc_insertion_point(field_get:main.Periodical.periodical_title)
  return periodical_title_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Periodical::set_periodical_title(const ::std::string& value) {
  
  periodical_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Periodical.periodical_title)
}
inline void Periodical::set_periodical_title(const char* value) {
  
  periodical_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Periodical.periodical_title)
}
inline void Periodical::set_periodical_title(const char* value, size_t size) {
  
  periodical_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Periodical.periodical_title)
}
inline ::std::string* Periodical::mutable_periodical_title() {
  
  // @@protoc_insertion_point(field_mutable:main.Periodical.periodical_title)
  return periodical_title_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Periodical::release_periodical_title() {
  // @@protoc_insertion_point(field_release:main.Periodical.periodical_title)
  
  return periodical_title_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Periodical::set_allocated_periodical_title(::std::string* periodical_title) {
  if (periodical_title != NULL) {
    
  } else {
    
  }
  periodical_title_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), periodical_title);
  // @@protoc_insertion_point(field_set_allocated:main.Periodical.periodical_title)
}

inline const Periodical* Periodical::internal_default_instance() {
  return &Periodical_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------

// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace main

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_hot_5fperiodical_2eproto__INCLUDED
