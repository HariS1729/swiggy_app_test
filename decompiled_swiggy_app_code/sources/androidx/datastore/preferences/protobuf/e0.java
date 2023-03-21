package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;

/* compiled from: MapEntryLite */
public class e0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f9998a;

    /* renamed from: b  reason: collision with root package name */
    private final K f9999b;

    /* renamed from: c  reason: collision with root package name */
    private final V f10000c;

    /* compiled from: MapEntryLite */
    static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final WireFormat.FieldType f10001a;

        /* renamed from: b  reason: collision with root package name */
        public final K f10002b;

        /* renamed from: c  reason: collision with root package name */
        public final WireFormat.FieldType f10003c;

        /* renamed from: d  reason: collision with root package name */
        public final V f10004d;

        public a(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
            this.f10001a = fieldType;
            this.f10002b = k;
            this.f10003c = fieldType2;
            this.f10004d = v;
        }
    }

    private e0(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.f9998a = new a<>(fieldType, k, fieldType2, v);
        this.f9999b = k;
        this.f10000c = v;
    }

    static <K, V> int b(a<K, V> aVar, K k, V v) {
        return s.d(aVar.f10001a, 1, k) + s.d(aVar.f10003c, 2, v);
    }

    public static <K, V> e0<K, V> d(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new e0<>(fieldType, k, fieldType2, v);
    }

    static <K, V> void e(CodedOutputStream codedOutputStream, a<K, V> aVar, K k, V v) throws IOException {
        s.z(codedOutputStream, aVar.f10001a, 1, k);
        s.z(codedOutputStream, aVar.f10003c, 2, v);
    }

    public int a(int i11, K k, V v) {
        return CodedOutputStream.V(i11) + CodedOutputStream.C(b(this.f9998a, k, v));
    }

    /* access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f9998a;
    }
}
