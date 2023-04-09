/*      +----------------------+        +-----------------------+
        |    Registration      |        |        User           |
        +----------------------+        +-----------------------+
        | - courseList: List    |        | - username: String     |
        | - studentList: List   |        | - password: String     |
        | - instructorList: List|        | - email: String        |
        +----------------------+        | - firstName: String    |
        | + addStudent(): void |        | - lastName: String     |
        | + removeStudent(): void |     | - role: Enum           |
        | + addInstructor(): void |     | - courses: List        |
        | + removeInstructor(): void |  +-----------------------+
        | + addCourse(): void   |        | + login(): void        |
        | + removeCourse(): void |       | + logout(): void       |
        |                      |        | + enrollInCourse(): void|
        |                      |        | + dropCourse(): void    |
        |                      |        +-----------------------+
        +----------------------+


        */