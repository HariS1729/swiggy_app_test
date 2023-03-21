package e5;

import java.io.File;
import kotlin.jvm.internal.p;

/* compiled from: MuxerConfiguration.kt */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final File f14388a;

    public i(File file) {
        p.j(file, "file");
        this.f14388a = file;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i) && p.e(this.f14388a, ((i) obj).f14388a);
        }
        return true;
    }

    public int hashCode() {
        File file = this.f14388a;
        if (file != null) {
            return file.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "MuxingSuccess(file=" + this.f14388a + ")";
    }
}
