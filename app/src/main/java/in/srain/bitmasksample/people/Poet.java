package in.srain.bitmasksample.people;

/**
 * In the old times, some poets like <a href="https://en.wikipedia.org/wiki/Li_Bai">Li Po</a>, they are good are writing poem.
 * Some of their poems are about the joys of drinking wine.
 * <p/>
 * 举杯邀明月，对影成三人。 ———— 《月下独酌》
 * <p/>
 * <p/>
 * He was always busy, busy in writing poem or busy in drinking.
 * <p/>
 * Created by srain on 3/21/16.
 */
public class Poet {

    private static final byte STATE_UNKNOWN = 0;

    // 0000 0010
    private static final byte STATE_BUSY_IN_WRITING = 0x01 << 1;

    // 0000 0100
    private static final byte STATE_BUSY_IN_DRINKING = 0x01 << 2;

    // 0000 0110
    private static final byte STATE_BUSY_MASK = STATE_BUSY_IN_WRITING | STATE_BUSY_IN_DRINKING;

    private byte mState = STATE_UNKNOWN;

    public boolean isBusy() {
        return (mState & STATE_BUSY_MASK) != 0;
    }

    public boolean isBusyInWritingPoem() {
        return (mState & STATE_BUSY_IN_WRITING) != 0;
    }

    public void setBusyInWritingPoem(boolean busy) {
        if (busy) {
            mState |= STATE_BUSY_IN_WRITING;
        } else {
            mState &= ~STATE_BUSY_IN_WRITING;
        }
    }

    public boolean isBusyInDrinking() {
        return (mState & STATE_BUSY_IN_DRINKING) != 0;
    }

    public void setBusyInDrinking(boolean busy) {
        if (busy) {
            mState |= STATE_BUSY_IN_DRINKING;
        } else {
            mState &= ~STATE_BUSY_IN_DRINKING;
        }
    }
}
