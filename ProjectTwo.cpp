#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <map>

using namespace std;

// Define Course structure
struct Course {
    string courseNumber;
    string courseTitle;
    vector<string> prerequisites;
};

// Function to read course data from CSV file and store it in a sorted map
void loadCourseData(map<string, Course>& courses, const string& filename) {
    ifstream file(filename);
    if (!file) {
        cout << "Error: Unable to open file: " << filename << endl;
        return;
    }

    string line;
    while (getline(file, line)) {
        stringstream ss(line);
        string courseNumber, courseTitle, prereq;
        vector<string> prerequisites;

        // Read course number
        if (!getline(ss, courseNumber, ',')) continue;

        // Read course title
        if (!getline(ss, courseTitle, ',')) continue;

        // Read prerequisites (if any)
        while (getline(ss, prereq, ',')) {
            if (!prereq.empty()) {
                prerequisites.push_back(prereq);
            }
        }

        // Store the course in the map
        courses[courseNumber] = { courseNumber, courseTitle, prerequisites };
    }

    file.close();
}

// Function to print courses (automatically sorted due to map)
void printCourseList(const map<string, Course>& courses) {
    cout << "\nHere is a sample schedule:\n" << endl;
    for (const auto& pair : courses) {
        cout << pair.first << ", " << pair.second.courseTitle << endl;
    }
}

// Function to print course information
void printCourseInfo(const map<string, Course>& courses, const string& courseNumber) {
    auto it = courses.find(courseNumber);
    if (it != courses.end()) {
        const Course& course = it->second;
        cout << course.courseNumber << ", " << course.courseTitle << endl;
        cout << "Prerequisites: ";
        if (course.prerequisites.empty()) {
            cout << "None";
        }
        else {
            for (size_t i = 0; i < course.prerequisites.size(); i++) {
                cout << course.prerequisites[i];
                if (i < course.prerequisites.size() - 1) cout << ", ";
            }
        }
        cout << endl;
    }
    else {
        cout << "Course not found." << endl;
    }
}

int main() {
    map<string, Course> courses;
    string filename = "CS 300 ABCU_Advising_Program_Input.csv"; // Hardcoded filename

    // Automatically load the course data at program start
    loadCourseData(courses, filename);

    cout << "Welcome to the course planner.\n" << endl;

    int choice;
    do {
        cout << "\n1. Load Data Structure." << endl;
        cout << "2. Print Course List." << endl;
        cout << "3. Print Course." << endl;
        cout << "9. Exit" << endl;
        cout << "\nWhat would you like to do? ";
        cin >> choice;
        cin.ignore(); // Ignore newline character

        switch (choice) {
        case 1:
            cout << "Data has been loaded.\n";
            break;
        case 2:
            printCourseList(courses);
            break;
        case 3: {
            string courseNumber;
            cout << "\nWhat course do you want to know about? ";
            cin >> courseNumber;

            // Convert input to uppercase to ensure case-insensitive search
            for (char& c : courseNumber) {
                c = toupper(c);
            }

            printCourseInfo(courses, courseNumber);
            break;
        }
        case 9:
            cout << "\nThank you for using the course planner!" << endl;
            break;
        default:
            cout << "\n" << choice << " is not a valid option." << endl;
        }
    } while (choice != 9);

    return 0;
}
