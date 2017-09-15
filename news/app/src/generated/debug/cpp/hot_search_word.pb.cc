// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hot_search_word.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "hot_search_word.pb.h"

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

const ::google::protobuf::Descriptor* HotSearchWordRequest_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  HotSearchWordRequest_reflection_ = NULL;
const ::google::protobuf::Descriptor* HotSearchWordReply_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  HotSearchWordReply_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_hot_5fsearch_5fword_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AssignDesc_hot_5fsearch_5fword_2eproto() {
  protobuf_AddDesc_hot_5fsearch_5fword_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "hot_search_word.proto");
  GOOGLE_CHECK(file != NULL);
  HotSearchWordRequest_descriptor_ = file->message_type(0);
  static const int HotSearchWordRequest_offsets_[1] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(HotSearchWordRequest, user_id_),
  };
  HotSearchWordRequest_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      HotSearchWordRequest_descriptor_,
      HotSearchWordRequest::internal_default_instance(),
      HotSearchWordRequest_offsets_,
      -1,
      -1,
      -1,
      sizeof(HotSearchWordRequest),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(HotSearchWordRequest, _internal_metadata_));
  HotSearchWordReply_descriptor_ = file->message_type(1);
  static const int HotSearchWordReply_offsets_[1] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(HotSearchWordReply, hot_word_),
  };
  HotSearchWordReply_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      HotSearchWordReply_descriptor_,
      HotSearchWordReply::internal_default_instance(),
      HotSearchWordReply_offsets_,
      -1,
      -1,
      -1,
      sizeof(HotSearchWordReply),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(HotSearchWordReply, _internal_metadata_));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_hot_5fsearch_5fword_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      HotSearchWordRequest_descriptor_, HotSearchWordRequest::internal_default_instance());
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      HotSearchWordReply_descriptor_, HotSearchWordReply::internal_default_instance());
}

}  // namespace

void protobuf_ShutdownFile_hot_5fsearch_5fword_2eproto() {
  HotSearchWordRequest_default_instance_.Shutdown();
  delete HotSearchWordRequest_reflection_;
  HotSearchWordReply_default_instance_.Shutdown();
  delete HotSearchWordReply_reflection_;
}

void protobuf_InitDefaults_hot_5fsearch_5fword_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::internal::GetEmptyString();
  HotSearchWordRequest_default_instance_.DefaultConstruct();
  ::google::protobuf::internal::GetEmptyString();
  HotSearchWordReply_default_instance_.DefaultConstruct();
  HotSearchWordRequest_default_instance_.get_mutable()->InitAsDefaultInstance();
  HotSearchWordReply_default_instance_.get_mutable()->InitAsDefaultInstance();
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_InitDefaults_hot_5fsearch_5fword_2eproto_once_);
void protobuf_InitDefaults_hot_5fsearch_5fword_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_InitDefaults_hot_5fsearch_5fword_2eproto_once_,
                 &protobuf_InitDefaults_hot_5fsearch_5fword_2eproto_impl);
}
void protobuf_AddDesc_hot_5fsearch_5fword_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  protobuf_InitDefaults_hot_5fsearch_5fword_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\025hot_search_word.proto\022\004main\"\'\n\024HotSear"
    "chWordRequest\022\017\n\007user_id\030\001 \001(\t\"&\n\022HotSea"
    "rchWordReply\022\020\n\010hot_word\030\001 \003(\tB\022\n\020com.wa"
    "nfang.mainb\006proto3", 138);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "hot_search_word.proto", &protobuf_RegisterTypes);
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_hot_5fsearch_5fword_2eproto);
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AddDesc_hot_5fsearch_5fword_2eproto_once_);
void protobuf_AddDesc_hot_5fsearch_5fword_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AddDesc_hot_5fsearch_5fword_2eproto_once_,
                 &protobuf_AddDesc_hot_5fsearch_5fword_2eproto_impl);
}
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_hot_5fsearch_5fword_2eproto {
  StaticDescriptorInitializer_hot_5fsearch_5fword_2eproto() {
    protobuf_AddDesc_hot_5fsearch_5fword_2eproto();
  }
} static_descriptor_initializer_hot_5fsearch_5fword_2eproto_;

namespace {

static void MergeFromFail(int line) GOOGLE_ATTRIBUTE_COLD GOOGLE_ATTRIBUTE_NORETURN;
static void MergeFromFail(int line) {
  ::google::protobuf::internal::MergeFromFail(__FILE__, line);
}

}  // namespace


// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int HotSearchWordRequest::kUserIdFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

HotSearchWordRequest::HotSearchWordRequest()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (this != internal_default_instance()) protobuf_InitDefaults_hot_5fsearch_5fword_2eproto();
  SharedCtor();
  // @@protoc_insertion_point(constructor:main.HotSearchWordRequest)
}

void HotSearchWordRequest::InitAsDefaultInstance() {
}

HotSearchWordRequest::HotSearchWordRequest(const HotSearchWordRequest& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  UnsafeMergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:main.HotSearchWordRequest)
}

void HotSearchWordRequest::SharedCtor() {
  user_id_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  _cached_size_ = 0;
}

HotSearchWordRequest::~HotSearchWordRequest() {
  // @@protoc_insertion_point(destructor:main.HotSearchWordRequest)
  SharedDtor();
}

void HotSearchWordRequest::SharedDtor() {
  user_id_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

void HotSearchWordRequest::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* HotSearchWordRequest::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return HotSearchWordRequest_descriptor_;
}

const HotSearchWordRequest& HotSearchWordRequest::default_instance() {
  protobuf_InitDefaults_hot_5fsearch_5fword_2eproto();
  return *internal_default_instance();
}

::google::protobuf::internal::ExplicitlyConstructed<HotSearchWordRequest> HotSearchWordRequest_default_instance_;

HotSearchWordRequest* HotSearchWordRequest::New(::google::protobuf::Arena* arena) const {
  HotSearchWordRequest* n = new HotSearchWordRequest;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void HotSearchWordRequest::Clear() {
// @@protoc_insertion_point(message_clear_start:main.HotSearchWordRequest)
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

bool HotSearchWordRequest::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:main.HotSearchWordRequest)
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
            "main.HotSearchWordRequest.user_id"));
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
  // @@protoc_insertion_point(parse_success:main.HotSearchWordRequest)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:main.HotSearchWordRequest)
  return false;
#undef DO_
}

void HotSearchWordRequest::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:main.HotSearchWordRequest)
  // optional string user_id = 1;
  if (this->user_id().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->user_id().data(), this->user_id().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.HotSearchWordRequest.user_id");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      1, this->user_id(), output);
  }

  // @@protoc_insertion_point(serialize_end:main.HotSearchWordRequest)
}

::google::protobuf::uint8* HotSearchWordRequest::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:main.HotSearchWordRequest)
  // optional string user_id = 1;
  if (this->user_id().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->user_id().data(), this->user_id().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.HotSearchWordRequest.user_id");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        1, this->user_id(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:main.HotSearchWordRequest)
  return target;
}

size_t HotSearchWordRequest::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:main.HotSearchWordRequest)
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

void HotSearchWordRequest::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:main.HotSearchWordRequest)
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  const HotSearchWordRequest* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const HotSearchWordRequest>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:main.HotSearchWordRequest)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:main.HotSearchWordRequest)
    UnsafeMergeFrom(*source);
  }
}

void HotSearchWordRequest::MergeFrom(const HotSearchWordRequest& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:main.HotSearchWordRequest)
  if (GOOGLE_PREDICT_TRUE(&from != this)) {
    UnsafeMergeFrom(from);
  } else {
    MergeFromFail(__LINE__);
  }
}

void HotSearchWordRequest::UnsafeMergeFrom(const HotSearchWordRequest& from) {
  GOOGLE_DCHECK(&from != this);
  if (from.user_id().size() > 0) {

    user_id_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.user_id_);
  }
}

void HotSearchWordRequest::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:main.HotSearchWordRequest)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void HotSearchWordRequest::CopyFrom(const HotSearchWordRequest& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:main.HotSearchWordRequest)
  if (&from == this) return;
  Clear();
  UnsafeMergeFrom(from);
}

bool HotSearchWordRequest::IsInitialized() const {

  return true;
}

void HotSearchWordRequest::Swap(HotSearchWordRequest* other) {
  if (other == this) return;
  InternalSwap(other);
}
void HotSearchWordRequest::InternalSwap(HotSearchWordRequest* other) {
  user_id_.Swap(&other->user_id_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata HotSearchWordRequest::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = HotSearchWordRequest_descriptor_;
  metadata.reflection = HotSearchWordRequest_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// HotSearchWordRequest

// optional string user_id = 1;
void HotSearchWordRequest::clear_user_id() {
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
const ::std::string& HotSearchWordRequest::user_id() const {
  // @@protoc_insertion_point(field_get:main.HotSearchWordRequest.user_id)
  return user_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void HotSearchWordRequest::set_user_id(const ::std::string& value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.HotSearchWordRequest.user_id)
}
void HotSearchWordRequest::set_user_id(const char* value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.HotSearchWordRequest.user_id)
}
void HotSearchWordRequest::set_user_id(const char* value, size_t size) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.HotSearchWordRequest.user_id)
}
::std::string* HotSearchWordRequest::mutable_user_id() {
  
  // @@protoc_insertion_point(field_mutable:main.HotSearchWordRequest.user_id)
  return user_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
::std::string* HotSearchWordRequest::release_user_id() {
  // @@protoc_insertion_point(field_release:main.HotSearchWordRequest.user_id)
  
  return user_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void HotSearchWordRequest::set_allocated_user_id(::std::string* user_id) {
  if (user_id != NULL) {
    
  } else {
    
  }
  user_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), user_id);
  // @@protoc_insertion_point(field_set_allocated:main.HotSearchWordRequest.user_id)
}

inline const HotSearchWordRequest* HotSearchWordRequest::internal_default_instance() {
  return &HotSearchWordRequest_default_instance_.get();
}
#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int HotSearchWordReply::kHotWordFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

HotSearchWordReply::HotSearchWordReply()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (this != internal_default_instance()) protobuf_InitDefaults_hot_5fsearch_5fword_2eproto();
  SharedCtor();
  // @@protoc_insertion_point(constructor:main.HotSearchWordReply)
}

void HotSearchWordReply::InitAsDefaultInstance() {
}

HotSearchWordReply::HotSearchWordReply(const HotSearchWordReply& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  UnsafeMergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:main.HotSearchWordReply)
}

void HotSearchWordReply::SharedCtor() {
  _cached_size_ = 0;
}

HotSearchWordReply::~HotSearchWordReply() {
  // @@protoc_insertion_point(destructor:main.HotSearchWordReply)
  SharedDtor();
}

void HotSearchWordReply::SharedDtor() {
}

void HotSearchWordReply::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* HotSearchWordReply::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return HotSearchWordReply_descriptor_;
}

const HotSearchWordReply& HotSearchWordReply::default_instance() {
  protobuf_InitDefaults_hot_5fsearch_5fword_2eproto();
  return *internal_default_instance();
}

::google::protobuf::internal::ExplicitlyConstructed<HotSearchWordReply> HotSearchWordReply_default_instance_;

HotSearchWordReply* HotSearchWordReply::New(::google::protobuf::Arena* arena) const {
  HotSearchWordReply* n = new HotSearchWordReply;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void HotSearchWordReply::Clear() {
// @@protoc_insertion_point(message_clear_start:main.HotSearchWordReply)
  hot_word_.Clear();
}

bool HotSearchWordReply::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:main.HotSearchWordReply)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // repeated string hot_word = 1;
      case 1: {
        if (tag == 10) {
         parse_hot_word:
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->add_hot_word()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->hot_word(this->hot_word_size() - 1).data(),
            this->hot_word(this->hot_word_size() - 1).length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "main.HotSearchWordReply.hot_word"));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(10)) goto parse_hot_word;
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
  // @@protoc_insertion_point(parse_success:main.HotSearchWordReply)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:main.HotSearchWordReply)
  return false;
#undef DO_
}

void HotSearchWordReply::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:main.HotSearchWordReply)
  // repeated string hot_word = 1;
  for (int i = 0; i < this->hot_word_size(); i++) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->hot_word(i).data(), this->hot_word(i).length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.HotSearchWordReply.hot_word");
    ::google::protobuf::internal::WireFormatLite::WriteString(
      1, this->hot_word(i), output);
  }

  // @@protoc_insertion_point(serialize_end:main.HotSearchWordReply)
}

::google::protobuf::uint8* HotSearchWordReply::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:main.HotSearchWordReply)
  // repeated string hot_word = 1;
  for (int i = 0; i < this->hot_word_size(); i++) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->hot_word(i).data(), this->hot_word(i).length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.HotSearchWordReply.hot_word");
    target = ::google::protobuf::internal::WireFormatLite::
      WriteStringToArray(1, this->hot_word(i), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:main.HotSearchWordReply)
  return target;
}

size_t HotSearchWordReply::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:main.HotSearchWordReply)
  size_t total_size = 0;

  // repeated string hot_word = 1;
  total_size += 1 *
      ::google::protobuf::internal::FromIntSize(this->hot_word_size());
  for (int i = 0; i < this->hot_word_size(); i++) {
    total_size += ::google::protobuf::internal::WireFormatLite::StringSize(
      this->hot_word(i));
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void HotSearchWordReply::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:main.HotSearchWordReply)
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  const HotSearchWordReply* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const HotSearchWordReply>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:main.HotSearchWordReply)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:main.HotSearchWordReply)
    UnsafeMergeFrom(*source);
  }
}

void HotSearchWordReply::MergeFrom(const HotSearchWordReply& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:main.HotSearchWordReply)
  if (GOOGLE_PREDICT_TRUE(&from != this)) {
    UnsafeMergeFrom(from);
  } else {
    MergeFromFail(__LINE__);
  }
}

void HotSearchWordReply::UnsafeMergeFrom(const HotSearchWordReply& from) {
  GOOGLE_DCHECK(&from != this);
  hot_word_.UnsafeMergeFrom(from.hot_word_);
}

void HotSearchWordReply::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:main.HotSearchWordReply)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void HotSearchWordReply::CopyFrom(const HotSearchWordReply& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:main.HotSearchWordReply)
  if (&from == this) return;
  Clear();
  UnsafeMergeFrom(from);
}

bool HotSearchWordReply::IsInitialized() const {

  return true;
}

void HotSearchWordReply::Swap(HotSearchWordReply* other) {
  if (other == this) return;
  InternalSwap(other);
}
void HotSearchWordReply::InternalSwap(HotSearchWordReply* other) {
  hot_word_.UnsafeArenaSwap(&other->hot_word_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata HotSearchWordReply::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = HotSearchWordReply_descriptor_;
  metadata.reflection = HotSearchWordReply_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// HotSearchWordReply

// repeated string hot_word = 1;
int HotSearchWordReply::hot_word_size() const {
  return hot_word_.size();
}
void HotSearchWordReply::clear_hot_word() {
  hot_word_.Clear();
}
const ::std::string& HotSearchWordReply::hot_word(int index) const {
  // @@protoc_insertion_point(field_get:main.HotSearchWordReply.hot_word)
  return hot_word_.Get(index);
}
::std::string* HotSearchWordReply::mutable_hot_word(int index) {
  // @@protoc_insertion_point(field_mutable:main.HotSearchWordReply.hot_word)
  return hot_word_.Mutable(index);
}
void HotSearchWordReply::set_hot_word(int index, const ::std::string& value) {
  // @@protoc_insertion_point(field_set:main.HotSearchWordReply.hot_word)
  hot_word_.Mutable(index)->assign(value);
}
void HotSearchWordReply::set_hot_word(int index, const char* value) {
  hot_word_.Mutable(index)->assign(value);
  // @@protoc_insertion_point(field_set_char:main.HotSearchWordReply.hot_word)
}
void HotSearchWordReply::set_hot_word(int index, const char* value, size_t size) {
  hot_word_.Mutable(index)->assign(
    reinterpret_cast<const char*>(value), size);
  // @@protoc_insertion_point(field_set_pointer:main.HotSearchWordReply.hot_word)
}
::std::string* HotSearchWordReply::add_hot_word() {
  // @@protoc_insertion_point(field_add_mutable:main.HotSearchWordReply.hot_word)
  return hot_word_.Add();
}
void HotSearchWordReply::add_hot_word(const ::std::string& value) {
  hot_word_.Add()->assign(value);
  // @@protoc_insertion_point(field_add:main.HotSearchWordReply.hot_word)
}
void HotSearchWordReply::add_hot_word(const char* value) {
  hot_word_.Add()->assign(value);
  // @@protoc_insertion_point(field_add_char:main.HotSearchWordReply.hot_word)
}
void HotSearchWordReply::add_hot_word(const char* value, size_t size) {
  hot_word_.Add()->assign(reinterpret_cast<const char*>(value), size);
  // @@protoc_insertion_point(field_add_pointer:main.HotSearchWordReply.hot_word)
}
const ::google::protobuf::RepeatedPtrField< ::std::string>&
HotSearchWordReply::hot_word() const {
  // @@protoc_insertion_point(field_list:main.HotSearchWordReply.hot_word)
  return hot_word_;
}
::google::protobuf::RepeatedPtrField< ::std::string>*
HotSearchWordReply::mutable_hot_word() {
  // @@protoc_insertion_point(field_mutable_list:main.HotSearchWordReply.hot_word)
  return &hot_word_;
}

inline const HotSearchWordReply* HotSearchWordReply::internal_default_instance() {
  return &HotSearchWordReply_default_instance_.get();
}
#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

}  // namespace main

// @@protoc_insertion_point(global_scope)
