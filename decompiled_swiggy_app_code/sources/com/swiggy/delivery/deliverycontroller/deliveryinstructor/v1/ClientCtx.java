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

public final class ClientCtx extends GeneratedMessageV3 implements ClientCtxOrBuilder {
    public static final int CLIENT_ID_FIELD_NUMBER = 2;
    private static final ClientCtx DEFAULT_INSTANCE = new ClientCtx();
    /* access modifiers changed from: private */
    public static final Parser<ClientCtx> PARSER = new AbstractParser<ClientCtx>() {
        public ClientCtx parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ClientCtx(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SOURCE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object clientId_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public volatile Object source_;

    public static ClientCtx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_ClientCtx_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ClientCtx parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClientCtx) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ClientCtx parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<ClientCtx> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientCtx)) {
            return super.equals(obj);
        }
        ClientCtx clientCtx = (ClientCtx) obj;
        if (getSource().equals(clientCtx.getSource()) && getClientId().equals(clientCtx.getClientId()) && this.unknownFields.equals(clientCtx.unknownFields)) {
            return true;
        }
        return false;
    }

    public String getClientId() {
        Object obj = this.clientId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.clientId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getClientIdBytes() {
        Object obj = this.clientId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.clientId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public Parser<ClientCtx> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        if (!getSourceBytes().isEmpty()) {
            i12 = 0 + GeneratedMessageV3.computeStringSize(1, this.source_);
        }
        if (!getClientIdBytes().isEmpty()) {
            i12 += GeneratedMessageV3.computeStringSize(2, this.clientId_);
        }
        int serializedSize = i12 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public String getSource() {
        Object obj = this.source_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.source_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSourceBytes() {
        Object obj = this.source_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.source_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSource().hashCode()) * 37) + 2) * 53) + getClientId().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_ClientCtx_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientCtx.class, Builder.class);
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
        return new ClientCtx();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getSourceBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.source_);
        }
        if (!getClientIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.clientId_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClientCtxOrBuilder {
        private Object clientId_;
        private Object source_;

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_ClientCtx_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearClientId() {
            this.clientId_ = ClientCtx.getDefaultInstance().getClientId();
            onChanged();
            return this;
        }

        public Builder clearSource() {
            this.source_ = ClientCtx.getDefaultInstance().getSource();
            onChanged();
            return this;
        }

        public String getClientId() {
            Object obj = this.clientId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.clientId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getClientIdBytes() {
            Object obj = this.clientId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.clientId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_ClientCtx_descriptor;
        }

        public String getSource() {
            Object obj = this.source_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.source_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSourceBytes() {
            Object obj = this.source_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.source_ = copyFromUtf8;
            return copyFromUtf8;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_ClientCtx_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientCtx.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder setClientId(String str) {
            Objects.requireNonNull(str);
            this.clientId_ = str;
            onChanged();
            return this;
        }

        public Builder setClientIdBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.clientId_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSource(String str) {
            Objects.requireNonNull(str);
            this.source_ = str;
            onChanged();
            return this;
        }

        public Builder setSourceBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.source_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.source_ = "";
            this.clientId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public ClientCtx build() {
            ClientCtx buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public ClientCtx buildPartial() {
            ClientCtx clientCtx = new ClientCtx((GeneratedMessageV3.Builder) this);
            Object unused = clientCtx.source_ = this.source_;
            Object unused2 = clientCtx.clientId_ = this.clientId_;
            onBuilt();
            return clientCtx;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public ClientCtx getDefaultInstanceForType() {
            return ClientCtx.getDefaultInstance();
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
            this.source_ = "";
            this.clientId_ = "";
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.source_ = "";
            this.clientId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof ClientCtx) {
                return mergeFrom((ClientCtx) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ClientCtx clientCtx) {
            if (clientCtx == ClientCtx.getDefaultInstance()) {
                return this;
            }
            if (!clientCtx.getSource().isEmpty()) {
                this.source_ = clientCtx.source_;
                onChanged();
            }
            if (!clientCtx.getClientId().isEmpty()) {
                this.clientId_ = clientCtx.clientId_;
                onChanged();
            }
            mergeUnknownFields(clientCtx.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx$Builder");
        }
    }

    public static Builder newBuilder(ClientCtx clientCtx) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(clientCtx);
    }

    public static ClientCtx parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private ClientCtx(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static ClientCtx parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientCtx) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ClientCtx parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public ClientCtx getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static ClientCtx parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private ClientCtx() {
        this.memoizedIsInitialized = -1;
        this.source_ = "";
        this.clientId_ = "";
    }

    public static ClientCtx parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static ClientCtx parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ClientCtx parseFrom(InputStream inputStream) throws IOException {
        return (ClientCtx) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private ClientCtx(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        while (!z11) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 10) {
                        this.source_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 18) {
                        this.clientId_ = codedInputStream.readStringRequireUtf8();
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

    public static ClientCtx parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientCtx) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ClientCtx parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClientCtx) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ClientCtx parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ClientCtx) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
