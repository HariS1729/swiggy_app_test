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
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.ClientCtx;
import com.swiggy.platform.shared.marketplace.v1.MarketplaceProto;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class RequestCtx extends GeneratedMessageV3 implements RequestCtxOrBuilder {
    public static final int BUSINESSLINE_ID_FIELD_NUMBER = 2;
    public static final int CATEGORY_ID_FIELD_NUMBER = 3;
    public static final int CLIENT_CTX_FIELD_NUMBER = 4;
    private static final RequestCtx DEFAULT_INSTANCE = new RequestCtx();
    public static final int MARKETPLACE_ID_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Parser<RequestCtx> PARSER = new AbstractParser<RequestCtx>() {
        public RequestCtx parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RequestCtx(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public int businesslineId_;
    /* access modifiers changed from: private */
    public int categoryId_;
    /* access modifiers changed from: private */
    public ClientCtx clientCtx_;
    /* access modifiers changed from: private */
    public int marketplaceId_;
    private byte memoizedIsInitialized;

    public static RequestCtx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_RequestCtx_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static RequestCtx parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestCtx) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RequestCtx parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<RequestCtx> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestCtx)) {
            return super.equals(obj);
        }
        RequestCtx requestCtx = (RequestCtx) obj;
        if (this.marketplaceId_ != requestCtx.marketplaceId_ || this.businesslineId_ != requestCtx.businesslineId_ || this.categoryId_ != requestCtx.categoryId_ || hasClientCtx() != requestCtx.hasClientCtx()) {
            return false;
        }
        if ((!hasClientCtx() || getClientCtx().equals(requestCtx.getClientCtx())) && this.unknownFields.equals(requestCtx.unknownFields)) {
            return true;
        }
        return false;
    }

    public MarketplaceProto.BusinessLine getBusinesslineId() {
        MarketplaceProto.BusinessLine valueOf = MarketplaceProto.BusinessLine.valueOf(this.businesslineId_);
        return valueOf == null ? MarketplaceProto.BusinessLine.UNRECOGNIZED : valueOf;
    }

    public int getBusinesslineIdValue() {
        return this.businesslineId_;
    }

    public MarketplaceProto.Category getCategoryId() {
        MarketplaceProto.Category valueOf = MarketplaceProto.Category.valueOf(this.categoryId_);
        return valueOf == null ? MarketplaceProto.Category.UNRECOGNIZED : valueOf;
    }

    public int getCategoryIdValue() {
        return this.categoryId_;
    }

    public ClientCtx getClientCtx() {
        ClientCtx clientCtx = this.clientCtx_;
        return clientCtx == null ? ClientCtx.getDefaultInstance() : clientCtx;
    }

    public ClientCtxOrBuilder getClientCtxOrBuilder() {
        return getClientCtx();
    }

    public MarketplaceProto.MarketPlaceId getMarketplaceId() {
        MarketplaceProto.MarketPlaceId valueOf = MarketplaceProto.MarketPlaceId.valueOf(this.marketplaceId_);
        return valueOf == null ? MarketplaceProto.MarketPlaceId.UNRECOGNIZED : valueOf;
    }

    public int getMarketplaceIdValue() {
        return this.marketplaceId_;
    }

    public Parser<RequestCtx> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        if (this.marketplaceId_ != MarketplaceProto.MarketPlaceId.MARKET_PLACE_ID_INVALID.getNumber()) {
            i12 = 0 + CodedOutputStream.computeEnumSize(1, this.marketplaceId_);
        }
        if (this.businesslineId_ != MarketplaceProto.BusinessLine.BUSINESS_LINE_INVALID.getNumber()) {
            i12 += CodedOutputStream.computeEnumSize(2, this.businesslineId_);
        }
        if (this.categoryId_ != MarketplaceProto.Category.CATEGORY_INVALID.getNumber()) {
            i12 += CodedOutputStream.computeEnumSize(3, this.categoryId_);
        }
        if (this.clientCtx_ != null) {
            i12 += CodedOutputStream.computeMessageSize(4, getClientCtx());
        }
        int serializedSize = i12 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasClientCtx() {
        return this.clientCtx_ != null;
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.marketplaceId_) * 37) + 2) * 53) + this.businesslineId_) * 37) + 3) * 53) + this.categoryId_;
        if (hasClientCtx()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getClientCtx().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_RequestCtx_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestCtx.class, Builder.class);
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
        return new RequestCtx();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.marketplaceId_ != MarketplaceProto.MarketPlaceId.MARKET_PLACE_ID_INVALID.getNumber()) {
            codedOutputStream.writeEnum(1, this.marketplaceId_);
        }
        if (this.businesslineId_ != MarketplaceProto.BusinessLine.BUSINESS_LINE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(2, this.businesslineId_);
        }
        if (this.categoryId_ != MarketplaceProto.Category.CATEGORY_INVALID.getNumber()) {
            codedOutputStream.writeEnum(3, this.categoryId_);
        }
        if (this.clientCtx_ != null) {
            codedOutputStream.writeMessage(4, getClientCtx());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestCtxOrBuilder {
        private int businesslineId_;
        private int categoryId_;
        private SingleFieldBuilderV3<ClientCtx, ClientCtx.Builder, ClientCtxOrBuilder> clientCtxBuilder_;
        private ClientCtx clientCtx_;
        private int marketplaceId_;

        private SingleFieldBuilderV3<ClientCtx, ClientCtx.Builder, ClientCtxOrBuilder> getClientCtxFieldBuilder() {
            if (this.clientCtxBuilder_ == null) {
                this.clientCtxBuilder_ = new SingleFieldBuilderV3<>(getClientCtx(), getParentForChildren(), isClean());
                this.clientCtx_ = null;
            }
            return this.clientCtxBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_RequestCtx_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearBusinesslineId() {
            this.businesslineId_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCategoryId() {
            this.categoryId_ = 0;
            onChanged();
            return this;
        }

        public Builder clearClientCtx() {
            if (this.clientCtxBuilder_ == null) {
                this.clientCtx_ = null;
                onChanged();
            } else {
                this.clientCtx_ = null;
                this.clientCtxBuilder_ = null;
            }
            return this;
        }

        public Builder clearMarketplaceId() {
            this.marketplaceId_ = 0;
            onChanged();
            return this;
        }

        public MarketplaceProto.BusinessLine getBusinesslineId() {
            MarketplaceProto.BusinessLine valueOf = MarketplaceProto.BusinessLine.valueOf(this.businesslineId_);
            return valueOf == null ? MarketplaceProto.BusinessLine.UNRECOGNIZED : valueOf;
        }

        public int getBusinesslineIdValue() {
            return this.businesslineId_;
        }

        public MarketplaceProto.Category getCategoryId() {
            MarketplaceProto.Category valueOf = MarketplaceProto.Category.valueOf(this.categoryId_);
            return valueOf == null ? MarketplaceProto.Category.UNRECOGNIZED : valueOf;
        }

        public int getCategoryIdValue() {
            return this.categoryId_;
        }

        public ClientCtx getClientCtx() {
            SingleFieldBuilderV3<ClientCtx, ClientCtx.Builder, ClientCtxOrBuilder> singleFieldBuilderV3 = this.clientCtxBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            ClientCtx clientCtx = this.clientCtx_;
            return clientCtx == null ? ClientCtx.getDefaultInstance() : clientCtx;
        }

        public ClientCtx.Builder getClientCtxBuilder() {
            onChanged();
            return getClientCtxFieldBuilder().getBuilder();
        }

        public ClientCtxOrBuilder getClientCtxOrBuilder() {
            SingleFieldBuilderV3<ClientCtx, ClientCtx.Builder, ClientCtxOrBuilder> singleFieldBuilderV3 = this.clientCtxBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            ClientCtx clientCtx = this.clientCtx_;
            return clientCtx == null ? ClientCtx.getDefaultInstance() : clientCtx;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_RequestCtx_descriptor;
        }

        public MarketplaceProto.MarketPlaceId getMarketplaceId() {
            MarketplaceProto.MarketPlaceId valueOf = MarketplaceProto.MarketPlaceId.valueOf(this.marketplaceId_);
            return valueOf == null ? MarketplaceProto.MarketPlaceId.UNRECOGNIZED : valueOf;
        }

        public int getMarketplaceIdValue() {
            return this.marketplaceId_;
        }

        public boolean hasClientCtx() {
            return (this.clientCtxBuilder_ == null && this.clientCtx_ == null) ? false : true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_RequestCtx_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestCtx.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeClientCtx(ClientCtx clientCtx) {
            SingleFieldBuilderV3<ClientCtx, ClientCtx.Builder, ClientCtxOrBuilder> singleFieldBuilderV3 = this.clientCtxBuilder_;
            if (singleFieldBuilderV3 == null) {
                ClientCtx clientCtx2 = this.clientCtx_;
                if (clientCtx2 != null) {
                    this.clientCtx_ = ClientCtx.newBuilder(clientCtx2).mergeFrom(clientCtx).buildPartial();
                } else {
                    this.clientCtx_ = clientCtx;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(clientCtx);
            }
            return this;
        }

        public Builder setBusinesslineId(MarketplaceProto.BusinessLine businessLine) {
            Objects.requireNonNull(businessLine);
            this.businesslineId_ = businessLine.getNumber();
            onChanged();
            return this;
        }

        public Builder setBusinesslineIdValue(int i11) {
            this.businesslineId_ = i11;
            onChanged();
            return this;
        }

        public Builder setCategoryId(MarketplaceProto.Category category) {
            Objects.requireNonNull(category);
            this.categoryId_ = category.getNumber();
            onChanged();
            return this;
        }

        public Builder setCategoryIdValue(int i11) {
            this.categoryId_ = i11;
            onChanged();
            return this;
        }

        public Builder setClientCtx(ClientCtx clientCtx) {
            SingleFieldBuilderV3<ClientCtx, ClientCtx.Builder, ClientCtxOrBuilder> singleFieldBuilderV3 = this.clientCtxBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(clientCtx);
                this.clientCtx_ = clientCtx;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(clientCtx);
            }
            return this;
        }

        public Builder setMarketplaceId(MarketplaceProto.MarketPlaceId marketPlaceId) {
            Objects.requireNonNull(marketPlaceId);
            this.marketplaceId_ = marketPlaceId.getNumber();
            onChanged();
            return this;
        }

        public Builder setMarketplaceIdValue(int i11) {
            this.marketplaceId_ = i11;
            onChanged();
            return this;
        }

        private Builder() {
            this.marketplaceId_ = 0;
            this.businesslineId_ = 0;
            this.categoryId_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public RequestCtx build() {
            RequestCtx buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public RequestCtx buildPartial() {
            RequestCtx requestCtx = new RequestCtx((GeneratedMessageV3.Builder) this);
            int unused = requestCtx.marketplaceId_ = this.marketplaceId_;
            int unused2 = requestCtx.businesslineId_ = this.businesslineId_;
            int unused3 = requestCtx.categoryId_ = this.categoryId_;
            SingleFieldBuilderV3<ClientCtx, ClientCtx.Builder, ClientCtxOrBuilder> singleFieldBuilderV3 = this.clientCtxBuilder_;
            if (singleFieldBuilderV3 == null) {
                ClientCtx unused4 = requestCtx.clientCtx_ = this.clientCtx_;
            } else {
                ClientCtx unused5 = requestCtx.clientCtx_ = singleFieldBuilderV3.build();
            }
            onBuilt();
            return requestCtx;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public RequestCtx getDefaultInstanceForType() {
            return RequestCtx.getDefaultInstance();
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
            this.marketplaceId_ = 0;
            this.businesslineId_ = 0;
            this.categoryId_ = 0;
            if (this.clientCtxBuilder_ == null) {
                this.clientCtx_ = null;
            } else {
                this.clientCtx_ = null;
                this.clientCtxBuilder_ = null;
            }
            return this;
        }

        public Builder setClientCtx(ClientCtx.Builder builder) {
            SingleFieldBuilderV3<ClientCtx, ClientCtx.Builder, ClientCtxOrBuilder> singleFieldBuilderV3 = this.clientCtxBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.clientCtx_ = builder.build();
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
            if (message instanceof RequestCtx) {
                return mergeFrom((RequestCtx) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.marketplaceId_ = 0;
            this.businesslineId_ = 0;
            this.categoryId_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(RequestCtx requestCtx) {
            if (requestCtx == RequestCtx.getDefaultInstance()) {
                return this;
            }
            if (requestCtx.marketplaceId_ != 0) {
                setMarketplaceIdValue(requestCtx.getMarketplaceIdValue());
            }
            if (requestCtx.businesslineId_ != 0) {
                setBusinesslineIdValue(requestCtx.getBusinesslineIdValue());
            }
            if (requestCtx.categoryId_ != 0) {
                setCategoryIdValue(requestCtx.getCategoryIdValue());
            }
            if (requestCtx.hasClientCtx()) {
                mergeClientCtx(requestCtx.getClientCtx());
            }
            mergeUnknownFields(requestCtx.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.RequestCtx$Builder");
        }
    }

    public static Builder newBuilder(RequestCtx requestCtx) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestCtx);
    }

    public static RequestCtx parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private RequestCtx(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static RequestCtx parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestCtx) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RequestCtx parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public RequestCtx getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static RequestCtx parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private RequestCtx() {
        this.memoizedIsInitialized = -1;
        this.marketplaceId_ = 0;
        this.businesslineId_ = 0;
        this.categoryId_ = 0;
    }

    public static RequestCtx parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static RequestCtx parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RequestCtx parseFrom(InputStream inputStream) throws IOException {
        return (RequestCtx) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RequestCtx parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestCtx) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    private RequestCtx(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        while (!z11) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 8) {
                        this.marketplaceId_ = codedInputStream.readEnum();
                    } else if (readTag == 16) {
                        this.businesslineId_ = codedInputStream.readEnum();
                    } else if (readTag == 24) {
                        this.categoryId_ = codedInputStream.readEnum();
                    } else if (readTag == 34) {
                        ClientCtx.Builder builder = null;
                        ClientCtx clientCtx = this.clientCtx_;
                        builder = clientCtx != null ? clientCtx.toBuilder() : builder;
                        ClientCtx clientCtx2 = (ClientCtx) codedInputStream.readMessage(ClientCtx.parser(), extensionRegistryLite);
                        this.clientCtx_ = clientCtx2;
                        if (builder != null) {
                            builder.mergeFrom(clientCtx2);
                            this.clientCtx_ = builder.buildPartial();
                        }
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

    public static RequestCtx parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RequestCtx) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RequestCtx parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestCtx) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
