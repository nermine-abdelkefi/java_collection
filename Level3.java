package levels;

import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Level3 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();


        /* TO DO 1: Retourner une chaine de caractère qui contient tous les noms des enseignants en majuscule separés par # */
        String names = teachers.stream().map(t -> t.getName().toUpperCase())
                .reduce((a, b) -> a + "#" + b)
                .orElse("");

        /* TO DO 2: Retourner une set d'enseignants Java dont le salaire > 80000 */
        Set<Teacher> teachers1 = teachers.stream()teachers.stream()
                .filter(t -> t.getSubject().equals("Java"))
                .filter(t -> t.getSalary() > 80000)
                .collect(Collectors.toSet());

        /* TO DO 3: Retourner une TreeSet d'enseignants (tri par nom et en cas d'égalité tri par salaire) */
        TreeSet<Teacher> teachers2 = teachers.stream().collect(Collectors.toCollection(() ->
                new TreeSet<>(
                        (t1, t2) -> {
                            int cmp = t1.getName().compareToIgnoreCase(t2.getName());
                            if (cmp == 0)
                                return Long.compare(t1.getSalary(), t2.getSalary());
                            return cmp;
                        }
                )
        ));

        /* TO DO 4: Retourner une Map qui regroupe les enseignants par module */
        Map<Integer, List<Teacher>> map = teachers.stream().collect(Collectors.groupingBy(Teacher::getClass));

        /* TO DO 5: Retourner une Map qui regroupe les nom des enseignants par salaire */
        Map<Integer, String> map1 = teachers.stream().collect(Collectors.groupingBy(
                Teacher::getSalary,
                Collectors.mapping(Teacher::getName, Collectors.joining(", "))
        ));

        /* TO DO 6: Afficher les nom des enseignants de chaque module */
        map.forEach((module, list) -> {
            System.out.println("Module " + module + " :");
            list.forEach(t -> System.out.println(" - " + t.getName()));
        });


    }
}
