package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter */
final class x extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f10611a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f10612b = new StringBuilder(128);

    x(String str) {
        this.f10611a = str;
    }

    private void a() {
        if (this.f10612b.length() > 0) {
            Log.d(this.f10611a, this.f10612b.toString());
            StringBuilder sb2 = this.f10612b;
            sb2.delete(0, sb2.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            char c11 = cArr[i11 + i13];
            if (c11 == 10) {
                a();
            } else {
                this.f10612b.append(c11);
            }
        }
    }
}
