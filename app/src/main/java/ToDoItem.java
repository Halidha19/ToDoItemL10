import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ToDoItem {

    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" + (date.get(Calendar.MONTH) + 1)
                + "/" + date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }

    private String getDay(int day) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, day);
        return sdf.format(calendar.getTime());
    }
}

