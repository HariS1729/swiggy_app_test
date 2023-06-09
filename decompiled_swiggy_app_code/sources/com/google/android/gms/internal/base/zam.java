package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public interface zam {
    ExecutorService zaa(ThreadFactory threadFactory, int i11);

    ExecutorService zab(int i11, int i12);

    ExecutorService zac(int i11, ThreadFactory threadFactory, int i12);
}
