package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminPortalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_portal);

        // Find the EditText fields for each day
        EditText mondayTime1 = findViewById(R.id.etMondayTime1);
        EditText mondayRoom1 = findViewById(R.id.etMondayRoom1);
        EditText mondayCourse1 = findViewById(R.id.etMondayCourse1);
        EditText mondayLecturer1 = findViewById(R.id.etMondayLecturer1);

        EditText tuesdayTime1 = findViewById(R.id.etTuesdayTime1);
        EditText tuesdayRoom1 = findViewById(R.id.etTuesdayRoom1);
        EditText tuesdayCourse1 = findViewById(R.id.etTuesdayCourse1);
        EditText tuesdayLecturer1 = findViewById(R.id.etTuesdayLecturer1);

        // Add more EditText fields as needed

        Button saveButton = findViewById(R.id.btnSaveTimetable);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve the data from EditText fields
                String mondayTime = mondayTime1.getText().toString();
                String mondayRoom = mondayRoom1.getText().toString();
                String mondayCourse = mondayCourse1.getText().toString();
                String mondayLecturer = mondayLecturer1.getText().toString();

                String tuesdayTime = tuesdayTime1.getText().toString();
                String tuesdayRoom = tuesdayRoom1.getText().toString();
                String tuesdayCourse = tuesdayCourse1.getText().toString();
                String tuesdayLecturer = tuesdayLecturer1.getText().toString();

                // Validate and save data (e.g., save to a database or Firebase)
                if (mondayTime.isEmpty() || mondayRoom.isEmpty() || mondayCourse.isEmpty() || mondayLecturer.isEmpty()) {
                    Toast.makeText(AdminPortalActivity.this, "Please fill in all fields for Monday.", Toast.LENGTH_SHORT).show();
                } else {
                    // Handle the saving logic (e.g., store data in a database)
                    Toast.makeText(AdminPortalActivity.this, "Timetable saved successfully!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
