
public class INetStream extends XStream {

    int i = 0;

    public INetStream() {

        i = 0;
    }

    @Override
    byte readByte() {

        System.out.println("INetStream::readByte()");
        return 0;
    }

    @Override
    void writeByte(byte b) {

        System.out.println("INetStream::writeByte()");

    }

    @Override
    boolean isDone() {

        System.out.println("INetStream::isDone()");
        i++;
        if (i < 2) {
            return false;
        }

        return true;
    }

}
