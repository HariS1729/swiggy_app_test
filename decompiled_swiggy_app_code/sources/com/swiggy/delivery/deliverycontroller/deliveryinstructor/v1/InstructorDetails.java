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

public final class InstructorDetails extends GeneratedMessageV3 implements InstructorDetailsOrBuilder {
    private static final InstructorDetails DEFAULT_INSTANCE = new InstructorDetails();
    public static final int INSTRUCTOR_ID_FIELD_NUMBER = 1;
    public static final int INSTRUCTOR_TYPE_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Parser<InstructorDetails> PARSER = new AbstractParser<InstructorDetails>() {
        public InstructorDetails parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new InstructorDetails(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object instructorId_;
    /* access modifiers changed from: private */
    public int instructorType_;
    private byte memoizedIsInitialized;

    public static InstructorDetails getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructorDetails_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InstructorDetails parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InstructorDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InstructorDetails parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<InstructorDetails> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstructorDetails)) {
            return super.equals(obj);
        }
        InstructorDetails instructorDetails = (InstructorDetails) obj;
        if (getInstructorId().equals(instructorDetails.getInstructorId()) && this.instructorType_ == instructorDetails.instructorType_ && this.unknownFields.equals(instructorDetails.unknownFields)) {
            return true;
        }
        return false;
    }

    public String getInstructorId() {
        Object obj = this.instructorId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.instructorId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getInstructorIdBytes() {
        Object obj = this.instructorId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.instructorId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public InstructorType getInstructorType() {
        InstructorType valueOf = InstructorType.valueOf(this.instructorType_);
        return valueOf == null ? InstructorType.UNRECOGNIZED : valueOf;
    }

    public int getInstructorTypeValue() {
        return this.instructorType_;
    }

    public Parser<InstructorDetails> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        if (!getInstructorIdBytes().isEmpty()) {
            i12 = 0 + GeneratedMessageV3.computeStringSize(1, this.instructorId_);
        }
        if (this.instructorType_ != InstructorType.INSTRUCTOR_TYPE_INVALID.getNumber()) {
            i12 += CodedOutputStream.computeEnumSize(2, this.instructorType_);
        }
        int serializedSize = i12 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getInstructorId().hashCode()) * 37) + 2) * 53) + this.instructorType_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructorDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(InstructorDetails.class, Builder.class);
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
        return new InstructorDetails();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getInstructorIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.instructorId_);
        }
        if (this.instructorType_ != InstructorType.INSTRUCTOR_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(2, this.instructorType_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstructorDetailsOrBuilder {
        private Object instructorId_;
        private int instructorType_;

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructorDetails_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder clearInstructorId() {
            this.instructorId_ = InstructorDetails.getDefaultInstance().getInstructorId();
            onChanged();
            return this;
        }

        public Builder clearInstructorType() {
            this.instructorType_ = 0;
            onChanged();
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructorDetails_descriptor;
        }

        public String getInstructorId() {
            Object obj = this.instructorId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.instructorId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getInstructorIdBytes() {
            Object obj = this.instructorId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.instructorId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public InstructorType getInstructorType() {
            InstructorType valueOf = InstructorType.valueOf(this.instructorType_);
            return valueOf == null ? InstructorType.UNRECOGNIZED : valueOf;
        }

        public int getInstructorTypeValue() {
            return this.instructorType_;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructorDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(InstructorDetails.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder setInstructorId(String str) {
            Objects.requireNonNull(str);
            this.instructorId_ = str;
            onChanged();
            return this;
        }

        public Builder setInstructorIdBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.instructorId_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInstructorType(InstructorType instructorType) {
            Objects.requireNonNull(instructorType);
            this.instructorType_ = instructorType.getNumber();
            onChanged();
            return this;
        }

        public Builder setInstructorTypeValue(int i11) {
            this.instructorType_ = i11;
            onChanged();
            return this;
        }

        private Builder() {
            this.instructorId_ = "";
            this.instructorType_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public InstructorDetails build() {
            InstructorDetails buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public InstructorDetails buildPartial() {
            InstructorDetails instructorDetails = new InstructorDetails((GeneratedMessageV3.Builder) this);
            Object unused = instructorDetails.instructorId_ = this.instructorId_;
            int unused2 = instructorDetails.instructorType_ = this.instructorType_;
            onBuilt();
            return instructorDetails;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public InstructorDetails getDefaultInstanceForType() {
            return InstructorDetails.getDefaultInstance();
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
            this.instructorId_ = "";
            this.instructorType_ = 0;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.instructorId_ = "";
            this.instructorType_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof InstructorDetails) {
                return mergeFrom((InstructorDetails) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(InstructorDetails instructorDetails) {
            if (instructorDetails == InstructorDetails.getDefaultInstance()) {
                return this;
            }
            if (!instructorDetails.getInstructorId().isEmpty()) {
                this.instructorId_ = instructorDetails.instructorId_;
                onChanged();
            }
            if (instructorDetails.instructorType_ != 0) {
                setInstructorTypeValue(instructorDetails.getInstructorTypeValue());
            }
            mergeUnknownFields(instructorDetails.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails$Builder");
        }
    }

    public static Builder newBuilder(InstructorDetails instructorDetails) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(instructorDetails);
    }

    public static InstructorDetails parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private InstructorDetails(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static InstructorDetails parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstructorDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InstructorDetails parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public InstructorDetails getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static InstructorDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private InstructorDetails() {
        this.memoizedIsInitialized = -1;
        this.instructorId_ = "";
        this.instructorType_ = 0;
    }

    public static InstructorDetails parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static InstructorDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static InstructorDetails parseFrom(InputStream inputStream) throws IOException {
        return (InstructorDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private InstructorDetails(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        while (!z11) {
            try {
                int readTag = codedInputStream.readTag();
                if (readTag != 0) {
                    if (readTag == 10) {
                        this.instructorId_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 16) {
                        this.instructorType_ = codedInputStream.readEnum();
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

    public static InstructorDetails parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstructorDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InstructorDetails parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InstructorDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static InstructorDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstructorDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
