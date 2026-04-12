import java.io.*;
import java.util.ArrayList;

public class student_manager{
        private ArrayList<student> students = new ArrayList<>();

        public void addStudent(student s){  // Method to add a student to the list
            students.add(s);                
        }

        public void saveToFile(String filename)throws IOException{ // Serialization method to save the list of students to a file
             // Method to save the list of students to a file
            try (
                FileOutputStream fileout=new FileOutputStream(filename);
                ObjectOutputStream out=new ObjectOutputStream(fileout);
            ) {
                out.writeObject(students);
            }
            catch (IOException e) {
                e.printStackTrace();
            }




        }
        public void loadFromFile(String filename) throws IOException, ClassNotFoundException{   //deserialization method to load the list of students from a file
            try (
                FileInputStream filein=new FileInputStream(filename);
                ObjectInputStream in=new ObjectInputStream(filein);
            ) {
                students = (ArrayList<student>) in.readObject();
            }
            catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        public void displayStudents(){  // Method to display the list of students
            for(student s: students){
                System.out.println("Name: " + s.getName() + ", ID: " + s.getS_ID() + ", Age: " + s.getAge() + ", Password: " + s.getPassword());
            }
        }

}