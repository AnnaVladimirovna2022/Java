package lesson2.homework2;

public class CheckingArray {
    private String[][] strings;

    public void setStrings(String[][] strings) {
        try {
            checkSizeArray(strings);
            this.strings = strings;
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException ne) {
            System.out.println("There is null in the array!");
            ne.printStackTrace();
        }
    }

    private void checkSizeArray(String[][] strings) throws MyArraySizeException {
        if (strings.length != 4 || checkLengthStrings(strings)){
            throw new MyArraySizeException("Array size is incorrect 4х4");
        }
    }

    private boolean checkLengthStrings(String[][] strings) {
        for (String [] str: strings){
            if (str.length!=4){return true;}
        }
        return false;
    }

    public void summ() {
        if (strings == null) {
            System.out.println("There is nothing to sum");
            return;
        }

        try {
            sumArray();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private void sumArray() throws MyArrayDataException {
        int result = 0;
        for (int x = 0; x < strings.length;x++) {
            String[] str = strings[x];
            for (int y = 0; y < str.length; y++) {
                try {
                    result+=Integer.parseInt(str[y]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("The array has more than only numbers. Error in the cell: " + x + ":" + y);
                }
            }
        }
        System.out.println("The sum of the array elements is: " + result);
    }
}


