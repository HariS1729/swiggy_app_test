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
import com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructorDetails;
import com.swiggy.delivery.deliverycontroller.shared.v1.TaskType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class InstructionsMapping extends GeneratedMessageV3 implements InstructionsMappingOrBuilder {
    private static final InstructionsMapping DEFAULT_INSTANCE = new InstructionsMapping();
    public static final int INSTRUCTIONS_FIELD_NUMBER = 1;
    public static final int INSTRUCTOR_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final Parser<InstructionsMapping> PARSER = new AbstractParser<InstructionsMapping>() {
        public InstructionsMapping parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new InstructionsMapping(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int TASK_TYPE_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public List<Instruction> instructions_;
    /* access modifiers changed from: private */
    public InstructorDetails instructor_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int taskType_;

    public static InstructionsMapping getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructionsMapping_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InstructionsMapping parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InstructionsMapping) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InstructionsMapping parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<InstructionsMapping> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstructionsMapping)) {
            return super.equals(obj);
        }
        InstructionsMapping instructionsMapping = (InstructionsMapping) obj;
        if (!getInstructionsList().equals(instructionsMapping.getInstructionsList()) || hasInstructor() != instructionsMapping.hasInstructor()) {
            return false;
        }
        if ((!hasInstructor() || getInstructor().equals(instructionsMapping.getInstructor())) && this.taskType_ == instructionsMapping.taskType_ && this.unknownFields.equals(instructionsMapping.unknownFields)) {
            return true;
        }
        return false;
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

    public InstructorDetails getInstructor() {
        InstructorDetails instructorDetails = this.instructor_;
        return instructorDetails == null ? InstructorDetails.getDefaultInstance() : instructorDetails;
    }

    public InstructorDetailsOrBuilder getInstructorOrBuilder() {
        return getInstructor();
    }

    public Parser<InstructionsMapping> getParserForType() {
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
        if (this.instructor_ != null) {
            i12 += CodedOutputStream.computeMessageSize(2, getInstructor());
        }
        if (this.taskType_ != TaskType.TASK_TYPE_INVALID.getNumber()) {
            i12 += CodedOutputStream.computeEnumSize(3, this.taskType_);
        }
        int serializedSize = i12 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public TaskType getTaskType() {
        TaskType valueOf = TaskType.valueOf(this.taskType_);
        return valueOf == null ? TaskType.UNRECOGNIZED : valueOf;
    }

    public int getTaskTypeValue() {
        return this.taskType_;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasInstructor() {
        return this.instructor_ != null;
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
        if (hasInstructor()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getInstructor().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 3) * 53) + this.taskType_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructionsMapping_fieldAccessorTable.ensureFieldAccessorsInitialized(InstructionsMapping.class, Builder.class);
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
        return new InstructionsMapping();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i11 = 0; i11 < this.instructions_.size(); i11++) {
            codedOutputStream.writeMessage(1, this.instructions_.get(i11));
        }
        if (this.instructor_ != null) {
            codedOutputStream.writeMessage(2, getInstructor());
        }
        if (this.taskType_ != TaskType.TASK_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(3, this.taskType_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstructionsMappingOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> instructionsBuilder_;
        private List<Instruction> instructions_;
        private SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> instructorBuilder_;
        private InstructorDetails instructor_;
        private int taskType_;

        private void ensureInstructionsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.instructions_ = new ArrayList(this.instructions_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructionsMapping_descriptor;
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

        private SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> getInstructorFieldBuilder() {
            if (this.instructorBuilder_ == null) {
                this.instructorBuilder_ = new SingleFieldBuilderV3<>(getInstructor(), getParentForChildren(), isClean());
                this.instructor_ = null;
            }
            return this.instructorBuilder_;
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

        public Builder clearInstructor() {
            if (this.instructorBuilder_ == null) {
                this.instructor_ = null;
                onChanged();
            } else {
                this.instructor_ = null;
                this.instructorBuilder_ = null;
            }
            return this;
        }

        public Builder clearTaskType() {
            this.taskType_ = 0;
            onChanged();
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructionsMapping_descriptor;
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

        public InstructorDetails getInstructor() {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            InstructorDetails instructorDetails = this.instructor_;
            return instructorDetails == null ? InstructorDetails.getDefaultInstance() : instructorDetails;
        }

        public InstructorDetails.Builder getInstructorBuilder() {
            onChanged();
            return getInstructorFieldBuilder().getBuilder();
        }

        public InstructorDetailsOrBuilder getInstructorOrBuilder() {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            InstructorDetails instructorDetails = this.instructor_;
            return instructorDetails == null ? InstructorDetails.getDefaultInstance() : instructorDetails;
        }

        public TaskType getTaskType() {
            TaskType valueOf = TaskType.valueOf(this.taskType_);
            return valueOf == null ? TaskType.UNRECOGNIZED : valueOf;
        }

        public int getTaskTypeValue() {
            return this.taskType_;
        }

        public boolean hasInstructor() {
            return (this.instructorBuilder_ == null && this.instructor_ == null) ? false : true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_InstructionsMapping_fieldAccessorTable.ensureFieldAccessorsInitialized(InstructionsMapping.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeInstructor(InstructorDetails instructorDetails) {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 == null) {
                InstructorDetails instructorDetails2 = this.instructor_;
                if (instructorDetails2 != null) {
                    this.instructor_ = InstructorDetails.newBuilder(instructorDetails2).mergeFrom(instructorDetails).buildPartial();
                } else {
                    this.instructor_ = instructorDetails;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(instructorDetails);
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

        public Builder setInstructor(InstructorDetails instructorDetails) {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 == null) {
                Objects.requireNonNull(instructorDetails);
                this.instructor_ = instructorDetails;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(instructorDetails);
            }
            return this;
        }

        public Builder setTaskType(TaskType taskType) {
            Objects.requireNonNull(taskType);
            this.taskType_ = taskType.getNumber();
            onChanged();
            return this;
        }

        public Builder setTaskTypeValue(int i11) {
            this.taskType_ = i11;
            onChanged();
            return this;
        }

        private Builder() {
            this.instructions_ = Collections.emptyList();
            this.taskType_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public InstructionsMapping build() {
            InstructionsMapping buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public InstructionsMapping buildPartial() {
            InstructionsMapping instructionsMapping = new InstructionsMapping((GeneratedMessageV3.Builder) this);
            int i11 = this.bitField0_;
            RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = this.instructionsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i11 & 1) != 0) {
                    this.instructions_ = Collections.unmodifiableList(this.instructions_);
                    this.bitField0_ &= -2;
                }
                List unused = instructionsMapping.instructions_ = this.instructions_;
            } else {
                List unused2 = instructionsMapping.instructions_ = repeatedFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 == null) {
                InstructorDetails unused3 = instructionsMapping.instructor_ = this.instructor_;
            } else {
                InstructorDetails unused4 = instructionsMapping.instructor_ = singleFieldBuilderV3.build();
            }
            int unused5 = instructionsMapping.taskType_ = this.taskType_;
            onBuilt();
            return instructionsMapping;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public InstructionsMapping getDefaultInstanceForType() {
            return InstructionsMapping.getDefaultInstance();
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
            if (this.instructorBuilder_ == null) {
                this.instructor_ = null;
            } else {
                this.instructor_ = null;
                this.instructorBuilder_ = null;
            }
            this.taskType_ = 0;
            return this;
        }

        public Builder setInstructor(InstructorDetails.Builder builder) {
            SingleFieldBuilderV3<InstructorDetails, InstructorDetails.Builder, InstructorDetailsOrBuilder> singleFieldBuilderV3 = this.instructorBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.instructor_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.instructions_ = Collections.emptyList();
            this.taskType_ = 0;
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
            if (message instanceof InstructionsMapping) {
                return mergeFrom((InstructionsMapping) message);
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

        public Builder mergeFrom(InstructionsMapping instructionsMapping) {
            if (instructionsMapping == InstructionsMapping.getDefaultInstance()) {
                return this;
            }
            if (this.instructionsBuilder_ == null) {
                if (!instructionsMapping.instructions_.isEmpty()) {
                    if (this.instructions_.isEmpty()) {
                        this.instructions_ = instructionsMapping.instructions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureInstructionsIsMutable();
                        this.instructions_.addAll(instructionsMapping.instructions_);
                    }
                    onChanged();
                }
            } else if (!instructionsMapping.instructions_.isEmpty()) {
                if (this.instructionsBuilder_.isEmpty()) {
                    this.instructionsBuilder_.dispose();
                    RepeatedFieldBuilderV3<Instruction, Instruction.Builder, InstructionOrBuilder> repeatedFieldBuilderV3 = null;
                    this.instructionsBuilder_ = null;
                    this.instructions_ = instructionsMapping.instructions_;
                    this.bitField0_ &= -2;
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getInstructionsFieldBuilder();
                    }
                    this.instructionsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.instructionsBuilder_.addAllMessages(instructionsMapping.instructions_);
                }
            }
            if (instructionsMapping.hasInstructor()) {
                mergeInstructor(instructionsMapping.getInstructor());
            }
            if (instructionsMapping.taskType_ != 0) {
                setTaskTypeValue(instructionsMapping.getTaskTypeValue());
            }
            mergeUnknownFields(instructionsMapping.unknownFields);
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
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.InstructionsMapping$Builder");
        }
    }

    public static Builder newBuilder(InstructionsMapping instructionsMapping) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(instructionsMapping);
    }

    public static InstructionsMapping parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    private InstructionsMapping(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static InstructionsMapping parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstructionsMapping) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InstructionsMapping parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public InstructionsMapping getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static InstructionsMapping parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private InstructionsMapping() {
        this.memoizedIsInitialized = -1;
        this.instructions_ = Collections.emptyList();
        this.taskType_ = 0;
    }

    public static InstructionsMapping parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static InstructionsMapping parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static InstructionsMapping parseFrom(InputStream inputStream) throws IOException {
        return (InstructionsMapping) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private InstructionsMapping(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                    } else if (readTag == 18) {
                        InstructorDetails.Builder builder = null;
                        InstructorDetails instructorDetails = this.instructor_;
                        builder = instructorDetails != null ? instructorDetails.toBuilder() : builder;
                        InstructorDetails instructorDetails2 = (InstructorDetails) codedInputStream.readMessage(InstructorDetails.parser(), extensionRegistryLite);
                        this.instructor_ = instructorDetails2;
                        if (builder != null) {
                            builder.mergeFrom(instructorDetails2);
                            this.instructor_ = builder.buildPartial();
                        }
                    } else if (readTag == 24) {
                        this.taskType_ = codedInputStream.readEnum();
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

    public static InstructionsMapping parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstructionsMapping) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InstructionsMapping parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InstructionsMapping) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static InstructionsMapping parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InstructionsMapping) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
