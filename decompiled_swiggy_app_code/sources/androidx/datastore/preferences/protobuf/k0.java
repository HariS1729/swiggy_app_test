package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: MessageLite */
public interface k0 extends l0 {

    /* compiled from: MessageLite */
    public interface a extends l0, Cloneable {
        a a(k0 k0Var);

        k0 build();

        k0 buildPartial();
    }

    void b(CodedOutputStream codedOutputStream) throws IOException;

    s0<? extends k0> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    ByteString toByteString();
}
