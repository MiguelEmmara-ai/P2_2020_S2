package Week05.Exercise03;

/**
 * Created by Miguel Emmara
 */
public class Standard {
    private final double TALK_RATE = 10;
    private final double TEXT_RATE = 5;
    private final int TALK_LIMIT = 10;
    private final int TEXT_LIMIT = 100;
    private int talk_time;
    private int text_count;

    public Standard(int talk_time, int text_count) {
        setTalk_time(talk_time);
        setText_count(text_count);
    }

    public int getTalk_time() {
        return talk_time;
    }

    public void setTalk_time(int talk_time) {
        this.talk_time = talk_time;
    }

    public int getText_count() {
        return text_count;
    }

    public void setText_count(int text_count) {
        this.text_count = text_count;
    }

    public void talk(int nMinsTalked) {
        setTalk_time(getTalk_time() + nMinsTalked);
        if (getTalk_time() > TALK_LIMIT) {
            System.out.println("Call Limit Reached!");
        }
    }

    public void sendTexts(int nTextSent) {
        setText_count(getText_count() + nTextSent);
        if (getText_count() > TEXT_LIMIT) {
            System.out.println("Text Limit Reached");
        }
    }

    public double getTotal() {
        return (TALK_RATE * getTalk_time() + TEXT_RATE * getText_count()) / 100;
    }

    @Override
    public String toString() {
        return String.format(" Talk : [%d/%d] Text: [%d/%d] ", getTalk_time(), TALK_LIMIT, getText_count(), TEXT_LIMIT);
    }
}
