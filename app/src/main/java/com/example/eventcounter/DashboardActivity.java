public class DashboardActivity extends AppCompatActivity {

    private TextView hourCountTextView;
    private TextView dayCountTextView;
    private TextView weekCountTextView;
    private TextView monthCountTextView;

    private int eventCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        hourCountTextView = findViewById(R.id.hourCountTextView);
        dayCountTextView = findViewById(R.id.dayCountTextView);
        weekCountTextView = findViewById(R.id.weekCountTextView);
        monthCountTextView = findViewById(R.id.monthCountTextView);

        // Retrieve the event count from MainActivity
        eventCount = getIntent().getIntExtra("EVENT_COUNT", 0);

        updateDashboard();
    }

    private void updateDashboard() {
        // Calculate counts for different time periods
        int eventsPerHour = eventCount; // Placeholder for actual calculation
        int eventsPerDay = eventCount * 24; // Placeholder for actual calculation
        int eventsPerWeek = eventCount * 168; // Placeholder for actual calculation
        int eventsPerMonth = eventCount * 720; // Placeholder for actual calculation

        // Update the TextViews with the calculated counts
        hourCountTextView.setText(String.valueOf(eventsPerHour));
        dayCountTextView.setText(String.valueOf(eventsPerDay));
        weekCountTextView.setText(String.valueOf(eventsPerWeek));
        monthCountTextView.setText(String.valueOf(eventsPerMonth));
    }
}