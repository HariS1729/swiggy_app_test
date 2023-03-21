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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class Instruction extends GeneratedMessageV3 implements InstructionOrBuilder {
    public static final int ACTIVE_ICON_URL_ID_FIELD_NUMBER = 8;
    public static final int CONDITIONAL_TEXT_FIELD_NUMBER = 10;
    private static final Instruction DEFAULT_INSTANCE = new Instruction();
    public static final int ELIGIBLE_FIELD_NUMBER = 11;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INACTIVE_ICON_URL_ID_FIELD_NUMBER = 9;
    public static final int INCOMPATIBLE_INSTRUCTION_IDS_FIELD_NUMBER = 7;
    public static final int INSTRUCTION_SUMMARY_FIELD_NUMBER = 3;
    public static final int INSTRUCTOR_TEXT_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final Parser<Instruction> PARSER = new AbstractParser<Instruction>() {
        public Instruction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Instruction(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int PREFERRED_FIELD_NUMBER = 5;
    public static final int RIDER_TEXT_FIELD_NUMBER = 13;
    public static final int SELECTED_FIELD_NUMBER = 6;
    public static final int STAGE_FIELD_NUMBER = 14;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 12;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object activeIconUrlId_;
    /* access modifiers changed from: private */
    public volatile Object conditionalText_;
    /* access modifiers changed from: private */
    public boolean eligible_;
    /* access modifiers changed from: private */
    public volatile Object id_;
    /* access modifiers changed from: private */
    public volatile Object inactiveIconUrlId_;
    /* access modifiers changed from: private */
    public LazyStringList incompatibleInstructionIds_;
    /* access modifiers changed from: private */
    public volatile Object instructionSummary_;
    /* access modifiers changed from: private */
    public volatile Object instructorText_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public boolean preferred_;
    /* access modifiers changed from: private */
    public volatile Object riderText_;
    /* access modifiers changed from: private */
    public boolean selected_;
    /* access modifiers changed from: private */
    public int stage_;
    /* access modifiers changed from: private */
    public volatile Object title_;
    /* access modifiers changed from: private */
    public int type_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstructionOrBuilder {
        private Object activeIconUrlId_;
        private int bitField0_;
        private Object conditionalText_;
        private boolean eligible_;
        private Object id_;
        private Object inactiveIconUrlId_;
        private LazyStringList incompatibleInstructionIds_;
        private Object instructionSummary_;
        private Object instructorText_;
        private boolean preferred_;
        private Object riderText_;
        private boolean selected_;
        private int stage_;
        private Object title_;
        private int type_;

        private void ensureIncompatibleInstructionIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.incompatibleInstructionIds_ = new LazyStringArrayList(this.incompatibleInstructionIds_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Instruction_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        public Builder addAllIncompatibleInstructionIds(Iterable<String> iterable) {
            ensureIncompatibleInstructionIdsIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.incompatibleInstructionIds_);
            onChanged();
            return this;
        }

        public Builder addIncompatibleInstructionIds(String str) {
            Objects.requireNonNull(str);
            ensureIncompatibleInstructionIdsIsMutable();
            this.incompatibleInstructionIds_.add(str);
            onChanged();
            return this;
        }

        public Builder addIncompatibleInstructionIdsBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureIncompatibleInstructionIdsIsMutable();
            this.incompatibleInstructionIds_.add(byteString);
            onChanged();
            return this;
        }

        public Builder clearActiveIconUrlId() {
            this.activeIconUrlId_ = Instruction.getDefaultInstance().getActiveIconUrlId();
            onChanged();
            return this;
        }

        public Builder clearConditionalText() {
            this.conditionalText_ = Instruction.getDefaultInstance().getConditionalText();
            onChanged();
            return this;
        }

        public Builder clearEligible() {
            this.eligible_ = false;
            onChanged();
            return this;
        }

        public Builder clearId() {
            this.id_ = Instruction.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearInactiveIconUrlId() {
            this.inactiveIconUrlId_ = Instruction.getDefaultInstance().getInactiveIconUrlId();
            onChanged();
            return this;
        }

        public Builder clearIncompatibleInstructionIds() {
            this.incompatibleInstructionIds_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearInstructionSummary() {
            this.instructionSummary_ = Instruction.getDefaultInstance().getInstructionSummary();
            onChanged();
            return this;
        }

        public Builder clearInstructorText() {
            this.instructorText_ = Instruction.getDefaultInstance().getInstructorText();
            onChanged();
            return this;
        }

        public Builder clearPreferred() {
            this.preferred_ = false;
            onChanged();
            return this;
        }

        public Builder clearRiderText() {
            this.riderText_ = Instruction.getDefaultInstance().getRiderText();
            onChanged();
            return this;
        }

        public Builder clearSelected() {
            this.selected_ = false;
            onChanged();
            return this;
        }

        public Builder clearStage() {
            this.stage_ = 0;
            onChanged();
            return this;
        }

        public Builder clearTitle() {
            this.title_ = Instruction.getDefaultInstance().getTitle();
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.type_ = 0;
            onChanged();
            return this;
        }

        public String getActiveIconUrlId() {
            Object obj = this.activeIconUrlId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.activeIconUrlId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getActiveIconUrlIdBytes() {
            Object obj = this.activeIconUrlId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.activeIconUrlId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getConditionalText() {
            Object obj = this.conditionalText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.conditionalText_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getConditionalTextBytes() {
            Object obj = this.conditionalText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.conditionalText_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Instruction_descriptor;
        }

        public boolean getEligible() {
            return this.eligible_;
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getInactiveIconUrlId() {
            Object obj = this.inactiveIconUrlId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.inactiveIconUrlId_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getInactiveIconUrlIdBytes() {
            Object obj = this.inactiveIconUrlId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.inactiveIconUrlId_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getIncompatibleInstructionIds(int i11) {
            return (String) this.incompatibleInstructionIds_.get(i11);
        }

        public ByteString getIncompatibleInstructionIdsBytes(int i11) {
            return this.incompatibleInstructionIds_.getByteString(i11);
        }

        public int getIncompatibleInstructionIdsCount() {
            return this.incompatibleInstructionIds_.size();
        }

        public String getInstructionSummary() {
            Object obj = this.instructionSummary_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.instructionSummary_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getInstructionSummaryBytes() {
            Object obj = this.instructionSummary_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.instructionSummary_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getInstructorText() {
            Object obj = this.instructorText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.instructorText_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getInstructorTextBytes() {
            Object obj = this.instructorText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.instructorText_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean getPreferred() {
            return this.preferred_;
        }

        public String getRiderText() {
            Object obj = this.riderText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.riderText_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getRiderTextBytes() {
            Object obj = this.riderText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.riderText_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean getSelected() {
            return this.selected_;
        }

        public InstructionStage getStage() {
            InstructionStage valueOf = InstructionStage.valueOf(this.stage_);
            return valueOf == null ? InstructionStage.UNRECOGNIZED : valueOf;
        }

        public int getStageValue() {
            return this.stage_;
        }

        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.title_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public InstructionType getType() {
            InstructionType valueOf = InstructionType.valueOf(this.type_);
            return valueOf == null ? InstructionType.UNRECOGNIZED : valueOf;
        }

        public int getTypeValue() {
            return this.type_;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Instruction_fieldAccessorTable.ensureFieldAccessorsInitialized(Instruction.class, Builder.class);
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder setActiveIconUrlId(String str) {
            Objects.requireNonNull(str);
            this.activeIconUrlId_ = str;
            onChanged();
            return this;
        }

        public Builder setActiveIconUrlIdBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.activeIconUrlId_ = byteString;
            onChanged();
            return this;
        }

        public Builder setConditionalText(String str) {
            Objects.requireNonNull(str);
            this.conditionalText_ = str;
            onChanged();
            return this;
        }

        public Builder setConditionalTextBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.conditionalText_ = byteString;
            onChanged();
            return this;
        }

        public Builder setEligible(boolean z11) {
            this.eligible_ = z11;
            onChanged();
            return this;
        }

        public Builder setId(String str) {
            Objects.requireNonNull(str);
            this.id_ = str;
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.id_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInactiveIconUrlId(String str) {
            Objects.requireNonNull(str);
            this.inactiveIconUrlId_ = str;
            onChanged();
            return this;
        }

        public Builder setInactiveIconUrlIdBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.inactiveIconUrlId_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIncompatibleInstructionIds(int i11, String str) {
            Objects.requireNonNull(str);
            ensureIncompatibleInstructionIdsIsMutable();
            this.incompatibleInstructionIds_.set(i11, str);
            onChanged();
            return this;
        }

        public Builder setInstructionSummary(String str) {
            Objects.requireNonNull(str);
            this.instructionSummary_ = str;
            onChanged();
            return this;
        }

        public Builder setInstructionSummaryBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.instructionSummary_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInstructorText(String str) {
            Objects.requireNonNull(str);
            this.instructorText_ = str;
            onChanged();
            return this;
        }

        public Builder setInstructorTextBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.instructorText_ = byteString;
            onChanged();
            return this;
        }

        public Builder setPreferred(boolean z11) {
            this.preferred_ = z11;
            onChanged();
            return this;
        }

        public Builder setRiderText(String str) {
            Objects.requireNonNull(str);
            this.riderText_ = str;
            onChanged();
            return this;
        }

        public Builder setRiderTextBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.riderText_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSelected(boolean z11) {
            this.selected_ = z11;
            onChanged();
            return this;
        }

        public Builder setStage(InstructionStage instructionStage) {
            Objects.requireNonNull(instructionStage);
            this.stage_ = instructionStage.getNumber();
            onChanged();
            return this;
        }

        public Builder setStageValue(int i11) {
            this.stage_ = i11;
            onChanged();
            return this;
        }

        public Builder setTitle(String str) {
            Objects.requireNonNull(str);
            this.title_ = str;
            onChanged();
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.title_ = byteString;
            onChanged();
            return this;
        }

        public Builder setType(InstructionType instructionType) {
            Objects.requireNonNull(instructionType);
            this.type_ = instructionType.getNumber();
            onChanged();
            return this;
        }

        public Builder setTypeValue(int i11) {
            this.type_ = i11;
            onChanged();
            return this;
        }

        public ProtocolStringList getIncompatibleInstructionIdsList() {
            return this.incompatibleInstructionIds_.getUnmodifiableView();
        }

        private Builder() {
            this.id_ = "";
            this.title_ = "";
            this.instructionSummary_ = "";
            this.instructorText_ = "";
            this.incompatibleInstructionIds_ = LazyStringArrayList.EMPTY;
            this.activeIconUrlId_ = "";
            this.inactiveIconUrlId_ = "";
            this.conditionalText_ = "";
            this.type_ = 0;
            this.riderText_ = "";
            this.stage_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public Instruction build() {
            Instruction buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException(buildPartial);
        }

        public Instruction buildPartial() {
            Instruction instruction = new Instruction((GeneratedMessageV3.Builder) this);
            Object unused = instruction.id_ = this.id_;
            Object unused2 = instruction.title_ = this.title_;
            Object unused3 = instruction.instructionSummary_ = this.instructionSummary_;
            Object unused4 = instruction.instructorText_ = this.instructorText_;
            boolean unused5 = instruction.preferred_ = this.preferred_;
            boolean unused6 = instruction.selected_ = this.selected_;
            if ((this.bitField0_ & 1) != 0) {
                this.incompatibleInstructionIds_ = this.incompatibleInstructionIds_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            LazyStringList unused7 = instruction.incompatibleInstructionIds_ = this.incompatibleInstructionIds_;
            Object unused8 = instruction.activeIconUrlId_ = this.activeIconUrlId_;
            Object unused9 = instruction.inactiveIconUrlId_ = this.inactiveIconUrlId_;
            Object unused10 = instruction.conditionalText_ = this.conditionalText_;
            boolean unused11 = instruction.eligible_ = this.eligible_;
            int unused12 = instruction.type_ = this.type_;
            Object unused13 = instruction.riderText_ = this.riderText_;
            int unused14 = instruction.stage_ = this.stage_;
            onBuilt();
            return instruction;
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Instruction getDefaultInstanceForType() {
            return Instruction.getDefaultInstance();
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
            this.id_ = "";
            this.title_ = "";
            this.instructionSummary_ = "";
            this.instructorText_ = "";
            this.preferred_ = false;
            this.selected_ = false;
            this.incompatibleInstructionIds_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.activeIconUrlId_ = "";
            this.inactiveIconUrlId_ = "";
            this.conditionalText_ = "";
            this.eligible_ = false;
            this.type_ = 0;
            this.riderText_ = "";
            this.stage_ = 0;
            return this;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof Instruction) {
                return mergeFrom((Instruction) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Instruction instruction) {
            if (instruction == Instruction.getDefaultInstance()) {
                return this;
            }
            if (!instruction.getId().isEmpty()) {
                this.id_ = instruction.id_;
                onChanged();
            }
            if (!instruction.getTitle().isEmpty()) {
                this.title_ = instruction.title_;
                onChanged();
            }
            if (!instruction.getInstructionSummary().isEmpty()) {
                this.instructionSummary_ = instruction.instructionSummary_;
                onChanged();
            }
            if (!instruction.getInstructorText().isEmpty()) {
                this.instructorText_ = instruction.instructorText_;
                onChanged();
            }
            if (instruction.getPreferred()) {
                setPreferred(instruction.getPreferred());
            }
            if (instruction.getSelected()) {
                setSelected(instruction.getSelected());
            }
            if (!instruction.incompatibleInstructionIds_.isEmpty()) {
                if (this.incompatibleInstructionIds_.isEmpty()) {
                    this.incompatibleInstructionIds_ = instruction.incompatibleInstructionIds_;
                    this.bitField0_ &= -2;
                } else {
                    ensureIncompatibleInstructionIdsIsMutable();
                    this.incompatibleInstructionIds_.addAll(instruction.incompatibleInstructionIds_);
                }
                onChanged();
            }
            if (!instruction.getActiveIconUrlId().isEmpty()) {
                this.activeIconUrlId_ = instruction.activeIconUrlId_;
                onChanged();
            }
            if (!instruction.getInactiveIconUrlId().isEmpty()) {
                this.inactiveIconUrlId_ = instruction.inactiveIconUrlId_;
                onChanged();
            }
            if (!instruction.getConditionalText().isEmpty()) {
                this.conditionalText_ = instruction.conditionalText_;
                onChanged();
            }
            if (instruction.getEligible()) {
                setEligible(instruction.getEligible());
            }
            if (instruction.type_ != 0) {
                setTypeValue(instruction.getTypeValue());
            }
            if (!instruction.getRiderText().isEmpty()) {
                this.riderText_ = instruction.riderText_;
                onChanged();
            }
            if (instruction.stage_ != 0) {
                setStageValue(instruction.getStageValue());
            }
            mergeUnknownFields(instruction.unknownFields);
            onChanged();
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.id_ = "";
            this.title_ = "";
            this.instructionSummary_ = "";
            this.instructorText_ = "";
            this.incompatibleInstructionIds_ = LazyStringArrayList.EMPTY;
            this.activeIconUrlId_ = "";
            this.inactiveIconUrlId_ = "";
            this.conditionalText_ = "";
            this.type_ = 0;
            this.riderText_ = "";
            this.stage_ = 0;
            maybeForceBuilderInitialization();
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction.Builder mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.Parser r1 = com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.google.protobuf.CodedInputStream) r3, (com.google.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction r3 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction r4 = (com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction.Builder.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1.Instruction$Builder");
        }
    }

    public static Instruction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Instruction_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Instruction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Instruction) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Instruction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Instruction> parser() {
        return PARSER;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Instruction)) {
            return super.equals(obj);
        }
        Instruction instruction = (Instruction) obj;
        if (getId().equals(instruction.getId()) && getTitle().equals(instruction.getTitle()) && getInstructionSummary().equals(instruction.getInstructionSummary()) && getInstructorText().equals(instruction.getInstructorText()) && getPreferred() == instruction.getPreferred() && getSelected() == instruction.getSelected() && getIncompatibleInstructionIdsList().equals(instruction.getIncompatibleInstructionIdsList()) && getActiveIconUrlId().equals(instruction.getActiveIconUrlId()) && getInactiveIconUrlId().equals(instruction.getInactiveIconUrlId()) && getConditionalText().equals(instruction.getConditionalText()) && getEligible() == instruction.getEligible() && this.type_ == instruction.type_ && getRiderText().equals(instruction.getRiderText()) && this.stage_ == instruction.stage_ && this.unknownFields.equals(instruction.unknownFields)) {
            return true;
        }
        return false;
    }

    public String getActiveIconUrlId() {
        Object obj = this.activeIconUrlId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.activeIconUrlId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getActiveIconUrlIdBytes() {
        Object obj = this.activeIconUrlId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.activeIconUrlId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getConditionalText() {
        Object obj = this.conditionalText_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.conditionalText_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getConditionalTextBytes() {
        Object obj = this.conditionalText_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.conditionalText_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean getEligible() {
        return this.eligible_;
    }

    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getInactiveIconUrlId() {
        Object obj = this.inactiveIconUrlId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.inactiveIconUrlId_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getInactiveIconUrlIdBytes() {
        Object obj = this.inactiveIconUrlId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.inactiveIconUrlId_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getIncompatibleInstructionIds(int i11) {
        return (String) this.incompatibleInstructionIds_.get(i11);
    }

    public ByteString getIncompatibleInstructionIdsBytes(int i11) {
        return this.incompatibleInstructionIds_.getByteString(i11);
    }

    public int getIncompatibleInstructionIdsCount() {
        return this.incompatibleInstructionIds_.size();
    }

    public String getInstructionSummary() {
        Object obj = this.instructionSummary_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.instructionSummary_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getInstructionSummaryBytes() {
        Object obj = this.instructionSummary_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.instructionSummary_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getInstructorText() {
        Object obj = this.instructorText_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.instructorText_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getInstructorTextBytes() {
        Object obj = this.instructorText_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.instructorText_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public Parser<Instruction> getParserForType() {
        return PARSER;
    }

    public boolean getPreferred() {
        return this.preferred_;
    }

    public String getRiderText() {
        Object obj = this.riderText_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.riderText_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getRiderTextBytes() {
        Object obj = this.riderText_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.riderText_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean getSelected() {
        return this.selected_;
    }

    public int getSerializedSize() {
        int i11 = this.memoizedSize;
        if (i11 != -1) {
            return i11;
        }
        int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
        if (!getTitleBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.title_);
        }
        if (!getInstructionSummaryBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(3, this.instructionSummary_);
        }
        if (!getInstructorTextBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(4, this.instructorText_);
        }
        boolean z11 = this.preferred_;
        if (z11) {
            computeStringSize += CodedOutputStream.computeBoolSize(5, z11);
        }
        boolean z12 = this.selected_;
        if (z12) {
            computeStringSize += CodedOutputStream.computeBoolSize(6, z12);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.incompatibleInstructionIds_.size(); i13++) {
            i12 += GeneratedMessageV3.computeStringSizeNoTag(this.incompatibleInstructionIds_.getRaw(i13));
        }
        int size = computeStringSize + i12 + (getIncompatibleInstructionIdsList().size() * 1);
        if (!getActiveIconUrlIdBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(8, this.activeIconUrlId_);
        }
        if (!getInactiveIconUrlIdBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(9, this.inactiveIconUrlId_);
        }
        if (!getConditionalTextBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(10, this.conditionalText_);
        }
        boolean z13 = this.eligible_;
        if (z13) {
            size += CodedOutputStream.computeBoolSize(11, z13);
        }
        if (this.type_ != InstructionType.INSTRUCTION_TYPE_INVALID.getNumber()) {
            size += CodedOutputStream.computeEnumSize(12, this.type_);
        }
        if (!getRiderTextBytes().isEmpty()) {
            size += GeneratedMessageV3.computeStringSize(13, this.riderText_);
        }
        if (this.stage_ != InstructionStage.INSTRUCTION_STAGE_INVALID.getNumber()) {
            size += CodedOutputStream.computeEnumSize(14, this.stage_);
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public InstructionStage getStage() {
        InstructionStage valueOf = InstructionStage.valueOf(this.stage_);
        return valueOf == null ? InstructionStage.UNRECOGNIZED : valueOf;
    }

    public int getStageValue() {
        return this.stage_;
    }

    public String getTitle() {
        Object obj = this.title_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.title_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTitleBytes() {
        Object obj = this.title_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.title_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public InstructionType getType() {
        InstructionType valueOf = InstructionType.valueOf(this.type_);
        return valueOf == null ? InstructionType.UNRECOGNIZED : valueOf;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public int hashCode() {
        int i11 = this.memoizedHashCode;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getTitle().hashCode()) * 37) + 3) * 53) + getInstructionSummary().hashCode()) * 37) + 4) * 53) + getInstructorText().hashCode()) * 37) + 5) * 53) + Internal.hashBoolean(getPreferred())) * 37) + 6) * 53) + Internal.hashBoolean(getSelected());
        if (getIncompatibleInstructionIdsCount() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + getIncompatibleInstructionIdsList().hashCode();
        }
        int hashCode2 = (((((((((((((((((((((((((((((hashCode * 37) + 8) * 53) + getActiveIconUrlId().hashCode()) * 37) + 9) * 53) + getInactiveIconUrlId().hashCode()) * 37) + 10) * 53) + getConditionalText().hashCode()) * 37) + 11) * 53) + Internal.hashBoolean(getEligible())) * 37) + 12) * 53) + this.type_) * 37) + 13) * 53) + getRiderText().hashCode()) * 37) + 14) * 53) + this.stage_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return DeliveryInstructorMessagesProto.internal_static_swiggy_delivery_deliverycontroller_deliveryinstructor_v1_Instruction_fieldAccessorTable.ensureFieldAccessorsInitialized(Instruction.class, Builder.class);
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
        return new Instruction();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
        }
        if (!getTitleBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.title_);
        }
        if (!getInstructionSummaryBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.instructionSummary_);
        }
        if (!getInstructorTextBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.instructorText_);
        }
        boolean z11 = this.preferred_;
        if (z11) {
            codedOutputStream.writeBool(5, z11);
        }
        boolean z12 = this.selected_;
        if (z12) {
            codedOutputStream.writeBool(6, z12);
        }
        for (int i11 = 0; i11 < this.incompatibleInstructionIds_.size(); i11++) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.incompatibleInstructionIds_.getRaw(i11));
        }
        if (!getActiveIconUrlIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.activeIconUrlId_);
        }
        if (!getInactiveIconUrlIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.inactiveIconUrlId_);
        }
        if (!getConditionalTextBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 10, this.conditionalText_);
        }
        boolean z13 = this.eligible_;
        if (z13) {
            codedOutputStream.writeBool(11, z13);
        }
        if (this.type_ != InstructionType.INSTRUCTION_TYPE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(12, this.type_);
        }
        if (!getRiderTextBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.riderText_);
        }
        if (this.stage_ != InstructionStage.INSTRUCTION_STAGE_INVALID.getNumber()) {
            codedOutputStream.writeEnum(14, this.stage_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Builder newBuilder(Instruction instruction) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(instruction);
    }

    public static Instruction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public ProtocolStringList getIncompatibleInstructionIdsList() {
        return this.incompatibleInstructionIds_;
    }

    private Instruction(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    public static Instruction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Instruction) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Instruction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public Instruction getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public Builder toBuilder() {
        if (this == DEFAULT_INSTANCE) {
            return new Builder();
        }
        return new Builder().mergeFrom(this);
    }

    public static Instruction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Instruction() {
        this.memoizedIsInitialized = -1;
        this.id_ = "";
        this.title_ = "";
        this.instructionSummary_ = "";
        this.instructorText_ = "";
        this.incompatibleInstructionIds_ = LazyStringArrayList.EMPTY;
        this.activeIconUrlId_ = "";
        this.inactiveIconUrlId_ = "";
        this.conditionalText_ = "";
        this.type_ = 0;
        this.riderText_ = "";
        this.stage_ = 0;
    }

    public static Instruction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Instruction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Instruction parseFrom(InputStream inputStream) throws IOException {
        return (Instruction) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Instruction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Instruction) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Instruction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Instruction) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Instruction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Instruction) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    private Instruction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Objects.requireNonNull(extensionRegistryLite);
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z11 = false;
        boolean z12 = false;
        while (!z11) {
            try {
                int readTag = codedInputStream.readTag();
                switch (readTag) {
                    case 0:
                        z11 = true;
                        break;
                    case 10:
                        this.id_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 18:
                        this.title_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 26:
                        this.instructionSummary_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 34:
                        this.instructorText_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 40:
                        this.preferred_ = codedInputStream.readBool();
                        break;
                    case 48:
                        this.selected_ = codedInputStream.readBool();
                        break;
                    case 58:
                        String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                        if (!z12 || !true) {
                            this.incompatibleInstructionIds_ = new LazyStringArrayList();
                            z12 |= true;
                        }
                        this.incompatibleInstructionIds_.add(readStringRequireUtf8);
                        break;
                    case 66:
                        this.activeIconUrlId_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 74:
                        this.inactiveIconUrlId_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 82:
                        this.conditionalText_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 88:
                        this.eligible_ = codedInputStream.readBool();
                        break;
                    case 96:
                        this.type_ = codedInputStream.readEnum();
                        break;
                    case 106:
                        this.riderText_ = codedInputStream.readStringRequireUtf8();
                        break;
                    case 112:
                        this.stage_ = codedInputStream.readEnum();
                        break;
                    default:
                        if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            break;
                        }
                        z11 = true;
                        break;
                }
            } catch (InvalidProtocolBufferException e11) {
                throw e11.setUnfinishedMessage(this);
            } catch (IOException e12) {
                throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(this);
            } catch (Throwable th2) {
                if (z12 && true) {
                    this.incompatibleInstructionIds_ = this.incompatibleInstructionIds_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z12 && true) {
            this.incompatibleInstructionIds_ = this.incompatibleInstructionIds_.getUnmodifiableView();
        }
        this.unknownFields = newBuilder.build();
        makeExtensionsImmutable();
    }
}
