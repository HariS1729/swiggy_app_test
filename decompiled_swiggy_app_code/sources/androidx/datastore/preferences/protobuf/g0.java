package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.e0;
import java.util.Map;

/* compiled from: MapFieldSchemaLite */
class g0 implements f0 {
    g0() {
    }

    private static <K, V> int a(int i11, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        e0 e0Var = (e0) obj2;
        int i12 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i12 += e0Var.a(i11, entry.getKey(), entry.getValue());
        }
        return i12;
    }

    private static <K, V> MapFieldLite<K, V> b(Object obj, Object obj2) {
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.n()) {
                mapFieldLite = mapFieldLite.q();
            }
            mapFieldLite.p(mapFieldLite2);
        }
        return mapFieldLite;
    }

    public Map<?, ?> forMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    public e0.a<?, ?> forMapMetadata(Object obj) {
        return ((e0) obj).c();
    }

    public Map<?, ?> forMutableMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    public int getSerializedSize(int i11, Object obj, Object obj2) {
        return a(i11, obj, obj2);
    }

    public boolean isImmutable(Object obj) {
        return !((MapFieldLite) obj).n();
    }

    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    public Object newMapField(Object obj) {
        return MapFieldLite.h().q();
    }

    public Object toImmutable(Object obj) {
        ((MapFieldLite) obj).o();
        return obj;
    }
}
