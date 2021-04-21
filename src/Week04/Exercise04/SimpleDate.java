package Week04.Exercise04;

/**
 * Created by Miguel Emmara
 */
public class SimpleDate {
    private int day; int month; int year;

    public SimpleDate() {
        this.day = 10;
        this.month = 10;
        this.year = 2010;
    }

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 10;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 31) {
            this.month = month;
        } else {
            this.month = 10;
        }
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 31) {
            this.year = year;
        } else {
            this.year = 2010;
        }
    }

    public void setDate(int day, int month, int year) {
        new SimpleDate(day,month,year);
    }

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }
}
