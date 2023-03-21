package com.swiggy.delivery.deliverycontroller.deliveryinstructor.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface InstructionOrBuilder extends MessageOrBuilder {
    String getActiveIconUrlId();

    ByteString getActiveIconUrlIdBytes();

    String getConditionalText();

    ByteString getConditionalTextBytes();

    boolean getEligible();

    String getId();

    ByteString getIdBytes();

    String getInactiveIconUrlId();

    ByteString getInactiveIconUrlIdBytes();

    String getIncompatibleInstructionIds(int i11);

    ByteString getIncompatibleInstructionIdsBytes(int i11);

    int getIncompatibleInstructionIdsCount();

    List<String> getIncompatibleInstructionIdsList();

    String getInstructionSummary();

    ByteString getInstructionSummaryBytes();

    String getInstructorText();

    ByteString getInstructorTextBytes();

    boolean getPreferred();

    String getRiderText();

    ByteString getRiderTextBytes();

    boolean getSelected();

    InstructionStage getStage();

    int getStageValue();

    String getTitle();

    ByteString getTitleBytes();

    InstructionType getType();

    int getTypeValue();
}
