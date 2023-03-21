package c7;

import java.io.FileNotFoundException;
import java.io.IOException;
import okio.i;
import okio.z;

/* compiled from: FileSystems.kt */
public final class e {
    public static final void a(i iVar, z zVar) {
        if (!iVar.j(zVar)) {
            i.c(iVar.o(zVar));
        }
    }

    public static final void b(i iVar, z zVar) {
        try {
            IOException iOException = null;
            for (z next : iVar.k(zVar)) {
                try {
                    if (iVar.l(next).f()) {
                        b(iVar, next);
                    }
                    iVar.h(next);
                } catch (IOException e11) {
                    if (iOException == null) {
                        iOException = e11;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
