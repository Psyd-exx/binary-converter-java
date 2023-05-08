class BinaryConverter {
    private String binaryInput;
    private int binaryLength;

    public BinaryConverter(String binaryInput) {
        this.binaryInput = binaryInput;
        this.binaryLength = binaryInput.length();
    }

    public int convertToDenary(){
        int result = 0;
        int count = 0;

        for (int i = binaryLength-1; i >= 0; i--) {
            if (binaryInput.charAt(i) == '1') {
                result += (Math.pow(2, count));
            } 
            count++;
        }

        if (checkRange(result) == false) {
            System.out.println("Out of range!");
            return 0;
        }

        System.out.println("Denary: " + result);
        return result;
    }

    public boolean checkRange(int result) {
        int lowerBound = (int) -(Math.pow(2, binaryLength-1));
        int upperBound = (int) Math.pow(2, binaryLength-1) - 1;

        System.out.println("Range: " + lowerBound + " to " + upperBound + ".");
        
        return (result >= lowerBound && result <= upperBound);
    }
}
