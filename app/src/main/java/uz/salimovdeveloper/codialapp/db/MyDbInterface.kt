package uz.salimovdeveloper.codialapp.db

import uz.salimovdeveloper.codialapp.models.Course
import uz.salimovdeveloper.codialapp.models.Group
import uz.salimovdeveloper.codialapp.models.Mentor
import uz.salimovdeveloper.codialapp.models.Student

interface MyDbInterface {

    fun addCourse(course: Course)
    fun addMentor(mentor: Mentor)
    fun addGroup(group: Group)
    fun addStudent(student: Student)

    fun getAllCourses():ArrayList<Course>
    fun getAllMentors():ArrayList<Mentor>
    fun getAllGroups():ArrayList<Group>
    fun getAllStudents():ArrayList<Student>

    fun getCourseById(id:Int):Course
    fun getMentorById(id:Int):Mentor
    fun getGroupById(id: Int):Group

    fun deleteCourse(course: Course)
    fun deleteMentor(mentor: Mentor)
    fun deleteGroup(group: Group)
    fun deleteStudent(student: Student)

    fun editMentors(mentor: Mentor)
    fun editGroup(group: Group)
    fun editStudent(student: Student)

    fun editGroupOpen(group: Group)
}