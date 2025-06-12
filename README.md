# Android WebView Application for Dastavval.com

This is a simple Android application whose primary function is to display the website [https://dastavval.com](https://dastavval.com) using an Android WebView component.

## Project Specifications

### Purpose
The application serves as a dedicated mobile interface for the website `dastavval.com`. It provides users with direct access to the site's content within a native app experience.

### Technologies Used
- **Programming Language:** Java
- **Platform:** Android SDK
- **Core Component:** Android WebView for displaying web content.
- **User Interface:** Basic Android XML layouts.

### Testing
- **Framework:** Espresso (Android UI testing framework)
- **Test Coverage:**
    - `WebViewActivityTest.java`: Contains UI tests to ensure the `MainActivity` correctly loads and displays content from `https://dastavval.com`. The test specifically checks for the presence of the text "دستاوال" within the loaded page's body.

### Project Structure
- `app/src/main/java/com/example/webviewapp/MainActivity.java`: The main activity that initializes and manages the WebView.
- `app/src/main/res/layout/activity_main.xml`: The XML layout file defining the WebView container.
- `app/src/main/AndroidManifest.xml`: Application manifest file, including internet permissions required for the WebView.
- `app/build.gradle`: Application-level Gradle build script, containing dependencies for AndroidX libraries and Espresso.
- `app/src/androidTest/java/com/example/webviewapp/WebViewActivityTest.java`: Espresso UI test class.

### How to Build and Run
1. Ensure you have Android Studio installed and configured.
2. Clone this repository.
3. Open the project in Android Studio.
4. Let Gradle sync the project dependencies.
5. Run the application on an Android emulator or a physical device.
6. To run tests, right-click on the `androidTest` directory or `WebViewActivityTest.java` and select "Run tests".
