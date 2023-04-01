import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Curso {
    
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public class ExemploCursos {
        public static void main(String[] args) {
            List<Curso> cursos = new ArrayList<Curso>();
            cursos.add(new Curso("Python", 45));
            cursos.add(new Curso("JavaScript", 150));
            cursos.add(new Curso("Java 8", 113));
            cursos.add(new Curso("C", 55));


            cursos.sort(Comparator.comparing(c -> c.getAlunos()));
            cursos.sort(Comparator.comparing(Curso::getAlunos));
            // cursos.forEach(c -> System.out.println(c.getNome()));


            cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
            cursos.stream().map(c -> c.getAlunos()).forEach(total -> System.out.println(total));


            int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                    .mapToInt(Curso::getAlunos).sum();
                        System.out.println(sum);


            cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                    .forEach(c -> System.out.println(c.getNome()));


            Stream<String> nomes = cursos.stream().map(Curso::getNome);
            System.out.println(nomes);


            Optional<Curso> optionalCurso = cursos
                .stream()
                    .filter(c -> c.getAlunos() >= 100)
                        .findAny();
                            System.out.println(optionalCurso);


            Curso curso = optionalCurso.orElse(null);
            System.out.println(curso.getNome());


            optionalCurso.ifPresent(c -> System.out.println(c.getNome()));


            cursos = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                    .collect(Collectors.toList());


            cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                    .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                            .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
                                    


            OptionalDouble media = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                        .mapToInt(Curso::getAlunos)
                            .average();
                                System.out.println(media);


            cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                    .findFirst();

            List<Curso> cursosFiltrados = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                    .collect(Collectors.toList());
                        System.out.println(cursosFiltrados);

            
                        
                
            
            // cursos.forEach(c -> System.out.println(c.getNome()));
            
        }
        
    }

    
}
