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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueOrBuilder;
import com.google.protobuf.UnknownFieldSet;
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping;
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class CreateUpdateInstructionsForOrderRequest extends GeneratedMessageV3 implements CreateUpdateInstructionsForOrderRequestOrBuilder {
    public static final int CAS_ADDRESS_ID_FIELD_NUMBER = 5;
    public static final int CLIENT_ORDER_ID_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final CreateUpdateInstructionsForOrderRequest DEFAULT_INSTANCE = new CreateUpdateInstructionsForOrderRequest();
    public static final int MAPPING_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Parser<CreateUpdateInstructionsForOrderRequest> PARSER = new AbstractParser<CreateUpdateInstructionsForOrderRequest>() {
        public CreateUpdateInstructionsForOrderRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CreateUpdateInstructionsForOrderRequest(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int PAYMENT_METHOD_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public StringValue casAddressId_;
    /* access modifiers changed from: private */
    public volatile Object clientOrderId_;
    /* access modifiers changed from: private */
    public RequestCtx context_;
    /* access modifiers changed from: private */
    public InstructionsMapping mapping_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public StringValue paymentMethod_;

    public static CreateUpdateInstructionsForOrderRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderRequest_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static CreateUpdateInstructionsForOrderRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreateUpdateInstructionsForOrderRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<CreateUpdateInstructionsForOrderRequest> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateUpdateInstructionsForOrderRequest)) {
            return super.equals(obj);
        }
        CreateUpdateInstructionsForOrderRequest createUpdateInstructionsForOrderRequest = (CreateUpdateInstructionsForOrderRequest) obj;
        if (hasContext() != createUpdateInstructionsForOrderRequest.hasContext()) {
            return false;
        }
        if ((hasContext() && !getContext().equals(createUpdateInstructionsForOrderRequest.getContext())) || !getClientOrderId().equals(createUpdateInstructionsForOrderRequest.getClientOrderId()) || hasMapping() != createUpdateInstructionsForOrderRequest.hasMapping()) {
            return false;
        }
        if ((hasMapping() && !getMapping().equals(createUpdateInstructionsForOrderRequest.getMapping())) || hasPaymentMethod() != createUpdateInstructionsForOrderRequest.hasPaymentMethod()) {
            return false;
        }
        if ((hasPaymentMethod() && !getPaymentMethod().equals(createUpdateInstructionsForOrderRequest.getPaymentMethod())) || hasCasAddressId() != createUpdateInstructionsForOrderRequest.hasCasAddressId()) {
            return false;
        }
        if ((!hasCasAddressId() || getCasAddressId().equals(createUpdateInstructionsForOrderRequest.getCasAddressId())) && this.unknownFields.equals(createUpdateInstructionsForOrderRequest.unknownFields)) {
            return true;
        }
        return false;
    }

    public StringValue getCasAddressId() {
        StringValue stringValue = this.casAddressId_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValueOrBuilder getCasAddressIdOrBuilder() {
        return getCasAddressId();
    }

    public String getClientOrderId() {
        Object obj = this.clientOrderId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.clientOrderId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getClientOrderIdBytes() {
        Object obj = this.clientOrderId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.clientOrderId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public RequestCtx getContext() {
        RequestCtx requestCtx = this.context_;
        return requestCtx == null ? RequestCtx.getDefaultInstance() : requestCtx;
    }

    public RequestCtxOrBuilder getContextOrBuilder() {
        return getContext();
    }

    public InstructionsMapping getMapping() {
        InstructionsMapping instructionsMapping = this.mapping_;
        return instructionsMapping == null ? InstructionsMapping.getDefaultInstance() : instructionsMapping;
    }

    public InstructionsMappingOrBuilder getMappingOrBuilder() {
        return getMapping();
    }

    public Parser<CreateUpdateInstructionsForOrderRequest> getParserForType() {
        return PARSER;
    }

    public StringValue getPaymentMethod() {
        StringValue stringValue = this.paymentMethod_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public StringValueOrBuilder getPaymentMethodOrBuilder() {
        return getPaymentMethod();
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
        if (!getClientOrderIdBytes().isEmpty()) {
            i12 += GeneratedMessageV3.computeStringSize(2, this.clientOrderId_);
        }
        if (this.mapping_ != null) {
            i12 += CodedOutputStream.computeMessageSize(3, getMapping());
        }
        if (this.paymentMethod_ != null) {
            i12 += CodedOutputStream.computeMessageSize(4, getPaymentMethod());
        }
        if (this.casAddressId_ != null) {
            i12 += CodedOutputStream.computeMessageSize(5, getCasAddressId());
        }
        int serializedSize = i12 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasCasAddressId() {
        return this.casAddressId_ != null;
    }

    public boolean hasContext() {
        return this.context_ != null;
    }

    public boolean hasMapping() {
        return this.mapping_ != null;
    }

    public boolean hasPaymentMethod() {
        return this.paymentMethod_ != null;
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
        int hashCode2 = (((hashCode * 37) + 2) * 53) + getClientOrderId().hashCode();
        if (hasMapping()) {
            hashCode2 = (((hashCode2 * 37) + 3) * 53) + getMapping().hashCode();
        }
        if (hasPaymentMethod()) {
            hashCode2 = (((hashCode2 * 37) + 4) * 53) + getPaymentMethod().hashCode();
        }
        if (hasCasAddressId()) {
            hashCode2 = (((hashCode2 * 37) + 5) * 53) + getCasAddressId().hashCode();
        }
        int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode3;
        return hashCode3;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CreateUpdateInstructionsForOrderRequest.class, Builder.class);
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
        return new CreateUpdateInstructionsForOrderRequest();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.context_ != null) {
            codedOutputStream.writeMessage(1, getContext());
        }
        if (!getClientOrderIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.clientOrderId_);
        }
        if (this.mapping_ != null) {
            codedOutputStream.writeMessage(3, getMapping());
        }
        if (this.paymentMethod_ != null) {
            codedOutputStream.writeMessage(4, getPaymentMethod());
        }
        if (this.casAddressId_ != null) {
            codedOutputStream.writeMessage(5, getCasAddressId());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CreateUpdateInstructionsForOrderRequestOrBuilder {
        private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> casAddressIdBuilder_;
        private StringValue casAddressId_;
        private Object clientOrderId_;
        private SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> contextBuilder_;
        private RequestCtx context_;
        private SingleFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> mappingBuilder_;
        private InstructionsMapping mapping_;
        private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> paymentMethodBuilder_;
        private StringValue paymentMethod_;

        private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getCasAddressIdFieldBuilder() {
            if (this.casAddressIdBuilder_ == null) {
                this.casAddressIdBuilder_ = new SingleFieldBuilderV3<>(getCasAddressId(), getParentForChildren(), isClean());
                this.casAddressId_ = null;
            }
            return this.casAddressIdBuilder_;
        }

        private SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new SingleFieldBuilderV3<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderRequest_descriptor;
        }

        private SingleFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> getMappingFieldBuilder() {
            if (this.mappingBuilder_ == null) {
                this.mappingBuilder_ = new SingleFieldBuilderV3<>(getMapping(), getParentForChildren(), isClean());
                this.mapping_ = null;
            }
            return this.mappingBuilder_;
        }

        private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getPaymentMethodFieldBuilder() {
            if (this.paymentMethodBuilder_ == null) {
                this.paymentMethodBuilder_ = new SingleFieldBuilderV3<>(getPaymentMethod(), getParentForChildren(), isClean());
                this.paymentMethod_ = null;
            }
            return this.paymentMethodBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearCasAddressId() {
            if (this.casAddressIdBuilder_ == null) {
                this.casAddressId_ = null;
                onChanged();
            } else {
                this.casAddressId_ = null;
                this.casAddressIdBuilder_ = null;
            }
            return this;
        }

        public Builder clearClientOrderId() {
            this.clientOrderId_ = CreateUpdateInstructionsForOrderRequest.getDefaultInstance().getClientOrderId();
            onChanged();
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

        public Builder clearMapping() {
            if (this.mappingBuilder_ == null) {
                this.mapping_ = null;
                onChanged();
            } else {
                this.mapping_ = null;
                this.mappingBuilder_ = null;
            }
            return this;
        }

        public Builder clearPaymentMethod() {
            if (this.paymentMethodBuilder_ == null) {
                this.paymentMethod_ = null;
                onChanged();
            } else {
                this.paymentMethod_ = null;
                this.paymentMethodBuilder_ = null;
            }
            return this;
        }

        public StringValue getCasAddressId() {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.casAddressIdBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            StringValue stringValue = this.casAddressId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getCasAddressIdBuilder() {
            onChanged();
            return getCasAddressIdFieldBuilder().getBuilder();
        }

        public StringValueOrBuilder getCasAddressIdOrBuilder() {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.casAddressIdBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.casAddressId_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public String getClientOrderId() {
            Object obj = this.clientOrderId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.clientOrderId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getClientOrderIdBytes() {
            Object obj = this.clientOrderId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.clientOrderId_ = copyFromUtf8;
            return copyFromUtf8;
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
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderRequest_descriptor;
        }

        public InstructionsMapping getMapping() {
            SingleFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> singleFieldBuilderV3 = this.mappingBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            InstructionsMapping instructionsMapping = this.mapping_;
            return instructionsMapping == null ? InstructionsMapping.getDefaultInstance() : instructionsMapping;
        }

        public InstructionsMapping.Builder getMappingBuilder() {
            onChanged();
            return getMappingFieldBuilder().getBuilder();
        }

        public InstructionsMappingOrBuilder getMappingOrBuilder() {
            SingleFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> singleFieldBuilderV3 = this.mappingBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            InstructionsMapping instructionsMapping = this.mapping_;
            return instructionsMapping == null ? InstructionsMapping.getDefaultInstance() : instructionsMapping;
        }

        public StringValue getPaymentMethod() {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.paymentMethodBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            StringValue stringValue = this.paymentMethod_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public StringValue.Builder getPaymentMethodBuilder() {
            onChanged();
            return getPaymentMethodFieldBuilder().getBuilder();
        }

        public StringValueOrBuilder getPaymentMethodOrBuilder() {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.paymentMethodBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.paymentMethod_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        public boolean hasCasAddressId() {
            return (this.casAddressIdBuilder_ == null && this.casAddressId_ == null) ? false : true;
        }

        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        public boolean hasMapping() {
            return (this.mappingBuilder_ == null && this.mapping_ == null) ? false : true;
        }

        public boolean hasPaymentMethod() {
            return (this.paymentMethodBuilder_ == null && this.paymentMethod_ == null) ? false : true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CreateUpdateInstructionsForOrderRequest.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeCasAddressId(StringValue stringValue) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.casAddressIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.casAddressId_;
                if (stringValue2 != null) {
                    this.casAddressId_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.casAddressId_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
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

        public Builder mergeMapping(InstructionsMapping instructionsMapping) {
            SingleFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> singleFieldBuilderV3 = this.mappingBuilder_;
            if (singleFieldBuilderV3 == null) {
                InstructionsMapping instructionsMapping2 = this.mapping_;
                if (instructionsMapping2 != null) {
                    this.mapping_ = InstructionsMapping.newBuilder(instructionsMapping2).mergeFrom(instructionsMapping).buildPartial();
                } else {
                    this.mapping_ = instructionsMapping;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(instructionsMapping);
            }
            return this;
        }

        public Builder mergePaymentMethod(StringValue stringValue) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.paymentMethodBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.paymentMethod_;
                if (stringValue2 != null) {
                    this.paymentMethod_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.paymentMethod_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder setCasAddressId(StringValue stringValue) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.casAddressIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(stringValue);
                this.casAddressId_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setClientOrderId(String str) {
            Objects.requireNonNull(str);
            this.clientOrderId_ = str;
            onChanged();
            return this;
        }

        public Builder setClientOrderIdBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.clientOrderId_ = byteString;
            onChanged();
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

        public Builder setMapping(InstructionsMapping instructionsMapping) {
            SingleFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> singleFieldBuilderV3 = this.mappingBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(instructionsMapping);
                this.mapping_ = instructionsMapping;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(instructionsMapping);
            }
            return this;
        }

        public Builder setPaymentMethod(StringValue stringValue) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.paymentMethodBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(stringValue);
                this.paymentMethod_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        private Builder() {
            this.clientOrderId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public CreateUpdateInstructionsForOrderRequest build() {
            CreateUpdateInstructionsForOrderRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public CreateUpdateInstructionsForOrderRequest buildPartial() {
            CreateUpdateInstructionsForOrderRequest createUpdateInstructionsForOrderRequest = new CreateUpdateInstructionsForOrderRequest((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                RequestCtx unused = createUpdateInstructionsForOrderRequest.context_ = this.context_;
            } else {
                RequestCtx unused2 = createUpdateInstructionsForOrderRequest.context_ = singleFieldBuilderV3.build();
            }
            Object unused3 = createUpdateInstructionsForOrderRequest.clientOrderId_ = this.clientOrderId_;
            SingleFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> singleFieldBuilderV32 = this.mappingBuilder_;
            if (singleFieldBuilderV32 == null) {
                InstructionsMapping unused4 = createUpdateInstructionsForOrderRequest.mapping_ = this.mapping_;
            } else {
                InstructionsMapping unused5 = createUpdateInstructionsForOrderRequest.mapping_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV33 = this.paymentMethodBuilder_;
            if (singleFieldBuilderV33 == null) {
                StringValue unused6 = createUpdateInstructionsForOrderRequest.paymentMethod_ = this.paymentMethod_;
            } else {
                StringValue unused7 = createUpdateInstructionsForOrderRequest.paymentMethod_ = singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV34 = this.casAddressIdBuilder_;
            if (singleFieldBuilderV34 == null) {
                StringValue unused8 = createUpdateInstructionsForOrderRequest.casAddressId_ = this.casAddressId_;
            } else {
                StringValue unused9 = createUpdateInstructionsForOrderRequest.casAddressId_ = singleFieldBuilderV34.build();
            }
            onBuilt();
            return createUpdateInstructionsForOrderRequest;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public CreateUpdateInstructionsForOrderRequest getDefaultInstanceForType() {
            return CreateUpdateInstructionsForOrderRequest.getDefaultInstance();
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
            this.clientOrderId_ = "";
            if (this.mappingBuilder_ == null) {
                this.mapping_ = null;
            } else {
                this.mapping_ = null;
                this.mappingBuilder_ = null;
            }
            if (this.paymentMethodBuilder_ == null) {
                this.paymentMethod_ = null;
            } else {
                this.paymentMethod_ = null;
                this.paymentMethodBuilder_ = null;
            }
            if (this.casAddressIdBuilder_ == null) {
                this.casAddressId_ = null;
            } else {
                this.casAddressId_ = null;
                this.casAddressIdBuilder_ = null;
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.clientOrderId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder setCasAddressId(StringValue.Builder builder) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.casAddressIdBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.casAddressId_ = builder.build();
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

        public Builder setMapping(InstructionsMapping.Builder builder) {
            SingleFieldBuilderV3<InstructionsMapping, InstructionsMapping.Builder, InstructionsMappingOrBuilder> singleFieldBuilderV3 = this.mappingBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.mapping_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setPaymentMethod(StringValue.Builder builder) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.paymentMethodBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.paymentMethod_ = builder.build();
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
            if (message instanceof CreateUpdateInstructionsForOrderRequest) {
                return mergeFrom((CreateUpdateInstructionsForOrderRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CreateUpdateInstructionsForOrderRequest createUpdateInstructionsForOrderRequest) {
            if (createUpdateInstructionsForOrderRequest == CreateUpdateInstructionsForOrderRequest.getDefaultInstance()) {
                return this;
            }
            if (createUpdateInstructionsForOrderRequest.hasContext()) {
                mergeContext(createUpdateInstructionsForOrderRequest.getContext());
            }
            if (!createUpdateInstructionsForOrderRequest.getClientOrderId().isEmpty()) {
                this.clientOrderId_ = createUpdateInstructionsForOrderRequest.clientOrderId_;
                onChanged();
            }
            if (createUpdateInstructionsForOrderRequest.hasMapping()) {
                mergeMapping(createUpdateInstructionsForOrderRequest.getMapping());
            }
            if (createUpdateInstructionsForOrderRequest.hasPaymentMethod()) {
                mergePaymentMethod(createUpdateInstructionsForOrderRequest.getPaymentMethod());
            }
            if (createUpdateInstructionsForOrderRequest.hasCasAddressId()) {
                mergeCasAddressId(createUpdateInstructionsForOrderRequest.getCasAddressId());
            }
            mergeUnknownFields(createUpdateInstructionsForOrderRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest$Builder");
        }
    }

    public static Builder newBuilder(CreateUpdateInstructionsForOrderRequest createUpdateInstructionsForOrderRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(createUpdateInstructionsForOrderRequest);
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private CreateUpdateInstructionsForOrderRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static CreateUpdateInstructionsForOrderRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateUpdateInstructionsForOrderRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public CreateUpdateInstructionsForOrderRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private CreateUpdateInstructionsForOrderRequest() {
        this.memoizedIsInitialized = -1;
        this.clientOrderId_ = "";
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(InputStream inputStream) throws IOException {
        return (CreateUpdateInstructionsForOrderRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx$Builder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping$Builder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.google.protobuf.StringValue$Builder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.google.protobuf.StringValue$Builder} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private CreateUpdateInstructionsForOrderRequest(com.google.protobuf.CodedInputStream r7, com.google.protobuf.ExtensionRegistryLite r8) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r6 = this;
            r6.<init>()
            java.util.Objects.requireNonNull(r8)
            com.google.protobuf.UnknownFieldSet$Builder r0 = com.google.protobuf.UnknownFieldSet.newBuilder()
            r1 = 0
        L_0x000b:
            if (r1 != 0) goto L_0x00db
            int r2 = r7.readTag()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r3 = 1
            if (r2 == 0) goto L_0x00bb
            r4 = 10
            r5 = 0
            if (r2 == r4) goto L_0x009a
            r4 = 18
            if (r2 == r4) goto L_0x0092
            r4 = 26
            if (r2 == r4) goto L_0x0071
            r4 = 34
            if (r2 == r4) goto L_0x0051
            r4 = 42
            if (r2 == r4) goto L_0x0031
            boolean r2 = r6.parseUnknownField(r7, r0, r8, r2)     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            if (r2 != 0) goto L_0x000b
            goto L_0x00bb
        L_0x0031:
            com.google.protobuf.StringValue r2 = r6.casAddressId_     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            if (r2 == 0) goto L_0x0039
            com.google.protobuf.StringValue$Builder r5 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
        L_0x0039:
            com.google.protobuf.Parser r2 = com.google.protobuf.StringValue.parser()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.google.protobuf.MessageLite r2 = r7.readMessage(r2, (com.google.protobuf.ExtensionRegistryLite) r8)     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.google.protobuf.StringValue r2 = (com.google.protobuf.StringValue) r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r6.casAddressId_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            if (r5 == 0) goto L_0x000b
            r5.mergeFrom((com.google.protobuf.StringValue) r2)     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.google.protobuf.StringValue r2 = r5.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r6.casAddressId_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            goto L_0x000b
        L_0x0051:
            com.google.protobuf.StringValue r2 = r6.paymentMethod_     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            if (r2 == 0) goto L_0x0059
            com.google.protobuf.StringValue$Builder r5 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
        L_0x0059:
            com.google.protobuf.Parser r2 = com.google.protobuf.StringValue.parser()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.google.protobuf.MessageLite r2 = r7.readMessage(r2, (com.google.protobuf.ExtensionRegistryLite) r8)     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.google.protobuf.StringValue r2 = (com.google.protobuf.StringValue) r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r6.paymentMethod_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            if (r5 == 0) goto L_0x000b
            r5.mergeFrom((com.google.protobuf.StringValue) r2)     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.google.protobuf.StringValue r2 = r5.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r6.paymentMethod_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            goto L_0x000b
        L_0x0071:
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping r2 = r6.mapping_     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            if (r2 == 0) goto L_0x0079
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping$Builder r5 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
        L_0x0079:
            com.google.protobuf.Parser r2 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping.parser()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.google.protobuf.MessageLite r2 = r7.readMessage(r2, (com.google.protobuf.ExtensionRegistryLite) r8)     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping r2 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping) r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r6.mapping_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            if (r5 == 0) goto L_0x000b
            r5.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping) r2)     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping r2 = r5.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r6.mapping_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            goto L_0x000b
        L_0x0092:
            java.lang.String r2 = r7.readStringRequireUtf8()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r6.clientOrderId_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            goto L_0x000b
        L_0x009a:
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx r2 = r6.context_     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            if (r2 == 0) goto L_0x00a2
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx$Builder r5 = r2.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
        L_0x00a2:
            com.google.protobuf.Parser r2 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx.parser()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.google.protobuf.MessageLite r2 = r7.readMessage(r2, (com.google.protobuf.ExtensionRegistryLite) r8)     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx r2 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx) r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r6.context_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            if (r5 == 0) goto L_0x000b
            r5.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx) r2)     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx r2 = r5.buildPartial()     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            r6.context_ = r2     // Catch:{ InvalidProtocolBufferException -> 0x00cb, IOException -> 0x00c0 }
            goto L_0x000b
        L_0x00bb:
            r1 = 1
            goto L_0x000b
        L_0x00be:
            r7 = move-exception
            goto L_0x00d1
        L_0x00c0:
            r7 = move-exception
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00be }
            r8.<init>((java.io.IOException) r7)     // Catch:{ all -> 0x00be }
            com.google.protobuf.InvalidProtocolBufferException r7 = r8.setUnfinishedMessage(r6)     // Catch:{ all -> 0x00be }
            throw r7     // Catch:{ all -> 0x00be }
        L_0x00cb:
            r7 = move-exception
            com.google.protobuf.InvalidProtocolBufferException r7 = r7.setUnfinishedMessage(r6)     // Catch:{ all -> 0x00be }
            throw r7     // Catch:{ all -> 0x00be }
        L_0x00d1:
            com.google.protobuf.UnknownFieldSet r8 = r0.build()
            r6.unknownFields = r8
            r6.makeExtensionsImmutable()
            throw r7
        L_0x00db:
            com.google.protobuf.UnknownFieldSet r7 = r0.build()
            r6.unknownFields = r7
            r6.makeExtensionsImmutable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderRequest.<init>(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):void");
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateUpdateInstructionsForOrderRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreateUpdateInstructionsForOrderRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CreateUpdateInstructionsForOrderRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateUpdateInstructionsForOrderRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
