# Career Guidance App

## Application Purpose and Features

The Career Guidance App is designed to help Ugandan students and young professionals explore various career paths and educational opportunities. The app provides:

- A comprehensive list of career fields relevant to the Ugandan job market
- Detailed information about courses within each field
- Search functionality to find specific career fields
- Detailed course information including requirements and career prospects
- Modern Material Design 3 UI with dark mode support

## Use Case

### Context
In Uganda, many students and young professionals face challenges in making informed decisions about their career paths due to limited access to comprehensive career guidance resources. This app addresses this gap by providing accessible, relevant career information.

### Scope
The app focuses on providing information about various career fields and their associated courses. It specifically:

- Provides information about 6 major career fields (IT, Healthcare, Business, Engineering, Arts & Design, Education)
- Each field contains at least 5 detailed courses
- Includes course requirements and career prospects
- Offers search functionality to help users find relevant fields

### Limitations
- Currently limited to 6 major career fields
- No user account system
- No personalized recommendations
- No direct application or enrollment functionality
- No real-time updates or dynamic content

## Technical Implementation

### Architecture
The app follows the MVVM (Model-View-ViewModel) architecture pattern:

- **Model**: Data classes for CareerField and Course
- **View**: Jetpack Compose UI components
- **ViewModel**: CareerViewModel for state management

### Key Technologies
- Jetpack Compose for UI
- Material Design 3 for theming
- Navigation Compose for screen navigation
- ViewModel for state management
- Kotlin Coroutines for asynchronous operations

### Features Implemented
1. **Visual Design & Theming**
   - Custom Material Theme with primary, secondary, and background colors
   - Custom typography with different text styles
   - Defined shapes with rounded corners
   - Dark mode support

2. **Core Functionality**
   - Multi-screen navigation
   - State management using ViewModel
   - Search functionality
   - Configuration change handling

3. **UI Components**
   - Scrollable lists with text and images
   - Material Design components
   - Custom-shaped images
   - Responsive layout

4. **Technical Requirements**
   - Externalized strings in strings.xml
   - Dimension management using dimens.xml
   - Clean architecture implementation

## Team Members and Contributions

### [Team Member 1]
- Implemented the UI components and screens
- Created the Material Design theme
- Implemented navigation

### [Team Member 2]
- Developed the ViewModel and state management
- Implemented search functionality
- Created data models

### [Team Member 3]
- Added career field and course data
- Implemented PDF viewing functionality
- Created documentation

## Challenges and Solutions

### Challenge 1: State Management
**Problem**: Managing state across multiple screens while maintaining configuration changes.
**Solution**: Implemented ViewModel with StateFlow for reactive state management.

### Challenge 2: UI Consistency
**Problem**: Maintaining consistent styling across different screen sizes.
**Solution**: Created a comprehensive theme system with custom colors, typography, and shapes.

### Challenge 3: Performance
**Problem**: Handling large lists of career fields and courses efficiently.
**Solution**: Implemented LazyColumn for efficient list rendering and pagination.

## Future Improvements
1. Add user accounts and personalized recommendations
2. Implement real-time updates for course information
3. Add direct application/enrollment functionality
4. Include more career fields and courses
5. Add offline support
6. Implement analytics for user behavior tracking

## Installation and Setup
1. Clone the repository
2. Open the project in Android Studio
3. Sync Gradle files
4. Run the app on an emulator or physical device

## Requirements
- Android Studio Arctic Fox or newer
- Minimum SDK: API 24 (Android 7.0)
- Target SDK: API 34 (Android 14)
- Kotlin 1.8.0 or newer

## License
This project is licensed under the MIT License - see the LICENSE file for details. 