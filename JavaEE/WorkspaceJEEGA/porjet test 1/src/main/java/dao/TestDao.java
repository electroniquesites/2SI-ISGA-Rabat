package dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class TestDao {

    public static void main(String[] args) {
        DaoImp d = new DaoImp();
        
        // 1. Test d'ajout
        // d.addStudent(new Student("aaaa", "bbbbb", Date.valueOf(LocalDate.of(2004, 1, 25))));
        
        // 2. Test de récupération de tous les étudiants
        List<Student> stds = d.getAllStudent();
        stds.forEach(st -> {
            System.out.println(st);
        });
        
        // 3. Autres tests possibles :
        // System.out.println(d.getStudentById(2));
        // d.deleteStudent(3);
        // d.updateStudent(4, new Student("Wadie", "Wadie", Date.valueOf(LocalDate.of(2003, 1, 25))));
    }
}