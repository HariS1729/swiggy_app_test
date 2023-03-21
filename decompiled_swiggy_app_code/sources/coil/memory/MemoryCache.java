package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import c7.i;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.p;
import v6.d;
import v6.e;
import v6.f;
import v6.g;
import v6.h;

/* compiled from: MemoryCache.kt */
public interface MemoryCache {

    /* compiled from: MemoryCache.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f13647a;

        /* renamed from: b  reason: collision with root package name */
        private double f13648b;

        /* renamed from: c  reason: collision with root package name */
        private int f13649c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13650d = true;

        /* renamed from: e  reason: collision with root package name */
        private boolean f13651e = true;

        public a(Context context) {
            this.f13647a = context;
            this.f13648b = i.d(context);
        }

        public final MemoryCache a() {
            h hVar;
            g gVar;
            int i11;
            if (this.f13651e) {
                hVar = new f();
            } else {
                hVar = new v6.b();
            }
            if (this.f13650d) {
                double d11 = this.f13648b;
                if (d11 > 0.0d) {
                    i11 = i.b(this.f13647a, d11);
                } else {
                    i11 = this.f13649c;
                }
                if (i11 > 0) {
                    gVar = new e(i11, hVar);
                } else {
                    gVar = new v6.a(hVar);
                }
            } else {
                gVar = new v6.a(hVar);
            }
            return new d(gVar, hVar);
        }
    }

    /* compiled from: MemoryCache.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f13652a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Object> f13653b;

        public b(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.f13652a = bitmap;
            this.f13653b = map;
        }

        public final Bitmap a() {
            return this.f13652a;
        }

        public final Map<String, Object> b() {
            return this.f13653b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!p.e(this.f13652a, bVar.f13652a) || !p.e(this.f13653b, bVar.f13653b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13652a.hashCode() * 31) + this.f13653b.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.f13652a + ", extras=" + this.f13653b + ')';
        }
    }

    void a(int i11);

    b b(Key key);

    void c(Key key, b bVar);

    /* compiled from: MemoryCache.kt */
    public static final class Key implements Parcelable {
        public static final Parcelable.Creator<Key> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f13645a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, String> f13646b;

        /* compiled from: MemoryCache.kt */
        public static final class a implements Parcelable.Creator<Key> {
            /* renamed from: a */
            public final Key createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new Key(readString, linkedHashMap);
            }

            /* renamed from: b */
            public final Key[] newArray(int i11) {
                return new Key[i11];
            }
        }

        public Key(String str, Map<String, String> map) {
            this.f13645a = str;
            this.f13646b = map;
        }

        public static /* synthetic */ Key b(Key key, String str, Map<String, String> map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = key.f13645a;
            }
            if ((i11 & 2) != 0) {
                map = key.f13646b;
            }
            return key.a(str, map);
        }

        public final Key a(String str, Map<String, String> map) {
            return new Key(str, map);
        }

        public final Map<String, String> c() {
            return this.f13646b;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (!p.e(this.f13645a, key.f13645a) || !p.e(this.f13646b, key.f13646b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13645a.hashCode() * 31) + this.f13646b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f13645a + ", extras=" + this.f13646b + ')';
        }

        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f13645a);
            Map<String, String> map = this.f13646b;
            parcel.writeInt(map.size());
            for (Map.Entry next : map.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Key(String str, Map map, int i11, kotlin.jvm.internal.i iVar) {
            this(str, (i11 & 2) != 0 ? x.f() : map);
        }
    }
}
