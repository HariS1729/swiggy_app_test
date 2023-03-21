package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.g;
import io.sentry.instrumentation.file.l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: DeviceProfileWriter */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f11051a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11052b;

    /* renamed from: c  reason: collision with root package name */
    private final g.c f11053c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f11054d;

    /* renamed from: e  reason: collision with root package name */
    private final File f11055e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11056f;

    /* renamed from: g  reason: collision with root package name */
    private final String f11057g;

    /* renamed from: h  reason: collision with root package name */
    private final String f11058h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11059i = false;
    private c[] j;
    private byte[] k;

    public b(AssetManager assetManager, Executor executor, g.c cVar, String str, String str2, String str3, File file) {
        this.f11051a = assetManager;
        this.f11052b = executor;
        this.f11053c = cVar;
        this.f11056f = str;
        this.f11057g = str2;
        this.f11058h = str3;
        this.f11055e = file;
        this.f11054d = c();
    }

    private void b() {
        if (!this.f11059i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] c() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24) {
            return null;
        }
        switch (i11) {
            case 24:
            case 25:
                return m.f11086e;
            case 26:
                return m.f11085d;
            case 27:
                return m.f11084c;
            case 28:
            case 29:
            case 30:
                return m.f11083b;
            case 31:
                return m.f11082a;
            default:
                return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(int i11, Object obj) {
        this.f11053c.a(i11, obj);
    }

    private static boolean g() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24) {
            return false;
        }
        return i11 == 24 || i11 == 25 || i11 == 31;
    }

    private void h(int i11, Object obj) {
        this.f11052b.execute(new a(this, i11, obj));
    }

    public boolean d() {
        if (this.f11054d == null) {
            h(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f11055e.canWrite()) {
            h(4, (Object) null);
            return false;
        } else {
            this.f11059i = true;
            return true;
        }
    }

    public b f() {
        FileInputStream createInputStream;
        FileInputStream createInputStream2;
        b();
        if (this.f11054d == null) {
            return this;
        }
        try {
            AssetFileDescriptor openFd = this.f11051a.openFd(this.f11057g);
            try {
                createInputStream2 = openFd.createInputStream();
                this.j = l.w(createInputStream2, l.o(createInputStream2, l.f11080a), this.f11056f);
                if (createInputStream2 != null) {
                    createInputStream2.close();
                }
                openFd.close();
                c[] cVarArr = this.j;
                if (cVarArr != null && g()) {
                    try {
                        AssetFileDescriptor openFd2 = this.f11051a.openFd(this.f11058h);
                        try {
                            createInputStream = openFd2.createInputStream();
                            this.j = l.q(createInputStream, l.o(createInputStream, l.f11081b), this.f11054d, cVarArr);
                            if (createInputStream != null) {
                                createInputStream.close();
                            }
                            openFd2.close();
                            return this;
                        } catch (Throwable th2) {
                            if (openFd2 != null) {
                                openFd2.close();
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException e11) {
                        this.f11053c.a(9, e11);
                    } catch (IOException e12) {
                        this.f11053c.a(7, e12);
                    } catch (IllegalStateException e13) {
                        this.j = null;
                        this.f11053c.a(8, e13);
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                return this;
            } catch (Throwable th4) {
                if (openFd != null) {
                    openFd.close();
                }
                throw th4;
            }
        } catch (FileNotFoundException e14) {
            this.f11053c.a(6, e14);
        } catch (IOException e15) {
            this.f11053c.a(7, e15);
        } catch (IllegalStateException e16) {
            this.f11053c.a(8, e16);
        } catch (Throwable th5) {
            th4.addSuppressed(th5);
        }
        throw th;
        throw th;
    }

    public b i() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.j;
        byte[] bArr = this.f11054d;
        if (!(cVarArr == null || bArr == null)) {
            b();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                l.E(byteArrayOutputStream, bArr);
                if (!l.B(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f11053c.a(5, (Object) null);
                    this.j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.j = null;
            } catch (IOException e11) {
                this.f11053c.a(7, e11);
            } catch (IllegalStateException e12) {
                this.f11053c.a(8, e12);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return this;
        throw th;
    }

    public boolean j() {
        FileOutputStream a11;
        byte[] bArr = this.k;
        if (bArr == null) {
            return false;
        }
        b();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                File file = this.f11055e;
                a11 = l.b.a(new FileOutputStream(file), file);
                d.l(byteArrayInputStream, a11);
                h(1, (Object) null);
                a11.close();
                byteArrayInputStream.close();
                this.k = null;
                this.j = null;
                return true;
            } catch (Throwable th2) {
                byteArrayInputStream.close();
                throw th2;
            }
        } catch (FileNotFoundException e11) {
            h(6, e11);
            this.k = null;
            this.j = null;
            return false;
        } catch (IOException e12) {
            try {
                h(7, e12);
                this.k = null;
                this.j = null;
                return false;
            } catch (Throwable th3) {
                this.k = null;
                this.j = null;
                throw th3;
            }
        } catch (Throwable th4) {
            th2.addSuppressed(th4);
        }
        throw th;
    }
}
