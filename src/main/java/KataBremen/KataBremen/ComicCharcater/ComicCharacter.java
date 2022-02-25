package KataBremen.KataBremen.ComicCharcater;

import KataBremen.KataBremen.ISingers;

public class ComicCharacter implements ISingers {
    protected boolean isSinging = false;

    public boolean isSinging() {
        return isSinging;
    }

    @Override
    public String message() {
        return null;
    }

    public boolean startSinging() {
        return this.isSinging = true;
    }

    public boolean stopSinging() {
        return this.isSinging = false;
    }
}
