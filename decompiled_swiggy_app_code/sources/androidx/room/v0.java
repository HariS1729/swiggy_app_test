package androidx.room;

import android.content.Context;
import android.util.Log;
import io.sentry.instrumentation.file.h;
import io.sentry.instrumentation.file.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Objects;
import java.util.concurrent.Callable;
import m3.a;
import m3.c;
import m3.d;
import t3.g;
import t3.h;

/* compiled from: SQLiteCopyOpenHelper */
class v0 implements h, p {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11635a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11636b;

    /* renamed from: c  reason: collision with root package name */
    private final File f11637c;

    /* renamed from: d  reason: collision with root package name */
    private final Callable<InputStream> f11638d;

    /* renamed from: e  reason: collision with root package name */
    private final int f11639e;

    /* renamed from: f  reason: collision with root package name */
    private final h f11640f;

    /* renamed from: g  reason: collision with root package name */
    private o f11641g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11642h;

    v0(Context context, String str, File file, Callable<InputStream> callable, int i11, h hVar) {
        this.f11635a = context;
        this.f11636b = str;
        this.f11637c = file;
        this.f11638d = callable;
        this.f11639e = i11;
        this.f11640f = hVar;
    }

    private void a(File file, boolean z11) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.f11636b != null) {
            readableByteChannel = Channels.newChannel(this.f11635a.getAssets().open(this.f11636b));
        } else if (this.f11637c != null) {
            File file2 = this.f11637c;
            readableByteChannel = h.b.a(new FileInputStream(file2), file2).getChannel();
        } else {
            Callable<InputStream> callable = this.f11638d;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel(callable.call());
                } catch (Exception e11) {
                    throw new IOException("inputStreamCallable exception on call", e11);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f11635a.getCacheDir());
        createTempFile.deleteOnExit();
        d.a(readableByteChannel, l.b.a(new FileOutputStream(createTempFile), createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            b(createTempFile, z11);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    private void b(File file, boolean z11) {
        o oVar = this.f11641g;
        if (oVar != null) {
            Objects.requireNonNull(oVar);
        }
    }

    private void g(boolean z11) {
        String databaseName = getDatabaseName();
        File databasePath = this.f11635a.getDatabasePath(databaseName);
        o oVar = this.f11641g;
        a aVar = new a(databaseName, this.f11635a.getFilesDir(), oVar == null || oVar.f11600l);
        try {
            aVar.b();
            if (!databasePath.exists()) {
                a(databasePath, z11);
                aVar.c();
            } else if (this.f11641g == null) {
                aVar.c();
            } else {
                try {
                    int d11 = c.d(databasePath);
                    int i11 = this.f11639e;
                    if (d11 == i11) {
                        aVar.c();
                    } else if (this.f11641g.a(d11, i11)) {
                        aVar.c();
                    } else {
                        if (this.f11635a.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath, z11);
                            } catch (IOException e11) {
                                Log.w("ROOM", "Unable to copy database file.", e11);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar.c();
                    }
                } catch (IOException e12) {
                    Log.w("ROOM", "Unable to read database version.", e12);
                    aVar.c();
                }
            }
        } catch (IOException e13) {
            throw new RuntimeException("Unable to copy database file.", e13);
        } catch (Throwable th2) {
            aVar.c();
            throw th2;
        }
    }

    public synchronized void close() {
        this.f11640f.close();
        this.f11642h = false;
    }

    /* access modifiers changed from: package-private */
    public void f(o oVar) {
        this.f11641g = oVar;
    }

    public String getDatabaseName() {
        return this.f11640f.getDatabaseName();
    }

    public t3.h getDelegate() {
        return this.f11640f;
    }

    public synchronized g i() {
        if (!this.f11642h) {
            g(true);
            this.f11642h = true;
        }
        return this.f11640f.i();
    }

    public void setWriteAheadLoggingEnabled(boolean z11) {
        this.f11640f.setWriteAheadLoggingEnabled(z11);
    }
}
