package august.bao0818.domeyl;

class Student {
    String name;
    int score;
    int age;
    char sex;

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return (name + "的成绩是" + score);
    }
}
