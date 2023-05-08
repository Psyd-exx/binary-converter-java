class BinaryConverter {
    private String binaryInput;

    public BinaryConverter(String binaryInput) {
        this.binaryInput = binaryInput;
    }

    public int convertToDenary(){
        int result = 0;
        int count = 0;

        for (int i=binaryInput.length()-1; i >= 0; i--) {
            if (binaryInput.charAt(i) == '1') {
                result += (Math.pow(2, count));
            } 
            count++;
        }
        
        return result;
    }
}
