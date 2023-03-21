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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class GetInstructionsRequest extends GeneratedMessageV3 implements GetInstructionsRequestOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final GetInstructionsRequest DEFAULT_INSTANCE = new GetInstructionsRequest();
    public static final int IDS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Parser<GetInstructionsRequest> PARSER = new AbstractParser<GetInstructionsRequest>() {
        public GetInstructionsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new GetInstructionsRequest(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public RequestCtx context_;
    /* access modifiers changed from: private */
    public LazyStringList ids_;
    private byte memoizedIsInitialized;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetInstructionsRequestOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> contextBuilder_;
        private RequestCtx context_;
        private LazyStringList ids_;

        private void ensureIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.ids_ = new LazyStringArrayList(this.ids_);
                this.bitField0_ |= 1;
            }
        }

        private SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new SingleFieldBuilderV3<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsRequest_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder addAllIds(Iterable<String> iterable) {
            ensureIdsIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.ids_);
            onChanged();
            return this;
        }

        public Builder addIds(String str) {
            Objects.requireNonNull(str);
            ensureIdsIsMutable();
            this.ids_.add(str);
            onChanged();
            return this;
        }

        public Builder addIdsBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureIdsIsMutable();
            this.ids_.add(byteString);
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

        public Builder clearIds() {
            this.ids_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            onChanged();
            return this;
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
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsRequest_descriptor;
        }

        public String getIds(int i11) {
            return (String) this.ids_.get(i11);
        }

        public ByteString getIdsBytes(int i11) {
            return this.ids_.getByteString(i11);
        }

        public int getIdsCount() {
            return this.ids_.size();
        }

        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstructionsRequest.class, Builder.class);
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

        public Builder setIds(int i11, String str) {
            Objects.requireNonNull(str);
            ensureIdsIsMutable();
            this.ids_.set(i11, str);
            onChanged();
            return this;
        }

        public ProtocolStringList getIdsList() {
            return this.ids_.getUnmodifiableView();
        }

        private Builder() {
            this.ids_ = LazyStringArrayList.EMPTY;
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public GetInstructionsRequest build() {
            GetInstructionsRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public GetInstructionsRequest buildPartial() {
            GetInstructionsRequest getInstructionsRequest = new GetInstructionsRequest((GeneratedMessageV3.Builder) this);
            SingleFieldBuilderV3<RequestCtx, RequestCtx.Builder, RequestCtxOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                RequestCtx unused = getInstructionsRequest.context_ = this.context_;
            } else {
                RequestCtx unused2 = getInstructionsRequest.context_ = singleFieldBuilderV3.build();
            }
            if ((this.bitField0_ & 1) != 0) {
                this.ids_ = this.ids_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            LazyStringList unused3 = getInstructionsRequest.ids_ = this.ids_;
            onBuilt();
            return getInstructionsRequest;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public GetInstructionsRequest getDefaultInstanceForType() {
            return GetInstructionsRequest.getDefaultInstance();
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
            this.ids_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.ids_ = LazyStringArrayList.EMPTY;
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
            if (message instanceof GetInstructionsRequest) {
                return mergeFrom((GetInstructionsRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GetInstructionsRequest getInstructionsRequest) {
            if (getInstructionsRequest == GetInstructionsRequest.getDefaultInstance()) {
                return this;
            }
            if (getInstructionsRequest.hasContext()) {
                mergeContext(getInstructionsRequest.getContext());
            }
            if (!getInstructionsRequest.ids_.isEmpty()) {
                if (this.ids_.isEmpty()) {
                    this.ids_ = getInstructionsRequest.ids_;
                    this.bitField0_ &= -2;
                } else {
                    ensureIdsIsMutable();
                    this.ids_.addAll(getInstructionsRequest.ids_);
                }
                onChanged();
            }
            mergeUnknownFields(getInstructionsRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.GetInstructionsRequest$Builder");
        }
    }

    public static GetInstructionsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsRequest_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GetInstructionsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetInstructionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GetInstructionsRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<GetInstructionsRequest> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInstructionsRequest)) {
            return super.equals(obj);
        }
        GetInstructionsRequest getInstructionsRequest = (GetInstructionsRequest) obj;
        if (hasContext() != getInstructionsRequest.hasContext()) {
            return false;
        }
        if ((!hasContext() || getContext().equals(getInstructionsRequest.getContext())) && getIdsList().equals(getInstructionsRequest.getIdsList()) && this.unknownFields.equals(getInstructionsRequest.unknownFields)) {
            return true;
        }
        return false;
    }

    public RequestCtx getContext() {
        RequestCtx requestCtx = this.context_;
        return requestCtx == null ? RequestCtx.getDefaultInstance() : requestCtx;
    }

    public RequestCtxOrBuilder getContextOrBuilder() {
        return getContext();
    }

    public String getIds(int i11) {
        return (String) this.ids_.get(i11);
    }

    public ByteString getIdsBytes(int i11) {
        return this.ids_.getByteString(i11);
    }

    public int getIdsCount() {
        return this.ids_.size();
    }

    public Parser<GetInstructionsRequest> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeMessageSize = this.context_ != null ? CodedOutputStream.computeMessageSize(1, getContext()) + 0 : 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.ids_.size(); i13++) {
            i12 += GeneratedMessageV3.computeStringSizeNoTag(this.ids_.getRaw(i13));
        }
        int size = computeMessageSize + i12 + (getIdsList().size() * 1) + this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
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
        if (getIdsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getIdsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_GetInstructionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetInstructionsRequest.class, Builder.class);
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
        return new GetInstructionsRequest();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.context_ != null) {
            codedOutputStream.writeMessage(1, getContext());
        }
        for (int i11 = 0; i11 < this.ids_.size(); i11++) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.ids_.getRaw(i11));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Builder newBuilder(GetInstructionsRequest getInstructionsRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(getInstructionsRequest);
    }

    public static GetInstructionsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public ProtocolStringList getIdsList() {
        return this.ids_;
    }

    private GetInstructionsRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static GetInstructionsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetInstructionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetInstructionsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public GetInstructionsRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static GetInstructionsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private GetInstructionsRequest() {
        this.memoizedIsInitialized = -1;
        this.ids_ = LazyStringArrayList.EMPTY;
    }

    public static GetInstructionsRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static GetInstructionsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GetInstructionsRequest parseFrom(InputStream inputStream) throws IOException {
        return (GetInstructionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private GetInstructionsRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                        if (!z12 || !true) {
                            this.ids_ = new LazyStringArrayList();
                            z12 |= true;
                        }
                        this.ids_.add(readStringRequireUtf8);
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
                    this.ids_ = this.ids_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z12 && true) {
            this.ids_ = this.ids_.getUnmodifiableView();
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static GetInstructionsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetInstructionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GetInstructionsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetInstructionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static GetInstructionsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetInstructionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
