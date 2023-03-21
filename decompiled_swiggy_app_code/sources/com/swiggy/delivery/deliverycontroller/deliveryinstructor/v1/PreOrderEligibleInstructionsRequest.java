package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails;
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx;
import com.swiggy.delivery.deliverycontroller.shared.v1.TaskType;
import com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress;
import com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddressOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class PreOrderEligibleInstructionsRequest extends GeneratedMessageV3 implements PreOrderEligibleInstructionsRequestOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 3;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final PreOrderEligibleInstructionsRequest DEFAULT_INSTANCE = new PreOrderEligibleInstructionsRequest();
    public static final int INSTRUCTOR_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Parser<PreOrderEligibleInstructionsRequest> PARSER = new AbstractParser<PreOrderEligibleInstructionsRequest>() {
        public PreOrderEligibleInstructionsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new PreOrderEligibleInstructionsRequest(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int TASK_TYPE_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public EnrichedAddress address_;
    /* access modifiers changed from: private */
    public RequestCtx context_;
    /* access modifiers changed from: private */
    public InstructorDetails instructor_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int taskType_;

    public static PreOrderEligibleInstructionsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsRequest_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PreOrderEligibleInstructionsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PreOrderEligibleInstructionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<PreOrderEligibleInstructionsRequest> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreOrderEligibleInstructionsRequest)) {
            return super.equals(obj);
        }
        PreOrderEligibleInstructionsRequest preOrderEligibleInstructionsRequest = (PreOrderEligibleInstructionsRequest) obj;
        if (hasContext() != preOrderEligibleInstructionsRequest.hasContext()) {
            return false;
        }
        if ((hasContext() && !getContext().equals(preOrderEligibleInstructionsRequest.getContext())) || hasInstructor() != preOrderEligibleInstructionsRequest.hasInstructor()) {
            return false;
        }
        if ((hasInstructor() && !getInstructor().equals(preOrderEligibleInstructionsRequest.getInstructor())) || hasAddress() != preOrderEligibleInstructionsRequest.hasAddress()) {
            return false;
        }
        if ((!hasAddress() || getAddress().equals(preOrderEligibleInstructionsRequest.getAddress())) && this.taskType_ == preOrderEligibleInstructionsRequest.taskType_ && this.unknownFields.equals(preOrderEligibleInstructionsRequest.unknownFields)) {
            return true;
        }
        return false;
    }

    public EnrichedAddress getAddress() {
        EnrichedAddress enrichedAddress = this.address_;
        return enrichedAddress == null ? EnrichedAddress.getDefaultInstance() : enrichedAddress;
    }

    public EnrichedAddressOrBuilder getAddressOrBuilder() {
        return getAddress();
    }

    public RequestCtx getContext() {
        RequestCtx requestCtx = this.context_;
        return requestCtx == null ? RequestCtx.getDefaultInstance() : requestCtx;
    }

    public RequestCtxOrBuilder getContextOrBuilder() {
        return getContext();
    }

    public InstructorDetails getInstructor() {
        InstructorDetails instructorDetails = this.instructor_;
        return instructorDetails == null ? InstructorDetails.getDefaultInstance() : instructorDetails;
    }

    public InstructorDetailsOrBuilder getInstructorOrBuilder() {
        return getInstructor();
    }

    public Parser<PreOrderEligibleInstructionsRequest> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        if (this.context_ != null) {
            i12 = 0 + CodedOutputStream.computeMessageSize(1, getContext());
        }
        if (this.instructor_ != null) {
            i12 += CodedOutputStream.computeMessageSize(2, getInstructor());
        }
        if (this.address_ != null) {
            i12 += CodedOutputStream.computeMessageSize(3, getAddress());
        }
        if (this.taskType_ != TaskType.TASK_TYPE_INVALID.getNumber()) {
            i12 += CodedOutputStream.computeEnumSize(4, this.taskType_);
        }
        int serializedSize = i12 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public TaskType getTaskType() {
        TaskType valueOf = TaskType.valueOf(this.taskType_);
        return valueOf == null ? TaskType.UNRECOGNIZED : valueOf;
    }

    public int getTaskTypeValue() {
        return this.taskType_;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasAddress() {
        return this.address_ != null;
    }

    public boolean hasContext() {
        return this.context_ != null;
    }

    public boolean hasInstructor() {
        return this.instructor_ != null;
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasContext()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getContext().hashCode();
        }
        if (hasInstructor()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getInstructor().hashCode();
        }
        if (hasAddress()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getAddress().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 4) * 53) + this.taskType_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PreOrderEligibleInstructionsRequest.class, Builder.class);
    }

    public final boolean isInitialized() {
        byte b11 = this.memoizedIsInitialized;
        if (b11 == 1) {
            return true;
        }
        if (b11 == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new PreOrderEligibleInstructionsRequest();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.context_ != null) {
            codedOutputStream.writeMessage(1, getContext());
        }
        if (this.instructor_ != null) {
            codedOutputStream.writeMessage(2, getInstructor());
        }
        if (this.address_ != null) {
            codedOutputStream.writeMessage(3, getAddress());
        }
        if (this.taskType_ != TaskType.TASK_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(4, this.taskType_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PreOrderEligibleInstructionsRequestOrBuilder {
        private SingleFieldBuilderV3<EnrichedAddress, EnrichedAddress.Builder, EnrichedAddressOrBuilder> addressBuilder_;
        private EnrichedAddress address_;
        private SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> contextBuilder_;
        private RequestCtx context_;
        private SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> instructorBuilder_;
        private InstructorDetails instructor_;
        private int taskType_;

        private SingleFieldBuilderV3<EnrichedAddress, EnrichedAddress.Builder, EnrichedAddressOrBuilder> getAddressFieldBuilder() {
            if (this.addressBuilder_ == null) {
                this.addressBuilder_ = new SingleFieldBuilderV3<>(getAddress(), getParentForChildren(), isClean());
                this.address_ = null;
            }
            return this.addressBuilder_;
        }

        private SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new SingleFieldBuilderV3<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsRequest_descriptor;
        }

        private SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> getInstructorFieldBuilder() {
            if (this.instructorBuilder_ == null) {
                this.instructorBuilder_ = new SingleFieldBuilderV3<>(getInstructor(), getParentForChildren(), isClean());
                this.instructor_ = null;
            }
            return this.instructorBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearAddress() {
            if (this.addressBuilder_ == null) {
                this.address_ = null;
                onChanged();
            } else {
                this.address_ = null;
                this.addressBuilder_ = null;
            }
            return this;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        public Builder clearInstructor() {
            if (this.instructorBuilder_ == null) {
                this.instructor_ = null;
                onChanged();
            } else {
                this.instructor_ = null;
                this.instructorBuilder_ = null;
            }
            return this;
        }

        public Builder clearTaskType() {
            this.taskType_ = 0;
            onChanged();
            return this;
        }

        public EnrichedAddress getAddress() {
            SingleFieldBuilderV3<EnrichedAddress, EnrichedAddress.Builder, EnrichedAddressOrBuilder> singleFieldBuilderV3 = this.addressBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            EnrichedAddress enrichedAddress = this.address_;
            return enrichedAddress == null ? EnrichedAddress.getDefaultInstance() : enrichedAddress;
        }

        public EnrichedAddress.Builder getAddressBuilder() {
            onChanged();
            return getAddressFieldBuilder().getBuilder();
        }

        public EnrichedAddressOrBuilder getAddressOrBuilder() {
            SingleFieldBuilderV3<EnrichedAddress, EnrichedAddress.Builder, EnrichedAddressOrBuilder> singleFieldBuilderV3 = this.addressBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            EnrichedAddress enrichedAddress = this.address_;
            return enrichedAddress == null ? EnrichedAddress.getDefaultInstance() : enrichedAddress;
        }

        public RequestCtx getContext() {
            SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            RequestCtx requestCtx = this.context_;
            return requestCtx == null ? RequestCtx.getDefaultInstance() : requestCtx;
        }

        public RequestCtx.Builder getContextBuilder() {
            onChanged();
            return getContextFieldBuilder().getBuilder();
        }

        public RequestCtxOrBuilder getContextOrBuilder() {
            SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            RequestCtx requestCtx = this.context_;
            return requestCtx == null ? RequestCtx.getDefaultInstance() : requestCtx;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsRequest_descriptor;
        }

        public InstructorDetails getInstructor() {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            InstructorDetails instructorDetails = this.instructor_;
            return instructorDetails == null ? InstructorDetails.getDefaultInstance() : instructorDetails;
        }

        public InstructorDetails.Builder getInstructorBuilder() {
            onChanged();
            return getInstructorFieldBuilder().getBuilder();
        }

        public InstructorDetailsOrBuilder getInstructorOrBuilder() {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            InstructorDetails instructorDetails = this.instructor_;
            return instructorDetails == null ? InstructorDetails.getDefaultInstance() : instructorDetails;
        }

        public TaskType getTaskType() {
            TaskType valueOf = TaskType.valueOf(this.taskType_);
            return valueOf == null ? TaskType.UNRECOGNIZED : valueOf;
        }

        public int getTaskTypeValue() {
            return this.taskType_;
        }

        public boolean hasAddress() {
            return (this.addressBuilder_ == null && this.address_ == null) ? false : true;
        }

        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        public boolean hasInstructor() {
            return (this.instructorBuilder_ == null && this.instructor_ == null) ? false : true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PreOrderEligibleInstructionsRequest.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAddress(EnrichedAddress enrichedAddress) {
            SingleFieldBuilderV3<EnrichedAddress, EnrichedAddress.Builder, EnrichedAddressOrBuilder> singleFieldBuilderV3 = this.addressBuilder_;
            if (singleFieldBuilderV3 == null) {
                EnrichedAddress enrichedAddress2 = this.address_;
                if (enrichedAddress2 != null) {
                    this.address_ = EnrichedAddress.newBuilder(enrichedAddress2).mergeFrom(enrichedAddress).buildPartial();
                } else {
                    this.address_ = enrichedAddress;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(enrichedAddress);
            }
            return this;
        }

        public Builder mergeContext(RequestCtx requestCtx) {
            SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                RequestCtx requestCtx2 = this.context_;
                if (requestCtx2 != null) {
                    this.context_ = RequestCtx.newBuilder(requestCtx2).mergeFrom(requestCtx).buildPartial();
                } else {
                    this.context_ = requestCtx;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(requestCtx);
            }
            return this;
        }

        public Builder mergeInstructor(InstructorDetails instructorDetails) {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 == null) {
                InstructorDetails instructorDetails2 = this.instructor_;
                if (instructorDetails2 != null) {
                    this.instructor_ = InstructorDetails.newBuilder(instructorDetails2).mergeFrom(instructorDetails).buildPartial();
                } else {
                    this.instructor_ = instructorDetails;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(instructorDetails);
            }
            return this;
        }

        public Builder setAddress(EnrichedAddress enrichedAddress) {
            SingleFieldBuilderV3<EnrichedAddress, EnrichedAddress.Builder, EnrichedAddressOrBuilder> singleFieldBuilderV3 = this.addressBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(enrichedAddress);
                this.address_ = enrichedAddress;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(enrichedAddress);
            }
            return this;
        }

        public Builder setContext(RequestCtx requestCtx) {
            SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(requestCtx);
                this.context_ = requestCtx;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(requestCtx);
            }
            return this;
        }

        public Builder setInstructor(InstructorDetails instructorDetails) {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(instructorDetails);
                this.instructor_ = instructorDetails;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(instructorDetails);
            }
            return this;
        }

        public Builder setTaskType(TaskType taskType) {
            Objects.requireNonNull(taskType);
            this.taskType_ = taskType.getNumber();
            onChanged();
            return this;
        }

        public Builder setTaskTypeValue(int i11) {
            this.taskType_ = i11;
            onChanged();
            return this;
        }

        private Builder() {
            this.taskType_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public PreOrderEligibleInstructionsRequest build() {
            PreOrderEligibleInstructionsRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public PreOrderEligibleInstructionsRequest buildPartial() {
            PreOrderEligibleInstructionsRequest preOrderEligibleInstructionsRequest = new PreOrderEligibleInstructionsRequest((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                RequestCtx unused = preOrderEligibleInstructionsRequest.context_ = this.context_;
            } else {
                RequestCtx unused2 = preOrderEligibleInstructionsRequest.context_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV32 = this.instructorBuilder_;
            if (singleFieldBuilderV32 == null) {
                InstructorDetails unused3 = preOrderEligibleInstructionsRequest.instructor_ = this.instructor_;
            } else {
                InstructorDetails unused4 = preOrderEligibleInstructionsRequest.instructor_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<EnrichedAddress, EnrichedAddress.Builder, EnrichedAddressOrBuilder> singleFieldBuilderV33 = this.addressBuilder_;
            if (singleFieldBuilderV33 == null) {
                EnrichedAddress unused5 = preOrderEligibleInstructionsRequest.address_ = this.address_;
            } else {
                EnrichedAddress unused6 = preOrderEligibleInstructionsRequest.address_ = singleFieldBuilderV33.build();
            }
            int unused7 = preOrderEligibleInstructionsRequest.taskType_ = this.taskType_;
            onBuilt();
            return preOrderEligibleInstructionsRequest;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public PreOrderEligibleInstructionsRequest getDefaultInstanceForType() {
            return PreOrderEligibleInstructionsRequest.getDefaultInstance();
        }

        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i11, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i11, obj);
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public Builder clear() {
            super.clear();
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            if (this.instructorBuilder_ == null) {
                this.instructor_ = null;
            } else {
                this.instructor_ = null;
                this.instructorBuilder_ = null;
            }
            if (this.addressBuilder_ == null) {
                this.address_ = null;
            } else {
                this.address_ = null;
                this.addressBuilder_ = null;
            }
            this.taskType_ = 0;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.taskType_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder setAddress(EnrichedAddress.Builder builder) {
            SingleFieldBuilderV3<EnrichedAddress, EnrichedAddress.Builder, EnrichedAddressOrBuilder> singleFieldBuilderV3 = this.addressBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.address_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setContext(RequestCtx.Builder builder) {
            SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.context_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setInstructor(InstructorDetails.Builder builder) {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.instructor_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof PreOrderEligibleInstructionsRequest) {
                return mergeFrom((PreOrderEligibleInstructionsRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(PreOrderEligibleInstructionsRequest preOrderEligibleInstructionsRequest) {
            if (preOrderEligibleInstructionsRequest == PreOrderEligibleInstructionsRequest.getDefaultInstance()) {
                return this;
            }
            if (preOrderEligibleInstructionsRequest.hasContext()) {
                mergeContext(preOrderEligibleInstructionsRequest.getContext());
            }
            if (preOrderEligibleInstructionsRequest.hasInstructor()) {
                mergeInstructor(preOrderEligibleInstructionsRequest.getInstructor());
            }
            if (preOrderEligibleInstructionsRequest.hasAddress()) {
                mergeAddress(preOrderEligibleInstructionsRequest.getAddress());
            }
            if (preOrderEligibleInstructionsRequest.taskType_ != 0) {
                setTaskTypeValue(preOrderEligibleInstructionsRequest.getTaskTypeValue());
            }
            mergeUnknownFields(preOrderEligibleInstructionsRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest$Builder");
        }
    }

    public static Builder newBuilder(PreOrderEligibleInstructionsRequest preOrderEligibleInstructionsRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(preOrderEligibleInstructionsRequest);
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private PreOrderEligibleInstructionsRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static PreOrderEligibleInstructionsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PreOrderEligibleInstructionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public PreOrderEligibleInstructionsRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private PreOrderEligibleInstructionsRequest() {
        this.memoizedIsInitialized = -1;
        this.taskType_ = 0;
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(InputStream inputStream) throws IOException {
        return (PreOrderEligibleInstructionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx$Builder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails$Builder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress$Builder} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private PreOrderEligibleInstructionsRequest(com.google.protobuf.CodedInputStream r7, com.google.protobuf.ExtensionRegistryLite r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r6 = this;
            r6.<init>()
            java.util.Objects.requireNonNull(r8)
            com.google.protobuf.UnknownFieldSet$Builder r0 = com.google.protobuf.UnknownFieldSet.newBuilder()
            r1 = 0
        L_0x000b:
            if (r1 != 0) goto L_0x00b4
            int r2 = r7.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            r3 = 1
            if (r2 == 0) goto L_0x0094
            r4 = 10
            r5 = 0
            if (r2 == r4) goto L_0x0073
            r4 = 18
            if (r2 == r4) goto L_0x0053
            r4 = 26
            if (r2 == r4) goto L_0x0033
            r4 = 32
            if (r2 == r4) goto L_0x002c
            boolean r2 = r6.parseUnknownField(r7, r0, r8, r2)     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            if (r2 != 0) goto L_0x000b
            goto L_0x0094
        L_0x002c:
            int r2 = r7.readEnum()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            r6.taskType_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            goto L_0x000b
        L_0x0033:
            com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress r2 = r6.address_     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            if (r2 == 0) goto L_0x003b
            com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress$Builder r5 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
        L_0x003b:
            com.google.protobuf.Parser r2 = com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress.parser()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            com.google.protobuf.MessageLite r2 = r7.readMessage(r2, (com.google.protobuf.ExtensionRegistryLite) r8)     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress r2 = (com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress) r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            r6.address_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            if (r5 == 0) goto L_0x000b
            r5.mergeFrom((com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress) r2)     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            com.swiggy.locationplatform.centraladdressservice.v1.EnrichedAddress r2 = r5.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            r6.address_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            goto L_0x000b
        L_0x0053:
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails r2 = r6.instructor_     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            if (r2 == 0) goto L_0x005b
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails$Builder r5 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
        L_0x005b:
            com.google.protobuf.Parser r2 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails.parser()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            com.google.protobuf.MessageLite r2 = r7.readMessage(r2, (com.google.protobuf.ExtensionRegistryLite) r8)     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails r2 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails) r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            r6.instructor_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            if (r5 == 0) goto L_0x000b
            r5.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails) r2)     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails r2 = r5.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            r6.instructor_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            goto L_0x000b
        L_0x0073:
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx r2 = r6.context_     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            if (r2 == 0) goto L_0x007b
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx$Builder r5 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
        L_0x007b:
            com.google.protobuf.Parser r2 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx.parser()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            com.google.protobuf.MessageLite r2 = r7.readMessage(r2, (com.google.protobuf.ExtensionRegistryLite) r8)     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx r2 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx) r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            r6.context_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            if (r5 == 0) goto L_0x000b
            r5.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx) r2)     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx r2 = r5.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            r6.context_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00a4, IOException -> 0x0099 }
            goto L_0x000b
        L_0x0094:
            r1 = 1
            goto L_0x000b
        L_0x0097:
            r7 = move-exception
            goto L_0x00aa
        L_0x0099:
            r7 = move-exception
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0097 }
            r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x0097 }
            com.google.protobuf.InvalidProtocolBufferException r7 = r8.setUnfinishedMessage(r6)     // Catch:{ all -> 0x0097 }
            throw r7     // Catch:{ all -> 0x0097 }
        L_0x00a4:
            r7 = move-exception
            com.google.protobuf.InvalidProtocolBufferException r7 = r7.setUnfinishedMessage(r6)     // Catch:{ all -> 0x0097 }
            throw r7     // Catch:{ all -> 0x0097 }
        L_0x00aa:
            com.google.protobuf.UnknownFieldSet r8 = r0.build()
            r6.unknownFields = r8
            r6.makeExtensionsImmutable()
            throw r7
        L_0x00b4:
            com.google.protobuf.UnknownFieldSet r7 = r0.build()
            r6.unknownFields = r7
            r6.makeExtensionsImmutable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsRequest.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PreOrderEligibleInstructionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PreOrderEligibleInstructionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static PreOrderEligibleInstructionsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PreOrderEligibleInstructionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
