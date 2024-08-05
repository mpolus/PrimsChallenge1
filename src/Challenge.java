public class Challenge {
    public static void main(String[] args) {
        byte myByte = 42; //-128- 127
        short myShort = 8;
        int myInt = 26;
        long myLong = 80000 - 5 * (myByte + myShort + myInt);

        System.out.println(myLong);
    }
}
