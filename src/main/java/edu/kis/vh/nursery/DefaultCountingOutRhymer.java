package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int RHYMER_SIZE = 12;
    private int EMPTY_RHYMER_SIZE = -1;
    private int ERROR_CODE = -1;
    
	private int[] numbers = new int[RHYMER_SIZE];
    public int total = EMPTY_RHYMER_SIZE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_SIZE;
    }

    public boolean isFull() {
        return total == (RHYMER_SIZE - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total--];
    }

}
