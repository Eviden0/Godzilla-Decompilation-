/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;
import org.bouncycastle.crypto.CharToByteConverter;
import org.bouncycastle.jcajce.PBKDF2Key;
import org.bouncycastle.util.Arrays;

public class PBKDF2KeyWithParameters
extends PBKDF2Key
implements PBEKey {
    private final byte[] salt;
    private final int iterationCount;

    public PBKDF2KeyWithParameters(char[] cArray, CharToByteConverter charToByteConverter, byte[] byArray, int n) {
        super(cArray, charToByteConverter);
        this.salt = Arrays.clone(byArray);
        this.iterationCount = n;
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public int getIterationCount() {
        return this.iterationCount;
    }
}
