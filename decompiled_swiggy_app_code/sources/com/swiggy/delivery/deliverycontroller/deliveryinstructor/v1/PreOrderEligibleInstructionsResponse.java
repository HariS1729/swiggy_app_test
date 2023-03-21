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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction;
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Nudge;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class PreOrderEligibleInstructionsResponse extends GeneratedMessageV3 implements PreOrderEligibleInstructionsResponseOrBuilder {
    private static final PreOrderEligibleInstructionsResponse DEFAULT_INSTANCE = new PreOrderEligibleInstructionsResponse();
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int INSTRUCTIONS_FIELD_NUMBER = 1;
    public static final int NUDGE_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Parser<PreOrderEligibleInstructionsResponse> PARSER = new AbstractParser<PreOrderEligibleInstructionsResponse>() {
        public PreOrderEligibleInstructionsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new PreOrderEligibleInstructionsResponse(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int STATUS_CODE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object error_;
    /* access modifiers changed from: private */
    public List<Instruction> instructions_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public Nudge nudge_;
    /* access modifiers changed from: private */
    public int statusCode_;

    public static PreOrderEligibleInstructionsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsResponse_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PreOrderEligibleInstructionsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PreOrderEligibleInstructionsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<PreOrderEligibleInstructionsResponse> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreOrderEligibleInstructionsResponse)) {
            return super.equals(obj);
        }
        PreOrderEligibleInstructionsResponse preOrderEligibleInstructionsResponse = (PreOrderEligibleInstructionsResponse) obj;
        if (!getInstructionsList().equals(preOrderEligibleInstructionsResponse.getInstructionsList()) || getStatusCode() != preOrderEligibleInstructionsResponse.getStatusCode() || !getError().equals(preOrderEligibleInstructionsResponse.getError()) || hasNudge() != preOrderEligibleInstructionsResponse.hasNudge()) {
            return false;
        }
        if ((!hasNudge() || getNudge().equals(preOrderEligibleInstructionsResponse.getNudge())) && this.unknownFields.equals(preOrderEligibleInstructionsResponse.unknownFields)) {
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

    public Instruction getInstructions(int i11) {
        return this.instructions_.get(i11);
    }

    public int getInstructionsCount() {
        return this.instructions_.size();
    }

    public List<Instruction> getInstructionsList() {
        return this.instructions_;
    }

    public InstructionOrBuilder getInstructionsOrBuilder(int i11) {
        return this.instructions_.get(i11);
    }

    public List<? extends InstructionOrBuilder> getInstructionsOrBuilderList() {
        return this.instructions_;
    }

    public Nudge getNudge() {
        Nudge nudge = this.nudge_;
        return nudge == null ? Nudge.getDefaultInstance() : nudge;
    }

    public NudgeOrBuilder getNudgeOrBuilder() {
        return getNudge();
    }

    public Parser<PreOrderEligibleInstructionsResponse> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.instructions_.size(); i13++) {
            i12 += CodedOutputStream.computeMessageSize(1, this.instructions_.get(i13));
        }
        int i14 = this.statusCode_;
        if (i14 != 0) {
            i12 += CodedOutputStream.computeInt32Size(2, i14);
        }
        if (!getErrorBytes().isEmpty()) {
            i12 += GeneratedMessageV3.computeStringSize(3, this.error_);
        }
        if (this.nudge_ != null) {
            i12 += CodedOutputStream.computeMessageSize(4, getNudge());
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

    public boolean hasNudge() {
        return this.nudge_ != null;
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getInstructionsCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getInstructionsList().hashCode();
        }
        int statusCode = (((((((hashCode * 37) + 2) * 53) + getStatusCode()) * 37) + 3) * 53) + getError().hashCode();
        if (hasNudge()) {
            statusCode = (((statusCode * 37) + 4) * 53) + getNudge().hashCode();
        }
        int hashCode2 = (statusCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PreOrderEligibleInstructionsResponse.class, Builder.class);
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
        return new PreOrderEligibleInstructionsResponse();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i11 = 0; i11 < this.instructions_.size(); i11++) {
            codedOutputStream.writeMessage(1, this.instructions_.get(i11));
        }
        int i12 = this.statusCode_;
        if (i12 != 0) {
            codedOutputStream.writeInt32(2, i12);
        }
        if (!getErrorBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.error_);
        }
        if (this.nudge_ != null) {
            codedOutputStream.writeMessage(4, getNudge());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PreOrderEligibleInstructionsResponseOrBuilder {
        private int bitField0_;
        private Object error_;
        private RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> instructionsBuilder_;
        private List<Instruction> instructions_;
        private SingleFieldBuilderV3<Nudge, Nudge.Builder, NudgeOrBuilder> nudgeBuilder_;
        private Nudge nudge_;
        private int statusCode_;

        private void ensureInstructionsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.instructions_ = new ArrayList(this.instructions_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsResponse_descriptor;
        }

        private RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> getInstructionsFieldBuilder() {
            if (this.instructionsBuilder_ == null) {
                List<Instruction> list = this.instructions_;
                boolean z11 = true;
                if ((this.bitField0_ & 1) == 0) {
                    z11 = false;
                }
                this.instructionsBuilder_ = new RepeatedFieldBuilderV3<>(list, z11, getParentForChildren(), isClean());
                this.instructions_ = null;
            }
            return this.instructionsBuilder_;
        }

        private SingleFieldBuilderV3<Nudge, Nudge.Builder, NudgeOrBuilder> getNudgeFieldBuilder() {
            if (this.nudgeBuilder_ == null) {
                this.nudgeBuilder_ = new SingleFieldBuilderV3<>(getNudge(), getParentForChildren(), isClean());
                this.nudge_ = null;
            }
            return this.nudgeBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getInstructionsFieldBuilder();
            }
        }

        public Builder addAllInstructions(Iterable<? extends Instruction> iterable) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureInstructionsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.instructions_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addInstructions(Instruction instruction) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(instruction);
                ensureInstructionsIsMutable();
                this.instructions_.add(instruction);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(instruction);
            }
            return this;
        }

        public Instruction.Builder addInstructionsBuilder() {
            return getInstructionsFieldBuilder().addBuilder(Instruction.getDefaultInstance());
        }

        public Builder clearError() {
            this.error_ = PreOrderEligibleInstructionsResponse.getDefaultInstance().getError();
            onChanged();
            return this;
        }

        public Builder clearInstructions() {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.instructions_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearNudge() {
            if (this.nudgeBuilder_ == null) {
                this.nudge_ = null;
                onChanged();
            } else {
                this.nudge_ = null;
                this.nudgeBuilder_ = null;
            }
            return this;
        }

        public Builder clearStatusCode() {
            this.statusCode_ = 0;
            onChanged();
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsResponse_descriptor;
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

        public Instruction getInstructions(int i11) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.instructions_.get(i11);
            }
            return repeatedFieldBuilderV3.getMessage(i11);
        }

        public Instruction.Builder getInstructionsBuilder(int i11) {
            return getInstructionsFieldBuilder().getBuilder(i11);
        }

        public List<Instruction.Builder> getInstructionsBuilderList() {
            return getInstructionsFieldBuilder().getBuilderList();
        }

        public int getInstructionsCount() {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.instructions_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public List<Instruction> getInstructionsList() {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.instructions_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public InstructionOrBuilder getInstructionsOrBuilder(int i11) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.instructions_.get(i11);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i11);
        }

        public List<? extends InstructionOrBuilder> getInstructionsOrBuilderList() {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.instructions_);
        }

        public Nudge getNudge() {
            SingleFieldBuilderV3<Nudge, Nudge.Builder, NudgeOrBuilder> singleFieldBuilderV3 = this.nudgeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Nudge nudge = this.nudge_;
            return nudge == null ? Nudge.getDefaultInstance() : nudge;
        }

        public Nudge.Builder getNudgeBuilder() {
            onChanged();
            return getNudgeFieldBuilder().getBuilder();
        }

        public NudgeOrBuilder getNudgeOrBuilder() {
            SingleFieldBuilderV3<Nudge, Nudge.Builder, NudgeOrBuilder> singleFieldBuilderV3 = this.nudgeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Nudge nudge = this.nudge_;
            return nudge == null ? Nudge.getDefaultInstance() : nudge;
        }

        public int getStatusCode() {
            return this.statusCode_;
        }

        public boolean hasNudge() {
            return (this.nudgeBuilder_ == null && this.nudge_ == null) ? false : true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorApiProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_PreOrderEligibleInstructionsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PreOrderEligibleInstructionsResponse.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeNudge(Nudge nudge) {
            SingleFieldBuilderV3<Nudge, Nudge.Builder, NudgeOrBuilder> singleFieldBuilderV3 = this.nudgeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Nudge nudge2 = this.nudge_;
                if (nudge2 != null) {
                    this.nudge_ = Nudge.newBuilder(nudge2).mergeFrom(nudge).buildPartial();
                } else {
                    this.nudge_ = nudge;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(nudge);
            }
            return this;
        }

        public Builder removeInstructions(int i11) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureInstructionsIsMutable();
                this.instructions_.remove(i11);
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

        public Builder setInstructions(int i11, Instruction instruction) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(instruction);
                ensureInstructionsIsMutable();
                this.instructions_.set(i11, instruction);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i11, instruction);
            }
            return this;
        }

        public Builder setNudge(Nudge nudge) {
            SingleFieldBuilderV3<Nudge, Nudge.Builder, NudgeOrBuilder> singleFieldBuilderV3 = this.nudgeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(nudge);
                this.nudge_ = nudge;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(nudge);
            }
            return this;
        }

        public Builder setStatusCode(int i11) {
            this.statusCode_ = i11;
            onChanged();
            return this;
        }

        private Builder() {
            this.instructions_ = Collections.emptyList();
            this.error_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public PreOrderEligibleInstructionsResponse build() {
            PreOrderEligibleInstructionsResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public PreOrderEligibleInstructionsResponse buildPartial() {
            PreOrderEligibleInstructionsResponse preOrderEligibleInstructionsResponse = new PreOrderEligibleInstructionsResponse((GeneratedMessageV3.Builder) this);
            int i11 = this.bitField0_;
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i11 & 1) != 0) {
                    this.instructions_ = Collections.unmodifiableList(this.instructions_);
                    this.bitField0_ &= -2;
                }
                List unused = preOrderEligibleInstructionsResponse.instructions_ = this.instructions_;
            } else {
                List unused2 = preOrderEligibleInstructionsResponse.instructions_ = repeatedFieldBuilderV3.build();
            }
            int unused3 = preOrderEligibleInstructionsResponse.statusCode_ = this.statusCode_;
            Object unused4 = preOrderEligibleInstructionsResponse.error_ = this.error_;
            SingleFieldBuilderV3<Nudge, Nudge.Builder, NudgeOrBuilder> singleFieldBuilderV3 = this.nudgeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Nudge unused5 = preOrderEligibleInstructionsResponse.nudge_ = this.nudge_;
            } else {
                Nudge unused6 = preOrderEligibleInstructionsResponse.nudge_ = singleFieldBuilderV3.build();
            }
            onBuilt();
            return preOrderEligibleInstructionsResponse;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public PreOrderEligibleInstructionsResponse getDefaultInstanceForType() {
            return PreOrderEligibleInstructionsResponse.getDefaultInstance();
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

        public Instruction.Builder addInstructionsBuilder(int i11) {
            return getInstructionsFieldBuilder().addBuilder(i11, Instruction.getDefaultInstance());
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.instructions_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.statusCode_ = 0;
            this.error_ = "";
            if (this.nudgeBuilder_ == null) {
                this.nudge_ = null;
            } else {
                this.nudge_ = null;
                this.nudgeBuilder_ = null;
            }
            return this;
        }

        public Builder setNudge(Nudge.Builder builder) {
            SingleFieldBuilderV3<Nudge, Nudge.Builder, NudgeOrBuilder> singleFieldBuilderV3 = this.nudgeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.nudge_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.instructions_ = Collections.emptyList();
            this.error_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder addInstructions(int i11, Instruction instruction) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                Objects.requireNonNull(instruction);
                ensureInstructionsIsMutable();
                this.instructions_.add(i11, instruction);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i11, instruction);
            }
            return this;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof PreOrderEligibleInstructionsResponse) {
                return mergeFrom((PreOrderEligibleInstructionsResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setInstructions(int i11, Instruction.Builder builder) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureInstructionsIsMutable();
                this.instructions_.set(i11, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i11, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(PreOrderEligibleInstructionsResponse preOrderEligibleInstructionsResponse) {
            if (preOrderEligibleInstructionsResponse == PreOrderEligibleInstructionsResponse.getDefaultInstance()) {
                return this;
            }
            if (this.instructionsBuilder_ == null) {
                if (!preOrderEligibleInstructionsResponse.instructions_.isEmpty()) {
                    if (this.instructions_.isEmpty()) {
                        this.instructions_ = preOrderEligibleInstructionsResponse.instructions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureInstructionsIsMutable();
                        this.instructions_.addAll(preOrderEligibleInstructionsResponse.instructions_);
                    }
                    onChanged();
                }
            } else if (!preOrderEligibleInstructionsResponse.instructions_.isEmpty()) {
                if (this.instructionsBuilder_.isEmpty()) {
                    this.instructionsBuilder_.dispose();
                    RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = null;
                    this.instructionsBuilder_ = null;
                    this.instructions_ = preOrderEligibleInstructionsResponse.instructions_;
                    this.bitField0_ &= -2;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getInstructionsFieldBuilder();
                    }
                    this.instructionsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.instructionsBuilder_.addAllMessages(preOrderEligibleInstructionsResponse.instructions_);
                }
            }
            if (preOrderEligibleInstructionsResponse.getStatusCode() != 0) {
                setStatusCode(preOrderEligibleInstructionsResponse.getStatusCode());
            }
            if (!preOrderEligibleInstructionsResponse.getError().isEmpty()) {
                this.error_ = preOrderEligibleInstructionsResponse.error_;
                onChanged();
            }
            if (preOrderEligibleInstructionsResponse.hasNudge()) {
                mergeNudge(preOrderEligibleInstructionsResponse.getNudge());
            }
            mergeUnknownFields(preOrderEligibleInstructionsResponse.unknownFields);
            onChanged();
            return this;
        }

        public Builder addInstructions(Instruction.Builder builder) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureInstructionsIsMutable();
                this.instructions_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addInstructions(int i11, Instruction.Builder builder) {
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureInstructionsIsMutable();
                this.instructions_.add(i11, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i11, builder.build());
            }
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.PreOrderEligibleInstructionsResponse$Builder");
        }
    }

    public static Builder newBuilder(PreOrderEligibleInstructionsResponse preOrderEligibleInstructionsResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(preOrderEligibleInstructionsResponse);
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private PreOrderEligibleInstructionsResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static PreOrderEligibleInstructionsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PreOrderEligibleInstructionsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public PreOrderEligibleInstructionsResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private PreOrderEligibleInstructionsResponse() {
        this.memoizedIsInitialized = -1;
        this.instructions_ = Collections.emptyList();
        this.error_ = "";
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(InputStream inputStream) throws IOException {
        return (PreOrderEligibleInstructionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private PreOrderEligibleInstructionsResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.instructions_ = new ArrayList();
                            z12 |= true;
                        }
                        this.instructions_.add(codedInputStream.readMessage(Instruction.parser(), extensionRegistryLite));
                    } else if (readTag == 16) {
                        this.statusCode_ = codedInputStream.readInt32();
                    } else if (readTag == 26) {
                        this.error_ = codedInputStream.readStringRequireUtf8();
                    } else if (readTag == 34) {
                        Nudge.Builder builder = null;
                        Nudge nudge = this.nudge_;
                        builder = nudge != null ? nudge.toBuilder() : builder;
                        Nudge nudge2 = (Nudge) codedInputStream.readMessage(Nudge.parser(), extensionRegistryLite);
                        this.nudge_ = nudge2;
                        if (builder != null) {
                            builder.mergeFrom(nudge2);
                            this.nudge_ = builder.buildPartial();
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
                if (z12 && true) {
                    this.instructions_ = Collections.unmodifiableList(this.instructions_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z12 && true) {
            this.instructions_ = Collections.unmodifiableList(this.instructions_);
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PreOrderEligibleInstructionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PreOrderEligibleInstructionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static PreOrderEligibleInstructionsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PreOrderEligibleInstructionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
