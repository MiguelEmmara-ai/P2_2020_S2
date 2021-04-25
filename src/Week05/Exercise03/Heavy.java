package Week05.Exercise03;

/**
 * Created by Miguel Emmara
 */
public class Heavy extends Data {

    public Heavy(int talk_time, int text_count) {
        super(talk_time, text_count);
    }

    public Heavy(int talk_time, int text_count, int data_rate, int data_usage, int data_limit) {
        super(talk_time, text_count, data_rate, data_usage, data_limit);
    }
}
