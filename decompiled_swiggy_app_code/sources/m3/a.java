package m3;

import io.sentry.instrumentation.file.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock */
public class a {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Lock> f15598e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final File f15599a;

    /* renamed from: b  reason: collision with root package name */
    private final Lock f15600b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15601c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f15602d;

    public a(String str, File file, boolean z11) {
        File file2 = new File(file, str + ".lck");
        this.f15599a = file2;
        this.f15600b = a(file2.getAbsolutePath());
        this.f15601c = z11;
    }

    private static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f15598e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f15600b.lock();
        if (this.f15601c) {
            try {
                File file = this.f15599a;
                FileChannel channel = l.b.a(new FileOutputStream(file), file).getChannel();
                this.f15602d = channel;
                channel.lock();
            } catch (IOException e11) {
                throw new IllegalStateException("Unable to grab copy lock.", e11);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f15602d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f15600b.unlock();
    }
}
