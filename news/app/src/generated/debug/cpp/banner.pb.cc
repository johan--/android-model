// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: banner.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "banner.pb.h"

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

namespace main {

namespace {

const ::google::protobuf::Descriptor* AllBannerRequest_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  AllBannerRequest_reflection_ = NULL;
const ::google::protobuf::Descriptor* AllBannerReply_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  AllBannerReply_reflection_ = NULL;
const ::google::protobuf::Descriptor* Baner_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  Baner_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_banner_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AssignDesc_banner_2eproto() {
  protobuf_AddDesc_banner_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "banner.proto");
  GOOGLE_CHECK(file != NULL);
  AllBannerRequest_descriptor_ = file->message_type(0);
  static const int AllBannerRequest_offsets_[1] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(AllBannerRequest, user_id_),
  };
  AllBannerRequest_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      AllBannerRequest_descriptor_,
      AllBannerRequest::internal_default_instance(),
      AllBannerRequest_offsets_,
      -1,
      -1,
      -1,
      sizeof(AllBannerRequest),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(AllBannerRequest, _internal_metadata_));
  AllBannerReply_descriptor_ = file->message_type(1);
  static const int AllBannerReply_offsets_[1] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(AllBannerReply, baner_),
  };
  AllBannerReply_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      AllBannerReply_descriptor_,
      AllBannerReply::internal_default_instance(),
      AllBannerReply_offsets_,
      -1,
      -1,
      -1,
      sizeof(AllBannerReply),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(AllBannerReply, _internal_metadata_));
  Baner_descriptor_ = file->message_type(2);
  static const int Baner_offsets_[2] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(Baner, banner_link_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(Baner, banner_pic_),
  };
  Baner_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      Baner_descriptor_,
      Baner::internal_default_instance(),
      Baner_offsets_,
      -1,
      -1,
      -1,
      sizeof(Baner),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(Baner, _internal_metadata_));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_banner_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      AllBannerRequest_descriptor_, AllBannerRequest::internal_default_instance());
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      AllBannerReply_descriptor_, AllBannerReply::internal_default_instance());
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      Baner_descriptor_, Baner::internal_default_instance());
}

}  // namespace

void protobuf_ShutdownFile_banner_2eproto() {
  AllBannerRequest_default_instance_.Shutdown();
  delete AllBannerRequest_reflection_;
  AllBannerReply_default_instance_.Shutdown();
  delete AllBannerReply_reflection_;
  Baner_default_instance_.Shutdown();
  delete Baner_reflection_;
}

void protobuf_InitDefaults_banner_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::internal::GetEmptyString();
  AllBannerRequest_default_instance_.DefaultConstruct();
  AllBannerReply_default_instance_.DefaultConstruct();
  ::google::protobuf::internal::GetEmptyString();
  Baner_default_instance_.DefaultConstruct();
  AllBannerRequest_default_instance_.get_mutable()->InitAsDefaultInstance();
  AllBannerReply_default_instance_.get_mutable()->InitAsDefaultInstance();
  Baner_default_instance_.get_mutable()->InitAsDefaultInstance();
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_InitDefaults_banner_2eproto_once_);
void protobuf_InitDefaults_banner_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_InitDefaults_banner_2eproto_once_,
                 &protobuf_InitDefaults_banner_2eproto_impl);
}
void protobuf_AddDesc_banner_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  protobuf_InitDefaults_banner_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\014banner.proto\022\004main\"#\n\020AllBannerRequest"
    "\022\017\n\007user_id\030\001 \001(\t\",\n\016AllBannerReply\022\032\n\005b"
    "aner\030\001 \003(\0132\013.main.Baner\"0\n\005Baner\022\023\n\013bann"
    "er_link\030\001 \001(\t\022\022\n\nbanner_pic\030\002 \001(\tB\022\n\020com"
    ".wanfang.mainb\006proto3", 181);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "banner.proto", &protobuf_RegisterTypes);
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_banner_2eproto);
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AddDesc_banner_2eproto_once_);
void protobuf_AddDesc_banner_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AddDesc_banner_2eproto_once_,
                 &protobuf_AddDesc_banner_2eproto_impl);
}
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_banner_2eproto {
  StaticDescriptorInitializer_banner_2eproto() {
    protobuf_AddDesc_banner_2eproto();
  }
} static_descriptor_initializer_banner_2eproto_;

namespace {

static void MergeFromFail(int line) GOOGLE_ATTRIBUTE_COLD GOOGLE_ATTRIBUTE_NORETURN;
static void MergeFromFail(int line) {
  ::google::protobuf::internal::MergeFromFail(__FILE__, line);
}

}  // namespace


// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int AllBannerRequest::kUserIdFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

AllBannerRequest::AllBannerRequest()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (this != internal_default_instance()) protobuf_InitDefaults_banner_2eproto();
  SharedCtor();
  // @@protoc_insertion_point(constructor:main.AllBannerRequest)
}

void AllBannerRequest::InitAsDefaultInstance() {
}

AllBannerRequest::AllBannerRequest(const AllBannerRequest& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  UnsafeMergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:main.AllBannerRequest)
}

void AllBannerRequest::SharedCtor() {
  user_id_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  _cached_size_ = 0;
}

AllBannerRequest::~AllBannerRequest() {
  // @@protoc_insertion_point(destructor:main.AllBannerRequest)
  SharedDtor();
}

void AllBannerRequest::SharedDtor() {
  user_id_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

void AllBannerRequest::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* AllBannerRequest::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return AllBannerRequest_descriptor_;
}

const AllBannerRequest& AllBannerRequest::default_instance() {
  protobuf_InitDefaults_banner_2eproto();
  return *internal_default_instance();
}

::google::protobuf::internal::ExplicitlyConstructed<AllBannerRequest> AllBannerRequest_default_instance_;

AllBannerRequest* AllBannerRequest::New(::google::protobuf::Arena* arena) const {
  AllBannerRequest* n = new AllBannerRequest;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void AllBannerRequest::Clear() {
// @@protoc_insertion_point(message_clear_start:main.AllBannerRequest)
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

bool AllBannerRequest::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:main.AllBannerRequest)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // optional string user_id = 1;
      case 1: {
        if (tag == 10) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_user_id()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->user_id().data(), this->user_id().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "main.AllBannerRequest.user_id"));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectAtEnd()) goto success;
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0 ||
            ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormatLite::SkipField(input, tag));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:main.AllBannerRequest)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:main.AllBannerRequest)
  return false;
#undef DO_
}

void AllBannerRequest::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:main.AllBannerRequest)
  // optional string user_id = 1;
  if (this->user_id().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->user_id().data(), this->user_id().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.AllBannerRequest.user_id");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      1, this->user_id(), output);
  }

  // @@protoc_insertion_point(serialize_end:main.AllBannerRequest)
}

::google::protobuf::uint8* AllBannerRequest::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:main.AllBannerRequest)
  // optional string user_id = 1;
  if (this->user_id().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->user_id().data(), this->user_id().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.AllBannerRequest.user_id");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        1, this->user_id(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:main.AllBannerRequest)
  return target;
}

size_t AllBannerRequest::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:main.AllBannerRequest)
  size_t total_size = 0;

  // optional string user_id = 1;
  if (this->user_id().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->user_id());
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void AllBannerRequest::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:main.AllBannerRequest)
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  const AllBannerRequest* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const AllBannerRequest>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:main.AllBannerRequest)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:main.AllBannerRequest)
    UnsafeMergeFrom(*source);
  }
}

void AllBannerRequest::MergeFrom(const AllBannerRequest& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:main.AllBannerRequest)
  if (GOOGLE_PREDICT_TRUE(&from != this)) {
    UnsafeMergeFrom(from);
  } else {
    MergeFromFail(__LINE__);
  }
}

void AllBannerRequest::UnsafeMergeFrom(const AllBannerRequest& from) {
  GOOGLE_DCHECK(&from != this);
  if (from.user_id().size() > 0) {

    user_id_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.user_id_);
  }
}

void AllBannerRequest::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:main.AllBannerRequest)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void AllBannerRequest::CopyFrom(const AllBannerRequest& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:main.AllBannerRequest)
  if (&from == this) return;
  Clear();
  UnsafeMergeFrom(from);
}

bool AllBannerRequest::IsInitialized() const {

  return true;
}

void AllBannerRequest::Swap(AllBannerRequest* other) {
  if (other == this) return;
  InternalSwap(other);
}
void AllBannerRequest::InternalSwap(AllBannerRequest* other) {
  user_id_.Swap(&other->user_id_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata AllBannerRequest::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = AllBannerRequest_descriptor_;
  metadata.reflection = AllBannerRequest_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// AllBannerRequest

// optional string user_id = 1;
void AllBannerRequest::clear_user_id() {
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
const ::std::string& AllBannerRequest::user_id() const {
  // @@protoc_insertion_point(field_get:main.AllBannerRequest.user_id)
  return user_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void AllBannerRequest::set_user_id(const ::std::string& value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.AllBannerRequest.user_id)
}
void AllBannerRequest::set_user_id(const char* value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.AllBannerRequest.user_id)
}
void AllBannerRequest::set_user_id(const char* value, size_t size) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.AllBannerRequest.user_id)
}
::std::string* AllBannerRequest::mutable_user_id() {
  
  // @@protoc_insertion_point(field_mutable:main.AllBannerRequest.user_id)
  return user_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
::std::string* AllBannerRequest::release_user_id() {
  // @@protoc_insertion_point(field_release:main.AllBannerRequest.user_id)
  
  return user_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void AllBannerRequest::set_allocated_user_id(::std::string* user_id) {
  if (user_id != NULL) {
    
  } else {
    
  }
  user_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), user_id);
  // @@protoc_insertion_point(field_set_allocated:main.AllBannerRequest.user_id)
}

inline const AllBannerRequest* AllBannerRequest::internal_default_instance() {
  return &AllBannerRequest_default_instance_.get();
}
#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int AllBannerReply::kBanerFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

AllBannerReply::AllBannerReply()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (this != internal_default_instance()) protobuf_InitDefaults_banner_2eproto();
  SharedCtor();
  // @@protoc_insertion_point(constructor:main.AllBannerReply)
}

void AllBannerReply::InitAsDefaultInstance() {
}

AllBannerReply::AllBannerReply(const AllBannerReply& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  UnsafeMergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:main.AllBannerReply)
}

void AllBannerReply::SharedCtor() {
  _cached_size_ = 0;
}

AllBannerReply::~AllBannerReply() {
  // @@protoc_insertion_point(destructor:main.AllBannerReply)
  SharedDtor();
}

void AllBannerReply::SharedDtor() {
}

void AllBannerReply::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* AllBannerReply::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return AllBannerReply_descriptor_;
}

const AllBannerReply& AllBannerReply::default_instance() {
  protobuf_InitDefaults_banner_2eproto();
  return *internal_default_instance();
}

::google::protobuf::internal::ExplicitlyConstructed<AllBannerReply> AllBannerReply_default_instance_;

AllBannerReply* AllBannerReply::New(::google::protobuf::Arena* arena) const {
  AllBannerReply* n = new AllBannerReply;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void AllBannerReply::Clear() {
// @@protoc_insertion_point(message_clear_start:main.AllBannerReply)
  baner_.Clear();
}

bool AllBannerReply::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:main.AllBannerReply)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // repeated .main.Baner baner = 1;
      case 1: {
        if (tag == 10) {
          DO_(input->IncrementRecursionDepth());
         parse_loop_baner:
          DO_(::google::protobuf::internal::WireFormatLite::ReadMessageNoVirtualNoRecursionDepth(
                input, add_baner()));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(10)) goto parse_loop_baner;
        input->UnsafeDecrementRecursionDepth();
        if (input->ExpectAtEnd()) goto success;
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0 ||
            ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormatLite::SkipField(input, tag));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:main.AllBannerReply)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:main.AllBannerReply)
  return false;
#undef DO_
}

void AllBannerReply::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:main.AllBannerReply)
  // repeated .main.Baner baner = 1;
  for (unsigned int i = 0, n = this->baner_size(); i < n; i++) {
    ::google::protobuf::internal::WireFormatLite::WriteMessageMaybeToArray(
      1, this->baner(i), output);
  }

  // @@protoc_insertion_point(serialize_end:main.AllBannerReply)
}

::google::protobuf::uint8* AllBannerReply::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:main.AllBannerReply)
  // repeated .main.Baner baner = 1;
  for (unsigned int i = 0, n = this->baner_size(); i < n; i++) {
    target = ::google::protobuf::internal::WireFormatLite::
      InternalWriteMessageNoVirtualToArray(
        1, this->baner(i), false, target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:main.AllBannerReply)
  return target;
}

size_t AllBannerReply::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:main.AllBannerReply)
  size_t total_size = 0;

  // repeated .main.Baner baner = 1;
  {
    unsigned int count = this->baner_size();
    total_size += 1UL * count;
    for (unsigned int i = 0; i < count; i++) {
      total_size +=
        ::google::protobuf::internal::WireFormatLite::MessageSizeNoVirtual(
          this->baner(i));
    }
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void AllBannerReply::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:main.AllBannerReply)
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  const AllBannerReply* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const AllBannerReply>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:main.AllBannerReply)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:main.AllBannerReply)
    UnsafeMergeFrom(*source);
  }
}

void AllBannerReply::MergeFrom(const AllBannerReply& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:main.AllBannerReply)
  if (GOOGLE_PREDICT_TRUE(&from != this)) {
    UnsafeMergeFrom(from);
  } else {
    MergeFromFail(__LINE__);
  }
}

void AllBannerReply::UnsafeMergeFrom(const AllBannerReply& from) {
  GOOGLE_DCHECK(&from != this);
  baner_.MergeFrom(from.baner_);
}

void AllBannerReply::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:main.AllBannerReply)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void AllBannerReply::CopyFrom(const AllBannerReply& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:main.AllBannerReply)
  if (&from == this) return;
  Clear();
  UnsafeMergeFrom(from);
}

bool AllBannerReply::IsInitialized() const {

  return true;
}

void AllBannerReply::Swap(AllBannerReply* other) {
  if (other == this) return;
  InternalSwap(other);
}
void AllBannerReply::InternalSwap(AllBannerReply* other) {
  baner_.UnsafeArenaSwap(&other->baner_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata AllBannerReply::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = AllBannerReply_descriptor_;
  metadata.reflection = AllBannerReply_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// AllBannerReply

// repeated .main.Baner baner = 1;
int AllBannerReply::baner_size() const {
  return baner_.size();
}
void AllBannerReply::clear_baner() {
  baner_.Clear();
}
const ::main::Baner& AllBannerReply::baner(int index) const {
  // @@protoc_insertion_point(field_get:main.AllBannerReply.baner)
  return baner_.Get(index);
}
::main::Baner* AllBannerReply::mutable_baner(int index) {
  // @@protoc_insertion_point(field_mutable:main.AllBannerReply.baner)
  return baner_.Mutable(index);
}
::main::Baner* AllBannerReply::add_baner() {
  // @@protoc_insertion_point(field_add:main.AllBannerReply.baner)
  return baner_.Add();
}
::google::protobuf::RepeatedPtrField< ::main::Baner >*
AllBannerReply::mutable_baner() {
  // @@protoc_insertion_point(field_mutable_list:main.AllBannerReply.baner)
  return &baner_;
}
const ::google::protobuf::RepeatedPtrField< ::main::Baner >&
AllBannerReply::baner() const {
  // @@protoc_insertion_point(field_list:main.AllBannerReply.baner)
  return baner_;
}

inline const AllBannerReply* AllBannerReply::internal_default_instance() {
  return &AllBannerReply_default_instance_.get();
}
#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int Baner::kBannerLinkFieldNumber;
const int Baner::kBannerPicFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

Baner::Baner()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (this != internal_default_instance()) protobuf_InitDefaults_banner_2eproto();
  SharedCtor();
  // @@protoc_insertion_point(constructor:main.Baner)
}

void Baner::InitAsDefaultInstance() {
}

Baner::Baner(const Baner& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  UnsafeMergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:main.Baner)
}

void Baner::SharedCtor() {
  banner_link_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  banner_pic_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  _cached_size_ = 0;
}

Baner::~Baner() {
  // @@protoc_insertion_point(destructor:main.Baner)
  SharedDtor();
}

void Baner::SharedDtor() {
  banner_link_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  banner_pic_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

void Baner::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* Baner::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return Baner_descriptor_;
}

const Baner& Baner::default_instance() {
  protobuf_InitDefaults_banner_2eproto();
  return *internal_default_instance();
}

::google::protobuf::internal::ExplicitlyConstructed<Baner> Baner_default_instance_;

Baner* Baner::New(::google::protobuf::Arena* arena) const {
  Baner* n = new Baner;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void Baner::Clear() {
// @@protoc_insertion_point(message_clear_start:main.Baner)
  banner_link_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  banner_pic_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

bool Baner::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:main.Baner)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // optional string banner_link = 1;
      case 1: {
        if (tag == 10) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_banner_link()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->banner_link().data(), this->banner_link().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "main.Baner.banner_link"));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(18)) goto parse_banner_pic;
        break;
      }

      // optional string banner_pic = 2;
      case 2: {
        if (tag == 18) {
         parse_banner_pic:
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_banner_pic()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->banner_pic().data(), this->banner_pic().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "main.Baner.banner_pic"));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectAtEnd()) goto success;
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0 ||
            ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormatLite::SkipField(input, tag));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:main.Baner)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:main.Baner)
  return false;
#undef DO_
}

void Baner::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:main.Baner)
  // optional string banner_link = 1;
  if (this->banner_link().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->banner_link().data(), this->banner_link().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.Baner.banner_link");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      1, this->banner_link(), output);
  }

  // optional string banner_pic = 2;
  if (this->banner_pic().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->banner_pic().data(), this->banner_pic().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.Baner.banner_pic");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      2, this->banner_pic(), output);
  }

  // @@protoc_insertion_point(serialize_end:main.Baner)
}

::google::protobuf::uint8* Baner::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:main.Baner)
  // optional string banner_link = 1;
  if (this->banner_link().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->banner_link().data(), this->banner_link().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.Baner.banner_link");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        1, this->banner_link(), target);
  }

  // optional string banner_pic = 2;
  if (this->banner_pic().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->banner_pic().data(), this->banner_pic().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.Baner.banner_pic");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        2, this->banner_pic(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:main.Baner)
  return target;
}

size_t Baner::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:main.Baner)
  size_t total_size = 0;

  // optional string banner_link = 1;
  if (this->banner_link().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->banner_link());
  }

  // optional string banner_pic = 2;
  if (this->banner_pic().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->banner_pic());
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void Baner::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:main.Baner)
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  const Baner* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const Baner>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:main.Baner)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:main.Baner)
    UnsafeMergeFrom(*source);
  }
}

void Baner::MergeFrom(const Baner& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:main.Baner)
  if (GOOGLE_PREDICT_TRUE(&from != this)) {
    UnsafeMergeFrom(from);
  } else {
    MergeFromFail(__LINE__);
  }
}

void Baner::UnsafeMergeFrom(const Baner& from) {
  GOOGLE_DCHECK(&from != this);
  if (from.banner_link().size() > 0) {

    banner_link_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.banner_link_);
  }
  if (from.banner_pic().size() > 0) {

    banner_pic_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.banner_pic_);
  }
}

void Baner::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:main.Baner)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void Baner::CopyFrom(const Baner& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:main.Baner)
  if (&from == this) return;
  Clear();
  UnsafeMergeFrom(from);
}

bool Baner::IsInitialized() const {

  return true;
}

void Baner::Swap(Baner* other) {
  if (other == this) return;
  InternalSwap(other);
}
void Baner::InternalSwap(Baner* other) {
  banner_link_.Swap(&other->banner_link_);
  banner_pic_.Swap(&other->banner_pic_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata Baner::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = Baner_descriptor_;
  metadata.reflection = Baner_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// Baner

// optional string banner_link = 1;
void Baner::clear_banner_link() {
  banner_link_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
const ::std::string& Baner::banner_link() const {
  // @@protoc_insertion_point(field_get:main.Baner.banner_link)
  return banner_link_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void Baner::set_banner_link(const ::std::string& value) {
  
  banner_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Baner.banner_link)
}
void Baner::set_banner_link(const char* value) {
  
  banner_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Baner.banner_link)
}
void Baner::set_banner_link(const char* value, size_t size) {
  
  banner_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Baner.banner_link)
}
::std::string* Baner::mutable_banner_link() {
  
  // @@protoc_insertion_point(field_mutable:main.Baner.banner_link)
  return banner_link_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
::std::string* Baner::release_banner_link() {
  // @@protoc_insertion_point(field_release:main.Baner.banner_link)
  
  return banner_link_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void Baner::set_allocated_banner_link(::std::string* banner_link) {
  if (banner_link != NULL) {
    
  } else {
    
  }
  banner_link_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), banner_link);
  // @@protoc_insertion_point(field_set_allocated:main.Baner.banner_link)
}

// optional string banner_pic = 2;
void Baner::clear_banner_pic() {
  banner_pic_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
const ::std::string& Baner::banner_pic() const {
  // @@protoc_insertion_point(field_get:main.Baner.banner_pic)
  return banner_pic_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void Baner::set_banner_pic(const ::std::string& value) {
  
  banner_pic_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Baner.banner_pic)
}
void Baner::set_banner_pic(const char* value) {
  
  banner_pic_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Baner.banner_pic)
}
void Baner::set_banner_pic(const char* value, size_t size) {
  
  banner_pic_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Baner.banner_pic)
}
::std::string* Baner::mutable_banner_pic() {
  
  // @@protoc_insertion_point(field_mutable:main.Baner.banner_pic)
  return banner_pic_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
::std::string* Baner::release_banner_pic() {
  // @@protoc_insertion_point(field_release:main.Baner.banner_pic)
  
  return banner_pic_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void Baner::set_allocated_banner_pic(::std::string* banner_pic) {
  if (banner_pic != NULL) {
    
  } else {
    
  }
  banner_pic_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), banner_pic);
  // @@protoc_insertion_point(field_set_allocated:main.Baner.banner_pic)
}

inline const Baner* Baner::internal_default_instance() {
  return &Baner_default_instance_.get();
}
#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

}  // namespace main

// @@protoc_insertion_point(global_scope)
