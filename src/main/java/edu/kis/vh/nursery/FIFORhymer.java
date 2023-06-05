package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer internalRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            internalRhymer.countIn(super.countOut());

        int ret = internalRhymer.countOut();

        while (!internalRhymer.callCheck())
            countIn(internalRhymer.countOut());

        return ret;
    }
}
