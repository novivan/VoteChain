import java.util.ArrayList;
import java.util.Arrays;

public abstract class Data {

}

class Poll extends Data {
    private static int currentPollId = 0;
    private final int id;
    private final String[] options;
    private ArrayList<Vote> votes;

    Poll(String[] options) {
        id = ++currentPollId;
        this.options = Arrays.copyOf(options, options.length);
        votes = new ArrayList<Vote>();
    }
}

class Vote extends Data {
    private static int currentVoteId = 0;
    private final int id;
    private final int pollId;
    private final int optionIndex;

    Vote(int pollId, int optionIndex) {
        id = ++currentVoteId;
        this.pollId = pollId;
        this.optionIndex = optionIndex;
    }
}


