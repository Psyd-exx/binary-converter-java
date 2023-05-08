class BinaryConverter {
    private String binaryInput;
    private int binaryLength;

    public BinaryConverter(String binaryInput) {
        this.binaryInput = binaryInput;
        this.binaryLength = binaryInput.length();
    }

    public void convertToDenary() {
        int result = 0;
        if (binaryInput.charAt(0)=='0') {
            result = convertPositiveToDenary();
        } else if (binaryInput.charAt(0)=='1') {
            result = convertNegativeToDenary();
        }
        System.out.println("Denary: " + result);
    }

    public int convertNegativeToDenary() {
        int index = binaryLength - 1;
        for (int i = binaryLength-1; i >= 0; i--) {
            if (binaryInput.charAt(i) == '1') {
                break;
            }
            index--;
        }
        String endBinary = binaryInput.substring(index);
        String firstBinary = binaryInput.substring(0, index);
        String newFirstBinary = "";

        for (int i = 0; i<firstBinary.length(); i++) {
            if (firstBinary.charAt(i) == '1') {
                newFirstBinary += '0';
            } else if (firstBinary.charAt(i) == '0') {
                newFirstBinary += '1';
            }
        }

        String positiveBinary = newFirstBinary + endBinary;
        this.binaryInput = positiveBinary;
        int denaryNumber = -(convertPositiveToDenary());
        
        return denaryNumber;
    }

    public int convertPositiveToDenary(){
        int denaryNumber = 0;
        int count = 0;

        for (int i = binaryLength-1; i >= 0; i--) {
            if (binaryInput.charAt(i) == '1') {
                denaryNumber += (Math.pow(2, count));
            } 
            count++;
        }

        if (checkRange(denaryNumber) == false) {
            System.out.println("Out of range!");
            return 0;
        }
        return denaryNumber;
    }

    public boolean checkRange(int result) {
        int lowerBound = (int) -(Math.pow(2, binaryLength-1));
        int upperBound = (int) Math.pow(2, binaryLength-1) - 1;

        System.out.println("Range: " + lowerBound + " to " + upperBound + ".");
        
        return (result >= lowerBound && result <= upperBound);
    }

    public void setBinaryInput(String binaryInput) { this.binaryInput = binaryInput; }
}
