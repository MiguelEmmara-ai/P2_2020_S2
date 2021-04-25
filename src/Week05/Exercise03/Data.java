package Week05.Exercise03;

/**
 * Created by Miguel Emmara
 */
public class Data extends Standard {
    private double data_rate;
    private int data_usage;
    private int data_limit;


    public Data(int talk_time, int text_count) {
        super(talk_time, text_count);
    }

    public Data(int talk_time, int text_count, int data_rate, int data_usage, int data_limit) {
        super(talk_time, text_count);
        setData_rate(data_rate);
        setData_usage(data_usage);
        setData_limit(data_limit);
    }

    public double getData_rate() {
        return data_rate;
    }

    public void setData_rate(double data_rate) {
        this.data_rate = data_rate;
    }

    public int getData_usage() {
        return data_usage;
    }

    public void setData_usage(int data_usage) {
        this.data_usage = data_usage;
    }

    public int getData_limit() {
        return data_limit;
    }

    public void setData_limit(int data_limit) {
        this.data_limit = data_limit;
    }

    public void transfer(int n) {
        setData_usage(getData_usage() + n);

        if (getData_usage() > getData_limit()) {
            System.out.println("Data Limit Reached!");
        }
    }

    public String toString() {
        return String.format(" %s Data: [%d/%d] ", super.toString(), getData_usage(), getData_limit());
    }

    public double getTotal() {
        return super.getTotal() + (getData_usage() * getData_rate()) / 100;
    }
}
