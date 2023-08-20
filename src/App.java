import java.util.ArrayList;
import java.util.List;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;

public class App {
    public static void main(String[] args) throws Exception {
        StudentRepository studentRepository = new StudentRepository();

        StudentEntity entity = new StudentEntity();
        entity.setNic("893360139V");
        entity.setName(new StudentName("ABC", "XYZ"));
        List<String> mobiles = new ArrayList<>();
        mobiles.add("0776556789");
        mobiles.add("0716556789");
        entity.setMobiles(mobiles);

        Integer id = studentRepository.saveStudent(entity);
        System.out.println(id);
    }
}
