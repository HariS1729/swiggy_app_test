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
import com.google.protobuf.UnknownFieldSet;
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class GetInstructionsByOrderRequest extends GeneratedMessageV3 implements GetInstructionsByOrderRequestOrBuilder {
    public static final int CLIENT_ORDER_ID_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final GetInstructionsByOrderRequest DEFAULT_INSTANCE = new GetInstructionsByOrderRequest();
    /* access modifiers changed from: private */
    public static final Parser<GetInstructionsByOrderRequest> PARSER = new AbstractParser<GetInstructionsByOrderRequest>() {
        public GetInstructionsByOrderRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new GetInstructionsByOrderRequest(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object clientOrderId_;
    /* access modifiers changed from: private */
    public RequestCtx context_;
    private byte memoizedIsInitialized;

    public static GetInstructionsByOrderRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderRequest_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GetInstructionsByOrderRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetInstructionsByOrderRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GetInstructionsByOrderRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<GetInstructionsByOrderRequest> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInstructionsByOrderRequest)) {
            return super.equals(obj);
        }
        GetInstructionsByOrderRequest getInstructionsByOrderRequest = (GetInstructionsByOrderRequest) obj;
        if (hasContext() != getInstructionsByOrderRequest.hasContext()) {
            return false;
        }
        if ((!hasContext() || getContext().equals(getInstructionsByOrderRequest.getContext())) && getClientOrderId().equals(getInstructionsByOrderRequest.getClientOrderId()) && this.unknownFields.equals(getInstructionsByOrderRequest.unknownFields)) {
            return true;
        }
        return false;
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

    public Parser<GetInstructionsByOrderRequest> getParserForType() {
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
        if (!getClientOrderIdBytes().isEmpty()) {
            i12 += GeneratedMessageV3.computeStringSize(2, this.clientOrderId_);
        }
        int serializedSize = i12 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasContext() {
        return this.context_ != null;
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
        int hashCode2 = (((((hashCode * 37) + 2) * 53) + getClientOrderId().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstructionsByOrderRequest.class, Builder.class);
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
        return new GetInstructionsByOrderRequest();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.context_ != null) {
            codedOutputStream.writeMessage(1, getContext());
        }
        if (!getClientOrderIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.clientOrderId_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetInstructionsByOrderRequestOrBuilder {
        private Object clientOrderId_;
        private SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> contextBuilder_;
        private RequestCtx context_;

        private SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new SingleFieldBuilderV3<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderRequest_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearClientOrderId() {
            this.clientOrderId_ = GetInstructionsByOrderRequest.getDefaultInstance().getClientOrderId();
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
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderRequest_descriptor;
        }

        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsByOrderRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstructionsByOrderRequest.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
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

        private Builder() {
            this.clientOrderId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public GetInstructionsByOrderRequest build() {
            GetInstructionsByOrderRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public GetInstructionsByOrderRequest buildPartial() {
            GetInstructionsByOrderRequest getInstructionsByOrderRequest = new GetInstructionsByOrderRequest((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                RequestCtx unused = getInstructionsByOrderRequest.context_ = this.context_;
            } else {
                RequestCtx unused2 = getInstructionsByOrderRequest.context_ = singleFieldBuilderV3.build();
            }
            Object unused3 = getInstructionsByOrderRequest.clientOrderId_ = this.clientOrderId_;
            onBuilt();
            return getInstructionsByOrderRequest;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public GetInstructionsByOrderRequest getDefaultInstanceForType() {
            return GetInstructionsByOrderRequest.getDefaultInstance();
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
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.clientOrderId_ = "";
            maybeForceBuilderInitialization();
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

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof GetInstructionsByOrderRequest) {
                return mergeFrom((GetInstructionsByOrderRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GetInstructionsByOrderRequest getInstructionsByOrderRequest) {
            if (getInstructionsByOrderRequest == GetInstructionsByOrderRequest.getDefaultInstance()) {
                return this;
            }
            if (getInstructionsByOrderRequest.hasContext()) {
                mergeContext(getInstructionsByOrderRequest.getContext());
            }
            if (!getInstructionsByOrderRequest.getClientOrderId().isEmpty()) {
                this.clientOrderId_ = getInstructionsByOrderRequest.clientOrderId_;
                onChanged();
            }
            mergeUnknownFields(getInstructionsByOrderRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsByOrderRequest$Builder");
        }
    }

    public static Builder newBuilder(GetInstructionsByOrderRequest getInstructionsByOrderRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(getInstructionsByOrderRequest);
    }

    public static GetInstructionsByOrderRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private GetInstructionsByOrderRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static GetInstructionsByOrderRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetInstructionsByOrderRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetInstructionsByOrderRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public GetInstructionsByOrderRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static GetInstructionsByOrderRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private GetInstructionsByOrderRequest() {
        this.memoizedIsInitialized = -1;
        this.clientOrderId_ = "";
    }

    public static GetInstructionsByOrderRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static GetInstructionsByOrderRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GetInstructionsByOrderRequest parseFrom(InputStream inputStream) throws IOException {
        return (GetInstructionsByOrderRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private GetInstructionsByOrderRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        while (!z11) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 10) {
                        RequestCtx.Builder builder = null;
                        RequestCtx requestCtx = this.context_;
                        builder = requestCtx != null ? requestCtx.toBuilder() : builder;
                        RequestCtx requestCtx2 = (RequestCtx) codedInputStream.readMessage(RequestCtx.parser(), extensionRegistryLite);
                        this.context_ = requestCtx2;
                        if (builder != null) {
                            builder.mergeFrom(requestCtx2);
                            this.context_ = builder.buildPartial();
                        }
                    } else if (readTag == 18) {
                        this.clientOrderId_ = codedInputStream.readStringRequireUtf8();
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

    public static GetInstructionsByOrderRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetInstructionsByOrderRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetInstructionsByOrderRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetInstructionsByOrderRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static GetInstructionsByOrderRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetInstructionsByOrderRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
