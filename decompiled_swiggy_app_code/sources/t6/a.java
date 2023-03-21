package t6;

import java.io.File;
import x6.k;

/* compiled from: FileKeyer.kt */
public final class a implements b<File> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16728a;

    public a(boolean z11) {
        this.f16728a = z11;
    }

    /* renamed from: b */
    public String a(File file, k kVar) {
        if (!this.f16728a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
