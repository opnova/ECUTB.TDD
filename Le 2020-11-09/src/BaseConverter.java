
public class BaseConverter {

    public static int toDecimal(String binaryNumber) throws ConversionException {

        if (binaryNumber == null) {
            throw new ConversionException("Kan inte vara null");
        }

        String trimmed = binaryNumber.trim(); // " " -> ""
        int strLen = trimmed.length();

        if (strLen == 0) {
            throw new ConversionException("Kan inte vara tom");
        }

        int sum = 0;
        for (int i = 0; i < strLen; i++) {

            switch (trimmed.charAt(i)) {
            case '0':
                // Bidrar inte till något. Gör ingenting!
                break;

            case '1':
                sum = sum + 1 * (int) Math.pow(2, strLen - i - 1);
                break;

            default: // Dåligt tecken
                throw new ConversionException("Dåligt tecken");
            }
        }

        return sum;
    }

}
