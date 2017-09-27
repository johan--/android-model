// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mainPage/doc_resource.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "mainPage/doc_resource.pb.h"

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

const ::google::protobuf::Descriptor* DocResourceRequest_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  DocResourceRequest_reflection_ = NULL;
const ::google::protobuf::Descriptor* DocResourceReply_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  DocResourceReply_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_mainPage_2fdoc_5fresource_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AssignDesc_mainPage_2fdoc_5fresource_2eproto() {
  protobuf_AddDesc_mainPage_2fdoc_5fresource_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "mainPage/doc_resource.proto");
  GOOGLE_CHECK(file != NULL);
  DocResourceRequest_descriptor_ = file->message_type(0);
  static const int DocResourceRequest_offsets_[2] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(DocResourceRequest, doc_id_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(DocResourceRequest, user_id_),
  };
  DocResourceRequest_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      DocResourceRequest_descriptor_,
      DocResourceRequest::internal_default_instance(),
      DocResourceRequest_offsets_,
      -1,
      -1,
      -1,
      sizeof(DocResourceRequest),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(DocResourceRequest, _internal_metadata_));
  DocResourceReply_descriptor_ = file->message_type(1);
  static const int DocResourceReply_offsets_[1] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(DocResourceReply, resource_url_),
  };
  DocResourceReply_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      DocResourceReply_descriptor_,
      DocResourceReply::internal_default_instance(),
      DocResourceReply_offsets_,
      -1,
      -1,
      -1,
      sizeof(DocResourceReply),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(DocResourceReply, _internal_metadata_));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_mainPage_2fdoc_5fresource_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      DocResourceRequest_descriptor_, DocResourceRequest::internal_default_instance());
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      DocResourceReply_descriptor_, DocResourceReply::internal_default_instance());
}

}  // namespace

void protobuf_ShutdownFile_mainPage_2fdoc_5fresource_2eproto() {
  DocResourceRequest_default_instance_.Shutdown();
  delete DocResourceRequest_reflection_;
  DocResourceReply_default_instance_.Shutdown();
  delete DocResourceReply_reflection_;
}

void protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::internal::GetEmptyString();
  DocResourceRequest_default_instance_.DefaultConstruct();
  ::google::protobuf::internal::GetEmptyString();
  DocResourceReply_default_instance_.DefaultConstruct();
  DocResourceRequest_default_instance_.get_mutable()->InitAsDefaultInstance();
  DocResourceReply_default_instance_.get_mutable()->InitAsDefaultInstance();
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto_once_);
void protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto_once_,
                 &protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto_impl);
}
void protobuf_AddDesc_mainPage_2fdoc_5fresource_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\033mainPage/doc_resource.proto\022\004main\"5\n\022D"
    "ocResourceRequest\022\016\n\006doc_id\030\001 \001(\t\022\017\n\007use"
    "r_id\030\002 \001(\t\"(\n\020DocResourceReply\022\024\n\014resour"
    "ce_url\030\001 \001(\tB\022\n\020com.wanfang.mainb\006proto3", 160);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "mainPage/doc_resource.proto", &protobuf_RegisterTypes);
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_mainPage_2fdoc_5fresource_2eproto);
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AddDesc_mainPage_2fdoc_5fresource_2eproto_once_);
void protobuf_AddDesc_mainPage_2fdoc_5fresource_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AddDesc_mainPage_2fdoc_5fresource_2eproto_once_,
                 &protobuf_AddDesc_mainPage_2fdoc_5fresource_2eproto_impl);
}
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_mainPage_2fdoc_5fresource_2eproto {
  StaticDescriptorInitializer_mainPage_2fdoc_5fresource_2eproto() {
    protobuf_AddDesc_mainPage_2fdoc_5fresource_2eproto();
  }
} static_descriptor_initializer_mainPage_2fdoc_5fresource_2eproto_;

namespace {

static void MergeFromFail(int line) GOOGLE_ATTRIBUTE_COLD GOOGLE_ATTRIBUTE_NORETURN;
static void MergeFromFail(int line) {
  ::google::protobuf::internal::MergeFromFail(__FILE__, line);
}

}  // namespace


// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int DocResourceRequest::kDocIdFieldNumber;
const int DocResourceRequest::kUserIdFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

DocResourceRequest::DocResourceRequest()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (this != internal_default_instance()) protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto();
  SharedCtor();
  // @@protoc_insertion_point(constructor:main.DocResourceRequest)
}

void DocResourceRequest::InitAsDefaultInstance() {
}

DocResourceRequest::DocResourceRequest(const DocResourceRequest& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  UnsafeMergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:main.DocResourceRequest)
}

void DocResourceRequest::SharedCtor() {
  doc_id_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  user_id_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  _cached_size_ = 0;
}

DocResourceRequest::~DocResourceRequest() {
  // @@protoc_insertion_point(destructor:main.DocResourceRequest)
  SharedDtor();
}

void DocResourceRequest::SharedDtor() {
  doc_id_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  user_id_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

void DocResourceRequest::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* DocResourceRequest::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return DocResourceRequest_descriptor_;
}

const DocResourceRequest& DocResourceRequest::default_instance() {
  protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto();
  return *internal_default_instance();
}

::google::protobuf::internal::ExplicitlyConstructed<DocResourceRequest> DocResourceRequest_default_instance_;

DocResourceRequest* DocResourceRequest::New(::google::protobuf::Arena* arena) const {
  DocResourceRequest* n = new DocResourceRequest;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void DocResourceRequest::Clear() {
// @@protoc_insertion_point(message_clear_start:main.DocResourceRequest)
  doc_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

bool DocResourceRequest::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:main.DocResourceRequest)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // optional string doc_id = 1;
      case 1: {
        if (tag == 10) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_doc_id()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->doc_id().data(), this->doc_id().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "main.DocResourceRequest.doc_id"));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(18)) goto parse_user_id;
        break;
      }

      // optional string user_id = 2;
      case 2: {
        if (tag == 18) {
         parse_user_id:
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_user_id()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->user_id().data(), this->user_id().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "main.DocResourceRequest.user_id"));
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
  // @@protoc_insertion_point(parse_success:main.DocResourceRequest)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:main.DocResourceRequest)
  return false;
#undef DO_
}

void DocResourceRequest::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:main.DocResourceRequest)
  // optional string doc_id = 1;
  if (this->doc_id().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->doc_id().data(), this->doc_id().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.DocResourceRequest.doc_id");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      1, this->doc_id(), output);
  }

  // optional string user_id = 2;
  if (this->user_id().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->user_id().data(), this->user_id().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.DocResourceRequest.user_id");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      2, this->user_id(), output);
  }

  // @@protoc_insertion_point(serialize_end:main.DocResourceRequest)
}

::google::protobuf::uint8* DocResourceRequest::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:main.DocResourceRequest)
  // optional string doc_id = 1;
  if (this->doc_id().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->doc_id().data(), this->doc_id().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.DocResourceRequest.doc_id");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        1, this->doc_id(), target);
  }

  // optional string user_id = 2;
  if (this->user_id().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->user_id().data(), this->user_id().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.DocResourceRequest.user_id");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        2, this->user_id(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:main.DocResourceRequest)
  return target;
}

size_t DocResourceRequest::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:main.DocResourceRequest)
  size_t total_size = 0;

  // optional string doc_id = 1;
  if (this->doc_id().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->doc_id());
  }

  // optional string user_id = 2;
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

void DocResourceRequest::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:main.DocResourceRequest)
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  const DocResourceRequest* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const DocResourceRequest>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:main.DocResourceRequest)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:main.DocResourceRequest)
    UnsafeMergeFrom(*source);
  }
}

void DocResourceRequest::MergeFrom(const DocResourceRequest& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:main.DocResourceRequest)
  if (GOOGLE_PREDICT_TRUE(&from != this)) {
    UnsafeMergeFrom(from);
  } else {
    MergeFromFail(__LINE__);
  }
}

void DocResourceRequest::UnsafeMergeFrom(const DocResourceRequest& from) {
  GOOGLE_DCHECK(&from != this);
  if (from.doc_id().size() > 0) {

    doc_id_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.doc_id_);
  }
  if (from.user_id().size() > 0) {

    user_id_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.user_id_);
  }
}

void DocResourceRequest::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:main.DocResourceRequest)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void DocResourceRequest::CopyFrom(const DocResourceRequest& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:main.DocResourceRequest)
  if (&from == this) return;
  Clear();
  UnsafeMergeFrom(from);
}

bool DocResourceRequest::IsInitialized() const {

  return true;
}

void DocResourceRequest::Swap(DocResourceRequest* other) {
  if (other == this) return;
  InternalSwap(other);
}
void DocResourceRequest::InternalSwap(DocResourceRequest* other) {
  doc_id_.Swap(&other->doc_id_);
  user_id_.Swap(&other->user_id_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata DocResourceRequest::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = DocResourceRequest_descriptor_;
  metadata.reflection = DocResourceRequest_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// DocResourceRequest

// optional string doc_id = 1;
void DocResourceRequest::clear_doc_id() {
  doc_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
const ::std::string& DocResourceRequest::doc_id() const {
  // @@protoc_insertion_point(field_get:main.DocResourceRequest.doc_id)
  return doc_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void DocResourceRequest::set_doc_id(const ::std::string& value) {
  
  doc_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.DocResourceRequest.doc_id)
}
void DocResourceRequest::set_doc_id(const char* value) {
  
  doc_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.DocResourceRequest.doc_id)
}
void DocResourceRequest::set_doc_id(const char* value, size_t size) {
  
  doc_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.DocResourceRequest.doc_id)
}
::std::string* DocResourceRequest::mutable_doc_id() {
  
  // @@protoc_insertion_point(field_mutable:main.DocResourceRequest.doc_id)
  return doc_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
::std::string* DocResourceRequest::release_doc_id() {
  // @@protoc_insertion_point(field_release:main.DocResourceRequest.doc_id)
  
  return doc_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void DocResourceRequest::set_allocated_doc_id(::std::string* doc_id) {
  if (doc_id != NULL) {
    
  } else {
    
  }
  doc_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), doc_id);
  // @@protoc_insertion_point(field_set_allocated:main.DocResourceRequest.doc_id)
}

// optional string user_id = 2;
void DocResourceRequest::clear_user_id() {
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
const ::std::string& DocResourceRequest::user_id() const {
  // @@protoc_insertion_point(field_get:main.DocResourceRequest.user_id)
  return user_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void DocResourceRequest::set_user_id(const ::std::string& value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.DocResourceRequest.user_id)
}
void DocResourceRequest::set_user_id(const char* value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.DocResourceRequest.user_id)
}
void DocResourceRequest::set_user_id(const char* value, size_t size) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.DocResourceRequest.user_id)
}
::std::string* DocResourceRequest::mutable_user_id() {
  
  // @@protoc_insertion_point(field_mutable:main.DocResourceRequest.user_id)
  return user_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
::std::string* DocResourceRequest::release_user_id() {
  // @@protoc_insertion_point(field_release:main.DocResourceRequest.user_id)
  
  return user_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void DocResourceRequest::set_allocated_user_id(::std::string* user_id) {
  if (user_id != NULL) {
    
  } else {
    
  }
  user_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), user_id);
  // @@protoc_insertion_point(field_set_allocated:main.DocResourceRequest.user_id)
}

inline const DocResourceRequest* DocResourceRequest::internal_default_instance() {
  return &DocResourceRequest_default_instance_.get();
}
#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int DocResourceReply::kResourceUrlFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

DocResourceReply::DocResourceReply()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (this != internal_default_instance()) protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto();
  SharedCtor();
  // @@protoc_insertion_point(constructor:main.DocResourceReply)
}

void DocResourceReply::InitAsDefaultInstance() {
}

DocResourceReply::DocResourceReply(const DocResourceReply& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  UnsafeMergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:main.DocResourceReply)
}

void DocResourceReply::SharedCtor() {
  resource_url_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  _cached_size_ = 0;
}

DocResourceReply::~DocResourceReply() {
  // @@protoc_insertion_point(destructor:main.DocResourceReply)
  SharedDtor();
}

void DocResourceReply::SharedDtor() {
  resource_url_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

void DocResourceReply::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* DocResourceReply::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return DocResourceReply_descriptor_;
}

const DocResourceReply& DocResourceReply::default_instance() {
  protobuf_InitDefaults_mainPage_2fdoc_5fresource_2eproto();
  return *internal_default_instance();
}

::google::protobuf::internal::ExplicitlyConstructed<DocResourceReply> DocResourceReply_default_instance_;

DocResourceReply* DocResourceReply::New(::google::protobuf::Arena* arena) const {
  DocResourceReply* n = new DocResourceReply;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void DocResourceReply::Clear() {
// @@protoc_insertion_point(message_clear_start:main.DocResourceReply)
  resource_url_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

bool DocResourceReply::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:main.DocResourceReply)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // optional string resource_url = 1;
      case 1: {
        if (tag == 10) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_resource_url()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->resource_url().data(), this->resource_url().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "main.DocResourceReply.resource_url"));
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
  // @@protoc_insertion_point(parse_success:main.DocResourceReply)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:main.DocResourceReply)
  return false;
#undef DO_
}

void DocResourceReply::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:main.DocResourceReply)
  // optional string resource_url = 1;
  if (this->resource_url().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->resource_url().data(), this->resource_url().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.DocResourceReply.resource_url");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      1, this->resource_url(), output);
  }

  // @@protoc_insertion_point(serialize_end:main.DocResourceReply)
}

::google::protobuf::uint8* DocResourceReply::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:main.DocResourceReply)
  // optional string resource_url = 1;
  if (this->resource_url().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->resource_url().data(), this->resource_url().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "main.DocResourceReply.resource_url");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        1, this->resource_url(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:main.DocResourceReply)
  return target;
}

size_t DocResourceReply::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:main.DocResourceReply)
  size_t total_size = 0;

  // optional string resource_url = 1;
  if (this->resource_url().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->resource_url());
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void DocResourceReply::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:main.DocResourceReply)
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  const DocResourceReply* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const DocResourceReply>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:main.DocResourceReply)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:main.DocResourceReply)
    UnsafeMergeFrom(*source);
  }
}

void DocResourceReply::MergeFrom(const DocResourceReply& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:main.DocResourceReply)
  if (GOOGLE_PREDICT_TRUE(&from != this)) {
    UnsafeMergeFrom(from);
  } else {
    MergeFromFail(__LINE__);
  }
}

void DocResourceReply::UnsafeMergeFrom(const DocResourceReply& from) {
  GOOGLE_DCHECK(&from != this);
  if (from.resource_url().size() > 0) {

    resource_url_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.resource_url_);
  }
}

void DocResourceReply::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:main.DocResourceReply)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void DocResourceReply::CopyFrom(const DocResourceReply& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:main.DocResourceReply)
  if (&from == this) return;
  Clear();
  UnsafeMergeFrom(from);
}

bool DocResourceReply::IsInitialized() const {

  return true;
}

void DocResourceReply::Swap(DocResourceReply* other) {
  if (other == this) return;
  InternalSwap(other);
}
void DocResourceReply::InternalSwap(DocResourceReply* other) {
  resource_url_.Swap(&other->resource_url_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata DocResourceReply::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = DocResourceReply_descriptor_;
  metadata.reflection = DocResourceReply_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// DocResourceReply

// optional string resource_url = 1;
void DocResourceReply::clear_resource_url() {
  resource_url_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
const ::std::string& DocResourceReply::resource_url() const {
  // @@protoc_insertion_point(field_get:main.DocResourceReply.resource_url)
  return resource_url_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void DocResourceReply::set_resource_url(const ::std::string& value) {
  
  resource_url_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.DocResourceReply.resource_url)
}
void DocResourceReply::set_resource_url(const char* value) {
  
  resource_url_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.DocResourceReply.resource_url)
}
void DocResourceReply::set_resource_url(const char* value, size_t size) {
  
  resource_url_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.DocResourceReply.resource_url)
}
::std::string* DocResourceReply::mutable_resource_url() {
  
  // @@protoc_insertion_point(field_mutable:main.DocResourceReply.resource_url)
  return resource_url_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
::std::string* DocResourceReply::release_resource_url() {
  // @@protoc_insertion_point(field_release:main.DocResourceReply.resource_url)
  
  return resource_url_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
void DocResourceReply::set_allocated_resource_url(::std::string* resource_url) {
  if (resource_url != NULL) {
    
  } else {
    
  }
  resource_url_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), resource_url);
  // @@protoc_insertion_point(field_set_allocated:main.DocResourceReply.resource_url)
}

inline const DocResourceReply* DocResourceReply::internal_default_instance() {
  return &DocResourceReply_default_instance_.get();
}
#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

}  // namespace main

// @@protoc_insertion_point(global_scope)