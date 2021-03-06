import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) < treshold) {
                result.add(source.get(i));
                logger.log("Element " + source.get(i) + " added.");
                count ++;
            } else {
                logger.log("Element " + source.get(i) + " passed.");
            }
        }
        logger.log(count + " elements of " + source.size() + " have passed the filtration.");
        return result;
    }
}
