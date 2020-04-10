class Course {
    private List<Student> students = new ArrayList<>();

    public Course(List<Student> students) {
        this.students = students;
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public boolean addStudent(Student s) {
        return students.add(s);
    }

    public double getLabPointsAverage() {
        int sum = 0;

        for (Student s: students) {
            for (Integer point: s.getLabPoints()) {
                sum += point;
            }
        }

        double avg = (double) sum/students.size();
        return avg;
    }

    public int getNumSignatures() {
        int sum = 0;
        for (Student s: students) {
            if (s.hasSignature())
                ++sum;
        }
        return sum;
    }

}