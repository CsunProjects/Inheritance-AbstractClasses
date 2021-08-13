# Inheritance-AbstractClasses
Inheritance Abstract classes That display data from class using getters and setter
___________________________________________________________________________________

For this java project, you will create a Java program for a school. The purpose is to create a report containing one or more classrooms. For each classroom, the report will contain:

The room number of the classroom.
The teacher and the subject assigned to the classroom.
A list of students assigned to the classroom including their student id and final grade.

Application Structure

Project should be organized in a directory. Create a directory called “LastNamesP1” (replace LastNames with last name of group members)
The following shows the directory and files you should have:

LastNamesP1 Directory
Displayable.java (15 points)
Create Displayable interface. The interface should declare one method as follows:
	
	public abstract String display()
Person.java (15 points)
Create Person class. Make it an abstract class. Declare the following instance variables:

String firstName
String lastName

Include the getter and setter methods for each variable. Use the camelcase naming convention for methods and variables. Include a method named getFullName() that returns both names concatenated into a String with space between the first and last name.

Teacher.java (15 points)
Create the Teacher class. It inherits the Person abstract class and implements the Displayable interface. It defines only one variable as follows:
String subject

Include the getter and setter methods for the variable. Use the camelcase naming convention. Provide a constructor that uses the following parameters to initialize the variables:

String firstName
String lastName
String subject
Override the display() method. It should return a String containing the teacher’s name using the getFullName() method defined in Person and the subject taught as follows:


John Smith teaches Computer Science



Student.java (15 points)
Create the Student class. It inherits the Person abstract class and implements the Displayable interface. It defines two variables:

int studentId
int finalGrade

Include the getter and setter methods for the variables. Use the camelcase naming convention. Provide a constructor that uses the following parameters to initialize the variables:

String firstName
String lastName
int studentId
IntfinalGrade

Override the display() method. It should return a String containing the student’s id, the student’s name using the getFullName() method defined in Person, and the student’s final grade as follows:


Student ID: 1      John Doe Final Grade: 90


Classroom.java (15 points)
Create the Classroom class. It inherits the Person abstract class and implements the Displayable interface. It defines three variables:

int roomNumber
Displayable teacher (note that the Teacher instance is downcast to the Displayable interface)
ArrayList<Displayable> students  (note that the Student instances is downcast to the Displayable interface)

Provide a no argument constructor. Provide another constructor that uses the following parameters to initialize the variables:

int roomNumber
Displayable teacher
ArrayList<Displayable> students

Override the display() method. It should return a String containing the class room number, teacher information and list of students as follows:


Room Number: 10001
John Smith teaches Computer Science
Student ID: 110001   Eric Jones Final Grade: 95
Student ID: 110002   David Smith Final Grade: 90





Programming Logic

In your project directory create the PrintReports class.

PrintReports should define the following methods using the listed method signatures:

public PrintReports()
public Displayable enterClassroom()
public Displayable enterTeacher()
public Displayable enterStudents()
void report(ArrayList<Displayable>)

Note that the methods are non static. One way to escape the static requirement main() imposes is to use this approach:

public class School
{
   public static void main(String[] args) {
       New PrintReports();
   }

 The PrintReports class (25 points)
The public PrintReport() constructor

In a do..while loop collect the data need to create a Classroom object using the enterClassroom() method. You should be able to create any number of Classroom objects. Prompt the user so he or she can enter another Classroom or quit the loop. Store the Classroom objects in an ArrayList<Displayable> collection.

The public Displayable enterClassroom() Method

Prompt the user for a room number. Save it as an int. The room number must be 100 or greater. If the user enters a lower number, he or she should be prompted again until an acceptable number is entered.

Call enterTeacher() to obtain an instance of a teacher and store it as a Displayable object.

In a do..while loop, call enterStudent() to obtain a Student as a Displayable object and store it in an ArrayList<Displayable> collection. Prompt the user so he or she can enter another student or quit the loop.

The public Displayable enterTeacher() Method

The method should prompt the user for their first and last name as well as the subject they teach. Create an instance of Teacher using that data and return the object as instance of Displayable.

The public Displayable enterStudent() Method

Prompt the user for student id, first and last names, and their final grade. Using the data, create a Student instance. A student’s id must be greater than 0. A student’s final grade must be between 0 and 100. Return the student object as a Displayable object.

The void report(ArrayLIst<Displayable>) Method

A for loop, iterate through the ArrayList<Displayable> collection containing the downcast Classroom objects.

Call the display() method defined in Classroom. It should report the room number.

It should call the display() method in the teacher variable to report the teacher assigned to the classroom.

In a for loop it should iterate through the ArrayList<Displayable> collection of Student objects calling the display() method for each one.
****
