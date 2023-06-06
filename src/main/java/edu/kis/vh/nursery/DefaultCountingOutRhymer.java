package edu.kis.vh.nursery;

/**
 * @author 240827
 *	Default rhymer that works similarly to a stack.
 */
public class DefaultCountingOutRhymer {

    private int RHYMER_SIZE = 12;
    private int EMPTY_RHYMER_SIZE = -1;
    private int ERROR_CODE = -1;
    
	private int[] numbers = new int[RHYMER_SIZE];
    private int total = EMPTY_RHYMER_SIZE;

    /** 
	 * Adds number specified in in argument to the rhymer.
	 * The in argument is not added if the rhymer is full.
	 * @param in
	 */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
	 * @return boolean value indicating if the rhymer is empty.
	 */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_SIZE;
    }

    /**
	 * @return boolean value indicating if the rhymer is full.
	 */
    public boolean isFull() {
        return total == (RHYMER_SIZE - 1);
    }

    /**
	 * Returns at the top of the rhymer.
	 * If the rhymer is empty, NEGATIVE is returned.
	 * @return value at the top of the rhymer.
	 */
    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total];
    }

    /**
	 * Returns value at the top of the rhymer and removes it from the rhymer.
	 * If the rhymer is empty, NEGATIVE is returned.
	 * @return value at the top of the rhymer.
	 */
    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return numbers[total--];
    }
    
    /**
	 * @return How many numbers have been added to the rhymer so far.
	 */
    public int getTotal() {
		return total;
	}

}
