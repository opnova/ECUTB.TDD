
public class FileStream extends XStream {

    int i = 0;

    public FileStream() {

        i = 0;
    }

    @Override
    byte readByte() {

        System.out.println("FileStream::readByte()");
        return 0;
    }

    @Override
    void writeByte(byte b) {

        System.out.println("FileStream::writeByte()");

    }

    @Override
    boolean isDone() {

        System.out.println("FileStream::isDone()");
        i++;
        if (i < 2) {
            return false;
        }

        return true;
    }

}
