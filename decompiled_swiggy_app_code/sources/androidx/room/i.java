package androidx.room;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import defpackage.s1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import t3.e;
import t3.f;
import t3.g;
import t3.h;
import t3.j;
import t3.k;

/* compiled from: AutoClosingRoomOpenHelper */
final class i implements h, p {

    /* renamed from: a  reason: collision with root package name */
    private final h f11564a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11565b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11566c;

    /* compiled from: AutoClosingRoomOpenHelper */
    static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private final a f11567a;

        a(a aVar) {
            this.f11567a = aVar;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ Object x(g gVar) {
            return null;
        }

        public void C0() {
            if (this.f11567a.d() != null) {
                try {
                    this.f11567a.d().C0();
                } finally {
                    this.f11567a.b();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        public k T0(String str) {
            return new b(str, this.f11567a);
        }

        public Cursor b1(String str) {
            try {
                return new c(this.f11567a.e().b1(str), this.f11567a);
            } catch (Throwable th2) {
                this.f11567a.b();
                throw th2;
            }
        }

        public Cursor c0(j jVar, CancellationSignal cancellationSignal) {
            try {
                return new c(this.f11567a.e().c0(jVar, cancellationSignal), this.f11567a);
            } catch (Throwable th2) {
                this.f11567a.b();
                throw th2;
            }
        }

        public void close() throws IOException {
            this.f11567a.a();
        }

        public boolean f1() {
            if (this.f11567a.d() == null) {
                return false;
            }
            return ((Boolean) this.f11567a.c(h.f11560a)).booleanValue();
        }

        public boolean g1() {
            return ((Boolean) this.f11567a.c(d.f11546a)).booleanValue();
        }

        public String getPath() {
            return (String) this.f11567a.c(g.f11556a);
        }

        public boolean isOpen() {
            g d11 = this.f11567a.d();
            if (d11 == null) {
                return false;
            }
            return d11.isOpen();
        }

        public Cursor j0(j jVar) {
            try {
                return new c(this.f11567a.e().j0(jVar), this.f11567a);
            } catch (Throwable th2) {
                this.f11567a.b();
                throw th2;
            }
        }

        public void l() {
            try {
                this.f11567a.e().l();
            } catch (Throwable th2) {
                this.f11567a.b();
                throw th2;
            }
        }

        public List<Pair<String, String>> m() {
            return (List) this.f11567a.c(f.f11552a);
        }

        public void m0(String str) throws SQLException {
            this.f11567a.c(new b(str));
        }

        public void s() {
            try {
                this.f11567a.e().s();
            } catch (Throwable th2) {
                this.f11567a.b();
                throw th2;
            }
        }

        /* access modifiers changed from: package-private */
        public void y() {
            this.f11567a.c(e.f11549a);
        }

        public void y0() {
            g d11 = this.f11567a.d();
            if (d11 != null) {
                d11.y0();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        public void z0(String str, Object[] objArr) throws SQLException {
            this.f11567a.c(new c(str, objArr));
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper */
    private static class b implements k {

        /* renamed from: a  reason: collision with root package name */
        private final String f11568a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<Object> f11569b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private final a f11570c;

        b(String str, a aVar) {
            this.f11568a = str;
            this.f11570c = aVar;
        }

        private void b(k kVar) {
            int i11 = 0;
            while (i11 < this.f11569b.size()) {
                int i12 = i11 + 1;
                Object obj = this.f11569b.get(i11);
                if (obj == null) {
                    kVar.b0(i12);
                } else if (obj instanceof Long) {
                    kVar.R(i12, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.o0(i12, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.K(i12, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.S(i12, (byte[]) obj);
                }
                i11 = i12;
            }
        }

        private <T> T f(s1.b<k, T> bVar) {
            return this.f11570c.c(new j(this, bVar));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object g(s1.b bVar, g gVar) {
            k T0 = gVar.T0(this.f11568a);
            b(T0);
            return bVar.apply(T0);
        }

        private void j(int i11, Object obj) {
            int i12 = i11 - 1;
            if (i12 >= this.f11569b.size()) {
                for (int size = this.f11569b.size(); size <= i12; size++) {
                    this.f11569b.add((Object) null);
                }
            }
            this.f11569b.set(i12, obj);
        }

        public void K(int i11, String str) {
            j(i11, str);
        }

        public long P0() {
            return ((Long) f(l.f11585a)).longValue();
        }

        public void R(int i11, long j) {
            j(i11, Long.valueOf(j));
        }

        public void S(int i11, byte[] bArr) {
            j(i11, bArr);
        }

        public void b0(int i11) {
            j(i11, (Object) null);
        }

        public void close() throws IOException {
        }

        public int n() {
            return ((Integer) f(k.f11581a)).intValue();
        }

        public void o0(int i11, double d11) {
            j(i11, Double.valueOf(d11));
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper */
    private static final class c implements Cursor {

        /* renamed from: a  reason: collision with root package name */
        private final Cursor f11571a;

        /* renamed from: b  reason: collision with root package name */
        private final a f11572b;

        c(Cursor cursor, a aVar) {
            this.f11571a = cursor;
            this.f11572b = aVar;
        }

        public void close() {
            this.f11571a.close();
            this.f11572b.b();
        }

        public void copyStringToBuffer(int i11, CharArrayBuffer charArrayBuffer) {
            this.f11571a.copyStringToBuffer(i11, charArrayBuffer);
        }

        @Deprecated
        public void deactivate() {
            this.f11571a.deactivate();
        }

        public byte[] getBlob(int i11) {
            return this.f11571a.getBlob(i11);
        }

        public int getColumnCount() {
            return this.f11571a.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f11571a.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.f11571a.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i11) {
            return this.f11571a.getColumnName(i11);
        }

        public String[] getColumnNames() {
            return this.f11571a.getColumnNames();
        }

        public int getCount() {
            return this.f11571a.getCount();
        }

        public double getDouble(int i11) {
            return this.f11571a.getDouble(i11);
        }

        public Bundle getExtras() {
            return this.f11571a.getExtras();
        }

        public float getFloat(int i11) {
            return this.f11571a.getFloat(i11);
        }

        public int getInt(int i11) {
            return this.f11571a.getInt(i11);
        }

        public long getLong(int i11) {
            return this.f11571a.getLong(i11);
        }

        public Uri getNotificationUri() {
            return t3.c.a(this.f11571a);
        }

        public List<Uri> getNotificationUris() {
            return f.a(this.f11571a);
        }

        public int getPosition() {
            return this.f11571a.getPosition();
        }

        public short getShort(int i11) {
            return this.f11571a.getShort(i11);
        }

        public String getString(int i11) {
            return this.f11571a.getString(i11);
        }

        public int getType(int i11) {
            return this.f11571a.getType(i11);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f11571a.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f11571a.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f11571a.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f11571a.isClosed();
        }

        public boolean isFirst() {
            return this.f11571a.isFirst();
        }

        public boolean isLast() {
            return this.f11571a.isLast();
        }

        public boolean isNull(int i11) {
            return this.f11571a.isNull(i11);
        }

        public boolean move(int i11) {
            return this.f11571a.move(i11);
        }

        public boolean moveToFirst() {
            return this.f11571a.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f11571a.moveToLast();
        }

        public boolean moveToNext() {
            return this.f11571a.moveToNext();
        }

        public boolean moveToPosition(int i11) {
            return this.f11571a.moveToPosition(i11);
        }

        public boolean moveToPrevious() {
            return this.f11571a.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f11571a.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f11571a.registerDataSetObserver(dataSetObserver);
        }

        @Deprecated
        public boolean requery() {
            return this.f11571a.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f11571a.respond(bundle);
        }

        public void setExtras(Bundle bundle) {
            e.a(this.f11571a, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f11571a.setNotificationUri(contentResolver, uri);
        }

        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            f.b(this.f11571a, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f11571a.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f11571a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    i(h hVar, a aVar) {
        this.f11564a = hVar;
        this.f11566c = aVar;
        aVar.f(hVar);
        this.f11565b = new a(aVar);
    }

    /* access modifiers changed from: package-private */
    public a a() {
        return this.f11566c;
    }

    public void close() {
        try {
            this.f11565b.close();
        } catch (IOException e11) {
            m3.e.a(e11);
        }
    }

    public String getDatabaseName() {
        return this.f11564a.getDatabaseName();
    }

    public h getDelegate() {
        return this.f11564a;
    }

    public g i() {
        this.f11565b.y();
        return this.f11565b;
    }

    public void setWriteAheadLoggingEnabled(boolean z11) {
        this.f11564a.setWriteAheadLoggingEnabled(z11);
    }
}
