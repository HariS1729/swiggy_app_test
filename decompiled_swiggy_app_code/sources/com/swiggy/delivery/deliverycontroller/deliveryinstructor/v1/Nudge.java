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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class Nudge extends GeneratedMessageV3 implements NudgeOrBuilder {
    private static final Nudge DEFAULT_INSTANCE = new Nudge();
    public static final int ENABLE_FIELD_NUMBER = 1;
    public static final int IMG_URL_ID_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Parser<Nudge> PARSER = new AbstractParser<Nudge>() {
        public Nudge parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Nudge(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int TEXT_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public boolean enable_;
    /* access modifiers changed from: private */
    public volatile Object imgUrlId_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public volatile Object text_;

    public static Nudge getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Nudge_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Nudge parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Nudge) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Nudge parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Nudge> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Nudge)) {
            return super.equals(obj);
        }
        Nudge nudge = (Nudge) obj;
        if (getEnable() == nudge.getEnable() && getText().equals(nudge.getText()) && getImgUrlId().equals(nudge.getImgUrlId()) && this.unknownFields.equals(nudge.unknownFields)) {
            return true;
        }
        return false;
    }

    public boolean getEnable() {
        return this.enable_;
    }

    public String getImgUrlId() {
        Object obj = this.imgUrlId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.imgUrlId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getImgUrlIdBytes() {
        Object obj = this.imgUrlId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.imgUrlId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public Parser<Nudge> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        boolean z11 = this.enable_;
        if (z11) {
            i12 = 0 + CodedOutputStream.computeBoolSize(1, z11);
        }
        if (!getTextBytes().isEmpty()) {
            i12 += GeneratedMessageV3.computeStringSize(2, this.text_);
        }
        if (!getImgUrlIdBytes().isEmpty()) {
            i12 += GeneratedMessageV3.computeStringSize(3, this.imgUrlId_);
        }
        int serializedSize = i12 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public String getText() {
        Object obj = this.text_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.text_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTextBytes() {
        Object obj = this.text_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.text_ = copyFromUtf8;
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
        int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getEnable())) * 37) + 2) * 53) + getText().hashCode()) * 37) + 3) * 53) + getImgUrlId().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Nudge_fieldAccessorTable.ensureFieldAccessorsInitialized(Nudge.class, Builder.class);
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
        return new Nudge();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z11 = this.enable_;
        if (z11) {
            codedOutputStream.writeBool(1, z11);
        }
        if (!getTextBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.text_);
        }
        if (!getImgUrlIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.imgUrlId_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NudgeOrBuilder {
        private boolean enable_;
        private Object imgUrlId_;
        private Object text_;

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Nudge_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearEnable() {
            this.enable_ = false;
            onChanged();
            return this;
        }

        public Builder clearImgUrlId() {
            this.imgUrlId_ = Nudge.getDefaultInstance().getImgUrlId();
            onChanged();
            return this;
        }

        public Builder clearText() {
            this.text_ = Nudge.getDefaultInstance().getText();
            onChanged();
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Nudge_descriptor;
        }

        public boolean getEnable() {
            return this.enable_;
        }

        public String getImgUrlId() {
            Object obj = this.imgUrlId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.imgUrlId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getImgUrlIdBytes() {
            Object obj = this.imgUrlId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.imgUrlId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getText() {
            Object obj = this.text_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.text_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = copyFromUtf8;
            return copyFromUtf8;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Nudge_fieldAccessorTable.ensureFieldAccessorsInitialized(Nudge.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder setEnable(boolean z11) {
            this.enable_ = z11;
            onChanged();
            return this;
        }

        public Builder setImgUrlId(String str) {
            Objects.requireNonNull(str);
            this.imgUrlId_ = str;
            onChanged();
            return this;
        }

        public Builder setImgUrlIdBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.imgUrlId_ = byteString;
            onChanged();
            return this;
        }

        public Builder setText(String str) {
            Objects.requireNonNull(str);
            this.text_ = str;
            onChanged();
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.text_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.text_ = "";
            this.imgUrlId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public Nudge build() {
            Nudge buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public Nudge buildPartial() {
            Nudge nudge = new Nudge((GeneratedMessageV3.Builder) this);
            boolean unused = nudge.enable_ = this.enable_;
            Object unused2 = nudge.text_ = this.text_;
            Object unused3 = nudge.imgUrlId_ = this.imgUrlId_;
            onBuilt();
            return nudge;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Nudge getDefaultInstanceForType() {
            return Nudge.getDefaultInstance();
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
            this.enable_ = false;
            this.text_ = "";
            this.imgUrlId_ = "";
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.text_ = "";
            this.imgUrlId_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof Nudge) {
                return mergeFrom((Nudge) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Nudge nudge) {
            if (nudge == Nudge.getDefaultInstance()) {
                return this;
            }
            if (nudge.getEnable()) {
                setEnable(nudge.getEnable());
            }
            if (!nudge.getText().isEmpty()) {
                this.text_ = nudge.text_;
                onChanged();
            }
            if (!nudge.getImgUrlId().isEmpty()) {
                this.imgUrlId_ = nudge.imgUrlId_;
                onChanged();
            }
            mergeUnknownFields(nudge.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge$Builder");
        }
    }

    public static Builder newBuilder(Nudge nudge) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(nudge);
    }

    public static Nudge parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private Nudge(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Nudge parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Nudge) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Nudge parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public Nudge getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static Nudge parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Nudge() {
        this.memoizedIsInitialized = -1;
        this.text_ = "";
        this.imgUrlId_ = "";
    }

    public static Nudge parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Nudge parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Nudge parseFrom(InputStream inputStream) throws IOException {
        return (Nudge) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private Nudge(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        while (!z11) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 8) {
                        this.enable_ = codedInputStream.readBool();
                    } else if (readTag == 18) {
                        this.text_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 26) {
                        this.imgUrlId_ = codedInputStream.readStringRequireUtf8();
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

    public static Nudge parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Nudge) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Nudge parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Nudge) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Nudge parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Nudge) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
