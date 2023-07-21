package sg.edu.rp.c346.id22035802.todoitem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        // Create some sample ToDoItem objects
        ArrayList<ToDoItem> toDoItems = new ArrayList<>();
        toDoItems.add(new ToDoItem("Buy groceries", Calendar.getInstance()));
        toDoItems.add(new ToDoItem("Finish homework", Calendar.getInstance()));
        // Add more items here...

        // Create an ArrayAdapter to display the ToDoItems in the ListView
        ArrayAdapter<ToDoItem> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, toDoItems);
        listView.setAdapter(adapter);
    }
}