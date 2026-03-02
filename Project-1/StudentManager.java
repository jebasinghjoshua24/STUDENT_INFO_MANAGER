class StudentManager {
    private Student[] students;
    private int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count++] = s;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student list is full.");
        }
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("No students found.");
            return;
        }
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    public Student findById(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id)
                return students[i];
        }
        return null;
    }

    public void updateMarks(int id, double newMarks) {
        Student s = findById(id);
        if (s != null) {
            s.setMarks(newMarks);
            System.out.println("Marks updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--count] = null;
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}