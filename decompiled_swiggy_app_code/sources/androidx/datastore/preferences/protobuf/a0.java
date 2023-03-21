package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: LazyStringList */
public interface a0 extends List {
    Object getRaw(int i11);

    List<?> getUnderlyingElements();

    a0 getUnmodifiableView();

    void w(ByteString byteString);
}
