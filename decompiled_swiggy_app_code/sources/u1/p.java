package u1;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class p {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair<java.util.List<u1.h>, java.lang.Object> b(java.util.List<? extends u1.h> r16, u1.l0 r17, androidx.compose.ui.text.font.AsyncTypefaceCache r18, u1.a0 r19, lp0.l<? super u1.l0, ? extends java.lang.Object> r20) {
        /*
            r8 = r19
            int r9 = r16.size()
            r10 = 0
            r11 = 0
            r13 = r11
            r12 = 0
        L_0x000a:
            if (r12 >= r9) goto L_0x0198
            r14 = r16
            java.lang.Object r0 = r14.get(r12)
            r15 = r0
            u1.h r15 = (u1.h) r15
            int r0 = r15.b()
            u1.q$a r1 = u1.q.f16935a
            int r2 = r1.b()
            boolean r2 = u1.q.e(r0, r2)
            if (r2 == 0) goto L_0x00b0
            x1.l r1 = r18.f7579d
            monitor-enter(r1)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b     // Catch:{ all -> 0x00ad }
            java.lang.Object r2 = r19.a()     // Catch:{ all -> 0x00ad }
            r0.<init>(r15, r2)     // Catch:{ all -> 0x00ad }
            t1.b r2 = r18.f7577b     // Catch:{ all -> 0x00ad }
            java.lang.Object r2 = r2.d(r0)     // Catch:{ all -> 0x00ad }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r2     // Catch:{ all -> 0x00ad }
            if (r2 != 0) goto L_0x004a
            t1.c r2 = r18.f7578c     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r2.b(r0)     // Catch:{ all -> 0x00ad }
            r2 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r2     // Catch:{ all -> 0x00ad }
        L_0x004a:
            if (r2 == 0) goto L_0x0052
            java.lang.Object r0 = r2.g()     // Catch:{ all -> 0x00ad }
            monitor-exit(r1)
            goto L_0x0066
        L_0x0052:
            bp0.k r0 = bp0.k.f22762a     // Catch:{ all -> 0x00ad }
            monitor-exit(r1)
            java.lang.Object r0 = r8.c(r15)     // Catch:{ Exception -> 0x0094 }
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r18
            r2 = r15
            r3 = r19
            r4 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache.f(r1, r2, r3, r4, r5, r6, r7)
        L_0x0066:
            if (r0 == 0) goto L_0x007d
            int r1 = r17.e()
            u1.v r2 = r17.f()
            int r3 = r17.d()
            java.lang.Object r0 = u1.u.a(r1, r0, r15, r2, r3)
            kotlin.Pair r0 = bp0.h.a(r13, r0)
            return r0
        L_0x007d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load font "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0094:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to load font "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00b0:
            int r2 = r1.c()
            boolean r2 = u1.q.e(r0, r2)
            if (r2 == 0) goto L_0x0131
            x1.l r1 = r18.f7579d
            monitor-enter(r1)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b     // Catch:{ all -> 0x012e }
            java.lang.Object r2 = r19.a()     // Catch:{ all -> 0x012e }
            r0.<init>(r15, r2)     // Catch:{ all -> 0x012e }
            t1.b r2 = r18.f7577b     // Catch:{ all -> 0x012e }
            java.lang.Object r2 = r2.d(r0)     // Catch:{ all -> 0x012e }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r2     // Catch:{ all -> 0x012e }
            if (r2 != 0) goto L_0x00df
            t1.c r2 = r18.f7578c     // Catch:{ all -> 0x012e }
            java.lang.Object r0 = r2.b(r0)     // Catch:{ all -> 0x012e }
            r2 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.ui.text.font.AsyncTypefaceCache.a) r2     // Catch:{ all -> 0x012e }
        L_0x00df:
            if (r2 == 0) goto L_0x00e7
            java.lang.Object r0 = r2.g()     // Catch:{ all -> 0x012e }
            monitor-exit(r1)
            goto L_0x0114
        L_0x00e7:
            bp0.k r0 = bp0.k.f22762a     // Catch:{ all -> 0x012e }
            monitor-exit(r1)
            kotlin.Result$a r0 = kotlin.Result.f25582b     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = r8.c(r15)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = kotlin.Result.b(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x0100
        L_0x00f5:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f25582b
            java.lang.Object r0 = bp0.g.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
        L_0x0100:
            boolean r1 = kotlin.Result.g(r0)
            if (r1 == 0) goto L_0x0107
            r0 = r11
        L_0x0107:
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r18
            r2 = r15
            r3 = r19
            r4 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache.f(r1, r2, r3, r4, r5, r6, r7)
        L_0x0114:
            if (r0 == 0) goto L_0x012b
            int r1 = r17.e()
            u1.v r2 = r17.f()
            int r3 = r17.d()
            java.lang.Object r0 = u1.u.a(r1, r0, r15, r2, r3)
            kotlin.Pair r0 = bp0.h.a(r13, r0)
            return r0
        L_0x012b:
            r1 = r18
            goto L_0x017d
        L_0x012e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0131:
            int r1 = r1.a()
            boolean r0 = u1.q.e(r0, r1)
            if (r0 == 0) goto L_0x0181
            r1 = r18
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r0 = r1.d(r15, r8)
            if (r0 != 0) goto L_0x0153
            if (r13 != 0) goto L_0x014f
            r0 = 1
            u1.h[] r0 = new u1.h[r0]
            r0[r10] = r15
            java.util.List r13 = kotlin.collections.k.p(r0)
            goto L_0x017d
        L_0x014f:
            r13.add(r15)
            goto L_0x017d
        L_0x0153:
            java.lang.Object r2 = r0.g()
            boolean r2 = androidx.compose.ui.text.font.AsyncTypefaceCache.a.e(r2)
            if (r2 == 0) goto L_0x015e
            goto L_0x017d
        L_0x015e:
            java.lang.Object r2 = r0.g()
            if (r2 == 0) goto L_0x017d
            int r1 = r17.e()
            java.lang.Object r0 = r0.g()
            u1.v r2 = r17.f()
            int r3 = r17.d()
            java.lang.Object r0 = u1.u.a(r1, r0, r15, r2, r3)
            kotlin.Pair r0 = bp0.h.a(r13, r0)
            return r0
        L_0x017d:
            int r12 = r12 + 1
            goto L_0x000a
        L_0x0181:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown font type "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0198:
            r1 = r17
            r2 = r20
            java.lang.Object r0 = r2.invoke(r1)
            kotlin.Pair r0 = bp0.h.a(r13, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.p.b(java.util.List, u1.l0, androidx.compose.ui.text.font.AsyncTypefaceCache, u1.a0, lp0.l):kotlin.Pair");
    }
}
