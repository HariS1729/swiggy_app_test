package m3;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import io.sentry.instrumentation.file.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import t3.b;
import t3.g;
import t3.j;

/* compiled from: DBUtil */
public class c {
    public static CancellationSignal a() {
        return b.b();
    }

    /* JADX INFO: finally extract failed */
    public static void b(g gVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor b12 = gVar.b1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (b12.moveToNext()) {
            try {
                arrayList.add(b12.getString(0));
            } catch (Throwable th2) {
                b12.close();
                throw th2;
            }
        }
        b12.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                gVar.m0("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor c(RoomDatabase roomDatabase, j jVar, boolean z11, CancellationSignal cancellationSignal) {
        Cursor B = roomDatabase.B(jVar, cancellationSignal);
        if (!z11 || !(B instanceof AbstractWindowedCursor)) {
            return B;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) B;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : B;
    }

    public static int d(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = h.b.a(new FileInputStream(file), file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                int i11 = allocate.getInt();
                fileChannel.close();
                return i11;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th2) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th2;
        }
    }
}
