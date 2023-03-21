package androidx.profileinstaller;

enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    private FileSectionType(long j) {
        this.mValue = j;
    }

    static FileSectionType fromValue(long j) {
        FileSectionType[] values = values();
        for (int i11 = 0; i11 < values.length; i11++) {
            if (values[i11].getValue() == j) {
                return values[i11];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j);
    }

    public long getValue() {
        return this.mValue;
    }
}
