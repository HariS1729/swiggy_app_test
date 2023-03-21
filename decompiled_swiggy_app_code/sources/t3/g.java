package t3;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* compiled from: SupportSQLiteDatabase */
public interface g extends Closeable {
    void C0();

    k T0(String str);

    Cursor b1(String str);

    Cursor c0(j jVar, CancellationSignal cancellationSignal);

    boolean f1();

    boolean g1();

    String getPath();

    boolean isOpen();

    Cursor j0(j jVar);

    void l();

    List<Pair<String, String>> m();

    void m0(String str) throws SQLException;

    void s();

    void y0();

    void z0(String str, Object[] objArr) throws SQLException;
}
