
public abstract class XStream {

    abstract byte readByte();

    abstract void writeByte(byte b);

    abstract boolean isDone();

    public void copy() {

        while (!isDone()) {
            byte b = readByte();
            writeByte(b);
        }
    }

}
