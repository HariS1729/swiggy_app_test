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
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class CreateUpdateInstructionsForOrderResponse extends GeneratedMessageV3 implements CreateUpdateInstructionsForOrderResponseOrBuilder {
    private static final CreateUpdateInstructionsForOrderResponse DEFAULT_INSTANCE = new CreateUpdateInstructionsForOrderResponse();
    public static final int ERROR_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Parser<CreateUpdateInstructionsForOrderResponse> PARSER = new AbstractParser<CreateUpdateInstructionsForOrderResponse>() {
        public CreateUpdateInstructionsForOrderResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CreateUpdateInstructionsForOrderResponse(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int STATUS_CODE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object error_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int statusCode_;

    public static CreateUpdateInstructionsForOrderResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderResponse_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static CreateUpdateInstructionsForOrderResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreateUpdateInstructionsForOrderResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<CreateUpdateInstructionsForOrderResponse> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateUpdateInstructionsForOrderResponse)) {
            return super.equals(obj);
        }
        CreateUpdateInstructionsForOrderResponse createUpdateInstructionsForOrderResponse = (CreateUpdateInstructionsForOrderResponse) obj;
        if (getStatusCode() == createUpdateInstructionsForOrderResponse.getStatusCode() && getError().equals(createUpdateInstructionsForOrderResponse.getError()) && this.unknownFields.equals(createUpdateInstructionsForOrderResponse.unknownFields)) {
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

    public Parser<CreateUpdateInstructionsForOrderResponse> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        int i13 = this.statusCode_;
        if (i13 != 0) {
            i12 = 0 + CodedOutputStream.computeInt32Size(1, i13);
        }
        if (!getErrorBytes().isEmpty()) {
            i12 += GeneratedMessageV3.computeStringSize(2, this.error_);
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
        int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getStatusCode()) * 37) + 2) * 53) + getError().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CreateUpdateInstructionsForOrderResponse.class, Builder.class);
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
        return new CreateUpdateInstructionsForOrderResponse();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i11 = this.statusCode_;
        if (i11 != 0) {
            codedOutputStream.writeInt32(1, i11);
        }
        if (!getErrorBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.error_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CreateUpdateInstructionsForOrderResponseOrBuilder {
        private Object error_;
        private int statusCode_;

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderResponse_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearError() {
            this.error_ = CreateUpdateInstructionsForOrderResponse.getDefaultInstance().getError();
            onChanged();
            return this;
        }

        public Builder clearStatusCode() {
            this.statusCode_ = 0;
            onChanged();
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderResponse_descriptor;
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

        public int getStatusCode() {
            return this.statusCode_;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_CreateUpdateInstructionsForOrderResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CreateUpdateInstructionsForOrderResponse.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
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

        public Builder setStatusCode(int i11) {
            this.statusCode_ = i11;
            onChanged();
            return this;
        }

        private Builder() {
            this.error_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public CreateUpdateInstructionsForOrderResponse build() {
            CreateUpdateInstructionsForOrderResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public CreateUpdateInstructionsForOrderResponse buildPartial() {
            CreateUpdateInstructionsForOrderResponse createUpdateInstructionsForOrderResponse = new CreateUpdateInstructionsForOrderResponse((GeneratedMessageV3.Builder) this);
            int unused = createUpdateInstructionsForOrderResponse.statusCode_ = this.statusCode_;
            Object unused2 = createUpdateInstructionsForOrderResponse.error_ = this.error_;
            onBuilt();
            return createUpdateInstructionsForOrderResponse;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public CreateUpdateInstructionsForOrderResponse getDefaultInstanceForType() {
            return CreateUpdateInstructionsForOrderResponse.getDefaultInstance();
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
            this.statusCode_ = 0;
            this.error_ = "";
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.error_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof CreateUpdateInstructionsForOrderResponse) {
                return mergeFrom((CreateUpdateInstructionsForOrderResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CreateUpdateInstructionsForOrderResponse createUpdateInstructionsForOrderResponse) {
            if (createUpdateInstructionsForOrderResponse == CreateUpdateInstructionsForOrderResponse.getDefaultInstance()) {
                return this;
            }
            if (createUpdateInstructionsForOrderResponse.getStatusCode() != 0) {
                setStatusCode(createUpdateInstructionsForOrderResponse.getStatusCode());
            }
            if (!createUpdateInstructionsForOrderResponse.getError().isEmpty()) {
                this.error_ = createUpdateInstructionsForOrderResponse.error_;
                onChanged();
            }
            mergeUnknownFields(createUpdateInstructionsForOrderResponse.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.CreateUpdateInstructionsForOrderResponse$Builder");
        }
    }

    public static Builder newBuilder(CreateUpdateInstructionsForOrderResponse createUpdateInstructionsForOrderResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(createUpdateInstructionsForOrderResponse);
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private CreateUpdateInstructionsForOrderResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static CreateUpdateInstructionsForOrderResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateUpdateInstructionsForOrderResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public CreateUpdateInstructionsForOrderResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private CreateUpdateInstructionsForOrderResponse() {
        this.memoizedIsInitialized = -1;
        this.error_ = "";
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(InputStream inputStream) throws IOException {
        return (CreateUpdateInstructionsForOrderResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private CreateUpdateInstructionsForOrderResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        while (!z11) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 8) {
                        this.statusCode_ = codedInputStream.readInt32();
                    } else if (readTag == 18) {
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
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateUpdateInstructionsForOrderResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreateUpdateInstructionsForOrderResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CreateUpdateInstructionsForOrderResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateUpdateInstructionsForOrderResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
