package lesson9.homework9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    public static List<Student> getStudentsList() {
        // Список курсов
        Course course1 = new Course("Основы баз данных");
        Course course2 = new Course("Git. Базовый курс");
        Course course3 = new Course("Тестирование веб-приложений");
        Course course4 = new Course("Математика и информатика для программистов");
        Course course5 = new Course("Автоматизация тестирования на Java");
        Course course6 = new Course("Тестирование backend на Java");
        Course course7 = new Course("Компьютерные сети");
        Course course8 = new Course("HTML/CSS для тестировщиков");
        Course course9 = new Course("Linux системный администратор");
        Course course10 = new Course("Основы ручного тестирования");
        Course course11 = new Course("Тестирование мобильных приложений");
        Course course12 = new Course("Java Core для тестировщиков");
        Course course13 = new Course("Основы тест-аналитики");

        // Список студентов
        Student student1 = new Student("Студент_1", Arrays.asList(course2, course3, course10, course7, course9));
        Student student2 = new Student("Студент_2", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Студент_3", Arrays.asList(course1, course7, course11));
        Student student4 = new Student("Студент_4", Arrays.asList(course2, course6, course13));
        Student student5 = new Student("Студент_5", Arrays.asList(course3, course7, course9));
        Student student6 = new Student("Студент_6", Arrays.asList(course1, course3, course5, course9));
        Student student7 = new Student("Студент_7", Arrays.asList(course2, course6, course7, course5, course9));
        Student student8 = new Student("Студент_8", Arrays.asList(course3, course2, course4));
        Student student9 = new Student("Студент_9", Arrays.asList(course4, course8, course5));
        Student student10 = new Student("Студент_10", Arrays.asList(course5, course1, course9, course13, course4));
        Student student11 = new Student("Студент_11", Arrays.asList(course6, course9, course5));
        Student student12 = new Student("Студент_12", Arrays.asList(course7, course6, course13));
        Student student13 = new Student("Студент_13", Arrays.asList(course2, course4, course8, course1, course3, course5));
        Student student14 = new Student("Студент_14", Arrays.asList(course9, course2, course5));
        Student student15 = new Student("Студент_15", Arrays.asList(course7, course2, course11));
        Student student16 = new Student("Студент_16", Arrays.asList(course11, course9, course2));
        Student student17 = new Student("Студент_17", Arrays.asList(course12, course8, course3));
        Student student18 = new Student("Студент_18", Arrays.asList(course11, course7, course4, course9));
        Student student19 = new Student("Студент_19", Arrays.asList(course10, course6, course5));
        Student student20 = new Student("Студент_20", Arrays.asList(course9, course5, course3, course4));
        Student student21 = new Student("Студент_21", Arrays.asList(course8, course6, course13));
        Student student22 = new Student("Студент_22", Arrays.asList(course7, course2, course11));
        Student student23 = new Student("Студент_23", Arrays.asList(course6, course1, course5));
        Student student24 = new Student("Студент_24", Arrays.asList(course5, course11, course12));
        Student student25 = new Student("Студент_25", Arrays.asList(course13, course12, course5, course2));


        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7,
                student8, student9, student10, student11, student12, student13, student14,
                student15, student16, student17, student18, student19, student20, student21,
                student22, student23, student24, student25);
    }

    public static Course getRandomCourse() {
        Random random = new Random();
        List<Course> courses = getListCourses();
        return courses.get(random.nextInt(courses.size()));
    }

    private static List<Course> getListCourses() {
        return Arrays.asList(new Course("Основы баз данных"),
                new Course("Git. Базовый курс"),
                new Course("Тестирование веб-приложений"),
                new Course("Математика и информатика для программистов"),
                new Course("Автоматизация тестирования на Java"),
                new Course("Тестирование backend на Java"),
                new Course("Компьютерные сети"),
                new Course("HTML/CSS для тестировщиков"),
                new Course("Linux системный администратор"),
                new Course("Основы ручного тестирования"),
                new Course("Тестирование мобильных приложений"),
                new Course("Java Core для тестировщиков"),
                new Course("Основы тест-аналитики"));
    }
}
