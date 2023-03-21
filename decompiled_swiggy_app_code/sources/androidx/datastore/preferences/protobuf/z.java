package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList */
public class z extends c<String> implements a0, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final z f10136c;

    /* renamed from: d  reason: collision with root package name */
    public static final a0 f10137d;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f10138b;

    static {
        z zVar = new z();
        f10136c = zVar;
        zVar.makeImmutable();
        f10137d = zVar;
    }

    public z() {
        this(10);
    }

    private static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).F();
        }
        return w.j((byte[]) obj);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        c();
        this.f10138b.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public void add(int i11, String str) {
        c();
        this.f10138b.add(i11, str);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public String get(int i11) {
        Object obj = this.f10138b.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String F = byteString.F();
            if (byteString.m()) {
                this.f10138b.set(i11, F);
            }
            return F;
        }
        byte[] bArr = (byte[]) obj;
        String j = w.j(bArr);
        if (w.g(bArr)) {
            this.f10138b.set(i11, j);
        }
        return j;
    }

    /* renamed from: g */
    public z mutableCopyWithCapacity(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.f10138b);
            return new z((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Object getRaw(int i11) {
        return this.f10138b.get(i11);
    }

    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f10138b);
    }

    public a0 getUnmodifiableView() {
        return isModifiable() ? new h1(this) : this;
    }

    /* renamed from: h */
    public String remove(int i11) {
        c();
        Object remove = this.f10138b.remove(i11);
        this.modCount++;
        return e(remove);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public String set(int i11, String str) {
        c();
        return e(this.f10138b.set(i11, str));
    }

    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f10138b.size();
    }

    public void w(ByteString byteString) {
        c();
        this.f10138b.add(byteString);
        this.modCount++;
    }

    public z(int i11) {
        this((ArrayList<Object>) new ArrayList(i11));
    }

    public boolean addAll(int i11, Collection<? extends String> collection) {
        c();
        if (collection instanceof a0) {
            collection = ((a0) collection).getUnderlyingElements();
        }
        boolean addAll = this.f10138b.addAll(i11, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private z(ArrayList<Object> arrayList) {
        this.f10138b = arrayList;
    }
}
