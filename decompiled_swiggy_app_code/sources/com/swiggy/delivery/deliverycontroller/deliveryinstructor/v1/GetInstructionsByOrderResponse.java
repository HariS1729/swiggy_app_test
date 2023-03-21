package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class GetInstructionsByOrderResponse extends GeneratedMessageV3 implements GetInstructionsByOrderResponseOrBuilder {
    private static final GetInstructionsByOrderResponse DEFAULT_INSTANCE = new GetInstructionsByOrderResponse();
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int MAPPING_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Parser<GetInstructionsByOrderResponse> PARSER = new AbstractParser<GetInstructionsByOrderResponse>() {
        public GetInstructionsByOrderResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new GetInstructionsByOrderResponse(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int STATUS_CODE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object error_;
    /* access modifiers changed from: private */
    public List<InstructionsMapping> mapping_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int statusCode_;

    public static GetInstructionsByOrderResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderResponse_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GetInstructionsByOrderResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetInstructionsByOrderResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GetInstructionsByOrderResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<GetInstructionsByOrderResponse> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInstructionsByOrderResponse)) {
            return super.equals(obj);
        }
        GetInstructionsByOrderResponse getInstructionsByOrderResponse = (GetInstructionsByOrderResponse) obj;
        if (getMappingList().equals(getInstructionsByOrderResponse.getMappingList()) && getStatusCode() == getInstructionsByOrderResponse.getStatusCode() && getError().equals(getInstructionsByOrderResponse.getError()) && this.unknownFields.equals(getInstructionsByOrderResponse.unknownFields)) {
            return true;
        }
        return false;
    }

    public String getError() {
        Object obj = this.error_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.error_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getErrorBytes() {
        Object obj = this.error_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.error_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public InstructionsMapping getMapping(int i11) {
        return this.mapping_.get(i11);
    }

    public int getMappingCount() {
        return this.mapping_.size();
    }

    public List<InstructionsMapping> getMappingList() {
        return this.mapping_;
    }

    public InstructionsMappingOrBuilder getMappingOrBuilder(int i11) {
        return this.mapping_.get(i11);
    }

    public List<? extends InstructionsMappingOrBuilder> getMappingOrBuilderList() {
        return this.mapping_;
    }

    public Parser<GetInstructionsByOrderResponse> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.mapping_.size(); i13++) {
            i12 += CodedOutputStream.computeMessageSize(1, this.mapping_.get(i13));
        }
        int i14 = this.statusCode_;
        if (i14 != 0) {
            i12 += CodedOutputStream.computeInt32Size(2, i14);
        }
        if (!getErrorBytes().isEmpty()) {
            i12 += GeneratedMessageV3.computeStringSize(3, this.error_);
        }
        int serializedSize = i12 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public int getStatusCode() {
        return this.statusCode_;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getMappingCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getMappingList().hashCode();
        }
        int statusCode = (((((((((hashCode * 37) + 2) * 53) + getStatusCode()) * 37) + 3) * 53) + getError().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = statusCode;
        return statusCode;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstructionsByOrderResponse.class, Builder.class);
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
        return new GetInstructionsByOrderResponse();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i11 = 0; i11 < this.mapping_.size(); i11++) {
            codedOutputStream.writeMessage(1, this.mapping_.get(i11));
        }
        int i12 = this.statusCode_;
        if (i12 != 0) {
            codedOutputStream.writeInt32(2, i12);
        }
        if (!getErrorBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.error_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetInstructionsByOrderResponseOrBuilder {
        private int bitField0_;
        private Object error_;
        private RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> mappingBuilder_;
        private List<InstructionsMapping> mapping_;
        private int statusCode_;

        private void ensureMappingIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.mapping_ = new ArrayList(this.mapping_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderResponse_descriptor;
        }

        private RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> getMappingFieldBuilder() {
            if (this.mappingBuilder_ == null) {
                List<InstructionsMapping> list = this.mapping_;
                boolean z11 = true;
                if ((this.bitField0_ & 1) == 0) {
                    z11 = false;
                }
                this.mappingBuilder_ = new RepeatedFieldBuilderV3<>(list, z11, getParentForChildren(), isClean());
                this.mapping_ = null;
            }
            return this.mappingBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getMappingFieldBuilder();
            }
        }

        public Builder addAllMapping(Iterable<? extends InstructionsMapping> iterable) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMappingIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.mapping_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addMapping(InstructionsMapping instructionsMapping) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(instructionsMapping);
                ensureMappingIsMutable();
                this.mapping_.add(instructionsMapping);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(instructionsMapping);
            }
            return this;
        }

        public InstructionsMapping.Builder addMappingBuilder() {
            return getMappingFieldBuilder().addBuilder(InstructionsMapping.getDefaultInstance());
        }

        public Builder clearError() {
            this.error_ = GetInstructionsByOrderResponse.getDefaultInstance().getError();
            onChanged();
            return this;
        }

        public Builder clearMapping() {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.mapping_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearStatusCode() {
            this.statusCode_ = 0;
            onChanged();
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderResponse_descriptor;
        }

        public String getError() {
            Object obj = this.error_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.error_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getErrorBytes() {
            Object obj = this.error_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.error_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public InstructionsMapping getMapping(int i11) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.mapping_.get(i11);
            }
            return repeatedFieldBuilderV3.getMessage(i11);
        }

        public InstructionsMapping.Builder getMappingBuilder(int i11) {
            return getMappingFieldBuilder().getBuilder(i11);
        }

        public List<InstructionsMapping.Builder> getMappingBuilderList() {
            return getMappingFieldBuilder().getBuilderList();
        }

        public int getMappingCount() {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.mapping_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public List<InstructionsMapping> getMappingList() {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.mapping_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public InstructionsMappingOrBuilder getMappingOrBuilder(int i11) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.mapping_.get(i11);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i11);
        }

        public List<? extends InstructionsMappingOrBuilder> getMappingOrBuilderList() {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.mapping_);
        }

        public int getStatusCode() {
            return this.statusCode_;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstructionsByOrderResponse.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder removeMapping(int i11) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMappingIsMutable();
                this.mapping_.remove(i11);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i11);
            }
            return this;
        }

        public Builder setError(String str) {
            Objects.requireNonNull(str);
            this.error_ = str;
            onChanged();
            return this;
        }

        public Builder setErrorBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.error_ = byteString;
            onChanged();
            return this;
        }

        public Builder setMapping(int i11, InstructionsMapping instructionsMapping) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(instructionsMapping);
                ensureMappingIsMutable();
                this.mapping_.set(i11, instructionsMapping);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i11, instructionsMapping);
            }
            return this;
        }

        public Builder setStatusCode(int i11) {
            this.statusCode_ = i11;
            onChanged();
            return this;
        }

        private Builder() {
            this.mapping_ = Collections.emptyList();
            this.error_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public GetInstructionsByOrderResponse build() {
            GetInstructionsByOrderResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public GetInstructionsByOrderResponse buildPartial() {
            GetInstructionsByOrderResponse getInstructionsByOrderResponse = new GetInstructionsByOrderResponse((GeneratedMessageV3.Builder) this);
            int i11 = this.bitField0_;
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i11 & 1) != 0) {
                    this.mapping_ = Collections.unmodifiableList(this.mapping_);
                    this.bitField0_ &= -2;
                }
                List unused = getInstructionsByOrderResponse.mapping_ = this.mapping_;
            } else {
                List unused2 = getInstructionsByOrderResponse.mapping_ = repeatedFieldBuilderV3.build();
            }
            int unused3 = getInstructionsByOrderResponse.statusCode_ = this.statusCode_;
            Object unused4 = getInstructionsByOrderResponse.error_ = this.error_;
            onBuilt();
            return getInstructionsByOrderResponse;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public GetInstructionsByOrderResponse getDefaultInstanceForType() {
            return GetInstructionsByOrderResponse.getDefaultInstance();
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

        public InstructionsMapping.Builder addMappingBuilder(int i11) {
            return getMappingFieldBuilder().addBuilder(i11, InstructionsMapping.getDefaultInstance());
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.mapping_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.statusCode_ = 0;
            this.error_ = "";
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.mapping_ = Collections.emptyList();
            this.error_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder addMapping(int i11, InstructionsMapping instructionsMapping) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(instructionsMapping);
                ensureMappingIsMutable();
                this.mapping_.add(i11, instructionsMapping);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i11, instructionsMapping);
            }
            return this;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof GetInstructionsByOrderResponse) {
                return mergeFrom((GetInstructionsByOrderResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMapping(int i11, InstructionsMapping.Builder builder) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMappingIsMutable();
                this.mapping_.set(i11, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i11, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(GetInstructionsByOrderResponse getInstructionsByOrderResponse) {
            if (getInstructionsByOrderResponse == GetInstructionsByOrderResponse.getDefaultInstance()) {
                return this;
            }
            if (this.mappingBuilder_ == null) {
                if (!getInstructionsByOrderResponse.mapping_.isEmpty()) {
                    if (this.mapping_.isEmpty()) {
                        this.mapping_ = getInstructionsByOrderResponse.mapping_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMappingIsMutable();
                        this.mapping_.addAll(getInstructionsByOrderResponse.mapping_);
                    }
                    onChanged();
                }
            } else if (!getInstructionsByOrderResponse.mapping_.isEmpty()) {
                if (this.mappingBuilder_.isEmpty()) {
                    this.mappingBuilder_.dispose();
                    RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = null;
                    this.mappingBuilder_ = null;
                    this.mapping_ = getInstructionsByOrderResponse.mapping_;
                    this.bitField0_ &= -2;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getMappingFieldBuilder();
                    }
                    this.mappingBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.mappingBuilder_.addAllMessages(getInstructionsByOrderResponse.mapping_);
                }
            }
            if (getInstructionsByOrderResponse.getStatusCode() != 0) {
                setStatusCode(getInstructionsByOrderResponse.getStatusCode());
            }
            if (!getInstructionsByOrderResponse.getError().isEmpty()) {
                this.error_ = getInstructionsByOrderResponse.error_;
                onChanged();
            }
            mergeUnknownFields(getInstructionsByOrderResponse.unknownFields);
            onChanged();
            return this;
        }

        public Builder addMapping(InstructionsMapping.Builder builder) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMappingIsMutable();
                this.mapping_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMapping(int i11, InstructionsMapping.Builder builder) {
            RepeatedFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> repeatedFieldBuilderV3 = this.mappingBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMappingIsMutable();
                this.mapping_.add(i11, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i11, builder.build());
            }
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderResponse$Builder");
        }
    }

    public static Builder newBuilder(GetInstructionsByOrderResponse getInstructionsByOrderResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(getInstructionsByOrderResponse);
    }

    public static GetInstructionsByOrderResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private GetInstructionsByOrderResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static GetInstructionsByOrderResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetInstructionsByOrderResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetInstructionsByOrderResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public GetInstructionsByOrderResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static GetInstructionsByOrderResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private GetInstructionsByOrderResponse() {
        this.memoizedIsInitialized = -1;
        this.mapping_ = Collections.emptyList();
        this.error_ = "";
    }

    public static GetInstructionsByOrderResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static GetInstructionsByOrderResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GetInstructionsByOrderResponse parseFrom(InputStream inputStream) throws IOException {
        return (GetInstructionsByOrderResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private GetInstructionsByOrderResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 10) {
                        if (!z12 || !true) {
                            this.mapping_ = new ArrayList();
                            z12 |= true;
                        }
                        this.mapping_.add(codedInputStream.readMessage(InstructionsMapping.parser(), extensionRegistryLite));
                    } else if (readTag == 16) {
                        this.statusCode_ = codedInputStream.readInt32();
                    } else if (readTag == 26) {
                        this.error_ = codedInputStream.readStringRequireUtf8();
                    } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                    }
                }
                z11 = true;
            } catch (InvalidProtocolBufferException e11) {
                throw e11.setUnfinishedMessage(this);
            } catch (IOException e12) {
                throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(this);
            } catch (Throwable th2) {
                if (z12 && true) {
                    this.mapping_ = Collections.unmodifiableList(this.mapping_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z12 && true) {
            this.mapping_ = Collections.unmodifiableList(this.mapping_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static GetInstructionsByOrderResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetInstructionsByOrderResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetInstructionsByOrderResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetInstructionsByOrderResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static GetInstructionsByOrderResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetInstructionsByOrderResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
