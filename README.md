# Event Counter App

## Overview
Event Counter App is an Android application designed to help users track and increment event counts with a simple button click. The app provides a dashboard to visualize event counts across various time periods: hour, day, week, and month.

## Features
- **Increment Counter:** Easily increase the event count with a button.
- **Dashboard View:** Visualize event counts for different time frames.
- **Time-Based Statistics:** See counts for the last hour, day, week, and month.

## Project Structure
```
EventCounterApp
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── eventcounter
│   │   │   │               ├── MainActivity.java
│   │   │   │               └── DashboardActivity.java
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   └── activity_dashboard.xml
│   │   │   │   └── values
│   │   │   │       └── strings.xml
│   │   │   └── AndroidManifest.xml
├── build.gradle
└── README.md
```

## Getting Started

### Prerequisites
- Android Studio or compatible IDE
- Android device or emulator
- Gradle

### Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/EventCounterApp.git
   ```
2. **Open the project:**
   Launch Android Studio and open the cloned folder.
3. **Build the project:**
   Use Gradle to build the application.
4. **Run the app:**
   Deploy to an Android device or emulator.

## Usage
1. Launch the application.
2. Tap the button on the main screen to increment the event counter.
3. Navigate to the dashboard to view event counts for different time periods.

## Roadmap & Future Enhancements
- Backend integration for persistent data storage
- User authentication for personalized tracking
- Chart-based visualization of event counts

## License
This project is licensed under the GNU GPL License.